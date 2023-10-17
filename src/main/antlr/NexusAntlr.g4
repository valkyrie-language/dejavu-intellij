grammar NexusAntlr;

options {
	tokenVocab = NexusAntlrLexer;
}

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
program
    : (
        TEMPLATE_E
        | define_import
        | define_class
        | if_statement
        | for_statement
        | slot_statement
        | apply_statement
        | match_statement
        | any_expression
        | any_text
    )* EOF
    ;
statements: if_statement | for_statement | any_text;
any_text:   (TEXT_SPACE | TEXT_WORD | TEXT);

// import
define_import
    : TEMPLATE_L KW_IMPORT namepath_free (KW_AS identifier)? (KW_IN identifier)? TEMPLATE_R
    ;
define_class: TEMPLATE_L KW_CLASS namepath_free (KW_IN identifier)? TEMPLATE_R;
// if
if_statement: if_then else_if* else_then? if_end;
if_then:      TEMPLATE_L KW_IF expression TEMPLATE_R statements*;
else_then:    TEMPLATE_L KW_ELSE TEMPLATE_R statements*;
else_if:      TEMPLATE_L KW_ELSE KW_IF expression TEMPLATE_R statements*;
if_end:       TEMPLATE_L KW_END KW_IF? TEMPLATE_R;

// for
for_statement: for_begin else_then? for_end;
for_begin
    : TEMPLATE_L KW_FOR for_pattern KW_IN condition = expression (KW_IF guard = expression)? TEMPLATE_R statements*
    ;
for_pattern
    : PARENTHESES_L PARENTHESES_R
    | PARENTHESES_L modified_identifier (COMMA modified_identifier)* COMMA? PARENTHESES_R
    | modified_identifier (COMMA modified_identifier)* COMMA?
    ;
for_end: TEMPLATE_L KW_END KW_FOR? TEMPLATE_R;
// slot position
slot_statement: slot_begin slot_end;
slot_begin: TEMPLATE_L KW_SLOT identifier TEMPLATE_R statements*;
slot_end: TEMPLATE_L KW_END KW_SLOT? TEMPLATE_R;
// apply
apply_statement: apply_begin apply_end;
apply_begin: TEMPLATE_L KW_APPLY identifier TEMPLATE_R statements*;
apply_end: TEMPLATE_L KW_END KW_APPLY? TEMPLATE_R;
// match
match_statement: match_begin case_branch* match_end;
match_begin:     TEMPLATE_L KW_MATCH expression TEMPLATE_R statements*;
case_branch:     TEMPLATE_L KW_CASE expression TEMPLATE_R statements*;
match_end:       TEMPLATE_L KW_END KW_MATCH? TEMPLATE_R;

// expression
any_expression: TEMPLATE_L expression? TEMPLATE_R;
expression:     namepath;

// modifiers
modifiers:           (mods += identifier)*;
modified_identifier: (mods += identifier)* id = identifier;
modified_namepath
    : (mods += identifier)* path += identifier (OP_PROPORTION path += identifier)*
    ;
// identifier
namepath_free: identifier ((OP_PROPORTION | DOT) identifier)*;
namepath:      identifier (OP_PROPORTION identifier)*;
identifier:    UNICODE_ID | RAW_ID;