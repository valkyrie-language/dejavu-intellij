grammar NexusAntlr;
import NexusBasic;
options {
	language = Java;
}

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
program
    : (
        define_namespace
        | import_statement
        | define_extension
        | define_class
        | define_function
        | define_type
        // same as function
        | define_lambda
        | let_binding
        | loop_statement
        | guard_statement
        | expression_root
        | eos
    )* EOF
    ;

eos:      SEMICOLON;
eos_free: COMMA | SEMICOLON;
// ===========================================================================
define_namespace: KW_NAMESPACE namepath_free eos?;
// ===========================================================================
import_statement: KW_IMPORT import_term;
import_as:        KW_AS (OP_AT | OP_HASH)? identifier;
import_term
    : import_block
    | OP_AT import_name import_as?
    | OP_AT import_name ((OP_PROPORTION | DOT)? import_block)?
    | OP_HASH import_name import_as?
    | OP_HASH import_name ((OP_PROPORTION | DOT)? import_block)?
    | import_name import_as?
    | import_name ((OP_PROPORTION | DOT)? import_block)?
    | eos_free
    ;
import_name:  identifier ((OP_PROPORTION | DOT) identifier)* ((OP_PROPORTION | DOT) (OP_MUL));
import_block: BRACE_L BRACE_R | BRACE_L import_term* BRACE_R;
// ===========================================================================
define_extension: KW_EXTENSION;
// ===========================================================================
define_class
    : template_call? annotation* modifiers KW_CLASS identifier define_generic? class_inherit? type_hint? class_block eos?
    ;
class_block: BRACE_L (class_dsl | class_method | class_field | eos_free)* BRACE_R;
class_inherit
    : PARENTHESES_L PARENTHESES_R
    | PARENTHESES_L class_inherit_item (COMMA class_inherit_item)* COMMA? PARENTHESES_R
    ;
class_inherit_item: modified_namepath;
class_field:        annotation* modified_identifier type_hint? parameter_default?;
class_method
    : annotation* modified_namepath define_generic? function_parameters type_hint? effect_hint? function_block?
    ;
class_dsl: annotation* modified_identifier class_block;
// ===========================================================================
define_function
    : template_call? annotation* modifiers KW_FUNCTION namepath define_generic? function_parameters type_hint? effect_hint? function_block
    ;
function_parameters
    : PARENTHESES_L PARENTHESES_R
    | PARENTHESES_L parameter_item (COMMA parameter_item)* PARENTHESES_R
    ;
parameter_item:    annotation* modified_identifier type_hint? parameter_default?;
parameter_default: OP_ASSIGN expression;
// ===========================================================================
function_call
    : OP_AND_THEN? tuple_call_body // method?(b)
    | OP_AND_THEN? DOT OP_AT? namepath tuple_call_body? // value?.path::method()
    ;
tuple_call_body
    : PARENTHESES_L PARENTHESES_R
    | PARENTHESES_L tuple_call_item (COMMA tuple_call_item)* COMMA? PARENTHESES_R
    ;
tuple_call_item: identifier COLON expression | expression;
// ===========================================================================
define_lambda: annotation* KW_LAMBDA function_parameters type_hint? function_block;
// ===========================================================================
function_block
    : BRACE_L (
        define_type
        | define_lambda
        | let_binding
        | loop_statement
        | guard_statement
        | expression_root
        | eos
    )* BRACE_R
    ;
// ===========================================================================
let_binding:       KW_LET let_pattern type_hint? (OP_ASSIGN expression_root)?;
let_pattern:       let_pattern_tuple | let_pattern_plain;
let_pattern_plain: modified_identifier (COMMA modified_identifier)* COMMA?;
let_pattern_tuple
    : PARENTHESES_L (
        let_pattern_item COMMA
        | let_pattern_item (COMMA let_pattern_item)+ COMMA?
    )? PARENTHESES_R
    | namepath PARENTHESES_L (let_pattern_item (COMMA let_pattern_item)* COMMA?)? PARENTHESES_R
    | namepath? BRACKET_L (let_pattern_item (COMMA let_pattern_item)* COMMA?)? BRACKET_R
    | namepath? BRACE_L (let_pattern_item (COMMA let_pattern_item)* COMMA?)? BRACE_R
    ;
let_pattern_item
    : (modified_identifier COLON)? (bind = identifier OP_BIND)? let_pattern_tuple
    | (modified_identifier COLON)? (bind = identifier OP_BIND)? identifier
    | modified_identifier? OP_DECONSTRUCT bind = identifier?
    | modified_identifier
    ;
// ===========================================================================
define_type: KW_TYPE identifier OP_ASSIGN identifier;
type_hint:   (COLON | OP_ARROW) type_expression;
effect_hint: OP_DIV type_expression;
// ===========================================================================
if_statement
    : annotation* KW_IF inline_expression then_block = function_block else_if_statement* (
        KW_ELSE else_block = function_block
    )?
    ;
guard_statement
    : annotation* KW_IF (KW_LET | KW_NOT) (let_pattern_tuple | identifier | SPECIAL) OP_ASSIGN inline_expression then = function_block
    | annotation* KW_IF (KW_LET | KW_NOT) inline_expression then = function_block
    ;
else_if_statement: KW_ELSE KW_IF inline_expression function_block;
// ===========================================================================
loop_statement
    : KW_WHILE cond = inline_expression function_block                       # WhileLoop
    | KW_WHILE KW_LET let_pattern OP_ASSIGN inline_expression function_block # WhileLet
    | for_begin otherwise? end # ForLoop
    ;
for_begin: TEMPLATE_L KW_FOR let_pattern infix_in cond = inline_expression ( KW_IF guard=inline_expression)? TEMPLATE_R;
otherwise: TEMPLATE_L KW_ELSE TEMPLATE_R;
end: TEMPLATE_L KW_END identifier? TEMPLATE_R;
// ==========================================================================
expression_root: annotation* expression OP_AND_THEN? eos?;
expression
    : expression op_suffix     # ESuffix
    | expression slice_call    # ESlice
    | expression generic_call  # EGeneric
    | expression function_call # EFunction
    // value?. { lambda }
    | expression OP_AND_THEN? DOT? function_block # EClosure
    // value?.match as i: int {}
    | expression OP_AND_THEN? DOT (KW_MATCH | KW_CATCH) (KW_AS identifier type_hint?)? match_block # EDotMatch
    // prefix
    | op_prefix expression # EPrefix
    // infix
    | <assoc = right> lhs = expression infix_pow rhs = expression # EPow
    | lhs = expression op_multiple rhs = expression               # EMul
    | lhs = expression op_plus rhs = expression                   # EPlus
    | lhs = expression op_logic rhs = expression                  # ELogic
    | lhs = expression op_compare rhs = expression                # ECompare
    | lhs = expression infix_range rhs = expression               # EUntil
    | lhs = expression infix_map rhs = expression                 # EMap
    | lhs = expression infix_is rhs = type_expression             # EIsA
    | lhs = expression infix_as rhs = type_expression             # EAs
    | lhs = expression infix_in rhs = expression                  # EIn
    | lhs = expression OP_OR_ELSE rhs = op_assign                 # EOrElse
    | lhs = expression op_pipeline rhs = expression               # EPipe
    | lhs = expression op_assign rhs = expression                 # EAssign
    | PARENTHESES_L expression PARENTHESES_R                      # EGroup
    // term
    | control_expression # EControl
    | if_statement       # EIf
    | new_statement      # ENew
    | try_statement      # ETry
    | match_statement    # EMatch
    | object_statement   # EObject
    | macro_call         # EMacro
    | function_block     # ELambda
    | tuple_literal      # ETuple
    | range_literal      # ERange
    | atomic             # EAtom
    ;
// statement with return type
inline_expression
    :
    // prefix
    op_prefix inline_expression # IPrefix
    // suffix
    | inline_expression function_call # IFunction
    | inline_expression generic_call  # IGeneric
    | inline_expression slice_call    # ISlice
    // infix
    | lhs = inline_expression op_multiple rhs = inline_expression # IMul
    | lhs = inline_expression op_plus rhs = inline_expression     # IPlus
    | lhs = inline_expression op_logic rhs = inline_expression    # ILogic
    | lhs = inline_expression infix_map rhs = inline_expression   # IMap
    | lhs = inline_expression op_compare rhs = inline_expression  # ICompare
    | lhs = inline_expression infix_is rhs = type_expression      # IIs
    | lhs = inline_expression infix_as rhs = type_expression      # IAs
    | lhs = inline_expression infix_range rhs = inline_expression # IRange
    // term
    | tuple_literal # ITuple
    | range_literal # IRange
    | atomic        # IAtom
    ;
type_expression
    : type_expression op_pattern type_expression   # TPattern
    | type_expression infix_arrows type_expression # TArrows
    | type_expression OP_ADD type_expression       # TAdd
    | type_expression generic_call_in_type         # TGeneric
    | PARENTHESES_L (
        type_expression COMMA // must add ,
        | type_expression (COMMA type_expression)+ COMMA?
    )? PARENTHESES_R # TTuple
    | atomic         # TAtom
    ;
atomic
    : string_literal # AString
    | number_literal # ANumber
    | lambda_name    # ALambda
    | output_name    # AOutput
    | namepath       # ANamepath
    | SPECIAL        # ASpecial
    ;
// ===========================================================================
control_expression
    : (RETURN expression?)            # CReturn
    | BREAK              # CBreak
    | CONTINUE           # CContinue
    ;
op_prefix
    : OP_NOT
    | OP_ADD
    | OP_SUB
    | OP_AND
    | OP_DECONSTRUCT
    | OP_MUL
    ;
op_suffix
    : OP_NOT
    | OP_REM
    | OP_OR_DEFAULT
    | OP_INC
    | OP_DEC
    ;
// 中缀运算符
op_compare:   OP_LT | OP_LEQ | OP_GT | OP_GEQ | OP_EQ | OP_NE | OP_EEE | OP_NEE;
op_pattern:   OP_AND | OP_OR;
infix_map:    OP_MAP | OP_APPLY2 | OP_APPLY3;
infix_pow:    OP_POW;
infix_range:  OP_UNTIL;
infix_arrows: OP_ARROW | OP_ARROW2;
op_multiple:  OP_MUL | OP_DIV | OP_REM | OP_DIV_REM;
op_plus:      OP_ADD | OP_SUB;
op_logic:     LOGIC_OR | LOGIC_AND | LOGIC_XOR | LOGIC_NOR | LOGIC_NAND | LOGIC_XAND;
op_pipeline:  OP_LL | OP_LLE | OP_LLL | OP_GG | OP_GGG;
op_assign
    : OP_ASSIGN
    | OP_ADD_ASSIGN
    | OP_SUB_ASSIGN
    | OP_MUL_ASSIGN
    | OP_DIV_ASSIGN
    | OP_MAY_ASSIGN
    | OP_GGE
    ;
infix_is: KW_IS | KW_IS KW_NOT | OP_IS | OP_IS_NOT | OP_CONTINUES;
infix_as: KW_AS;
infix_in: KW_IN | KW_NOT KW_IN | OP_IN | OP_NOT_IN;
// ===========================================================================
define_generic
    : GENERIC_L GENERIC_R
    | GENERIC_L generic_item (COMMA generic_item)* COMMA? GENERIC_R
    | OP_PROPORTION? OP_LT OP_GT
    | OP_PROPORTION? OP_LT generic_item (COMMA generic_item)* COMMA? OP_GT
    ;
generic_item: (identifier COLON)? type_expression;
generic_call
    : OP_PROPORTION OP_LT OP_GT
    | OP_PROPORTION OP_LT generic_pair (COMMA generic_pair)* COMMA? OP_GT
    | GENERIC_L GENERIC_R
    | GENERIC_L generic_pair (COMMA generic_pair)* COMMA? GENERIC_R
    ;
generic_call_in_type
    : OP_PROPORTION? OP_LT generic_pair (COMMA generic_pair)* OP_GT
    | GENERIC_L generic_pair (COMMA generic_pair)* GENERIC_R
    ;
generic_pair: (identifier COLON)? type_expression;
// ===========================================================================
template_call
    : annotation* modifiers KW_TEMPLATE template_block
    | annotation* modifiers KW_TEMPLATE identifier (COMMA identifier)* COMMA? template_block
    ;
template_block:      BRACE_L (template_statements | eos_free)* BRACE_R;
template_statements: KW_WHERE where_block;
where_block:         BRACE_L where_bound* BRACE_R;
where_bound:         identifier COLON type_expression | eos_free;
// ===========================================================================
macro_call
    : OP_AT annotation_call_item class_block?
    | OP_AT BRACKET_L annotation_call_item (COMMA annotation_call_item)* BRACKET_R class_block?
    ;
annotation
    : OP_HASH annotation_call_item class_block?
    | OP_HASH BRACKET_L annotation_call_item (COMMA annotation_call_item)* BRACKET_R class_block?
    ;
annotation_call_item: namepath tuple_call_body? class_block?;
// ===========================================================================
try_statement: annotation* KW_TRY type_expression? function_block;
match_statement
    : annotation* (KW_MATCH | KW_CATCH) (identifier OP_BIND)? inline_expression match_block
    ;
// ===========================================================================
match_block: BRACE_L (match_terms | eos_free)* BRACE_R;
match_terms
    : annotation* KW_WITH identifier                                                   # MatchWith
    | annotation* KW_WITH BRACKET_L (identifier (COMMA identifier)* COMMA?)? BRACKET_R # MatchWithMany
    | annotation* KW_TYPE type_expression (KW_IF inline_expression)? match_case_block  # MatchType
    | annotation* KW_WHEN inline_expression match_case_block                           # MatchWhen
    | annotation* KW_ELSE match_case_block                                             # MatchElse
    | annotation* KW_CASE case_pattern (KW_IF inline_expression)? match_case_block     # MatchCase
    ;
match_case_block: COLON expression*;
case_pattern
    : case_pattern (OP_OR | OP_ADD) case_pattern # CaseOR
    | case_pattern (OP_UNTIL) case_pattern       # CaseUntil
    | case_pattern_item                          # CaseAtom
    ;
case_pattern_item
    : case_pattern_tuple
    | bind = identifier OP_BIND case_pattern_item
    | modified_identifier COLON (bind = identifier OP_BIND)? case_pattern_item
    | modified_identifier
    | namepath
    | number_literal
    | string_literal
    | SPECIAL
    ;
case_pattern_tuple
    : namepath? PARENTHESES_L PARENTHESES_R
    | namepath? BRACKET_L BRACKET_R
    | namepath? BRACE_L BRACE_R
    | PARENTHESES_L case_pattern_item COMMA PARENTHESES_R
    | PARENTHESES_L case_pattern_item (COMMA case_pattern_item)+ COMMA? PARENTHESES_R
    | namepath PARENTHESES_L case_pattern_item (COMMA case_pattern_item)* COMMA? PARENTHESES_R
    | namepath? BRACKET_L case_pattern_item (COMMA case_pattern_item)* COMMA? BRACKET_R
    | namepath? BRACE_L case_pattern_item (COMMA case_pattern_item)* COMMA? BRACE_R
    ;
// ===========================================================================
object_statement: KW_OBJECT define_generic? class_inherit? type_hint? class_block;
new_statement
    : KW_NEW modified_namepath generic_call_in_type? tuple_call_body? new_block
    | KW_NEW modified_namepath generic_call_in_type? tuple_call_body
    ;
new_body
    : tuple_call_body? new_block // 可选
    | tuple_call_body // 必选
    ;
new_block: BRACE_L (tuple_call_item | eos_free)* BRACE_R;
// ===========================================================================
tuple_literal
    : PARENTHESES_L PARENTHESES_R
    | PARENTHESES_L collection_pair (COMMA collection_pair)+ COMMA? PARENTHESES_R
    | PARENTHESES_L collection_pair COMMA PARENTHESES_R
    ;
collection_pair: (identifier COLON)? expression;
// ===========================================================================
slice_call: OP_AND_THEN? range_literal;
range_literal
    : BRACKET_L (range_axis (COMMA range_axis)* COMMA?)? BRACKET_R # Ordinal
    | OFFSET_L (range_axis (COMMA range_axis)* COMMA?)? OFFSET_R   # Offset
    ;
range_axis
    : COLON // [:]
    | OP_PROPORTION // [::]
    | range_start (COLON range_end)? (COLON range_step)?
    ;
range_start: inline_expression;
range_end:   inline_expression;
range_step:  inline_expression;
// ===========================================================================
modifiers:           identifier*;
modified_identifier: (mods += identifier)* id = identifier;
modified_namepath
    : (mods += identifier)* path += identifier (OP_PROPORTION path += identifier)*
    ;
// namepath
lambda_name:   LAMBDA_SLOT (identifier | number)?;
output_name:   (OP_REM | OP_LAST) INTEGER;
function_name: identifier (OP_PROPORTION identifier)* (DOT identifier)?;
namepath_free: identifier ((OP_PROPORTION | DOT) identifier)*;
namepath:      identifier (OP_PROPORTION identifier)*;
// identifier
identifier: UNICODE_ID | RAW_ID;
// number
number:         DECIMAL | INTEGER;
number_literal: number identifier?;
// string
string: STRING_SINGLE | STRING_DOUBLE;
string_literal
    : identifier? STRING_SINGLE
    | identifier? STRING_DOUBLE
    | identifier? STRING_BLOCK
    ;
