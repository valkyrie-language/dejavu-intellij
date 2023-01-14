// Generated from c:\Users\Dell\IdeaProjects\valkyrie-intellij\src\main\antlr\ValkyrieAntlr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValkyrieAntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COMMA=2, SEMICOLON=3, FAKE_COLON=4, OP_PROPORTION=5, COLON=6, PARENTHESES_L=7, 
		PARENTHESES_R=8, BRACKET_L=9, BRACKET_R=10, BRACE_L=11, BRACE_R=12, GENERIC_L=13, 
		GENERIC_R=14, OFFSET_L=15, OFFSET_R=16, RANGE_L=17, RANGE_R=18, CEILING_L=19, 
		CEILING_R=20, FLOOR_L=21, FLOOR_R=22, COLLECTION_L=23, COLLECTION_R=24, 
		OP_ADD=25, OP_SUB=26, OP_INC=27, OP_DEC=28, OP_MUL=29, OP_DIV=30, OP_REM=31, 
		OP_DIV_REM=32, OP_LAST=33, OP_EQ=34, OP_NE=35, OP_NEE=36, OP_EEE=37, OP_LEQ=38, 
		OP_LLE=39, OP_LLL=40, OP_LL=41, OP_LT=42, OP_GEQ=43, OP_GGE=44, OP_GGG=45, 
		OP_GG=46, OP_GT=47, OP_LEFT=48, OP_ARROW=49, OP_ARROW2=50, OP_ASSIGN=51, 
		OP_BIND=52, OP_MAY_ASSIGN=53, OP_ADD_ASSIGN=54, OP_SUB_ASSIGN=55, OP_MUL_ASSIGN=56, 
		OP_DIV_ASSIGN=57, LOGIC_NOT=58, LOGIC_AND=59, LOGIC_XAND=60, LOGIC_NAND=61, 
		LOGIC_OR=62, LOGIC_XOR=63, LOGIC_NOR=64, SET_INTERSECTION=65, SET_UNION=66, 
		OP_AND=67, OP_OR=68, OP_IMPL=69, OP_IFF=70, OP_MAP=71, OP_APPLY2=72, OP_APPLY3=73, 
		OP_AT=74, OP_HASH=75, LAMBDA_SLOT=76, MACRO_SLOT=77, OP_UNIMPLEMENTED=78, 
		OP_OR_DEFAULT=79, OP_OR_ELSE=80, OP_AND_THEN=81, OP_NOT=82, KW_NOT=83, 
		OP_IN=84, KW_IN=85, OP_NOT_IN=86, OP_CONTINUES=87, KW_IS=88, OP_IS=89, 
		OP_IS_NOT=90, KW_AS=91, OP_DECONSTRUCT=92, OP_UNTIL=93, OP_POW=94, OP_INVERSE=95, 
		OP_ROOT2=96, OP_ROOT3=97, OP_ROOT4=98, OP_TEMPERATURE=99, OP_TRANSPOSE=100, 
		OP_PERCENT=101, OP_REFERENCE=102, OP_LABEL=103, KW_NAMESPACE=104, KW_IMPORT=105, 
		KW_EXTENSION=106, KW_CLASS=107, KW_TRAIT=108, KW_UNION=109, KW_BITFLAGS=110, 
		KW_TYPE=111, KW_TEMPLATE=112, KW_EXTENDS=113, KW_IMPLEMENTS=114, KW_WHERE=115, 
		KW_WHILE=116, KW_FOR=117, KW_LET=118, KW_WITCH=119, KW_NEW=120, KW_OBJECT=121, 
		KW_LAMBDA=122, KW_FUNCTION=123, KW_TRY=124, KW_MATCH=125, KW_CATCH=126, 
		KW_WITH=127, KW_CASE=128, KW_WHEN=129, INTEGER=130, DECIMAL=131, STRING_SINGLE=132, 
		STRING_DOUBLE=133, STRING_BLOCK=134, KW_IF=135, KW_ELSE=136, KW_OTHERWISE=137, 
		RETURN=138, RESUME=139, YIELD=140, BREAK=141, CONTINUE=142, RAISE=143, 
		SPECIAL=144, RAW_ID=145, UNICODE_ID=146, LINE_COMMENT=147, BLOCK_COMMENT=148, 
		WHITE_SPACE=149, ERROR_CHARACTAR=150;
	public static final int
		RULE_program = 0, RULE_eos = 1, RULE_eos_free = 2, RULE_define_namespace = 3, 
		RULE_import_statement = 4, RULE_import_as = 5, RULE_import_term = 6, RULE_import_name = 7, 
		RULE_import_block = 8, RULE_define_extension = 9, RULE_define_class = 10, 
		RULE_class_block = 11, RULE_class_inherit = 12, RULE_class_inherit_item = 13, 
		RULE_class_field = 14, RULE_class_method = 15, RULE_class_dsl = 16, RULE_define_trait = 17, 
		RULE_trait_block = 18, RULE_define_trait_type = 19, RULE_define_extends = 20, 
		RULE_with_implements = 21, RULE_define_union = 22, RULE_base_layout = 23, 
		RULE_union_block = 24, RULE_define_variant = 25, RULE_variant_block = 26, 
		RULE_define_bitflags = 27, RULE_bitflags_block = 28, RULE_bitflags_item = 29, 
		RULE_define_function = 30, RULE_function_parameters = 31, RULE_parameter_item = 32, 
		RULE_parameter_default = 33, RULE_function_call = 34, RULE_tuple_call_body = 35, 
		RULE_tuple_call_item = 36, RULE_define_lambda = 37, RULE_function_block = 38, 
		RULE_let_binding = 39, RULE_let_pattern = 40, RULE_let_pattern_plain = 41, 
		RULE_let_pattern_tuple = 42, RULE_let_pattern_item = 43, RULE_define_type = 44, 
		RULE_type_hint = 45, RULE_effect_hint = 46, RULE_if_statement = 47, RULE_guard_statement = 48, 
		RULE_else_if_statement = 49, RULE_loop_statement = 50, RULE_if_guard = 51, 
		RULE_expression_root = 52, RULE_expression = 53, RULE_inline_expression = 54, 
		RULE_type_expression = 55, RULE_atomic = 56, RULE_control_expression = 57, 
		RULE_op_prefix = 58, RULE_op_suffix = 59, RULE_op_compare = 60, RULE_op_pattern = 61, 
		RULE_infix_map = 62, RULE_infix_pow = 63, RULE_infix_arrows = 64, RULE_op_multiple = 65, 
		RULE_op_plus = 66, RULE_op_logic = 67, RULE_op_pipeline = 68, RULE_op_assign = 69, 
		RULE_infix_is = 70, RULE_infix_as = 71, RULE_infix_in = 72, RULE_define_generic = 73, 
		RULE_generic_item = 74, RULE_generic_call = 75, RULE_generic_call_in_type = 76, 
		RULE_generic_pair = 77, RULE_define_label = 78, RULE_template_call = 79, 
		RULE_template_block = 80, RULE_template_statements = 81, RULE_where_block = 82, 
		RULE_where_bound = 83, RULE_macro_call = 84, RULE_annotation = 85, RULE_annotation_call_item = 86, 
		RULE_try_statement = 87, RULE_match_statement = 88, RULE_match_block = 89, 
		RULE_match_terms = 90, RULE_match_case_block = 91, RULE_case_pattern = 92, 
		RULE_case_pattern_item = 93, RULE_case_pattern_tuple = 94, RULE_object_statement = 95, 
		RULE_new_statement = 96, RULE_new_body = 97, RULE_new_block = 98, RULE_tuple_literal = 99, 
		RULE_collection_pair = 100, RULE_slice_call = 101, RULE_range_literal = 102, 
		RULE_range_axis = 103, RULE_range_start = 104, RULE_range_end = 105, RULE_range_step = 106, 
		RULE_modifiers = 107, RULE_modified_identifier = 108, RULE_modified_namepath = 109, 
		RULE_lambda_name = 110, RULE_output_name = 111, RULE_function_name = 112, 
		RULE_namepath_free = 113, RULE_namepath = 114, RULE_identifier = 115, 
		RULE_number = 116, RULE_number_literal = 117, RULE_string = 118, RULE_string_literal = 119;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "eos", "eos_free", "define_namespace", "import_statement", 
			"import_as", "import_term", "import_name", "import_block", "define_extension", 
			"define_class", "class_block", "class_inherit", "class_inherit_item", 
			"class_field", "class_method", "class_dsl", "define_trait", "trait_block", 
			"define_trait_type", "define_extends", "with_implements", "define_union", 
			"base_layout", "union_block", "define_variant", "variant_block", "define_bitflags", 
			"bitflags_block", "bitflags_item", "define_function", "function_parameters", 
			"parameter_item", "parameter_default", "function_call", "tuple_call_body", 
			"tuple_call_item", "define_lambda", "function_block", "let_binding", 
			"let_pattern", "let_pattern_plain", "let_pattern_tuple", "let_pattern_item", 
			"define_type", "type_hint", "effect_hint", "if_statement", "guard_statement", 
			"else_if_statement", "loop_statement", "if_guard", "expression_root", 
			"expression", "inline_expression", "type_expression", "atomic", "control_expression", 
			"op_prefix", "op_suffix", "op_compare", "op_pattern", "infix_map", "infix_pow", 
			"infix_arrows", "op_multiple", "op_plus", "op_logic", "op_pipeline", 
			"op_assign", "infix_is", "infix_as", "infix_in", "define_generic", "generic_item", 
			"generic_call", "generic_call_in_type", "generic_pair", "define_label", 
			"template_call", "template_block", "template_statements", "where_block", 
			"where_bound", "macro_call", "annotation", "annotation_call_item", "try_statement", 
			"match_statement", "match_block", "match_terms", "match_case_block", 
			"case_pattern", "case_pattern_item", "case_pattern_tuple", "object_statement", 
			"new_statement", "new_body", "new_block", "tuple_literal", "collection_pair", 
			"slice_call", "range_literal", "range_axis", "range_start", "range_end", 
			"range_step", "modifiers", "modified_identifier", "modified_namepath", 
			"lambda_name", "output_name", "function_name", "namepath_free", "namepath", 
			"identifier", "number", "number_literal", "string", "string_literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, "';'", null, null, null, "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'\u27E8'", "'\u27E9'", "'\u2045'", "'\u2046'", "'\u27E6'", 
			"'\u27E7'", "'\u2308'", "'\u2309'", "'\u230A'", "'\u230B'", "'\u2983'", 
			"'\u2984'", "'+'", "'-'", "'++'", "'--'", "'*'", null, null, null, "'%%'", 
			"'=='", null, null, null, null, "'<<='", null, null, "'<'", null, "'>>='", 
			null, null, "'>'", null, null, null, "'='", null, "'?='", "'+='", "'-='", 
			"'*='", "'/='", "'\u00AC'", null, "'\u2A5F'", "'\u22BC'", null, "'\u22BB'", 
			"'\u22BD'", "'\u2229'", "'\u222A'", "'&'", "'|'", "'\u203D'", "'\u21D4'", 
			null, null, null, "'@'", null, null, null, null, "'??'", "'?:'", "'?'", 
			"'!'", "'not'", null, "'in'", "'\u2209'", null, "'is'", null, null, null, 
			null, null, "'^'", "'\u215F'", "'\u221A'", "'\u221B'", "'\u221C'", null, 
			null, null, "'\u203B'", "'\u00B6'", null, null, "'extension'", null, 
			null, "'union'", "'flags'", "'type'", null, null, "'implement'", "'where'", 
			null, "'for'", "'let'", "'which'", "'new'", "'object'", "'lambda'", null, 
			"'try'", "'match'", "'catch'", "'with'", "'case'", "'when'", null, null, 
			null, null, null, "'if'", "'else'", "'otherwise'", "'return'", "'resume'", 
			"'yield'", "'break'", "'continue'", "'raise'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COMMA", "SEMICOLON", "FAKE_COLON", "OP_PROPORTION", "COLON", 
			"PARENTHESES_L", "PARENTHESES_R", "BRACKET_L", "BRACKET_R", "BRACE_L", 
			"BRACE_R", "GENERIC_L", "GENERIC_R", "OFFSET_L", "OFFSET_R", "RANGE_L", 
			"RANGE_R", "CEILING_L", "CEILING_R", "FLOOR_L", "FLOOR_R", "COLLECTION_L", 
			"COLLECTION_R", "OP_ADD", "OP_SUB", "OP_INC", "OP_DEC", "OP_MUL", "OP_DIV", 
			"OP_REM", "OP_DIV_REM", "OP_LAST", "OP_EQ", "OP_NE", "OP_NEE", "OP_EEE", 
			"OP_LEQ", "OP_LLE", "OP_LLL", "OP_LL", "OP_LT", "OP_GEQ", "OP_GGE", "OP_GGG", 
			"OP_GG", "OP_GT", "OP_LEFT", "OP_ARROW", "OP_ARROW2", "OP_ASSIGN", "OP_BIND", 
			"OP_MAY_ASSIGN", "OP_ADD_ASSIGN", "OP_SUB_ASSIGN", "OP_MUL_ASSIGN", "OP_DIV_ASSIGN", 
			"LOGIC_NOT", "LOGIC_AND", "LOGIC_XAND", "LOGIC_NAND", "LOGIC_OR", "LOGIC_XOR", 
			"LOGIC_NOR", "SET_INTERSECTION", "SET_UNION", "OP_AND", "OP_OR", "OP_IMPL", 
			"OP_IFF", "OP_MAP", "OP_APPLY2", "OP_APPLY3", "OP_AT", "OP_HASH", "LAMBDA_SLOT", 
			"MACRO_SLOT", "OP_UNIMPLEMENTED", "OP_OR_DEFAULT", "OP_OR_ELSE", "OP_AND_THEN", 
			"OP_NOT", "KW_NOT", "OP_IN", "KW_IN", "OP_NOT_IN", "OP_CONTINUES", "KW_IS", 
			"OP_IS", "OP_IS_NOT", "KW_AS", "OP_DECONSTRUCT", "OP_UNTIL", "OP_POW", 
			"OP_INVERSE", "OP_ROOT2", "OP_ROOT3", "OP_ROOT4", "OP_TEMPERATURE", "OP_TRANSPOSE", 
			"OP_PERCENT", "OP_REFERENCE", "OP_LABEL", "KW_NAMESPACE", "KW_IMPORT", 
			"KW_EXTENSION", "KW_CLASS", "KW_TRAIT", "KW_UNION", "KW_BITFLAGS", "KW_TYPE", 
			"KW_TEMPLATE", "KW_EXTENDS", "KW_IMPLEMENTS", "KW_WHERE", "KW_WHILE", 
			"KW_FOR", "KW_LET", "KW_WITCH", "KW_NEW", "KW_OBJECT", "KW_LAMBDA", "KW_FUNCTION", 
			"KW_TRY", "KW_MATCH", "KW_CATCH", "KW_WITH", "KW_CASE", "KW_WHEN", "INTEGER", 
			"DECIMAL", "STRING_SINGLE", "STRING_DOUBLE", "STRING_BLOCK", "KW_IF", 
			"KW_ELSE", "KW_OTHERWISE", "RETURN", "RESUME", "YIELD", "BREAK", "CONTINUE", 
			"RAISE", "SPECIAL", "RAW_ID", "UNICODE_ID", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WHITE_SPACE", "ERROR_CHARACTAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ValkyrieAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ValkyrieAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ValkyrieAntlrParser.EOF, 0); }
		public List<Define_namespaceContext> define_namespace() {
			return getRuleContexts(Define_namespaceContext.class);
		}
		public Define_namespaceContext define_namespace(int i) {
			return getRuleContext(Define_namespaceContext.class,i);
		}
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public List<Define_extensionContext> define_extension() {
			return getRuleContexts(Define_extensionContext.class);
		}
		public Define_extensionContext define_extension(int i) {
			return getRuleContext(Define_extensionContext.class,i);
		}
		public List<Define_classContext> define_class() {
			return getRuleContexts(Define_classContext.class);
		}
		public Define_classContext define_class(int i) {
			return getRuleContext(Define_classContext.class,i);
		}
		public List<Define_unionContext> define_union() {
			return getRuleContexts(Define_unionContext.class);
		}
		public Define_unionContext define_union(int i) {
			return getRuleContext(Define_unionContext.class,i);
		}
		public List<Define_bitflagsContext> define_bitflags() {
			return getRuleContexts(Define_bitflagsContext.class);
		}
		public Define_bitflagsContext define_bitflags(int i) {
			return getRuleContext(Define_bitflagsContext.class,i);
		}
		public List<Define_traitContext> define_trait() {
			return getRuleContexts(Define_traitContext.class);
		}
		public Define_traitContext define_trait(int i) {
			return getRuleContext(Define_traitContext.class,i);
		}
		public List<Define_extendsContext> define_extends() {
			return getRuleContexts(Define_extendsContext.class);
		}
		public Define_extendsContext define_extends(int i) {
			return getRuleContext(Define_extendsContext.class,i);
		}
		public List<Define_functionContext> define_function() {
			return getRuleContexts(Define_functionContext.class);
		}
		public Define_functionContext define_function(int i) {
			return getRuleContext(Define_functionContext.class,i);
		}
		public List<Define_typeContext> define_type() {
			return getRuleContexts(Define_typeContext.class);
		}
		public Define_typeContext define_type(int i) {
			return getRuleContext(Define_typeContext.class,i);
		}
		public List<Define_lambdaContext> define_lambda() {
			return getRuleContexts(Define_lambdaContext.class);
		}
		public Define_lambdaContext define_lambda(int i) {
			return getRuleContext(Define_lambdaContext.class,i);
		}
		public List<Let_bindingContext> let_binding() {
			return getRuleContexts(Let_bindingContext.class);
		}
		public Let_bindingContext let_binding(int i) {
			return getRuleContext(Let_bindingContext.class,i);
		}
		public List<Loop_statementContext> loop_statement() {
			return getRuleContexts(Loop_statementContext.class);
		}
		public Loop_statementContext loop_statement(int i) {
			return getRuleContext(Loop_statementContext.class,i);
		}
		public List<Guard_statementContext> guard_statement() {
			return getRuleContexts(Guard_statementContext.class);
		}
		public Guard_statementContext guard_statement(int i) {
			return getRuleContext(Guard_statementContext.class,i);
		}
		public List<Expression_rootContext> expression_root() {
			return getRuleContexts(Expression_rootContext.class);
		}
		public Expression_rootContext expression_root(int i) {
			return getRuleContext(Expression_rootContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMICOLON) | (1L << PARENTHESES_L) | (1L << BRACKET_L) | (1L << BRACE_L) | (1L << OFFSET_L) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_MUL) | (1L << OP_REM) | (1L << OP_LAST))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OP_AND - 67)) | (1L << (OP_AT - 67)) | (1L << (OP_HASH - 67)) | (1L << (LAMBDA_SLOT - 67)) | (1L << (OP_NOT - 67)) | (1L << (OP_DECONSTRUCT - 67)) | (1L << (OP_INVERSE - 67)) | (1L << (OP_ROOT2 - 67)) | (1L << (OP_ROOT3 - 67)) | (1L << (OP_ROOT4 - 67)) | (1L << (OP_REFERENCE - 67)) | (1L << (OP_LABEL - 67)) | (1L << (KW_NAMESPACE - 67)) | (1L << (KW_IMPORT - 67)) | (1L << (KW_EXTENSION - 67)) | (1L << (KW_CLASS - 67)) | (1L << (KW_TRAIT - 67)) | (1L << (KW_UNION - 67)) | (1L << (KW_BITFLAGS - 67)) | (1L << (KW_TYPE - 67)) | (1L << (KW_TEMPLATE - 67)) | (1L << (KW_EXTENDS - 67)) | (1L << (KW_WHILE - 67)) | (1L << (KW_FOR - 67)) | (1L << (KW_LET - 67)) | (1L << (KW_NEW - 67)) | (1L << (KW_OBJECT - 67)) | (1L << (KW_LAMBDA - 67)) | (1L << (KW_FUNCTION - 67)) | (1L << (KW_TRY - 67)) | (1L << (KW_MATCH - 67)) | (1L << (KW_CATCH - 67)) | (1L << (INTEGER - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DECIMAL - 131)) | (1L << (STRING_SINGLE - 131)) | (1L << (STRING_DOUBLE - 131)) | (1L << (STRING_BLOCK - 131)) | (1L << (KW_IF - 131)) | (1L << (RETURN - 131)) | (1L << (RESUME - 131)) | (1L << (YIELD - 131)) | (1L << (BREAK - 131)) | (1L << (CONTINUE - 131)) | (1L << (RAISE - 131)) | (1L << (SPECIAL - 131)) | (1L << (RAW_ID - 131)) | (1L << (UNICODE_ID - 131)))) != 0)) {
				{
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(240);
					define_namespace();
					}
					break;
				case 2:
					{
					setState(241);
					import_statement();
					}
					break;
				case 3:
					{
					setState(242);
					define_extension();
					}
					break;
				case 4:
					{
					setState(243);
					define_class();
					}
					break;
				case 5:
					{
					setState(244);
					define_union();
					}
					break;
				case 6:
					{
					setState(245);
					define_bitflags();
					}
					break;
				case 7:
					{
					setState(246);
					define_trait();
					}
					break;
				case 8:
					{
					setState(247);
					define_extends();
					}
					break;
				case 9:
					{
					setState(248);
					define_function();
					}
					break;
				case 10:
					{
					setState(249);
					define_type();
					}
					break;
				case 11:
					{
					setState(250);
					define_lambda();
					}
					break;
				case 12:
					{
					setState(251);
					let_binding();
					}
					break;
				case 13:
					{
					setState(252);
					loop_statement();
					}
					break;
				case 14:
					{
					setState(253);
					guard_statement();
					}
					break;
				case 15:
					{
					setState(254);
					expression_root();
					}
					break;
				case 16:
					{
					setState(255);
					eos();
					}
					break;
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(ValkyrieAntlrParser.SEMICOLON, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eos_freeContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ValkyrieAntlrParser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(ValkyrieAntlrParser.SEMICOLON, 0); }
		public Eos_freeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos_free; }
	}

	public final Eos_freeContext eos_free() throws RecognitionException {
		Eos_freeContext _localctx = new Eos_freeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eos_free);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_namespaceContext extends ParserRuleContext {
		public TerminalNode KW_NAMESPACE() { return getToken(ValkyrieAntlrParser.KW_NAMESPACE, 0); }
		public Namepath_freeContext namepath_free() {
			return getRuleContext(Namepath_freeContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Define_namespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_namespace; }
	}

	public final Define_namespaceContext define_namespace() throws RecognitionException {
		Define_namespaceContext _localctx = new Define_namespaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(KW_NAMESPACE);
			setState(268);
			namepath_free();
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(269);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode KW_IMPORT() { return getToken(ValkyrieAntlrParser.KW_IMPORT, 0); }
		public Import_termContext import_term() {
			return getRuleContext(Import_termContext.class,0);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(KW_IMPORT);
			setState(273);
			import_term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_asContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(ValkyrieAntlrParser.KW_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_AT() { return getToken(ValkyrieAntlrParser.OP_AT, 0); }
		public TerminalNode OP_HASH() { return getToken(ValkyrieAntlrParser.OP_HASH, 0); }
		public Import_asContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as; }
	}

	public final Import_asContext import_as() throws RecognitionException {
		Import_asContext _localctx = new Import_asContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_as);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(KW_AS);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_AT || _la==OP_HASH) {
				{
				setState(276);
				_la = _input.LA(1);
				if ( !(_la==OP_AT || _la==OP_HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(279);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_termContext extends ParserRuleContext {
		public Import_blockContext import_block() {
			return getRuleContext(Import_blockContext.class,0);
		}
		public TerminalNode OP_AT() { return getToken(ValkyrieAntlrParser.OP_AT, 0); }
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_asContext import_as() {
			return getRuleContext(Import_asContext.class,0);
		}
		public TerminalNode OP_PROPORTION() { return getToken(ValkyrieAntlrParser.OP_PROPORTION, 0); }
		public TerminalNode DOT() { return getToken(ValkyrieAntlrParser.DOT, 0); }
		public TerminalNode OP_HASH() { return getToken(ValkyrieAntlrParser.OP_HASH, 0); }
		public Eos_freeContext eos_free() {
			return getRuleContext(Eos_freeContext.class,0);
		}
		public Import_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_term; }
	}

	public final Import_termContext import_term() throws RecognitionException {
		Import_termContext _localctx = new Import_termContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_import_term);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				import_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(OP_AT);
				setState(283);
				import_name();
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(284);
					import_as();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(OP_AT);
				setState(288);
				import_name();
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT || _la==OP_PROPORTION) {
						{
						setState(289);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==OP_PROPORTION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(292);
					import_block();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(OP_HASH);
				setState(296);
				import_name();
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(297);
					import_as();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				match(OP_HASH);
				setState(301);
				import_name();
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT || _la==OP_PROPORTION) {
						{
						setState(302);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==OP_PROPORTION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(305);
					import_block();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				import_name();
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(309);
					import_as();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(312);
				import_name();
				setState(317);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT || _la==OP_PROPORTION) {
						{
						setState(313);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==OP_PROPORTION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(316);
					import_block();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(319);
				eos_free();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(ValkyrieAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(ValkyrieAntlrParser.OP_PROPORTION, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ValkyrieAntlrParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ValkyrieAntlrParser.DOT, i);
		}
		public TerminalNode OP_MUL() { return getToken(ValkyrieAntlrParser.OP_MUL, 0); }
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			identifier();
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(323);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==OP_PROPORTION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(324);
					identifier();
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==OP_PROPORTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(331);
			match(OP_MUL);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Import_termContext> import_term() {
			return getRuleContexts(Import_termContext.class);
		}
		public Import_termContext import_term(int i) {
			return getRuleContext(Import_termContext.class,i);
		}
		public Import_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_block; }
	}

	public final Import_blockContext import_block() throws RecognitionException {
		Import_blockContext _localctx = new Import_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_import_block);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(BRACE_L);
				setState(334);
				match(BRACE_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(BRACE_L);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << SEMICOLON) | (1L << BRACE_L))) != 0) || _la==OP_AT || _la==OP_HASH || _la==RAW_ID || _la==UNICODE_ID) {
					{
					{
					setState(336);
					import_term();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(BRACE_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_extensionContext extends ParserRuleContext {
		public TerminalNode KW_EXTENSION() { return getToken(ValkyrieAntlrParser.KW_EXTENSION, 0); }
		public Define_extensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_extension; }
	}

	public final Define_extensionContext define_extension() throws RecognitionException {
		Define_extensionContext _localctx = new Define_extensionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_define_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(KW_EXTENSION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_classContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_CLASS() { return getToken(ValkyrieAntlrParser.KW_CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public Template_callContext template_call() {
			return getRuleContext(Template_callContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Define_genericContext define_generic() {
			return getRuleContext(Define_genericContext.class,0);
		}
		public Class_inheritContext class_inherit() {
			return getRuleContext(Class_inheritContext.class,0);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Define_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_class; }
	}

	public final Define_classContext define_class() throws RecognitionException {
		Define_classContext _localctx = new Define_classContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_define_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(347);
				template_call();
				}
				break;
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(350);
				annotation();
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			modifiers();
			setState(357);
			match(KW_CLASS);
			setState(358);
			identifier();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << GENERIC_L) | (1L << OP_LT))) != 0)) {
				{
				setState(359);
				define_generic();
				}
			}

			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(362);
				class_inherit();
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(365);
				type_hint();
				}
			}

			setState(368);
			class_block();
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(369);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Class_dslContext> class_dsl() {
			return getRuleContexts(Class_dslContext.class);
		}
		public Class_dslContext class_dsl(int i) {
			return getRuleContext(Class_dslContext.class,i);
		}
		public List<Class_methodContext> class_method() {
			return getRuleContexts(Class_methodContext.class);
		}
		public Class_methodContext class_method(int i) {
			return getRuleContext(Class_methodContext.class,i);
		}
		public List<Class_fieldContext> class_field() {
			return getRuleContexts(Class_fieldContext.class);
		}
		public Class_fieldContext class_field(int i) {
			return getRuleContext(Class_fieldContext.class,i);
		}
		public List<Eos_freeContext> eos_free() {
			return getRuleContexts(Eos_freeContext.class);
		}
		public Eos_freeContext eos_free(int i) {
			return getRuleContext(Eos_freeContext.class,i);
		}
		public Class_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_block; }
	}

	public final Class_blockContext class_block() throws RecognitionException {
		Class_blockContext _localctx = new Class_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_class_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(BRACE_L);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || _la==OP_HASH || _la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(373);
					class_dsl();
					}
					break;
				case 2:
					{
					setState(374);
					class_method();
					}
					break;
				case 3:
					{
					setState(375);
					class_field();
					}
					break;
				case 4:
					{
					setState(376);
					eos_free();
					}
					break;
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_inheritContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Class_inherit_itemContext> class_inherit_item() {
			return getRuleContexts(Class_inherit_itemContext.class);
		}
		public Class_inherit_itemContext class_inherit_item(int i) {
			return getRuleContext(Class_inherit_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Class_inheritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_inherit; }
	}

	public final Class_inheritContext class_inherit() throws RecognitionException {
		Class_inheritContext _localctx = new Class_inheritContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_inherit);
		int _la;
		try {
			int _alt;
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(PARENTHESES_L);
				setState(385);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(PARENTHESES_L);
				setState(387);
				class_inherit_item();
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(388);
						match(COMMA);
						setState(389);
						class_inherit_item();
						}
						} 
					}
					setState(394);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(395);
					match(COMMA);
					}
				}

				setState(398);
				match(PARENTHESES_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_inherit_itemContext extends ParserRuleContext {
		public Modified_namepathContext modified_namepath() {
			return getRuleContext(Modified_namepathContext.class,0);
		}
		public Class_inherit_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_inherit_item; }
	}

	public final Class_inherit_itemContext class_inherit_item() throws RecognitionException {
		Class_inherit_itemContext _localctx = new Class_inherit_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_class_inherit_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			modified_namepath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_fieldContext extends ParserRuleContext {
		public Modified_identifierContext modified_identifier() {
			return getRuleContext(Modified_identifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Parameter_defaultContext parameter_default() {
			return getRuleContext(Parameter_defaultContext.class,0);
		}
		public Class_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_field; }
	}

	public final Class_fieldContext class_field() throws RecognitionException {
		Class_fieldContext _localctx = new Class_fieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_class_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(404);
				annotation();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			modified_identifier();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(411);
				type_hint();
				}
			}

			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(414);
				parameter_default();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_methodContext extends ParserRuleContext {
		public Modified_namepathContext modified_namepath() {
			return getRuleContext(Modified_namepathContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Define_genericContext define_generic() {
			return getRuleContext(Define_genericContext.class,0);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Effect_hintContext effect_hint() {
			return getRuleContext(Effect_hintContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Class_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method; }
	}

	public final Class_methodContext class_method() throws RecognitionException {
		Class_methodContext _localctx = new Class_methodContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_class_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(417);
				annotation();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			modified_namepath();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << GENERIC_L) | (1L << OP_LT))) != 0)) {
				{
				setState(424);
				define_generic();
				}
			}

			setState(427);
			function_parameters();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(428);
				type_hint();
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DIV) {
				{
				setState(431);
				effect_hint();
				}
			}

			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_L) {
				{
				setState(434);
				function_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_dslContext extends ParserRuleContext {
		public Modified_identifierContext modified_identifier() {
			return getRuleContext(Modified_identifierContext.class,0);
		}
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Class_dslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_dsl; }
	}

	public final Class_dslContext class_dsl() throws RecognitionException {
		Class_dslContext _localctx = new Class_dslContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_class_dsl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(437);
				annotation();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			modified_identifier();
			setState(444);
			class_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_traitContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_TRAIT() { return getToken(ValkyrieAntlrParser.KW_TRAIT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Trait_blockContext trait_block() {
			return getRuleContext(Trait_blockContext.class,0);
		}
		public Template_callContext template_call() {
			return getRuleContext(Template_callContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Define_genericContext define_generic() {
			return getRuleContext(Define_genericContext.class,0);
		}
		public With_implementsContext with_implements() {
			return getRuleContext(With_implementsContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Define_traitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_trait; }
	}

	public final Define_traitContext define_trait() throws RecognitionException {
		Define_traitContext _localctx = new Define_traitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_define_trait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(446);
				template_call();
				}
				break;
			}
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(449);
				annotation();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			modifiers();
			setState(456);
			match(KW_TRAIT);
			setState(457);
			identifier();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << GENERIC_L) | (1L << OP_LT))) != 0)) {
				{
				setState(458);
				define_generic();
				}
			}

			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==KW_IMPLEMENTS) {
				{
				setState(461);
				with_implements();
				}
			}

			setState(464);
			trait_block();
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(465);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trait_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Define_trait_typeContext> define_trait_type() {
			return getRuleContexts(Define_trait_typeContext.class);
		}
		public Define_trait_typeContext define_trait_type(int i) {
			return getRuleContext(Define_trait_typeContext.class,i);
		}
		public List<Class_methodContext> class_method() {
			return getRuleContexts(Class_methodContext.class);
		}
		public Class_methodContext class_method(int i) {
			return getRuleContext(Class_methodContext.class,i);
		}
		public List<Class_fieldContext> class_field() {
			return getRuleContexts(Class_fieldContext.class);
		}
		public Class_fieldContext class_field(int i) {
			return getRuleContext(Class_fieldContext.class,i);
		}
		public List<Eos_freeContext> eos_free() {
			return getRuleContexts(Eos_freeContext.class);
		}
		public Eos_freeContext eos_free(int i) {
			return getRuleContext(Eos_freeContext.class,i);
		}
		public Trait_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_block; }
	}

	public final Trait_blockContext trait_block() throws RecognitionException {
		Trait_blockContext _localctx = new Trait_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_trait_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(BRACE_L);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || _la==OP_HASH || _la==KW_TYPE || _la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(469);
					define_trait_type();
					}
					break;
				case 2:
					{
					setState(470);
					class_method();
					}
					break;
				case 3:
					{
					setState(471);
					class_field();
					}
					break;
				case 4:
					{
					setState(472);
					eos_free();
					}
					break;
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_trait_typeContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(ValkyrieAntlrParser.KW_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Define_trait_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_trait_type; }
	}

	public final Define_trait_typeContext define_trait_type() throws RecognitionException {
		Define_trait_typeContext _localctx = new Define_trait_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_define_trait_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(KW_TYPE);
			setState(481);
			identifier();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(482);
				match(OP_ASSIGN);
				setState(483);
				type_expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_extendsContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_EXTENDS() { return getToken(ValkyrieAntlrParser.KW_EXTENDS, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Trait_blockContext trait_block() {
			return getRuleContext(Trait_blockContext.class,0);
		}
		public Template_callContext template_call() {
			return getRuleContext(Template_callContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Define_genericContext define_generic() {
			return getRuleContext(Define_genericContext.class,0);
		}
		public With_implementsContext with_implements() {
			return getRuleContext(With_implementsContext.class,0);
		}
		public Define_extendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_extends; }
	}

	public final Define_extendsContext define_extends() throws RecognitionException {
		Define_extendsContext _localctx = new Define_extendsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_define_extends);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(486);
				template_call();
				}
				break;
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(489);
				annotation();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			modifiers();
			setState(496);
			match(KW_EXTENDS);
			setState(497);
			namepath();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << GENERIC_L) | (1L << OP_LT))) != 0)) {
				{
				setState(498);
				define_generic();
				}
			}

			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==KW_IMPLEMENTS) {
				{
				setState(501);
				with_implements();
				}
			}

			setState(504);
			trait_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_implementsContext extends ParserRuleContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public TerminalNode KW_IMPLEMENTS() { return getToken(ValkyrieAntlrParser.KW_IMPLEMENTS, 0); }
		public With_implementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_implements; }
	}

	public final With_implementsContext with_implements() throws RecognitionException {
		With_implementsContext _localctx = new With_implementsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_with_implements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==KW_IMPLEMENTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(507);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_unionContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_UNION() { return getToken(ValkyrieAntlrParser.KW_UNION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Union_blockContext union_block() {
			return getRuleContext(Union_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Base_layoutContext base_layout() {
			return getRuleContext(Base_layoutContext.class,0);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Define_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_union; }
	}

	public final Define_unionContext define_union() throws RecognitionException {
		Define_unionContext _localctx = new Define_unionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_define_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(509);
				annotation();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			modifiers();
			setState(516);
			match(KW_UNION);
			setState(517);
			identifier();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(518);
				base_layout();
				}
			}

			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(521);
				type_hint();
				}
			}

			setState(524);
			union_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_layoutContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Base_layoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_layout; }
	}

	public final Base_layoutContext base_layout() throws RecognitionException {
		Base_layoutContext _localctx = new Base_layoutContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_base_layout);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(PARENTHESES_L);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHESES_L) | (1L << OP_REM) | (1L << OP_LAST))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (LAMBDA_SLOT - 76)) | (1L << (INTEGER - 76)) | (1L << (DECIMAL - 76)) | (1L << (STRING_SINGLE - 76)) | (1L << (STRING_DOUBLE - 76)) | (1L << (STRING_BLOCK - 76)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SPECIAL - 144)) | (1L << (RAW_ID - 144)) | (1L << (UNICODE_ID - 144)))) != 0)) {
				{
				setState(527);
				type_expression(0);
				}
			}

			setState(530);
			match(PARENTHESES_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Union_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Class_methodContext> class_method() {
			return getRuleContexts(Class_methodContext.class);
		}
		public Class_methodContext class_method(int i) {
			return getRuleContext(Class_methodContext.class,i);
		}
		public List<Define_variantContext> define_variant() {
			return getRuleContexts(Define_variantContext.class);
		}
		public Define_variantContext define_variant(int i) {
			return getRuleContext(Define_variantContext.class,i);
		}
		public List<Eos_freeContext> eos_free() {
			return getRuleContexts(Eos_freeContext.class);
		}
		public Eos_freeContext eos_free(int i) {
			return getRuleContext(Eos_freeContext.class,i);
		}
		public Union_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_block; }
	}

	public final Union_blockContext union_block() throws RecognitionException {
		Union_blockContext _localctx = new Union_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_union_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(BRACE_L);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || _la==OP_HASH || _la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(533);
					class_method();
					}
					break;
				case 2:
					{
					setState(534);
					define_variant();
					}
					break;
				case 3:
					{
					setState(535);
					eos_free();
					}
					break;
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_variantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variant_blockContext variant_block() {
			return getRuleContext(Variant_blockContext.class,0);
		}
		public Define_variantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_variant; }
	}

	public final Define_variantContext define_variant() throws RecognitionException {
		Define_variantContext _localctx = new Define_variantContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_define_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			identifier();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRACE_L) {
				{
				setState(544);
				variant_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Class_fieldContext> class_field() {
			return getRuleContexts(Class_fieldContext.class);
		}
		public Class_fieldContext class_field(int i) {
			return getRuleContext(Class_fieldContext.class,i);
		}
		public List<Eos_freeContext> eos_free() {
			return getRuleContexts(Eos_freeContext.class);
		}
		public Eos_freeContext eos_free(int i) {
			return getRuleContext(Eos_freeContext.class,i);
		}
		public Variant_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_block; }
	}

	public final Variant_blockContext variant_block() throws RecognitionException {
		Variant_blockContext _localctx = new Variant_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variant_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(BRACE_L);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || _la==OP_HASH || _la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_HASH:
				case RAW_ID:
				case UNICODE_ID:
					{
					setState(548);
					class_field();
					}
					break;
				case COMMA:
				case SEMICOLON:
					{
					setState(549);
					eos_free();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_bitflagsContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_BITFLAGS() { return getToken(ValkyrieAntlrParser.KW_BITFLAGS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Bitflags_blockContext bitflags_block() {
			return getRuleContext(Bitflags_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Base_layoutContext base_layout() {
			return getRuleContext(Base_layoutContext.class,0);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Define_bitflagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_bitflags; }
	}

	public final Define_bitflagsContext define_bitflags() throws RecognitionException {
		Define_bitflagsContext _localctx = new Define_bitflagsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_define_bitflags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(557);
				annotation();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			modifiers();
			setState(564);
			match(KW_BITFLAGS);
			setState(565);
			identifier();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(566);
				base_layout();
				}
			}

			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(569);
				type_hint();
				}
			}

			setState(572);
			bitflags_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitflags_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Class_methodContext> class_method() {
			return getRuleContexts(Class_methodContext.class);
		}
		public Class_methodContext class_method(int i) {
			return getRuleContext(Class_methodContext.class,i);
		}
		public List<Bitflags_itemContext> bitflags_item() {
			return getRuleContexts(Bitflags_itemContext.class);
		}
		public Bitflags_itemContext bitflags_item(int i) {
			return getRuleContext(Bitflags_itemContext.class,i);
		}
		public List<Eos_freeContext> eos_free() {
			return getRuleContexts(Eos_freeContext.class);
		}
		public Eos_freeContext eos_free(int i) {
			return getRuleContext(Eos_freeContext.class,i);
		}
		public Bitflags_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitflags_block; }
	}

	public final Bitflags_blockContext bitflags_block() throws RecognitionException {
		Bitflags_blockContext _localctx = new Bitflags_blockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bitflags_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(BRACE_L);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || _la==OP_HASH || _la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(575);
					class_method();
					}
					break;
				case 2:
					{
					setState(576);
					bitflags_item();
					}
					break;
				case 3:
					{
					setState(577);
					eos_free();
					}
					break;
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitflags_itemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bitflags_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitflags_item; }
	}

	public final Bitflags_itemContext bitflags_item() throws RecognitionException {
		Bitflags_itemContext _localctx = new Bitflags_itemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bitflags_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(585);
				annotation();
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(591);
			identifier();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(592);
				match(OP_ASSIGN);
				setState(593);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_functionContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_FUNCTION() { return getToken(ValkyrieAntlrParser.KW_FUNCTION, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Template_callContext template_call() {
			return getRuleContext(Template_callContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Define_genericContext define_generic() {
			return getRuleContext(Define_genericContext.class,0);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Effect_hintContext effect_hint() {
			return getRuleContext(Effect_hintContext.class,0);
		}
		public Define_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_function; }
	}

	public final Define_functionContext define_function() throws RecognitionException {
		Define_functionContext _localctx = new Define_functionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_define_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(596);
				template_call();
				}
				break;
			}
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(599);
				annotation();
				}
				}
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(605);
			modifiers();
			setState(606);
			match(KW_FUNCTION);
			setState(607);
			namepath();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << GENERIC_L) | (1L << OP_LT))) != 0)) {
				{
				setState(608);
				define_generic();
				}
			}

			setState(611);
			function_parameters();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(612);
				type_hint();
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DIV) {
				{
				setState(615);
				effect_hint();
				}
			}

			setState(618);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_parametersContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Parameter_itemContext> parameter_item() {
			return getRuleContexts(Parameter_itemContext.class);
		}
		public Parameter_itemContext parameter_item(int i) {
			return getRuleContext(Parameter_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_parameters);
		int _la;
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				match(PARENTHESES_L);
				setState(621);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
				match(PARENTHESES_L);
				setState(623);
				parameter_item();
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(624);
					match(COMMA);
					setState(625);
					parameter_item();
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(631);
				match(PARENTHESES_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_itemContext extends ParserRuleContext {
		public Modified_identifierContext modified_identifier() {
			return getRuleContext(Modified_identifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Parameter_defaultContext parameter_default() {
			return getRuleContext(Parameter_defaultContext.class,0);
		}
		public Parameter_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_item; }
	}

	public final Parameter_itemContext parameter_item() throws RecognitionException {
		Parameter_itemContext _localctx = new Parameter_itemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(635);
				annotation();
				}
				}
				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(641);
			modified_identifier();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(642);
				type_hint();
				}
			}

			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(645);
				parameter_default();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_defaultContext extends ParserRuleContext {
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parameter_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_default; }
	}

	public final Parameter_defaultContext parameter_default() throws RecognitionException {
		Parameter_defaultContext _localctx = new Parameter_defaultContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameter_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(OP_ASSIGN);
			setState(649);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Tuple_call_bodyContext tuple_call_body() {
			return getRuleContext(Tuple_call_bodyContext.class,0);
		}
		public TerminalNode OP_AND_THEN() { return getToken(ValkyrieAntlrParser.OP_AND_THEN, 0); }
		public TerminalNode DOT() { return getToken(ValkyrieAntlrParser.DOT, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public TerminalNode OP_AT() { return getToken(ValkyrieAntlrParser.OP_AT, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_function_call);
		int _la;
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_AND_THEN) {
					{
					setState(651);
					match(OP_AND_THEN);
					}
				}

				setState(654);
				tuple_call_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_AND_THEN) {
					{
					setState(655);
					match(OP_AND_THEN);
					}
				}

				setState(658);
				match(DOT);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_AT) {
					{
					setState(659);
					match(OP_AT);
					}
				}

				setState(662);
				namepath();
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(663);
					tuple_call_body();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_call_bodyContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Tuple_call_itemContext> tuple_call_item() {
			return getRuleContexts(Tuple_call_itemContext.class);
		}
		public Tuple_call_itemContext tuple_call_item(int i) {
			return getRuleContext(Tuple_call_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Tuple_call_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_call_body; }
	}

	public final Tuple_call_bodyContext tuple_call_body() throws RecognitionException {
		Tuple_call_bodyContext _localctx = new Tuple_call_bodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tuple_call_body);
		int _la;
		try {
			int _alt;
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(PARENTHESES_L);
				setState(669);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(PARENTHESES_L);
				setState(671);
				tuple_call_item();
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(672);
						match(COMMA);
						setState(673);
						tuple_call_item();
						}
						} 
					}
					setState(678);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				}
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(679);
					match(COMMA);
					}
				}

				setState(682);
				match(PARENTHESES_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_call_itemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tuple_call_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_call_item; }
	}

	public final Tuple_call_itemContext tuple_call_item() throws RecognitionException {
		Tuple_call_itemContext _localctx = new Tuple_call_itemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tuple_call_item);
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				identifier();
				setState(687);
				match(COLON);
				setState(688);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_lambdaContext extends ParserRuleContext {
		public TerminalNode KW_LAMBDA() { return getToken(ValkyrieAntlrParser.KW_LAMBDA, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Define_lambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_lambda; }
	}

	public final Define_lambdaContext define_lambda() throws RecognitionException {
		Define_lambdaContext _localctx = new Define_lambdaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_define_lambda);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(693);
				annotation();
				}
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(699);
			match(KW_LAMBDA);
			setState(700);
			function_parameters();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(701);
				type_hint();
				}
			}

			setState(704);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Define_typeContext> define_type() {
			return getRuleContexts(Define_typeContext.class);
		}
		public Define_typeContext define_type(int i) {
			return getRuleContext(Define_typeContext.class,i);
		}
		public List<Define_lambdaContext> define_lambda() {
			return getRuleContexts(Define_lambdaContext.class);
		}
		public Define_lambdaContext define_lambda(int i) {
			return getRuleContext(Define_lambdaContext.class,i);
		}
		public List<Let_bindingContext> let_binding() {
			return getRuleContexts(Let_bindingContext.class);
		}
		public Let_bindingContext let_binding(int i) {
			return getRuleContext(Let_bindingContext.class,i);
		}
		public List<Loop_statementContext> loop_statement() {
			return getRuleContexts(Loop_statementContext.class);
		}
		public Loop_statementContext loop_statement(int i) {
			return getRuleContext(Loop_statementContext.class,i);
		}
		public List<Guard_statementContext> guard_statement() {
			return getRuleContexts(Guard_statementContext.class);
		}
		public Guard_statementContext guard_statement(int i) {
			return getRuleContext(Guard_statementContext.class,i);
		}
		public List<Expression_rootContext> expression_root() {
			return getRuleContexts(Expression_rootContext.class);
		}
		public Expression_rootContext expression_root(int i) {
			return getRuleContext(Expression_rootContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(BRACE_L);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMICOLON) | (1L << PARENTHESES_L) | (1L << BRACKET_L) | (1L << BRACE_L) | (1L << OFFSET_L) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_MUL) | (1L << OP_REM) | (1L << OP_LAST))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OP_AND - 67)) | (1L << (OP_AT - 67)) | (1L << (OP_HASH - 67)) | (1L << (LAMBDA_SLOT - 67)) | (1L << (OP_NOT - 67)) | (1L << (OP_DECONSTRUCT - 67)) | (1L << (OP_INVERSE - 67)) | (1L << (OP_ROOT2 - 67)) | (1L << (OP_ROOT3 - 67)) | (1L << (OP_ROOT4 - 67)) | (1L << (OP_REFERENCE - 67)) | (1L << (OP_LABEL - 67)) | (1L << (KW_TYPE - 67)) | (1L << (KW_WHILE - 67)) | (1L << (KW_FOR - 67)) | (1L << (KW_LET - 67)) | (1L << (KW_NEW - 67)) | (1L << (KW_OBJECT - 67)) | (1L << (KW_LAMBDA - 67)) | (1L << (KW_TRY - 67)) | (1L << (KW_MATCH - 67)) | (1L << (KW_CATCH - 67)) | (1L << (INTEGER - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DECIMAL - 131)) | (1L << (STRING_SINGLE - 131)) | (1L << (STRING_DOUBLE - 131)) | (1L << (STRING_BLOCK - 131)) | (1L << (KW_IF - 131)) | (1L << (RETURN - 131)) | (1L << (RESUME - 131)) | (1L << (YIELD - 131)) | (1L << (BREAK - 131)) | (1L << (CONTINUE - 131)) | (1L << (RAISE - 131)) | (1L << (SPECIAL - 131)) | (1L << (RAW_ID - 131)) | (1L << (UNICODE_ID - 131)))) != 0)) {
				{
				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(707);
					define_type();
					}
					break;
				case 2:
					{
					setState(708);
					define_lambda();
					}
					break;
				case 3:
					{
					setState(709);
					let_binding();
					}
					break;
				case 4:
					{
					setState(710);
					loop_statement();
					}
					break;
				case 5:
					{
					setState(711);
					guard_statement();
					}
					break;
				case 6:
					{
					setState(712);
					expression_root();
					}
					break;
				case 7:
					{
					setState(713);
					eos();
					}
					break;
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_bindingContext extends ParserRuleContext {
		public TerminalNode KW_LET() { return getToken(ValkyrieAntlrParser.KW_LET, 0); }
		public Let_patternContext let_pattern() {
			return getRuleContext(Let_patternContext.class,0);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public Expression_rootContext expression_root() {
			return getRuleContext(Expression_rootContext.class,0);
		}
		public Let_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_binding; }
	}

	public final Let_bindingContext let_binding() throws RecognitionException {
		Let_bindingContext _localctx = new Let_bindingContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_let_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(KW_LET);
			setState(722);
			let_pattern();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(723);
				type_hint();
				}
			}

			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASSIGN) {
				{
				setState(726);
				match(OP_ASSIGN);
				setState(727);
				expression_root();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_patternContext extends ParserRuleContext {
		public Let_pattern_tupleContext let_pattern_tuple() {
			return getRuleContext(Let_pattern_tupleContext.class,0);
		}
		public Let_pattern_plainContext let_pattern_plain() {
			return getRuleContext(Let_pattern_plainContext.class,0);
		}
		public Let_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_pattern; }
	}

	public final Let_patternContext let_pattern() throws RecognitionException {
		Let_patternContext _localctx = new Let_patternContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_let_pattern);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				let_pattern_tuple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				let_pattern_plain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_pattern_plainContext extends ParserRuleContext {
		public List<Modified_identifierContext> modified_identifier() {
			return getRuleContexts(Modified_identifierContext.class);
		}
		public Modified_identifierContext modified_identifier(int i) {
			return getRuleContext(Modified_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Let_pattern_plainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_pattern_plain; }
	}

	public final Let_pattern_plainContext let_pattern_plain() throws RecognitionException {
		Let_pattern_plainContext _localctx = new Let_pattern_plainContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_let_pattern_plain);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			modified_identifier();
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(735);
					match(COMMA);
					setState(736);
					modified_identifier();
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(742);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_pattern_tupleContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Let_pattern_itemContext> let_pattern_item() {
			return getRuleContexts(Let_pattern_itemContext.class);
		}
		public Let_pattern_itemContext let_pattern_item(int i) {
			return getRuleContext(Let_pattern_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public Let_pattern_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_pattern_tuple; }
	}

	public final Let_pattern_tupleContext let_pattern_tuple() throws RecognitionException {
		Let_pattern_tupleContext _localctx = new Let_pattern_tupleContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_let_pattern_tuple);
		int _la;
		try {
			int _alt;
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(PARENTHESES_L);
				setState(759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(746);
					let_pattern_item();
					setState(747);
					match(COMMA);
					}
					break;
				case 2:
					{
					setState(749);
					let_pattern_item();
					setState(752); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(750);
							match(COMMA);
							setState(751);
							let_pattern_item();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(754); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(756);
						match(COMMA);
						}
					}

					}
					break;
				}
				setState(761);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				namepath();
				setState(763);
				match(PARENTHESES_L);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHESES_L) | (1L << BRACKET_L) | (1L << BRACE_L))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (OP_DECONSTRUCT - 92)) | (1L << (RAW_ID - 92)) | (1L << (UNICODE_ID - 92)))) != 0)) {
					{
					setState(764);
					let_pattern_item();
					setState(769);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(765);
							match(COMMA);
							setState(766);
							let_pattern_item();
							}
							} 
						}
						setState(771);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
					}
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(772);
						match(COMMA);
						}
					}

					}
				}

				setState(777);
				match(PARENTHESES_R);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(779);
					namepath();
					}
				}

				setState(782);
				match(BRACKET_L);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHESES_L) | (1L << BRACKET_L) | (1L << BRACE_L))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (OP_DECONSTRUCT - 92)) | (1L << (RAW_ID - 92)) | (1L << (UNICODE_ID - 92)))) != 0)) {
					{
					setState(783);
					let_pattern_item();
					setState(788);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(784);
							match(COMMA);
							setState(785);
							let_pattern_item();
							}
							} 
						}
						setState(790);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(791);
						match(COMMA);
						}
					}

					}
				}

				setState(796);
				match(BRACKET_R);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(797);
					namepath();
					}
				}

				setState(800);
				match(BRACE_L);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHESES_L) | (1L << BRACKET_L) | (1L << BRACE_L))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (OP_DECONSTRUCT - 92)) | (1L << (RAW_ID - 92)) | (1L << (UNICODE_ID - 92)))) != 0)) {
					{
					setState(801);
					let_pattern_item();
					setState(806);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(802);
							match(COMMA);
							setState(803);
							let_pattern_item();
							}
							} 
						}
						setState(808);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
					}
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(809);
						match(COMMA);
						}
					}

					}
				}

				setState(814);
				match(BRACE_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_pattern_itemContext extends ParserRuleContext {
		public IdentifierContext bind;
		public Let_pattern_tupleContext let_pattern_tuple() {
			return getRuleContext(Let_pattern_tupleContext.class,0);
		}
		public Modified_identifierContext modified_identifier() {
			return getRuleContext(Modified_identifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public TerminalNode OP_BIND() { return getToken(ValkyrieAntlrParser.OP_BIND, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OP_DECONSTRUCT() { return getToken(ValkyrieAntlrParser.OP_DECONSTRUCT, 0); }
		public Let_pattern_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_pattern_item; }
	}

	public final Let_pattern_itemContext let_pattern_item() throws RecognitionException {
		Let_pattern_itemContext _localctx = new Let_pattern_itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_let_pattern_item);
		int _la;
		try {
			setState(847);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(817);
					modified_identifier();
					setState(818);
					match(COLON);
					}
					break;
				}
				setState(825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(822);
					((Let_pattern_itemContext)_localctx).bind = identifier();
					setState(823);
					match(OP_BIND);
					}
					break;
				}
				setState(827);
				let_pattern_tuple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(828);
					modified_identifier();
					setState(829);
					match(COLON);
					}
					break;
				}
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(833);
					((Let_pattern_itemContext)_localctx).bind = identifier();
					setState(834);
					match(OP_BIND);
					}
					break;
				}
				setState(838);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(839);
					modified_identifier();
					}
				}

				setState(842);
				match(OP_DECONSTRUCT);
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(843);
					((Let_pattern_itemContext)_localctx).bind = identifier();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(846);
				modified_identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_typeContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(ValkyrieAntlrParser.KW_TYPE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public Define_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_type; }
	}

	public final Define_typeContext define_type() throws RecognitionException {
		Define_typeContext _localctx = new Define_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_define_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(KW_TYPE);
			setState(850);
			identifier();
			setState(851);
			match(OP_ASSIGN);
			setState(852);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_hintContext extends ParserRuleContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public TerminalNode OP_ARROW() { return getToken(ValkyrieAntlrParser.OP_ARROW, 0); }
		public Type_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_hint; }
	}

	public final Type_hintContext type_hint() throws RecognitionException {
		Type_hintContext _localctx = new Type_hintContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_type_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_la = _input.LA(1);
			if ( !(_la==COLON || _la==OP_ARROW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(855);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Effect_hintContext extends ParserRuleContext {
		public TerminalNode OP_DIV() { return getToken(ValkyrieAntlrParser.OP_DIV, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Effect_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect_hint; }
	}

	public final Effect_hintContext effect_hint() throws RecognitionException {
		Effect_hintContext _localctx = new Effect_hintContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_effect_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(OP_DIV);
			setState(858);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Function_blockContext then_block;
		public Function_blockContext else_block;
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public List<Function_blockContext> function_block() {
			return getRuleContexts(Function_blockContext.class);
		}
		public Function_blockContext function_block(int i) {
			return getRuleContext(Function_blockContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(ValkyrieAntlrParser.KW_ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(860);
				annotation();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(866);
			match(KW_IF);
			setState(867);
			inline_expression(0);
			setState(868);
			((If_statementContext)_localctx).then_block = function_block();
			setState(872);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(869);
					else_if_statement();
					}
					} 
				}
				setState(874);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(875);
				match(KW_ELSE);
				setState(876);
				((If_statementContext)_localctx).else_block = function_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Guard_statementContext extends ParserRuleContext {
		public Function_blockContext then;
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public TerminalNode KW_LET() { return getToken(ValkyrieAntlrParser.KW_LET, 0); }
		public TerminalNode KW_NOT() { return getToken(ValkyrieAntlrParser.KW_NOT, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Let_pattern_tupleContext let_pattern_tuple() {
			return getRuleContext(Let_pattern_tupleContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SPECIAL() { return getToken(ValkyrieAntlrParser.SPECIAL, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Guard_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_statement; }
	}

	public final Guard_statementContext guard_statement() throws RecognitionException {
		Guard_statementContext _localctx = new Guard_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_guard_statement);
		int _la;
		try {
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(879);
					annotation();
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
				match(KW_IF);
				setState(886);
				_la = _input.LA(1);
				if ( !(_la==KW_NOT || _la==KW_LET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(887);
					let_pattern_tuple();
					}
					break;
				case 2:
					{
					setState(888);
					identifier();
					}
					break;
				case 3:
					{
					setState(889);
					match(SPECIAL);
					}
					break;
				}
				setState(892);
				match(OP_ASSIGN);
				setState(893);
				inline_expression(0);
				setState(894);
				((Guard_statementContext)_localctx).then = function_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(896);
					annotation();
					}
					}
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(902);
				match(KW_IF);
				setState(903);
				_la = _input.LA(1);
				if ( !(_la==KW_NOT || _la==KW_LET) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(904);
				inline_expression(0);
				setState(905);
				((Guard_statementContext)_localctx).then = function_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode KW_ELSE() { return getToken(ValkyrieAntlrParser.KW_ELSE, 0); }
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(KW_ELSE);
			setState(910);
			match(KW_IF);
			setState(911);
			inline_expression(0);
			setState(912);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
	 
		public Loop_statementContext() { }
		public void copyFrom(Loop_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForLoopContext extends Loop_statementContext {
		public Inline_expressionContext cond;
		public Inline_expressionContext guard;
		public TerminalNode KW_FOR() { return getToken(ValkyrieAntlrParser.KW_FOR, 0); }
		public Let_patternContext let_pattern() {
			return getRuleContext(Let_patternContext.class,0);
		}
		public Infix_inContext infix_in() {
			return getRuleContext(Infix_inContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public ForLoopContext(Loop_statementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileLetContext extends Loop_statementContext {
		public TerminalNode KW_WHILE() { return getToken(ValkyrieAntlrParser.KW_WHILE, 0); }
		public TerminalNode KW_LET() { return getToken(ValkyrieAntlrParser.KW_LET, 0); }
		public Let_patternContext let_pattern() {
			return getRuleContext(Let_patternContext.class,0);
		}
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WhileLetContext(Loop_statementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileLoopContext extends Loop_statementContext {
		public Inline_expressionContext cond;
		public TerminalNode KW_WHILE() { return getToken(ValkyrieAntlrParser.KW_WHILE, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WhileLoopContext(Loop_statementContext ctx) { copyFrom(ctx); }
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_loop_statement);
		int _la;
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(914);
					annotation();
					}
					}
					setState(919);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(920);
				match(KW_WHILE);
				setState(921);
				((WhileLoopContext)_localctx).cond = inline_expression(0);
				setState(922);
				function_block();
				}
				break;
			case 2:
				_localctx = new WhileLetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(924);
					annotation();
					}
					}
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(930);
				match(KW_WHILE);
				setState(931);
				match(KW_LET);
				setState(932);
				let_pattern();
				setState(933);
				match(OP_ASSIGN);
				setState(934);
				inline_expression(0);
				setState(935);
				function_block();
				}
				break;
			case 3:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(937);
					annotation();
					}
					}
					setState(942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(943);
				match(KW_FOR);
				setState(944);
				let_pattern();
				setState(945);
				infix_in();
				setState(946);
				((ForLoopContext)_localctx).cond = inline_expression(0);
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IF) {
					{
					setState(947);
					match(KW_IF);
					setState(948);
					((ForLoopContext)_localctx).guard = inline_expression(0);
					}
				}

				setState(951);
				function_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_guardContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public If_guardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_guard; }
	}

	public final If_guardContext if_guard() throws RecognitionException {
		If_guardContext _localctx = new If_guardContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_if_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(KW_IF);
			setState(956);
			inline_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_rootContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode OP_AND_THEN() { return getToken(ValkyrieAntlrParser.OP_AND_THEN, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public Expression_rootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_root; }
	}

	public final Expression_rootContext expression_root() throws RecognitionException {
		Expression_rootContext _localctx = new Expression_rootContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expression_root);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(958);
					annotation();
					}
					} 
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(964);
			expression(0);
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_AND_THEN) {
				{
				setState(965);
				match(OP_AND_THEN);
				}
			}

			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(968);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EIfContext extends ExpressionContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public EIfContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EUntilContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public TerminalNode OP_UNTIL() { return getToken(ValkyrieAntlrParser.OP_UNTIL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EUntilContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EInContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public Infix_inContext infix_in() {
			return getRuleContext(Infix_inContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EInContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EPlusContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public Op_plusContext op_plus() {
			return getRuleContext(Op_plusContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EPlusContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ESliceContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Slice_callContext slice_call() {
			return getRuleContext(Slice_callContext.class,0);
		}
		public ESliceContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EDotMatchContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ValkyrieAntlrParser.DOT, 0); }
		public Match_blockContext match_block() {
			return getRuleContext(Match_blockContext.class,0);
		}
		public TerminalNode KW_MATCH() { return getToken(ValkyrieAntlrParser.KW_MATCH, 0); }
		public TerminalNode KW_CATCH() { return getToken(ValkyrieAntlrParser.KW_CATCH, 0); }
		public TerminalNode OP_AND_THEN() { return getToken(ValkyrieAntlrParser.OP_AND_THEN, 0); }
		public TerminalNode KW_AS() { return getToken(ValkyrieAntlrParser.KW_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public EDotMatchContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ETryContext extends ExpressionContext {
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public ETryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EAsContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Type_expressionContext rhs;
		public Infix_asContext infix_as() {
			return getRuleContext(Infix_asContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public EAsContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EObjectContext extends ExpressionContext {
		public Object_statementContext object_statement() {
			return getRuleContext(Object_statementContext.class,0);
		}
		public EObjectContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ETupleContext extends ExpressionContext {
		public Tuple_literalContext tuple_literal() {
			return getRuleContext(Tuple_literalContext.class,0);
		}
		public ETupleContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ERangeContext extends ExpressionContext {
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public ERangeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EAssignContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Type_expressionContext rhs;
		public Op_assignContext op_assign() {
			return getRuleContext(Op_assignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public EAssignContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EAtomContext extends ExpressionContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public EAtomContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EMulContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public Op_multipleContext op_multiple() {
			return getRuleContext(Op_multipleContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EMulContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EPipeContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public Op_pipelineContext op_pipeline() {
			return getRuleContext(Op_pipelineContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EPipeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ELambdaContext extends ExpressionContext {
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public ELambdaContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EOrElseContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Type_expressionContext rhs;
		public TerminalNode OP_OR_ELSE() { return getToken(ValkyrieAntlrParser.OP_OR_ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public EOrElseContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EGroupContext extends ExpressionContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public EGroupContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ESuffixContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Op_suffixContext op_suffix() {
			return getRuleContext(Op_suffixContext.class,0);
		}
		public ESuffixContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EFunctionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public EFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EClosureContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public TerminalNode OP_AND_THEN() { return getToken(ValkyrieAntlrParser.OP_AND_THEN, 0); }
		public TerminalNode DOT() { return getToken(ValkyrieAntlrParser.DOT, 0); }
		public EClosureContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EMatchContext extends ExpressionContext {
		public Match_statementContext match_statement() {
			return getRuleContext(Match_statementContext.class,0);
		}
		public EMatchContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EMacroContext extends ExpressionContext {
		public Macro_callContext macro_call() {
			return getRuleContext(Macro_callContext.class,0);
		}
		public EMacroContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EPrefixContext extends ExpressionContext {
		public Op_prefixContext op_prefix() {
			return getRuleContext(Op_prefixContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EPrefixContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ECompareContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public Op_compareContext op_compare() {
			return getRuleContext(Op_compareContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ECompareContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EGenericContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Generic_callContext generic_call() {
			return getRuleContext(Generic_callContext.class,0);
		}
		public EGenericContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EIsAContext extends ExpressionContext {
		public ExpressionContext lhs;
		public Type_expressionContext rhs;
		public Infix_isContext infix_is() {
			return getRuleContext(Infix_isContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public EIsAContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EPowContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public Infix_powContext infix_pow() {
			return getRuleContext(Infix_powContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EPowContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EDefineContext extends ExpressionContext {
		public Define_labelContext define_label() {
			return getRuleContext(Define_labelContext.class,0);
		}
		public EDefineContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EMapContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public Infix_mapContext infix_map() {
			return getRuleContext(Infix_mapContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EMapContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ELogicContext extends ExpressionContext {
		public ExpressionContext lhs;
		public ExpressionContext rhs;
		public Op_logicContext op_logic() {
			return getRuleContext(Op_logicContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ELogicContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EControlContext extends ExpressionContext {
		public Control_expressionContext control_expression() {
			return getRuleContext(Control_expressionContext.class,0);
		}
		public EControlContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ENewContext extends ExpressionContext {
		public New_statementContext new_statement() {
			return getRuleContext(New_statementContext.class,0);
		}
		public ENewContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				_localctx = new EPrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(972);
				op_prefix();
				setState(973);
				expression(27);
				}
				break;
			case 2:
				{
				_localctx = new EGroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(975);
				match(PARENTHESES_L);
				setState(976);
				expression(0);
				setState(977);
				match(PARENTHESES_R);
				}
				break;
			case 3:
				{
				_localctx = new EControlContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(979);
				control_expression();
				}
				break;
			case 4:
				{
				_localctx = new EIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(980);
				if_statement();
				}
				break;
			case 5:
				{
				_localctx = new ENewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(981);
				new_statement();
				}
				break;
			case 6:
				{
				_localctx = new ETryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(982);
				try_statement();
				}
				break;
			case 7:
				{
				_localctx = new EMatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(983);
				match_statement();
				}
				break;
			case 8:
				{
				_localctx = new EObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(984);
				object_statement();
				}
				break;
			case 9:
				{
				_localctx = new EMacroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(985);
				macro_call();
				}
				break;
			case 10:
				{
				_localctx = new ELambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(986);
				function_block();
				}
				break;
			case 11:
				{
				_localctx = new EDefineContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(987);
				define_label();
				}
				break;
			case 12:
				{
				_localctx = new ETupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(988);
				tuple_literal();
				}
				break;
			case 13:
				{
				_localctx = new ERangeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(989);
				range_literal();
				}
				break;
			case 14:
				{
				_localctx = new EAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(990);
				atomic();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1075);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1073);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						_localctx = new EPowContext(new ExpressionContext(_parentctx, _parentState));
						((EPowContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(993);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(994);
						infix_pow();
						setState(995);
						((EPowContext)_localctx).rhs = expression(26);
						}
						break;
					case 2:
						{
						_localctx = new EMulContext(new ExpressionContext(_parentctx, _parentState));
						((EMulContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(997);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(998);
						op_multiple();
						setState(999);
						((EMulContext)_localctx).rhs = expression(26);
						}
						break;
					case 3:
						{
						_localctx = new EPlusContext(new ExpressionContext(_parentctx, _parentState));
						((EPlusContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1001);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1002);
						op_plus();
						setState(1003);
						((EPlusContext)_localctx).rhs = expression(25);
						}
						break;
					case 4:
						{
						_localctx = new ELogicContext(new ExpressionContext(_parentctx, _parentState));
						((ELogicContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1005);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1006);
						op_logic();
						setState(1007);
						((ELogicContext)_localctx).rhs = expression(24);
						}
						break;
					case 5:
						{
						_localctx = new ECompareContext(new ExpressionContext(_parentctx, _parentState));
						((ECompareContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1009);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1010);
						op_compare();
						setState(1011);
						((ECompareContext)_localctx).rhs = expression(23);
						}
						break;
					case 6:
						{
						_localctx = new EUntilContext(new ExpressionContext(_parentctx, _parentState));
						((EUntilContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1013);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1014);
						match(OP_UNTIL);
						setState(1015);
						((EUntilContext)_localctx).rhs = expression(22);
						}
						break;
					case 7:
						{
						_localctx = new EMapContext(new ExpressionContext(_parentctx, _parentState));
						((EMapContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1016);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1017);
						infix_map();
						setState(1018);
						((EMapContext)_localctx).rhs = expression(21);
						}
						break;
					case 8:
						{
						_localctx = new EInContext(new ExpressionContext(_parentctx, _parentState));
						((EInContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1020);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1021);
						infix_in();
						setState(1022);
						((EInContext)_localctx).rhs = expression(18);
						}
						break;
					case 9:
						{
						_localctx = new EPipeContext(new ExpressionContext(_parentctx, _parentState));
						((EPipeContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1024);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1025);
						op_pipeline();
						setState(1026);
						((EPipeContext)_localctx).rhs = expression(16);
						}
						break;
					case 10:
						{
						_localctx = new ESuffixContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1028);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1029);
						op_suffix();
						}
						break;
					case 11:
						{
						_localctx = new ESliceContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1030);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1031);
						slice_call();
						}
						break;
					case 12:
						{
						_localctx = new EGenericContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1032);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1033);
						generic_call();
						}
						break;
					case 13:
						{
						_localctx = new EFunctionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1034);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(1035);
						function_call();
						}
						break;
					case 14:
						{
						_localctx = new EClosureContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1036);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(1038);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OP_AND_THEN) {
							{
							setState(1037);
							match(OP_AND_THEN);
							}
						}

						setState(1041);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DOT) {
							{
							setState(1040);
							match(DOT);
							}
						}

						setState(1043);
						function_block();
						}
						break;
					case 15:
						{
						_localctx = new EDotMatchContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1044);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(1046);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==OP_AND_THEN) {
							{
							setState(1045);
							match(OP_AND_THEN);
							}
						}

						setState(1048);
						match(DOT);
						setState(1049);
						_la = _input.LA(1);
						if ( !(_la==KW_MATCH || _la==KW_CATCH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1055);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==KW_AS) {
							{
							setState(1050);
							match(KW_AS);
							setState(1051);
							identifier();
							setState(1053);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COLON || _la==OP_ARROW) {
								{
								setState(1052);
								type_hint();
								}
							}

							}
						}

						setState(1057);
						match_block();
						}
						break;
					case 16:
						{
						_localctx = new EIsAContext(new ExpressionContext(_parentctx, _parentState));
						((EIsAContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1058);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1059);
						infix_is();
						setState(1060);
						((EIsAContext)_localctx).rhs = type_expression(0);
						}
						break;
					case 17:
						{
						_localctx = new EAsContext(new ExpressionContext(_parentctx, _parentState));
						((EAsContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1062);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1063);
						infix_as();
						setState(1064);
						((EAsContext)_localctx).rhs = type_expression(0);
						}
						break;
					case 18:
						{
						_localctx = new EOrElseContext(new ExpressionContext(_parentctx, _parentState));
						((EOrElseContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1066);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1067);
						match(OP_OR_ELSE);
						setState(1068);
						((EOrElseContext)_localctx).rhs = type_expression(0);
						}
						break;
					case 19:
						{
						_localctx = new EAssignContext(new ExpressionContext(_parentctx, _parentState));
						((EAssignContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1069);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1070);
						op_assign();
						setState(1071);
						((EAssignContext)_localctx).rhs = type_expression(0);
						}
						break;
					}
					} 
				}
				setState(1077);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Inline_expressionContext extends ParserRuleContext {
		public Inline_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_expression; }
	 
		public Inline_expressionContext() { }
		public void copyFrom(Inline_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ILogicContext extends Inline_expressionContext {
		public Inline_expressionContext lhs;
		public Inline_expressionContext rhs;
		public Op_logicContext op_logic() {
			return getRuleContext(Op_logicContext.class,0);
		}
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public ILogicContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IDotContext extends Inline_expressionContext {
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public IDotContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IPlusContext extends Inline_expressionContext {
		public Inline_expressionContext lhs;
		public Inline_expressionContext rhs;
		public Op_plusContext op_plus() {
			return getRuleContext(Op_plusContext.class,0);
		}
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public IPlusContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class ICompareContext extends Inline_expressionContext {
		public Inline_expressionContext lhs;
		public Inline_expressionContext rhs;
		public Op_compareContext op_compare() {
			return getRuleContext(Op_compareContext.class,0);
		}
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public ICompareContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IGenericContext extends Inline_expressionContext {
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Generic_callContext generic_call() {
			return getRuleContext(Generic_callContext.class,0);
		}
		public IGenericContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IIsAContext extends Inline_expressionContext {
		public Inline_expressionContext lhs;
		public Inline_expressionContext rhs;
		public Infix_isContext infix_is() {
			return getRuleContext(Infix_isContext.class,0);
		}
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public IIsAContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IMapContext extends Inline_expressionContext {
		public Inline_expressionContext lhs;
		public Inline_expressionContext rhs;
		public Infix_mapContext infix_map() {
			return getRuleContext(Infix_mapContext.class,0);
		}
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public IMapContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class ITupleContext extends Inline_expressionContext {
		public Tuple_literalContext tuple_literal() {
			return getRuleContext(Tuple_literalContext.class,0);
		}
		public ITupleContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IRangeContext extends Inline_expressionContext {
		public Inline_expressionContext lhs;
		public Inline_expressionContext rhs;
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public TerminalNode OP_UNTIL() { return getToken(ValkyrieAntlrParser.OP_UNTIL, 0); }
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public IRangeContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IMulContext extends Inline_expressionContext {
		public Inline_expressionContext lhs;
		public Inline_expressionContext rhs;
		public Op_multipleContext op_multiple() {
			return getRuleContext(Op_multipleContext.class,0);
		}
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public IMulContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IAsContext extends Inline_expressionContext {
		public Inline_expressionContext lhs;
		public Inline_expressionContext rhs;
		public TerminalNode KW_AS() { return getToken(ValkyrieAntlrParser.KW_AS, 0); }
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public IAsContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IPrefixContext extends Inline_expressionContext {
		public Op_prefixContext op_prefix() {
			return getRuleContext(Op_prefixContext.class,0);
		}
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public IPrefixContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IAtomContext extends Inline_expressionContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public IAtomContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class ISliceContext extends Inline_expressionContext {
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Slice_callContext slice_call() {
			return getRuleContext(Slice_callContext.class,0);
		}
		public ISliceContext(Inline_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Inline_expressionContext inline_expression() throws RecognitionException {
		return inline_expression(0);
	}

	private Inline_expressionContext inline_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inline_expressionContext _localctx = new Inline_expressionContext(_ctx, _parentState);
		Inline_expressionContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_inline_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_ADD:
			case OP_SUB:
			case OP_MUL:
			case OP_AND:
			case OP_NOT:
			case OP_DECONSTRUCT:
			case OP_INVERSE:
			case OP_ROOT2:
			case OP_ROOT3:
			case OP_ROOT4:
			case OP_REFERENCE:
				{
				_localctx = new IPrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1079);
				op_prefix();
				setState(1080);
				inline_expression(15);
				}
				break;
			case PARENTHESES_L:
				{
				_localctx = new ITupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1082);
				tuple_literal();
				}
				break;
			case BRACKET_L:
			case OFFSET_L:
				{
				_localctx = new IRangeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1083);
				range_literal();
				}
				break;
			case OP_REM:
			case OP_LAST:
			case LAMBDA_SLOT:
			case INTEGER:
			case DECIMAL:
			case STRING_SINGLE:
			case STRING_DOUBLE:
			case STRING_BLOCK:
			case SPECIAL:
			case RAW_ID:
			case UNICODE_ID:
				{
				_localctx = new IAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1084);
				atomic();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
					case 1:
						{
						_localctx = new IMulContext(new Inline_expressionContext(_parentctx, _parentState));
						((IMulContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1087);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1088);
						op_multiple();
						setState(1089);
						((IMulContext)_localctx).rhs = inline_expression(12);
						}
						break;
					case 2:
						{
						_localctx = new IPlusContext(new Inline_expressionContext(_parentctx, _parentState));
						((IPlusContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1091);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1092);
						op_plus();
						setState(1093);
						((IPlusContext)_localctx).rhs = inline_expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ILogicContext(new Inline_expressionContext(_parentctx, _parentState));
						((ILogicContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1095);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1096);
						op_logic();
						setState(1097);
						((ILogicContext)_localctx).rhs = inline_expression(10);
						}
						break;
					case 4:
						{
						_localctx = new IMapContext(new Inline_expressionContext(_parentctx, _parentState));
						((IMapContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1099);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1100);
						infix_map();
						setState(1101);
						((IMapContext)_localctx).rhs = inline_expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ICompareContext(new Inline_expressionContext(_parentctx, _parentState));
						((ICompareContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1103);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1104);
						op_compare();
						setState(1105);
						((ICompareContext)_localctx).rhs = inline_expression(8);
						}
						break;
					case 6:
						{
						_localctx = new IIsAContext(new Inline_expressionContext(_parentctx, _parentState));
						((IIsAContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1107);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1108);
						infix_is();
						setState(1109);
						((IIsAContext)_localctx).rhs = inline_expression(7);
						}
						break;
					case 7:
						{
						_localctx = new IRangeContext(new Inline_expressionContext(_parentctx, _parentState));
						((IRangeContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1111);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1112);
						match(OP_UNTIL);
						setState(1113);
						((IRangeContext)_localctx).rhs = inline_expression(6);
						}
						break;
					case 8:
						{
						_localctx = new IAsContext(new Inline_expressionContext(_parentctx, _parentState));
						((IAsContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1114);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1115);
						match(KW_AS);
						setState(1116);
						((IAsContext)_localctx).rhs = inline_expression(5);
						}
						break;
					case 9:
						{
						_localctx = new IDotContext(new Inline_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1117);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1118);
						function_call();
						}
						break;
					case 10:
						{
						_localctx = new IGenericContext(new Inline_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1119);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1120);
						generic_call();
						}
						break;
					case 11:
						{
						_localctx = new ISliceContext(new Inline_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_inline_expression);
						setState(1121);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1122);
						slice_call();
						}
						break;
					}
					} 
				}
				setState(1127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_expressionContext extends ParserRuleContext {
		public Type_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_expression; }
	 
		public Type_expressionContext() { }
		public void copyFrom(Type_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TGenericContext extends Type_expressionContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Generic_call_in_typeContext generic_call_in_type() {
			return getRuleContext(Generic_call_in_typeContext.class,0);
		}
		public TGenericContext(Type_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class TPatternContext extends Type_expressionContext {
		public List<Type_expressionContext> type_expression() {
			return getRuleContexts(Type_expressionContext.class);
		}
		public Type_expressionContext type_expression(int i) {
			return getRuleContext(Type_expressionContext.class,i);
		}
		public Op_patternContext op_pattern() {
			return getRuleContext(Op_patternContext.class,0);
		}
		public TPatternContext(Type_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class TTupleContext extends Type_expressionContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Type_expressionContext> type_expression() {
			return getRuleContexts(Type_expressionContext.class);
		}
		public Type_expressionContext type_expression(int i) {
			return getRuleContext(Type_expressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public TTupleContext(Type_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class TAtomContext extends Type_expressionContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TAtomContext(Type_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class TAddContext extends Type_expressionContext {
		public List<Type_expressionContext> type_expression() {
			return getRuleContexts(Type_expressionContext.class);
		}
		public Type_expressionContext type_expression(int i) {
			return getRuleContext(Type_expressionContext.class,i);
		}
		public TerminalNode OP_ADD() { return getToken(ValkyrieAntlrParser.OP_ADD, 0); }
		public TAddContext(Type_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class TArrowsContext extends Type_expressionContext {
		public List<Type_expressionContext> type_expression() {
			return getRuleContexts(Type_expressionContext.class);
		}
		public Type_expressionContext type_expression(int i) {
			return getRuleContext(Type_expressionContext.class,i);
		}
		public Infix_arrowsContext infix_arrows() {
			return getRuleContext(Infix_arrowsContext.class,0);
		}
		public TArrowsContext(Type_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Type_expressionContext type_expression() throws RecognitionException {
		return type_expression(0);
	}

	private Type_expressionContext type_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_expressionContext _localctx = new Type_expressionContext(_ctx, _parentState);
		Type_expressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_type_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTHESES_L:
				{
				_localctx = new TTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1129);
				match(PARENTHESES_L);
				setState(1143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1130);
					type_expression(0);
					setState(1131);
					match(COMMA);
					}
					break;
				case 2:
					{
					setState(1133);
					type_expression(0);
					setState(1136); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1134);
							match(COMMA);
							setState(1135);
							type_expression(0);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1138); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1141);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1140);
						match(COMMA);
						}
					}

					}
					break;
				}
				setState(1145);
				match(PARENTHESES_R);
				}
				break;
			case OP_REM:
			case OP_LAST:
			case LAMBDA_SLOT:
			case INTEGER:
			case DECIMAL:
			case STRING_SINGLE:
			case STRING_DOUBLE:
			case STRING_BLOCK:
			case SPECIAL:
			case RAW_ID:
			case UNICODE_ID:
				{
				_localctx = new TAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1146);
				atomic();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
					case 1:
						{
						_localctx = new TPatternContext(new Type_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
						setState(1149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1150);
						op_pattern();
						setState(1151);
						type_expression(7);
						}
						break;
					case 2:
						{
						_localctx = new TArrowsContext(new Type_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
						setState(1153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1154);
						infix_arrows();
						setState(1155);
						type_expression(6);
						}
						break;
					case 3:
						{
						_localctx = new TAddContext(new Type_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
						setState(1157);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1158);
						match(OP_ADD);
						setState(1159);
						type_expression(5);
						}
						break;
					case 4:
						{
						_localctx = new TGenericContext(new Type_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
						setState(1160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1161);
						generic_call_in_type();
						}
						break;
					}
					} 
				}
				setState(1166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomicContext extends ParserRuleContext {
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
	 
		public AtomicContext() { }
		public void copyFrom(AtomicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ASpecialContext extends AtomicContext {
		public TerminalNode SPECIAL() { return getToken(ValkyrieAntlrParser.SPECIAL, 0); }
		public ASpecialContext(AtomicContext ctx) { copyFrom(ctx); }
	}
	public static class ALambdaContext extends AtomicContext {
		public Lambda_nameContext lambda_name() {
			return getRuleContext(Lambda_nameContext.class,0);
		}
		public ALambdaContext(AtomicContext ctx) { copyFrom(ctx); }
	}
	public static class ANumberContext extends AtomicContext {
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public ANumberContext(AtomicContext ctx) { copyFrom(ctx); }
	}
	public static class AOutputContext extends AtomicContext {
		public Output_nameContext output_name() {
			return getRuleContext(Output_nameContext.class,0);
		}
		public AOutputContext(AtomicContext ctx) { copyFrom(ctx); }
	}
	public static class AStringContext extends AtomicContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public AStringContext(AtomicContext ctx) { copyFrom(ctx); }
	}
	public static class ANamepathContext extends AtomicContext {
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public ANamepathContext(AtomicContext ctx) { copyFrom(ctx); }
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_atomic);
		try {
			setState(1173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new AStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				string_literal();
				}
				break;
			case 2:
				_localctx = new ANumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				number_literal();
				}
				break;
			case 3:
				_localctx = new ALambdaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1169);
				lambda_name();
				}
				break;
			case 4:
				_localctx = new AOutputContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1170);
				output_name();
				}
				break;
			case 5:
				_localctx = new ANamepathContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1171);
				namepath();
				}
				break;
			case 6:
				_localctx = new ASpecialContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1172);
				match(SPECIAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_expressionContext extends ParserRuleContext {
		public Control_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_expression; }
	 
		public Control_expressionContext() { }
		public void copyFrom(Control_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CBreakContext extends Control_expressionContext {
		public TerminalNode BREAK() { return getToken(ValkyrieAntlrParser.BREAK, 0); }
		public TerminalNode OP_LABEL() { return getToken(ValkyrieAntlrParser.OP_LABEL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode YIELD() { return getToken(ValkyrieAntlrParser.YIELD, 0); }
		public CBreakContext(Control_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class CWithContext extends Control_expressionContext {
		public TerminalNode YIELD() { return getToken(ValkyrieAntlrParser.YIELD, 0); }
		public TerminalNode KW_WITH() { return getToken(ValkyrieAntlrParser.KW_WITH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CWithContext(Control_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class CYieldContext extends Control_expressionContext {
		public TerminalNode YIELD() { return getToken(ValkyrieAntlrParser.YIELD, 0); }
		public TerminalNode OP_LABEL() { return getToken(ValkyrieAntlrParser.OP_LABEL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CYieldContext(Control_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class CReturnContext extends Control_expressionContext {
		public TerminalNode RETURN() { return getToken(ValkyrieAntlrParser.RETURN, 0); }
		public TerminalNode RESUME() { return getToken(ValkyrieAntlrParser.RESUME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CReturnContext(Control_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class CRaiseContext extends Control_expressionContext {
		public TerminalNode RAISE() { return getToken(ValkyrieAntlrParser.RAISE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CRaiseContext(Control_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class CContinueContext extends Control_expressionContext {
		public TerminalNode CONTINUE() { return getToken(ValkyrieAntlrParser.CONTINUE, 0); }
		public TerminalNode OP_LABEL() { return getToken(ValkyrieAntlrParser.OP_LABEL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CContinueContext(Control_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Control_expressionContext control_expression() throws RecognitionException {
		Control_expressionContext _localctx = new Control_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_control_expression);
		try {
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				_localctx = new CReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(1175);
					match(RETURN);
					}
					break;
				case RESUME:
					{
					setState(1176);
					match(RESUME);
					setState(1178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
					case 1:
						{
						setState(1177);
						expression(0);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new CBreakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1182);
				match(BREAK);
				setState(1185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1183);
					match(OP_LABEL);
					setState(1184);
					identifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new CContinueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1187);
				match(CONTINUE);
				setState(1190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1188);
					match(OP_LABEL);
					setState(1189);
					identifier();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new CRaiseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1192);
				match(RAISE);
				setState(1193);
				expression(0);
				}
				break;
			case 5:
				_localctx = new CYieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1194);
				match(YIELD);
				setState(1197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1195);
					match(OP_LABEL);
					setState(1196);
					identifier();
					}
					break;
				}
				setState(1200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1199);
					expression(0);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new CBreakContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1202);
				match(YIELD);
				setState(1203);
				match(BREAK);
				}
				break;
			case 7:
				_localctx = new CWithContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1204);
				match(YIELD);
				setState(1205);
				match(KW_WITH);
				setState(1206);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_prefixContext extends ParserRuleContext {
		public TerminalNode OP_NOT() { return getToken(ValkyrieAntlrParser.OP_NOT, 0); }
		public TerminalNode OP_ADD() { return getToken(ValkyrieAntlrParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(ValkyrieAntlrParser.OP_SUB, 0); }
		public TerminalNode OP_AND() { return getToken(ValkyrieAntlrParser.OP_AND, 0); }
		public TerminalNode OP_REFERENCE() { return getToken(ValkyrieAntlrParser.OP_REFERENCE, 0); }
		public TerminalNode OP_DECONSTRUCT() { return getToken(ValkyrieAntlrParser.OP_DECONSTRUCT, 0); }
		public TerminalNode OP_INVERSE() { return getToken(ValkyrieAntlrParser.OP_INVERSE, 0); }
		public TerminalNode OP_ROOT2() { return getToken(ValkyrieAntlrParser.OP_ROOT2, 0); }
		public TerminalNode OP_ROOT3() { return getToken(ValkyrieAntlrParser.OP_ROOT3, 0); }
		public TerminalNode OP_ROOT4() { return getToken(ValkyrieAntlrParser.OP_ROOT4, 0); }
		public TerminalNode OP_MUL() { return getToken(ValkyrieAntlrParser.OP_MUL, 0); }
		public Op_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_prefix; }
	}

	public final Op_prefixContext op_prefix() throws RecognitionException {
		Op_prefixContext _localctx = new Op_prefixContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_op_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_MUL))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OP_AND - 67)) | (1L << (OP_NOT - 67)) | (1L << (OP_DECONSTRUCT - 67)) | (1L << (OP_INVERSE - 67)) | (1L << (OP_ROOT2 - 67)) | (1L << (OP_ROOT3 - 67)) | (1L << (OP_ROOT4 - 67)) | (1L << (OP_REFERENCE - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_suffixContext extends ParserRuleContext {
		public TerminalNode OP_NOT() { return getToken(ValkyrieAntlrParser.OP_NOT, 0); }
		public TerminalNode OP_TEMPERATURE() { return getToken(ValkyrieAntlrParser.OP_TEMPERATURE, 0); }
		public TerminalNode OP_TRANSPOSE() { return getToken(ValkyrieAntlrParser.OP_TRANSPOSE, 0); }
		public TerminalNode OP_PERCENT() { return getToken(ValkyrieAntlrParser.OP_PERCENT, 0); }
		public TerminalNode OP_REM() { return getToken(ValkyrieAntlrParser.OP_REM, 0); }
		public TerminalNode OP_OR_DEFAULT() { return getToken(ValkyrieAntlrParser.OP_OR_DEFAULT, 0); }
		public TerminalNode OP_INC() { return getToken(ValkyrieAntlrParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(ValkyrieAntlrParser.OP_DEC, 0); }
		public Op_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_suffix; }
	}

	public final Op_suffixContext op_suffix() throws RecognitionException {
		Op_suffixContext _localctx = new Op_suffixContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_op_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_INC) | (1L << OP_DEC) | (1L << OP_REM))) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (OP_OR_DEFAULT - 79)) | (1L << (OP_NOT - 79)) | (1L << (OP_TEMPERATURE - 79)) | (1L << (OP_TRANSPOSE - 79)) | (1L << (OP_PERCENT - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_compareContext extends ParserRuleContext {
		public TerminalNode OP_LT() { return getToken(ValkyrieAntlrParser.OP_LT, 0); }
		public TerminalNode OP_LEQ() { return getToken(ValkyrieAntlrParser.OP_LEQ, 0); }
		public TerminalNode OP_GT() { return getToken(ValkyrieAntlrParser.OP_GT, 0); }
		public TerminalNode OP_GEQ() { return getToken(ValkyrieAntlrParser.OP_GEQ, 0); }
		public TerminalNode OP_EQ() { return getToken(ValkyrieAntlrParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(ValkyrieAntlrParser.OP_NE, 0); }
		public TerminalNode OP_EEE() { return getToken(ValkyrieAntlrParser.OP_EEE, 0); }
		public TerminalNode OP_NEE() { return getToken(ValkyrieAntlrParser.OP_NEE, 0); }
		public Op_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_compare; }
	}

	public final Op_compareContext op_compare() throws RecognitionException {
		Op_compareContext _localctx = new Op_compareContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_op_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQ) | (1L << OP_NE) | (1L << OP_NEE) | (1L << OP_EEE) | (1L << OP_LEQ) | (1L << OP_LT) | (1L << OP_GEQ) | (1L << OP_GT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_patternContext extends ParserRuleContext {
		public TerminalNode OP_AND() { return getToken(ValkyrieAntlrParser.OP_AND, 0); }
		public TerminalNode OP_OR() { return getToken(ValkyrieAntlrParser.OP_OR, 0); }
		public Op_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_pattern; }
	}

	public final Op_patternContext op_pattern() throws RecognitionException {
		Op_patternContext _localctx = new Op_patternContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_op_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_la = _input.LA(1);
			if ( !(_la==OP_AND || _la==OP_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_mapContext extends ParserRuleContext {
		public TerminalNode OP_MAP() { return getToken(ValkyrieAntlrParser.OP_MAP, 0); }
		public TerminalNode OP_APPLY2() { return getToken(ValkyrieAntlrParser.OP_APPLY2, 0); }
		public TerminalNode OP_APPLY3() { return getToken(ValkyrieAntlrParser.OP_APPLY3, 0); }
		public Infix_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_map; }
	}

	public final Infix_mapContext infix_map() throws RecognitionException {
		Infix_mapContext _localctx = new Infix_mapContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_infix_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (OP_MAP - 71)) | (1L << (OP_APPLY2 - 71)) | (1L << (OP_APPLY3 - 71)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_powContext extends ParserRuleContext {
		public TerminalNode OP_POW() { return getToken(ValkyrieAntlrParser.OP_POW, 0); }
		public TerminalNode OP_ROOT2() { return getToken(ValkyrieAntlrParser.OP_ROOT2, 0); }
		public Infix_powContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_pow; }
	}

	public final Infix_powContext infix_pow() throws RecognitionException {
		Infix_powContext _localctx = new Infix_powContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_infix_pow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			_la = _input.LA(1);
			if ( !(_la==OP_POW || _la==OP_ROOT2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_arrowsContext extends ParserRuleContext {
		public TerminalNode OP_ARROW() { return getToken(ValkyrieAntlrParser.OP_ARROW, 0); }
		public TerminalNode OP_ARROW2() { return getToken(ValkyrieAntlrParser.OP_ARROW2, 0); }
		public Infix_arrowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_arrows; }
	}

	public final Infix_arrowsContext infix_arrows() throws RecognitionException {
		Infix_arrowsContext _localctx = new Infix_arrowsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_infix_arrows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			_la = _input.LA(1);
			if ( !(_la==OP_ARROW || _la==OP_ARROW2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_multipleContext extends ParserRuleContext {
		public TerminalNode OP_MUL() { return getToken(ValkyrieAntlrParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(ValkyrieAntlrParser.OP_DIV, 0); }
		public TerminalNode OP_REM() { return getToken(ValkyrieAntlrParser.OP_REM, 0); }
		public TerminalNode OP_DIV_REM() { return getToken(ValkyrieAntlrParser.OP_DIV_REM, 0); }
		public Op_multipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiple; }
	}

	public final Op_multipleContext op_multiple() throws RecognitionException {
		Op_multipleContext _localctx = new Op_multipleContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_op_multiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MUL) | (1L << OP_DIV) | (1L << OP_REM) | (1L << OP_DIV_REM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_plusContext extends ParserRuleContext {
		public TerminalNode OP_ADD() { return getToken(ValkyrieAntlrParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(ValkyrieAntlrParser.OP_SUB, 0); }
		public Op_plusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_plus; }
	}

	public final Op_plusContext op_plus() throws RecognitionException {
		Op_plusContext _localctx = new Op_plusContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_op_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			_la = _input.LA(1);
			if ( !(_la==OP_ADD || _la==OP_SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logicContext extends ParserRuleContext {
		public TerminalNode LOGIC_OR() { return getToken(ValkyrieAntlrParser.LOGIC_OR, 0); }
		public TerminalNode LOGIC_AND() { return getToken(ValkyrieAntlrParser.LOGIC_AND, 0); }
		public TerminalNode LOGIC_XOR() { return getToken(ValkyrieAntlrParser.LOGIC_XOR, 0); }
		public TerminalNode LOGIC_NOR() { return getToken(ValkyrieAntlrParser.LOGIC_NOR, 0); }
		public TerminalNode LOGIC_NAND() { return getToken(ValkyrieAntlrParser.LOGIC_NAND, 0); }
		public TerminalNode LOGIC_XAND() { return getToken(ValkyrieAntlrParser.LOGIC_XAND, 0); }
		public Op_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logic; }
	}

	public final Op_logicContext op_logic() throws RecognitionException {
		Op_logicContext _localctx = new Op_logicContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_op_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (LOGIC_AND - 59)) | (1L << (LOGIC_XAND - 59)) | (1L << (LOGIC_NAND - 59)) | (1L << (LOGIC_OR - 59)) | (1L << (LOGIC_XOR - 59)) | (1L << (LOGIC_NOR - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_pipelineContext extends ParserRuleContext {
		public TerminalNode OP_LL() { return getToken(ValkyrieAntlrParser.OP_LL, 0); }
		public TerminalNode OP_LLE() { return getToken(ValkyrieAntlrParser.OP_LLE, 0); }
		public TerminalNode OP_LLL() { return getToken(ValkyrieAntlrParser.OP_LLL, 0); }
		public TerminalNode OP_GG() { return getToken(ValkyrieAntlrParser.OP_GG, 0); }
		public TerminalNode OP_GGG() { return getToken(ValkyrieAntlrParser.OP_GGG, 0); }
		public Op_pipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_pipeline; }
	}

	public final Op_pipelineContext op_pipeline() throws RecognitionException {
		Op_pipelineContext _localctx = new Op_pipelineContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_op_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_LLE) | (1L << OP_LLL) | (1L << OP_LL) | (1L << OP_GGG) | (1L << OP_GG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_assignContext extends ParserRuleContext {
		public TerminalNode OP_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ASSIGN, 0); }
		public TerminalNode OP_ADD_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_ADD_ASSIGN, 0); }
		public TerminalNode OP_SUB_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_SUB_ASSIGN, 0); }
		public TerminalNode OP_MUL_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_MUL_ASSIGN, 0); }
		public TerminalNode OP_DIV_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_DIV_ASSIGN, 0); }
		public TerminalNode OP_MAY_ASSIGN() { return getToken(ValkyrieAntlrParser.OP_MAY_ASSIGN, 0); }
		public TerminalNode OP_GGE() { return getToken(ValkyrieAntlrParser.OP_GGE, 0); }
		public Op_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_assign; }
	}

	public final Op_assignContext op_assign() throws RecognitionException {
		Op_assignContext _localctx = new Op_assignContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_op_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_GGE) | (1L << OP_ASSIGN) | (1L << OP_MAY_ASSIGN) | (1L << OP_ADD_ASSIGN) | (1L << OP_SUB_ASSIGN) | (1L << OP_MUL_ASSIGN) | (1L << OP_DIV_ASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_isContext extends ParserRuleContext {
		public TerminalNode KW_IS() { return getToken(ValkyrieAntlrParser.KW_IS, 0); }
		public TerminalNode KW_NOT() { return getToken(ValkyrieAntlrParser.KW_NOT, 0); }
		public TerminalNode OP_IS() { return getToken(ValkyrieAntlrParser.OP_IS, 0); }
		public TerminalNode OP_IS_NOT() { return getToken(ValkyrieAntlrParser.OP_IS_NOT, 0); }
		public TerminalNode OP_CONTINUES() { return getToken(ValkyrieAntlrParser.OP_CONTINUES, 0); }
		public Infix_isContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_is; }
	}

	public final Infix_isContext infix_is() throws RecognitionException {
		Infix_isContext _localctx = new Infix_isContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_infix_is);
		try {
			setState(1239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1233);
				match(KW_IS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				match(KW_IS);
				setState(1235);
				match(KW_NOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1236);
				match(OP_IS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1237);
				match(OP_IS_NOT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1238);
				match(OP_CONTINUES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_asContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(ValkyrieAntlrParser.KW_AS, 0); }
		public Infix_asContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_as; }
	}

	public final Infix_asContext infix_as() throws RecognitionException {
		Infix_asContext _localctx = new Infix_asContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_infix_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(KW_AS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Infix_inContext extends ParserRuleContext {
		public TerminalNode KW_IN() { return getToken(ValkyrieAntlrParser.KW_IN, 0); }
		public TerminalNode KW_NOT() { return getToken(ValkyrieAntlrParser.KW_NOT, 0); }
		public TerminalNode OP_IN() { return getToken(ValkyrieAntlrParser.OP_IN, 0); }
		public TerminalNode OP_NOT_IN() { return getToken(ValkyrieAntlrParser.OP_NOT_IN, 0); }
		public Infix_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_in; }
	}

	public final Infix_inContext infix_in() throws RecognitionException {
		Infix_inContext _localctx = new Infix_inContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_infix_in);
		try {
			setState(1248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				match(KW_IN);
				}
				break;
			case KW_NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				match(KW_NOT);
				setState(1245);
				match(KW_IN);
				}
				break;
			case OP_IN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1246);
				match(OP_IN);
				}
				break;
			case OP_NOT_IN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1247);
				match(OP_NOT_IN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_genericContext extends ParserRuleContext {
		public TerminalNode GENERIC_L() { return getToken(ValkyrieAntlrParser.GENERIC_L, 0); }
		public TerminalNode GENERIC_R() { return getToken(ValkyrieAntlrParser.GENERIC_R, 0); }
		public List<Generic_itemContext> generic_item() {
			return getRuleContexts(Generic_itemContext.class);
		}
		public Generic_itemContext generic_item(int i) {
			return getRuleContext(Generic_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public TerminalNode OP_LT() { return getToken(ValkyrieAntlrParser.OP_LT, 0); }
		public TerminalNode OP_GT() { return getToken(ValkyrieAntlrParser.OP_GT, 0); }
		public TerminalNode OP_PROPORTION() { return getToken(ValkyrieAntlrParser.OP_PROPORTION, 0); }
		public Define_genericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_generic; }
	}

	public final Define_genericContext define_generic() throws RecognitionException {
		Define_genericContext _localctx = new Define_genericContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_define_generic);
		int _la;
		try {
			int _alt;
			setState(1288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				match(GENERIC_L);
				setState(1251);
				match(GENERIC_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1252);
				match(GENERIC_L);
				setState(1253);
				generic_item();
				setState(1258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1254);
						match(COMMA);
						setState(1255);
						generic_item();
						}
						} 
					}
					setState(1260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
				}
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1261);
					match(COMMA);
					}
				}

				setState(1264);
				match(GENERIC_R);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_PROPORTION) {
					{
					setState(1266);
					match(OP_PROPORTION);
					}
				}

				setState(1269);
				match(OP_LT);
				setState(1270);
				match(OP_GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_PROPORTION) {
					{
					setState(1271);
					match(OP_PROPORTION);
					}
				}

				setState(1274);
				match(OP_LT);
				setState(1275);
				generic_item();
				setState(1280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1276);
						match(COMMA);
						setState(1277);
						generic_item();
						}
						} 
					}
					setState(1282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				}
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1283);
					match(COMMA);
					}
				}

				setState(1286);
				match(OP_GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_itemContext extends ParserRuleContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public Generic_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_item; }
	}

	public final Generic_itemContext generic_item() throws RecognitionException {
		Generic_itemContext _localctx = new Generic_itemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_generic_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1290);
				identifier();
				setState(1291);
				match(COLON);
				}
				break;
			}
			setState(1295);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_callContext extends ParserRuleContext {
		public TerminalNode OP_PROPORTION() { return getToken(ValkyrieAntlrParser.OP_PROPORTION, 0); }
		public TerminalNode OP_LT() { return getToken(ValkyrieAntlrParser.OP_LT, 0); }
		public TerminalNode OP_GT() { return getToken(ValkyrieAntlrParser.OP_GT, 0); }
		public List<Generic_pairContext> generic_pair() {
			return getRuleContexts(Generic_pairContext.class);
		}
		public Generic_pairContext generic_pair(int i) {
			return getRuleContext(Generic_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public TerminalNode GENERIC_L() { return getToken(ValkyrieAntlrParser.GENERIC_L, 0); }
		public TerminalNode GENERIC_R() { return getToken(ValkyrieAntlrParser.GENERIC_R, 0); }
		public Generic_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_call; }
	}

	public final Generic_callContext generic_call() throws RecognitionException {
		Generic_callContext _localctx = new Generic_callContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_generic_call);
		int _la;
		try {
			int _alt;
			setState(1331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				match(OP_PROPORTION);
				setState(1298);
				match(OP_LT);
				setState(1299);
				match(OP_GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				match(OP_PROPORTION);
				setState(1301);
				match(OP_LT);
				setState(1302);
				generic_pair();
				setState(1307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1303);
						match(COMMA);
						setState(1304);
						generic_pair();
						}
						} 
					}
					setState(1309);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
				}
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1310);
					match(COMMA);
					}
				}

				setState(1313);
				match(OP_GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1315);
				match(GENERIC_L);
				setState(1316);
				match(GENERIC_R);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1317);
				match(GENERIC_L);
				setState(1318);
				generic_pair();
				setState(1323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1319);
						match(COMMA);
						setState(1320);
						generic_pair();
						}
						} 
					}
					setState(1325);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				}
				setState(1327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1326);
					match(COMMA);
					}
				}

				setState(1329);
				match(GENERIC_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_call_in_typeContext extends ParserRuleContext {
		public TerminalNode OP_LT() { return getToken(ValkyrieAntlrParser.OP_LT, 0); }
		public List<Generic_pairContext> generic_pair() {
			return getRuleContexts(Generic_pairContext.class);
		}
		public Generic_pairContext generic_pair(int i) {
			return getRuleContext(Generic_pairContext.class,i);
		}
		public TerminalNode OP_GT() { return getToken(ValkyrieAntlrParser.OP_GT, 0); }
		public TerminalNode OP_PROPORTION() { return getToken(ValkyrieAntlrParser.OP_PROPORTION, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public TerminalNode GENERIC_L() { return getToken(ValkyrieAntlrParser.GENERIC_L, 0); }
		public TerminalNode GENERIC_R() { return getToken(ValkyrieAntlrParser.GENERIC_R, 0); }
		public Generic_call_in_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_call_in_type; }
	}

	public final Generic_call_in_typeContext generic_call_in_type() throws RecognitionException {
		Generic_call_in_typeContext _localctx = new Generic_call_in_typeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_generic_call_in_type);
		int _la;
		try {
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PROPORTION:
			case OP_LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_PROPORTION) {
					{
					setState(1333);
					match(OP_PROPORTION);
					}
				}

				setState(1336);
				match(OP_LT);
				setState(1337);
				generic_pair();
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1338);
					match(COMMA);
					setState(1339);
					generic_pair();
					}
					}
					setState(1344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1345);
				match(OP_GT);
				}
				break;
			case GENERIC_L:
				enterOuterAlt(_localctx, 2);
				{
				setState(1347);
				match(GENERIC_L);
				setState(1348);
				generic_pair();
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1349);
					match(COMMA);
					setState(1350);
					generic_pair();
					}
					}
					setState(1355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1356);
				match(GENERIC_R);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_pairContext extends ParserRuleContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public Generic_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_pair; }
	}

	public final Generic_pairContext generic_pair() throws RecognitionException {
		Generic_pairContext _localctx = new Generic_pairContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_generic_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1360);
				identifier();
				setState(1361);
				match(COLON);
				}
				break;
			}
			setState(1365);
			type_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_labelContext extends ParserRuleContext {
		public TerminalNode OP_LABEL() { return getToken(ValkyrieAntlrParser.OP_LABEL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Define_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_label; }
	}

	public final Define_labelContext define_label() throws RecognitionException {
		Define_labelContext _localctx = new Define_labelContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_define_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(OP_LABEL);
			setState(1368);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_callContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public TerminalNode KW_TEMPLATE() { return getToken(ValkyrieAntlrParser.KW_TEMPLATE, 0); }
		public Template_blockContext template_block() {
			return getRuleContext(Template_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Template_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_call; }
	}

	public final Template_callContext template_call() throws RecognitionException {
		Template_callContext _localctx = new Template_callContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_template_call);
		int _la;
		try {
			int _alt;
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(1370);
					annotation();
					}
					}
					setState(1375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1376);
				modifiers();
				setState(1377);
				match(KW_TEMPLATE);
				setState(1378);
				template_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(1380);
					annotation();
					}
					}
					setState(1385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1386);
				modifiers();
				setState(1387);
				match(KW_TEMPLATE);
				setState(1388);
				identifier();
				setState(1393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1389);
						match(COMMA);
						setState(1390);
						identifier();
						}
						} 
					}
					setState(1395);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
				}
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1396);
					match(COMMA);
					}
				}

				setState(1399);
				template_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Template_statementsContext> template_statements() {
			return getRuleContexts(Template_statementsContext.class);
		}
		public Template_statementsContext template_statements(int i) {
			return getRuleContext(Template_statementsContext.class,i);
		}
		public List<Eos_freeContext> eos_free() {
			return getRuleContexts(Eos_freeContext.class);
		}
		public Eos_freeContext eos_free(int i) {
			return getRuleContext(Eos_freeContext.class,i);
		}
		public Template_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_block; }
	}

	public final Template_blockContext template_block() throws RecognitionException {
		Template_blockContext _localctx = new Template_blockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_template_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			match(BRACE_L);
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || _la==KW_WHERE) {
				{
				setState(1406);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_WHERE:
					{
					setState(1404);
					template_statements();
					}
					break;
				case COMMA:
				case SEMICOLON:
					{
					setState(1405);
					eos_free();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1411);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Template_statementsContext extends ParserRuleContext {
		public TerminalNode KW_WHERE() { return getToken(ValkyrieAntlrParser.KW_WHERE, 0); }
		public Where_blockContext where_block() {
			return getRuleContext(Where_blockContext.class,0);
		}
		public Template_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_statements; }
	}

	public final Template_statementsContext template_statements() throws RecognitionException {
		Template_statementsContext _localctx = new Template_statementsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_template_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(KW_WHERE);
			setState(1414);
			where_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Where_boundContext> where_bound() {
			return getRuleContexts(Where_boundContext.class);
		}
		public Where_boundContext where_bound(int i) {
			return getRuleContext(Where_boundContext.class,i);
		}
		public Where_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_block; }
	}

	public final Where_blockContext where_block() throws RecognitionException {
		Where_blockContext _localctx = new Where_blockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_where_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			match(BRACE_L);
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || _la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(1417);
				where_bound();
				}
				}
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1423);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_boundContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Eos_freeContext eos_free() {
			return getRuleContext(Eos_freeContext.class,0);
		}
		public Where_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_bound; }
	}

	public final Where_boundContext where_bound() throws RecognitionException {
		Where_boundContext _localctx = new Where_boundContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_where_bound);
		try {
			setState(1430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1425);
				identifier();
				setState(1426);
				match(COLON);
				setState(1427);
				type_expression(0);
				}
				break;
			case COMMA:
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1429);
				eos_free();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Macro_callContext extends ParserRuleContext {
		public TerminalNode OP_AT() { return getToken(ValkyrieAntlrParser.OP_AT, 0); }
		public List<Annotation_call_itemContext> annotation_call_item() {
			return getRuleContexts(Annotation_call_itemContext.class);
		}
		public Annotation_call_itemContext annotation_call_item(int i) {
			return getRuleContext(Annotation_call_itemContext.class,i);
		}
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Macro_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_call; }
	}

	public final Macro_callContext macro_call() throws RecognitionException {
		Macro_callContext _localctx = new Macro_callContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_macro_call);
		int _la;
		try {
			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1432);
				match(OP_AT);
				setState(1433);
				annotation_call_item();
				setState(1435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1434);
					class_block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1437);
				match(OP_AT);
				setState(1438);
				match(BRACKET_L);
				setState(1439);
				annotation_call_item();
				setState(1444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1440);
					match(COMMA);
					setState(1441);
					annotation_call_item();
					}
					}
					setState(1446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1447);
				match(BRACKET_R);
				setState(1449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1448);
					class_block();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode OP_HASH() { return getToken(ValkyrieAntlrParser.OP_HASH, 0); }
		public List<Annotation_call_itemContext> annotation_call_item() {
			return getRuleContexts(Annotation_call_itemContext.class);
		}
		public Annotation_call_itemContext annotation_call_item(int i) {
			return getRuleContext(Annotation_call_itemContext.class,i);
		}
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_annotation);
		int _la;
		try {
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1453);
				match(OP_HASH);
				setState(1454);
				annotation_call_item();
				setState(1456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1455);
					class_block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1458);
				match(OP_HASH);
				setState(1459);
				match(BRACKET_L);
				setState(1460);
				annotation_call_item();
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1461);
					match(COMMA);
					setState(1462);
					annotation_call_item();
					}
					}
					setState(1467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1468);
				match(BRACKET_R);
				setState(1470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1469);
					class_block();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_call_itemContext extends ParserRuleContext {
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Tuple_call_bodyContext tuple_call_body() {
			return getRuleContext(Tuple_call_bodyContext.class,0);
		}
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public Annotation_call_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_call_item; }
	}

	public final Annotation_call_itemContext annotation_call_item() throws RecognitionException {
		Annotation_call_itemContext _localctx = new Annotation_call_itemContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_annotation_call_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			namepath();
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1475);
				tuple_call_body();
				}
				break;
			}
			setState(1479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1478);
				class_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_statementContext extends ParserRuleContext {
		public TerminalNode KW_TRY() { return getToken(ValkyrieAntlrParser.KW_TRY, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_try_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(1481);
				annotation();
				}
				}
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1487);
			match(KW_TRY);
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTHESES_L) | (1L << OP_REM) | (1L << OP_LAST))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (LAMBDA_SLOT - 76)) | (1L << (INTEGER - 76)) | (1L << (DECIMAL - 76)) | (1L << (STRING_SINGLE - 76)) | (1L << (STRING_DOUBLE - 76)) | (1L << (STRING_BLOCK - 76)))) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (SPECIAL - 144)) | (1L << (RAW_ID - 144)) | (1L << (UNICODE_ID - 144)))) != 0)) {
				{
				setState(1488);
				type_expression(0);
				}
			}

			setState(1491);
			function_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_statementContext extends ParserRuleContext {
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Match_blockContext match_block() {
			return getRuleContext(Match_blockContext.class,0);
		}
		public TerminalNode KW_MATCH() { return getToken(ValkyrieAntlrParser.KW_MATCH, 0); }
		public TerminalNode KW_CATCH() { return getToken(ValkyrieAntlrParser.KW_CATCH, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OP_BIND() { return getToken(ValkyrieAntlrParser.OP_BIND, 0); }
		public Match_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_statement; }
	}

	public final Match_statementContext match_statement() throws RecognitionException {
		Match_statementContext _localctx = new Match_statementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_match_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(1493);
				annotation();
				}
				}
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1499);
			_la = _input.LA(1);
			if ( !(_la==KW_MATCH || _la==KW_CATCH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1500);
				identifier();
				setState(1501);
				match(OP_BIND);
				}
				break;
			}
			setState(1505);
			inline_expression(0);
			setState(1506);
			match_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Match_termsContext> match_terms() {
			return getRuleContexts(Match_termsContext.class);
		}
		public Match_termsContext match_terms(int i) {
			return getRuleContext(Match_termsContext.class,i);
		}
		public List<Eos_freeContext> eos_free() {
			return getRuleContexts(Eos_freeContext.class);
		}
		public Eos_freeContext eos_free(int i) {
			return getRuleContext(Eos_freeContext.class,i);
		}
		public Match_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_block; }
	}

	public final Match_blockContext match_block() throws RecognitionException {
		Match_blockContext _localctx = new Match_blockContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_match_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			match(BRACE_L);
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==SEMICOLON || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (OP_HASH - 75)) | (1L << (KW_TYPE - 75)) | (1L << (KW_WITH - 75)) | (1L << (KW_CASE - 75)) | (1L << (KW_WHEN - 75)) | (1L << (KW_ELSE - 75)))) != 0)) {
				{
				setState(1511);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_HASH:
				case KW_TYPE:
				case KW_WITH:
				case KW_CASE:
				case KW_WHEN:
				case KW_ELSE:
					{
					setState(1509);
					match_terms();
					}
					break;
				case COMMA:
				case SEMICOLON:
					{
					setState(1510);
					eos_free();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1516);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_termsContext extends ParserRuleContext {
		public Match_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_terms; }
	 
		public Match_termsContext() { }
		public void copyFrom(Match_termsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatchWhenContext extends Match_termsContext {
		public TerminalNode KW_WHEN() { return getToken(ValkyrieAntlrParser.KW_WHEN, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Match_case_blockContext match_case_block() {
			return getRuleContext(Match_case_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MatchWhenContext(Match_termsContext ctx) { copyFrom(ctx); }
	}
	public static class MatchTypeContext extends Match_termsContext {
		public TerminalNode KW_TYPE() { return getToken(ValkyrieAntlrParser.KW_TYPE, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Match_case_blockContext match_case_block() {
			return getRuleContext(Match_case_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public MatchTypeContext(Match_termsContext ctx) { copyFrom(ctx); }
	}
	public static class MatchCaseContext extends Match_termsContext {
		public TerminalNode KW_CASE() { return getToken(ValkyrieAntlrParser.KW_CASE, 0); }
		public Case_patternContext case_pattern() {
			return getRuleContext(Case_patternContext.class,0);
		}
		public Match_case_blockContext match_case_block() {
			return getRuleContext(Match_case_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode KW_IF() { return getToken(ValkyrieAntlrParser.KW_IF, 0); }
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public MatchCaseContext(Match_termsContext ctx) { copyFrom(ctx); }
	}
	public static class MatchWithContext extends Match_termsContext {
		public TerminalNode KW_WITH() { return getToken(ValkyrieAntlrParser.KW_WITH, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MatchWithContext(Match_termsContext ctx) { copyFrom(ctx); }
	}
	public static class MatchWithManyContext extends Match_termsContext {
		public TerminalNode KW_WITH() { return getToken(ValkyrieAntlrParser.KW_WITH, 0); }
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public MatchWithManyContext(Match_termsContext ctx) { copyFrom(ctx); }
	}
	public static class MatchElseContext extends Match_termsContext {
		public TerminalNode KW_ELSE() { return getToken(ValkyrieAntlrParser.KW_ELSE, 0); }
		public Match_case_blockContext match_case_block() {
			return getRuleContext(Match_case_blockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MatchElseContext(Match_termsContext ctx) { copyFrom(ctx); }
	}

	public final Match_termsContext match_terms() throws RecognitionException {
		Match_termsContext _localctx = new Match_termsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_match_terms);
		int _la;
		try {
			int _alt;
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				_localctx = new MatchWithContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(1518);
					annotation();
					}
					}
					setState(1523);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1524);
				match(KW_WITH);
				setState(1525);
				identifier();
				}
				break;
			case 2:
				_localctx = new MatchWithManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(1526);
					annotation();
					}
					}
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1532);
				match(KW_WITH);
				setState(1533);
				match(BRACKET_L);
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(1534);
					identifier();
					setState(1539);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1535);
							match(COMMA);
							setState(1536);
							identifier();
							}
							} 
						}
						setState(1541);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
					}
					setState(1543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1542);
						match(COMMA);
						}
					}

					}
				}

				setState(1547);
				match(BRACKET_R);
				}
				break;
			case 3:
				_localctx = new MatchTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(1548);
					annotation();
					}
					}
					setState(1553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1554);
				match(KW_TYPE);
				setState(1555);
				type_expression(0);
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IF) {
					{
					setState(1556);
					match(KW_IF);
					setState(1557);
					inline_expression(0);
					}
				}

				setState(1560);
				match_case_block();
				}
				break;
			case 4:
				_localctx = new MatchWhenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(1562);
					annotation();
					}
					}
					setState(1567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1568);
				match(KW_WHEN);
				setState(1569);
				inline_expression(0);
				setState(1570);
				match_case_block();
				}
				break;
			case 5:
				_localctx = new MatchElseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(1572);
					annotation();
					}
					}
					setState(1577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1578);
				match(KW_ELSE);
				setState(1579);
				match_case_block();
				}
				break;
			case 6:
				_localctx = new MatchCaseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_HASH) {
					{
					{
					setState(1580);
					annotation();
					}
					}
					setState(1585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1586);
				match(KW_CASE);
				setState(1587);
				case_pattern(0);
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_IF) {
					{
					setState(1588);
					match(KW_IF);
					setState(1589);
					inline_expression(0);
					}
				}

				setState(1592);
				match_case_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_case_blockContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Match_case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_case_block; }
	}

	public final Match_case_blockContext match_case_block() throws RecognitionException {
		Match_case_blockContext _localctx = new Match_case_blockContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_match_case_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			match(COLON);
			setState(1600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1597);
					expression(0);
					}
					} 
				}
				setState(1602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_patternContext extends ParserRuleContext {
		public Case_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_pattern; }
	 
		public Case_patternContext() { }
		public void copyFrom(Case_patternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseORContext extends Case_patternContext {
		public List<Case_patternContext> case_pattern() {
			return getRuleContexts(Case_patternContext.class);
		}
		public Case_patternContext case_pattern(int i) {
			return getRuleContext(Case_patternContext.class,i);
		}
		public TerminalNode OP_OR() { return getToken(ValkyrieAntlrParser.OP_OR, 0); }
		public TerminalNode OP_ADD() { return getToken(ValkyrieAntlrParser.OP_ADD, 0); }
		public CaseORContext(Case_patternContext ctx) { copyFrom(ctx); }
	}
	public static class CaseAtomContext extends Case_patternContext {
		public Case_pattern_itemContext case_pattern_item() {
			return getRuleContext(Case_pattern_itemContext.class,0);
		}
		public CaseAtomContext(Case_patternContext ctx) { copyFrom(ctx); }
	}
	public static class CaseUntilContext extends Case_patternContext {
		public List<Case_patternContext> case_pattern() {
			return getRuleContexts(Case_patternContext.class);
		}
		public Case_patternContext case_pattern(int i) {
			return getRuleContext(Case_patternContext.class,i);
		}
		public TerminalNode OP_UNTIL() { return getToken(ValkyrieAntlrParser.OP_UNTIL, 0); }
		public CaseUntilContext(Case_patternContext ctx) { copyFrom(ctx); }
	}

	public final Case_patternContext case_pattern() throws RecognitionException {
		return case_pattern(0);
	}

	private Case_patternContext case_pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Case_patternContext _localctx = new Case_patternContext(_ctx, _parentState);
		Case_patternContext _prevctx = _localctx;
		int _startState = 184;
		enterRecursionRule(_localctx, 184, RULE_case_pattern, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CaseAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1604);
			case_pattern_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(1614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1612);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						_localctx = new CaseORContext(new Case_patternContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_case_pattern);
						setState(1606);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1607);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1608);
						case_pattern(4);
						}
						break;
					case 2:
						{
						_localctx = new CaseUntilContext(new Case_patternContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_case_pattern);
						setState(1609);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(1610);
						match(OP_UNTIL);
						}
						setState(1611);
						case_pattern(3);
						}
						break;
					}
					} 
				}
				setState(1616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Case_pattern_itemContext extends ParserRuleContext {
		public IdentifierContext bind;
		public Case_pattern_tupleContext case_pattern_tuple() {
			return getRuleContext(Case_pattern_tupleContext.class,0);
		}
		public TerminalNode OP_BIND() { return getToken(ValkyrieAntlrParser.OP_BIND, 0); }
		public Case_pattern_itemContext case_pattern_item() {
			return getRuleContext(Case_pattern_itemContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Modified_identifierContext modified_identifier() {
			return getRuleContext(Modified_identifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public Number_literalContext number_literal() {
			return getRuleContext(Number_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode SPECIAL() { return getToken(ValkyrieAntlrParser.SPECIAL, 0); }
		public Case_pattern_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_pattern_item; }
	}

	public final Case_pattern_itemContext case_pattern_item() throws RecognitionException {
		Case_pattern_itemContext _localctx = new Case_pattern_itemContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_case_pattern_item);
		try {
			setState(1636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				case_pattern_tuple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				((Case_pattern_itemContext)_localctx).bind = identifier();
				setState(1619);
				match(OP_BIND);
				setState(1620);
				case_pattern_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1622);
				modified_identifier();
				setState(1623);
				match(COLON);
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1624);
					((Case_pattern_itemContext)_localctx).bind = identifier();
					setState(1625);
					match(OP_BIND);
					}
					break;
				}
				setState(1629);
				case_pattern_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1631);
				modified_identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1632);
				namepath();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1633);
				number_literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1634);
				string_literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1635);
				match(SPECIAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_pattern_tupleContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Case_pattern_itemContext> case_pattern_item() {
			return getRuleContexts(Case_pattern_itemContext.class);
		}
		public Case_pattern_itemContext case_pattern_item(int i) {
			return getRuleContext(Case_pattern_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Case_pattern_tupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_pattern_tuple; }
	}

	public final Case_pattern_tupleContext case_pattern_tuple() throws RecognitionException {
		Case_pattern_tupleContext _localctx = new Case_pattern_tupleContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_case_pattern_tuple);
		int _la;
		try {
			int _alt;
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(1638);
					namepath();
					}
				}

				setState(1641);
				match(PARENTHESES_L);
				setState(1642);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(1643);
					namepath();
					}
				}

				setState(1646);
				match(BRACKET_L);
				setState(1647);
				match(BRACKET_R);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(1648);
					namepath();
					}
				}

				setState(1651);
				match(BRACE_L);
				setState(1652);
				match(BRACE_R);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1653);
				match(PARENTHESES_L);
				setState(1654);
				case_pattern_item();
				setState(1655);
				match(COMMA);
				setState(1656);
				match(PARENTHESES_R);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1658);
				match(PARENTHESES_L);
				setState(1659);
				case_pattern_item();
				setState(1662); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1660);
						match(COMMA);
						setState(1661);
						case_pattern_item();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1664); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1666);
					match(COMMA);
					}
				}

				setState(1669);
				match(PARENTHESES_R);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1671);
				namepath();
				setState(1672);
				match(PARENTHESES_L);
				setState(1673);
				case_pattern_item();
				setState(1678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1674);
						match(COMMA);
						setState(1675);
						case_pattern_item();
						}
						} 
					}
					setState(1680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				}
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1681);
					match(COMMA);
					}
				}

				setState(1684);
				match(PARENTHESES_R);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(1686);
					namepath();
					}
				}

				setState(1689);
				match(BRACKET_L);
				setState(1690);
				case_pattern_item();
				setState(1695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1691);
						match(COMMA);
						setState(1692);
						case_pattern_item();
						}
						} 
					}
					setState(1697);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,225,_ctx);
				}
				setState(1699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1698);
					match(COMMA);
					}
				}

				setState(1701);
				match(BRACKET_R);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(1703);
					namepath();
					}
				}

				setState(1706);
				match(BRACE_L);
				setState(1707);
				case_pattern_item();
				setState(1712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1708);
						match(COMMA);
						setState(1709);
						case_pattern_item();
						}
						} 
					}
					setState(1714);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
				}
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1715);
					match(COMMA);
					}
				}

				setState(1718);
				match(BRACE_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_statementContext extends ParserRuleContext {
		public TerminalNode KW_OBJECT() { return getToken(ValkyrieAntlrParser.KW_OBJECT, 0); }
		public Class_blockContext class_block() {
			return getRuleContext(Class_blockContext.class,0);
		}
		public Define_genericContext define_generic() {
			return getRuleContext(Define_genericContext.class,0);
		}
		public Class_inheritContext class_inherit() {
			return getRuleContext(Class_inheritContext.class,0);
		}
		public Type_hintContext type_hint() {
			return getRuleContext(Type_hintContext.class,0);
		}
		public Object_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_statement; }
	}

	public final Object_statementContext object_statement() throws RecognitionException {
		Object_statementContext _localctx = new Object_statementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_object_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			match(KW_OBJECT);
			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << GENERIC_L) | (1L << OP_LT))) != 0)) {
				{
				setState(1723);
				define_generic();
				}
			}

			setState(1727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARENTHESES_L) {
				{
				setState(1726);
				class_inherit();
				}
			}

			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==OP_ARROW) {
				{
				setState(1729);
				type_hint();
				}
			}

			setState(1732);
			class_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_statementContext extends ParserRuleContext {
		public TerminalNode KW_NEW() { return getToken(ValkyrieAntlrParser.KW_NEW, 0); }
		public Modified_namepathContext modified_namepath() {
			return getRuleContext(Modified_namepathContext.class,0);
		}
		public New_blockContext new_block() {
			return getRuleContext(New_blockContext.class,0);
		}
		public Generic_call_in_typeContext generic_call_in_type() {
			return getRuleContext(Generic_call_in_typeContext.class,0);
		}
		public Tuple_call_bodyContext tuple_call_body() {
			return getRuleContext(Tuple_call_bodyContext.class,0);
		}
		public New_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_statement; }
	}

	public final New_statementContext new_statement() throws RecognitionException {
		New_statementContext _localctx = new New_statementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_new_statement);
		int _la;
		try {
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1734);
				match(KW_NEW);
				setState(1735);
				modified_namepath();
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << GENERIC_L) | (1L << OP_LT))) != 0)) {
					{
					setState(1736);
					generic_call_in_type();
					}
				}

				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTHESES_L) {
					{
					setState(1739);
					tuple_call_body();
					}
				}

				setState(1742);
				new_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1744);
				match(KW_NEW);
				setState(1745);
				modified_namepath();
				setState(1747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << GENERIC_L) | (1L << OP_LT))) != 0)) {
					{
					setState(1746);
					generic_call_in_type();
					}
				}

				setState(1749);
				tuple_call_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_bodyContext extends ParserRuleContext {
		public New_blockContext new_block() {
			return getRuleContext(New_blockContext.class,0);
		}
		public Tuple_call_bodyContext tuple_call_body() {
			return getRuleContext(Tuple_call_bodyContext.class,0);
		}
		public New_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_body; }
	}

	public final New_bodyContext new_body() throws RecognitionException {
		New_bodyContext _localctx = new New_bodyContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_new_body);
		int _la;
		try {
			setState(1758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARENTHESES_L) {
					{
					setState(1753);
					tuple_call_body();
					}
				}

				setState(1756);
				new_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1757);
				tuple_call_body();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_blockContext extends ParserRuleContext {
		public TerminalNode BRACE_L() { return getToken(ValkyrieAntlrParser.BRACE_L, 0); }
		public TerminalNode BRACE_R() { return getToken(ValkyrieAntlrParser.BRACE_R, 0); }
		public List<Tuple_call_itemContext> tuple_call_item() {
			return getRuleContexts(Tuple_call_itemContext.class);
		}
		public Tuple_call_itemContext tuple_call_item(int i) {
			return getRuleContext(Tuple_call_itemContext.class,i);
		}
		public List<Eos_freeContext> eos_free() {
			return getRuleContexts(Eos_freeContext.class);
		}
		public Eos_freeContext eos_free(int i) {
			return getRuleContext(Eos_freeContext.class,i);
		}
		public New_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_block; }
	}

	public final New_blockContext new_block() throws RecognitionException {
		New_blockContext _localctx = new New_blockContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_new_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			match(BRACE_L);
			setState(1765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMA) | (1L << SEMICOLON) | (1L << PARENTHESES_L) | (1L << BRACKET_L) | (1L << BRACE_L) | (1L << OFFSET_L) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_MUL) | (1L << OP_REM) | (1L << OP_LAST))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OP_AND - 67)) | (1L << (OP_AT - 67)) | (1L << (OP_HASH - 67)) | (1L << (LAMBDA_SLOT - 67)) | (1L << (OP_NOT - 67)) | (1L << (OP_DECONSTRUCT - 67)) | (1L << (OP_INVERSE - 67)) | (1L << (OP_ROOT2 - 67)) | (1L << (OP_ROOT3 - 67)) | (1L << (OP_ROOT4 - 67)) | (1L << (OP_REFERENCE - 67)) | (1L << (OP_LABEL - 67)) | (1L << (KW_NEW - 67)) | (1L << (KW_OBJECT - 67)) | (1L << (KW_TRY - 67)) | (1L << (KW_MATCH - 67)) | (1L << (KW_CATCH - 67)) | (1L << (INTEGER - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DECIMAL - 131)) | (1L << (STRING_SINGLE - 131)) | (1L << (STRING_DOUBLE - 131)) | (1L << (STRING_BLOCK - 131)) | (1L << (KW_IF - 131)) | (1L << (RETURN - 131)) | (1L << (RESUME - 131)) | (1L << (YIELD - 131)) | (1L << (BREAK - 131)) | (1L << (CONTINUE - 131)) | (1L << (RAISE - 131)) | (1L << (SPECIAL - 131)) | (1L << (RAW_ID - 131)) | (1L << (UNICODE_ID - 131)))) != 0)) {
				{
				setState(1763);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PARENTHESES_L:
				case BRACKET_L:
				case BRACE_L:
				case OFFSET_L:
				case OP_ADD:
				case OP_SUB:
				case OP_MUL:
				case OP_REM:
				case OP_LAST:
				case OP_AND:
				case OP_AT:
				case OP_HASH:
				case LAMBDA_SLOT:
				case OP_NOT:
				case OP_DECONSTRUCT:
				case OP_INVERSE:
				case OP_ROOT2:
				case OP_ROOT3:
				case OP_ROOT4:
				case OP_REFERENCE:
				case OP_LABEL:
				case KW_NEW:
				case KW_OBJECT:
				case KW_TRY:
				case KW_MATCH:
				case KW_CATCH:
				case INTEGER:
				case DECIMAL:
				case STRING_SINGLE:
				case STRING_DOUBLE:
				case STRING_BLOCK:
				case KW_IF:
				case RETURN:
				case RESUME:
				case YIELD:
				case BREAK:
				case CONTINUE:
				case RAISE:
				case SPECIAL:
				case RAW_ID:
				case UNICODE_ID:
					{
					setState(1761);
					tuple_call_item();
					}
					break;
				case COMMA:
				case SEMICOLON:
					{
					setState(1762);
					eos_free();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1768);
			match(BRACE_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_literalContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(ValkyrieAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(ValkyrieAntlrParser.PARENTHESES_R, 0); }
		public List<Collection_pairContext> collection_pair() {
			return getRuleContexts(Collection_pairContext.class);
		}
		public Collection_pairContext collection_pair(int i) {
			return getRuleContext(Collection_pairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public Tuple_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal; }
	}

	public final Tuple_literalContext tuple_literal() throws RecognitionException {
		Tuple_literalContext _localctx = new Tuple_literalContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_tuple_literal);
		int _la;
		try {
			int _alt;
			setState(1790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				match(PARENTHESES_L);
				setState(1771);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1772);
				match(PARENTHESES_L);
				setState(1773);
				collection_pair();
				setState(1776); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1774);
						match(COMMA);
						setState(1775);
						collection_pair();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1778); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1780);
					match(COMMA);
					}
				}

				setState(1783);
				match(PARENTHESES_R);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1785);
				match(PARENTHESES_L);
				setState(1786);
				collection_pair();
				setState(1787);
				match(COMMA);
				setState(1788);
				match(PARENTHESES_R);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_pairContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ValkyrieAntlrParser.COLON, 0); }
		public Collection_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_pair; }
	}

	public final Collection_pairContext collection_pair() throws RecognitionException {
		Collection_pairContext _localctx = new Collection_pairContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_collection_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				{
				setState(1792);
				identifier();
				setState(1793);
				match(COLON);
				}
				break;
			}
			setState(1797);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slice_callContext extends ParserRuleContext {
		public Range_literalContext range_literal() {
			return getRuleContext(Range_literalContext.class,0);
		}
		public TerminalNode OP_AND_THEN() { return getToken(ValkyrieAntlrParser.OP_AND_THEN, 0); }
		public Slice_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_call; }
	}

	public final Slice_callContext slice_call() throws RecognitionException {
		Slice_callContext _localctx = new Slice_callContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_slice_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_AND_THEN) {
				{
				setState(1799);
				match(OP_AND_THEN);
				}
			}

			setState(1802);
			range_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_literalContext extends ParserRuleContext {
		public Range_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_literal; }
	 
		public Range_literalContext() { }
		public void copyFrom(Range_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrdinalContext extends Range_literalContext {
		public TerminalNode BRACKET_L() { return getToken(ValkyrieAntlrParser.BRACKET_L, 0); }
		public TerminalNode BRACKET_R() { return getToken(ValkyrieAntlrParser.BRACKET_R, 0); }
		public List<Range_axisContext> range_axis() {
			return getRuleContexts(Range_axisContext.class);
		}
		public Range_axisContext range_axis(int i) {
			return getRuleContext(Range_axisContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public OrdinalContext(Range_literalContext ctx) { copyFrom(ctx); }
	}
	public static class OffsetContext extends Range_literalContext {
		public TerminalNode OFFSET_L() { return getToken(ValkyrieAntlrParser.OFFSET_L, 0); }
		public TerminalNode OFFSET_R() { return getToken(ValkyrieAntlrParser.OFFSET_R, 0); }
		public List<Range_axisContext> range_axis() {
			return getRuleContexts(Range_axisContext.class);
		}
		public Range_axisContext range_axis(int i) {
			return getRuleContext(Range_axisContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ValkyrieAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ValkyrieAntlrParser.COMMA, i);
		}
		public OffsetContext(Range_literalContext ctx) { copyFrom(ctx); }
	}

	public final Range_literalContext range_literal() throws RecognitionException {
		Range_literalContext _localctx = new Range_literalContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_range_literal);
		int _la;
		try {
			int _alt;
			setState(1834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKET_L:
				_localctx = new OrdinalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1804);
				match(BRACKET_L);
				setState(1816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << COLON) | (1L << PARENTHESES_L) | (1L << BRACKET_L) | (1L << OFFSET_L) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_MUL) | (1L << OP_REM) | (1L << OP_LAST))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OP_AND - 67)) | (1L << (LAMBDA_SLOT - 67)) | (1L << (OP_NOT - 67)) | (1L << (OP_DECONSTRUCT - 67)) | (1L << (OP_INVERSE - 67)) | (1L << (OP_ROOT2 - 67)) | (1L << (OP_ROOT3 - 67)) | (1L << (OP_ROOT4 - 67)) | (1L << (OP_REFERENCE - 67)) | (1L << (INTEGER - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DECIMAL - 131)) | (1L << (STRING_SINGLE - 131)) | (1L << (STRING_DOUBLE - 131)) | (1L << (STRING_BLOCK - 131)) | (1L << (SPECIAL - 131)) | (1L << (RAW_ID - 131)) | (1L << (UNICODE_ID - 131)))) != 0)) {
					{
					setState(1805);
					range_axis();
					setState(1810);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1806);
							match(COMMA);
							setState(1807);
							range_axis();
							}
							} 
						}
						setState(1812);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
					}
					setState(1814);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1813);
						match(COMMA);
						}
					}

					}
				}

				setState(1818);
				match(BRACKET_R);
				}
				break;
			case OFFSET_L:
				_localctx = new OffsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1819);
				match(OFFSET_L);
				setState(1831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_PROPORTION) | (1L << COLON) | (1L << PARENTHESES_L) | (1L << BRACKET_L) | (1L << OFFSET_L) | (1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_MUL) | (1L << OP_REM) | (1L << OP_LAST))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OP_AND - 67)) | (1L << (LAMBDA_SLOT - 67)) | (1L << (OP_NOT - 67)) | (1L << (OP_DECONSTRUCT - 67)) | (1L << (OP_INVERSE - 67)) | (1L << (OP_ROOT2 - 67)) | (1L << (OP_ROOT3 - 67)) | (1L << (OP_ROOT4 - 67)) | (1L << (OP_REFERENCE - 67)) | (1L << (INTEGER - 67)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (DECIMAL - 131)) | (1L << (STRING_SINGLE - 131)) | (1L << (STRING_DOUBLE - 131)) | (1L << (STRING_BLOCK - 131)) | (1L << (SPECIAL - 131)) | (1L << (RAW_ID - 131)) | (1L << (UNICODE_ID - 131)))) != 0)) {
					{
					setState(1820);
					range_axis();
					setState(1825);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1821);
							match(COMMA);
							setState(1822);
							range_axis();
							}
							} 
						}
						setState(1827);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
					}
					setState(1829);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1828);
						match(COMMA);
						}
					}

					}
				}

				setState(1833);
				match(OFFSET_R);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_axisContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(ValkyrieAntlrParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ValkyrieAntlrParser.COLON, i);
		}
		public TerminalNode OP_PROPORTION() { return getToken(ValkyrieAntlrParser.OP_PROPORTION, 0); }
		public Range_startContext range_start() {
			return getRuleContext(Range_startContext.class,0);
		}
		public Range_endContext range_end() {
			return getRuleContext(Range_endContext.class,0);
		}
		public Range_stepContext range_step() {
			return getRuleContext(Range_stepContext.class,0);
		}
		public Range_axisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_axis; }
	}

	public final Range_axisContext range_axis() throws RecognitionException {
		Range_axisContext _localctx = new Range_axisContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_range_axis);
		int _la;
		try {
			setState(1847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				match(COLON);
				}
				break;
			case OP_PROPORTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1837);
				match(OP_PROPORTION);
				}
				break;
			case PARENTHESES_L:
			case BRACKET_L:
			case OFFSET_L:
			case OP_ADD:
			case OP_SUB:
			case OP_MUL:
			case OP_REM:
			case OP_LAST:
			case OP_AND:
			case LAMBDA_SLOT:
			case OP_NOT:
			case OP_DECONSTRUCT:
			case OP_INVERSE:
			case OP_ROOT2:
			case OP_ROOT3:
			case OP_ROOT4:
			case OP_REFERENCE:
			case INTEGER:
			case DECIMAL:
			case STRING_SINGLE:
			case STRING_DOUBLE:
			case STRING_BLOCK:
			case SPECIAL:
			case RAW_ID:
			case UNICODE_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(1838);
				range_start();
				setState(1841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(1839);
					match(COLON);
					setState(1840);
					range_end();
					}
					break;
				}
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1843);
					match(COLON);
					setState(1844);
					range_step();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_startContext extends ParserRuleContext {
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Range_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_start; }
	}

	public final Range_startContext range_start() throws RecognitionException {
		Range_startContext _localctx = new Range_startContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_range_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			inline_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_endContext extends ParserRuleContext {
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Range_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_end; }
	}

	public final Range_endContext range_end() throws RecognitionException {
		Range_endContext _localctx = new Range_endContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_range_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			inline_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_stepContext extends ParserRuleContext {
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public Range_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_step; }
	}

	public final Range_stepContext range_step() throws RecognitionException {
		Range_stepContext _localctx = new Range_stepContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_range_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			inline_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(1855);
				identifier();
				}
				}
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modified_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public IdentifierContext id;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Modified_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modified_identifier; }
	}

	public final Modified_identifierContext modified_identifier() throws RecognitionException {
		Modified_identifierContext _localctx = new Modified_identifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_modified_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1861);
					((Modified_identifierContext)_localctx).identifier = identifier();
					((Modified_identifierContext)_localctx).mods.add(((Modified_identifierContext)_localctx).identifier);
					}
					} 
				}
				setState(1866);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			}
			setState(1867);
			((Modified_identifierContext)_localctx).id = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modified_namepathContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> path = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(ValkyrieAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(ValkyrieAntlrParser.OP_PROPORTION, i);
		}
		public Modified_namepathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modified_namepath; }
	}

	public final Modified_namepathContext modified_namepath() throws RecognitionException {
		Modified_namepathContext _localctx = new Modified_namepathContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_modified_namepath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1869);
					((Modified_namepathContext)_localctx).identifier = identifier();
					((Modified_namepathContext)_localctx).mods.add(((Modified_namepathContext)_localctx).identifier);
					}
					} 
				}
				setState(1874);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			}
			setState(1875);
			((Modified_namepathContext)_localctx).identifier = identifier();
			((Modified_namepathContext)_localctx).path.add(((Modified_namepathContext)_localctx).identifier);
			setState(1880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1876);
					match(OP_PROPORTION);
					setState(1877);
					((Modified_namepathContext)_localctx).identifier = identifier();
					((Modified_namepathContext)_localctx).path.add(((Modified_namepathContext)_localctx).identifier);
					}
					} 
				}
				setState(1882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_nameContext extends ParserRuleContext {
		public TerminalNode LAMBDA_SLOT() { return getToken(ValkyrieAntlrParser.LAMBDA_SLOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Lambda_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_name; }
	}

	public final Lambda_nameContext lambda_name() throws RecognitionException {
		Lambda_nameContext _localctx = new Lambda_nameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_lambda_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			match(LAMBDA_SLOT);
			setState(1886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1884);
				identifier();
				}
				break;
			case 2:
				{
				setState(1885);
				number();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_nameContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ValkyrieAntlrParser.INTEGER, 0); }
		public TerminalNode OP_REM() { return getToken(ValkyrieAntlrParser.OP_REM, 0); }
		public TerminalNode OP_LAST() { return getToken(ValkyrieAntlrParser.OP_LAST, 0); }
		public Output_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_name; }
	}

	public final Output_nameContext output_name() throws RecognitionException {
		Output_nameContext _localctx = new Output_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_output_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			_la = _input.LA(1);
			if ( !(_la==OP_REM || _la==OP_LAST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1889);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(ValkyrieAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(ValkyrieAntlrParser.OP_PROPORTION, i);
		}
		public TerminalNode DOT() { return getToken(ValkyrieAntlrParser.DOT, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			identifier();
			setState(1896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_PROPORTION) {
				{
				{
				setState(1892);
				match(OP_PROPORTION);
				setState(1893);
				identifier();
				}
				}
				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1899);
				match(DOT);
				setState(1900);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namepath_freeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(ValkyrieAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(ValkyrieAntlrParser.OP_PROPORTION, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ValkyrieAntlrParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ValkyrieAntlrParser.DOT, i);
		}
		public Namepath_freeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namepath_free; }
	}

	public final Namepath_freeContext namepath_free() throws RecognitionException {
		Namepath_freeContext _localctx = new Namepath_freeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_namepath_free);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			identifier();
			setState(1908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==OP_PROPORTION) {
				{
				{
				setState(1904);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==OP_PROPORTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1905);
				identifier();
				}
				}
				setState(1910);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamepathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(ValkyrieAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(ValkyrieAntlrParser.OP_PROPORTION, i);
		}
		public NamepathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namepath; }
	}

	public final NamepathContext namepath() throws RecognitionException {
		NamepathContext _localctx = new NamepathContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_namepath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			identifier();
			setState(1916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1912);
					match(OP_PROPORTION);
					setState(1913);
					identifier();
					}
					} 
				}
				setState(1918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode UNICODE_ID() { return getToken(ValkyrieAntlrParser.UNICODE_ID, 0); }
		public TerminalNode RAW_ID() { return getToken(ValkyrieAntlrParser.RAW_ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			_la = _input.LA(1);
			if ( !(_la==RAW_ID || _la==UNICODE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(ValkyrieAntlrParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(ValkyrieAntlrParser.INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_literalContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Number_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_literal; }
	}

	public final Number_literalContext number_literal() throws RecognitionException {
		Number_literalContext _localctx = new Number_literalContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_number_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			number();
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(1924);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_SINGLE() { return getToken(ValkyrieAntlrParser.STRING_SINGLE, 0); }
		public TerminalNode STRING_DOUBLE() { return getToken(ValkyrieAntlrParser.STRING_DOUBLE, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			_la = _input.LA(1);
			if ( !(_la==STRING_SINGLE || _la==STRING_DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING_SINGLE() { return getToken(ValkyrieAntlrParser.STRING_SINGLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING_DOUBLE() { return getToken(ValkyrieAntlrParser.STRING_DOUBLE, 0); }
		public TerminalNode STRING_BLOCK() { return getToken(ValkyrieAntlrParser.STRING_BLOCK, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_string_literal);
		int _la;
		try {
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(1929);
					identifier();
					}
				}

				setState(1932);
				match(STRING_SINGLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1934);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(1933);
					identifier();
					}
				}

				setState(1936);
				match(STRING_DOUBLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RAW_ID || _la==UNICODE_ID) {
					{
					setState(1937);
					identifier();
					}
				}

				setState(1940);
				match(STRING_BLOCK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 53:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 54:
			return inline_expression_sempred((Inline_expressionContext)_localctx, predIndex);
		case 55:
			return type_expression_sempred((Type_expressionContext)_localctx, predIndex);
		case 92:
			return case_pattern_sempred((Case_patternContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 26);
		case 1:
			return precpred(_ctx, 25);
		case 2:
			return precpred(_ctx, 24);
		case 3:
			return precpred(_ctx, 23);
		case 4:
			return precpred(_ctx, 22);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 17);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 33);
		case 10:
			return precpred(_ctx, 32);
		case 11:
			return precpred(_ctx, 31);
		case 12:
			return precpred(_ctx, 30);
		case 13:
			return precpred(_ctx, 29);
		case 14:
			return precpred(_ctx, 28);
		case 15:
			return precpred(_ctx, 19);
		case 16:
			return precpred(_ctx, 18);
		case 17:
			return precpred(_ctx, 16);
		case 18:
			return precpred(_ctx, 14);
		}
		return true;
	}
	private boolean inline_expression_sempred(Inline_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 11);
		case 20:
			return precpred(_ctx, 10);
		case 21:
			return precpred(_ctx, 9);
		case 22:
			return precpred(_ctx, 8);
		case 23:
			return precpred(_ctx, 7);
		case 24:
			return precpred(_ctx, 6);
		case 25:
			return precpred(_ctx, 5);
		case 26:
			return precpred(_ctx, 4);
		case 27:
			return precpred(_ctx, 14);
		case 28:
			return precpred(_ctx, 13);
		case 29:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean type_expression_sempred(Type_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 6);
		case 31:
			return precpred(_ctx, 5);
		case 32:
			return precpred(_ctx, 4);
		case 33:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean case_pattern_sempred(Case_patternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 3);
		case 35:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0098\u079a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2\u0103\n\2\f\2\16\2\u0106\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\5\5\u0111\n\5\3\6\3\6\3\6\3\7\3\7\5\7\u0118\n\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\5\b\u0120\n\b\3\b\3\b\3\b\5\b\u0125\n\b\3\b\5\b\u0128\n\b"+
		"\3\b\3\b\3\b\5\b\u012d\n\b\3\b\3\b\3\b\5\b\u0132\n\b\3\b\5\b\u0135\n\b"+
		"\3\b\3\b\5\b\u0139\n\b\3\b\3\b\5\b\u013d\n\b\3\b\5\b\u0140\n\b\3\b\5\b"+
		"\u0143\n\b\3\t\3\t\3\t\7\t\u0148\n\t\f\t\16\t\u014b\13\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\7\n\u0154\n\n\f\n\16\n\u0157\13\n\3\n\5\n\u015a\n\n\3\13"+
		"\3\13\3\f\5\f\u015f\n\f\3\f\7\f\u0162\n\f\f\f\16\f\u0165\13\f\3\f\3\f"+
		"\3\f\3\f\5\f\u016b\n\f\3\f\5\f\u016e\n\f\3\f\5\f\u0171\n\f\3\f\3\f\5\f"+
		"\u0175\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u017c\n\r\f\r\16\r\u017f\13\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0189\n\16\f\16\16\16\u018c\13\16"+
		"\3\16\5\16\u018f\n\16\3\16\3\16\5\16\u0193\n\16\3\17\3\17\3\20\7\20\u0198"+
		"\n\20\f\20\16\20\u019b\13\20\3\20\3\20\5\20\u019f\n\20\3\20\5\20\u01a2"+
		"\n\20\3\21\7\21\u01a5\n\21\f\21\16\21\u01a8\13\21\3\21\3\21\5\21\u01ac"+
		"\n\21\3\21\3\21\5\21\u01b0\n\21\3\21\5\21\u01b3\n\21\3\21\5\21\u01b6\n"+
		"\21\3\22\7\22\u01b9\n\22\f\22\16\22\u01bc\13\22\3\22\3\22\3\22\3\23\5"+
		"\23\u01c2\n\23\3\23\7\23\u01c5\n\23\f\23\16\23\u01c8\13\23\3\23\3\23\3"+
		"\23\3\23\5\23\u01ce\n\23\3\23\5\23\u01d1\n\23\3\23\3\23\5\23\u01d5\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u01dc\n\24\f\24\16\24\u01df\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\5\25\u01e7\n\25\3\26\5\26\u01ea\n\26\3\26\7"+
		"\26\u01ed\n\26\f\26\16\26\u01f0\13\26\3\26\3\26\3\26\3\26\5\26\u01f6\n"+
		"\26\3\26\5\26\u01f9\n\26\3\26\3\26\3\27\3\27\3\27\3\30\7\30\u0201\n\30"+
		"\f\30\16\30\u0204\13\30\3\30\3\30\3\30\3\30\5\30\u020a\n\30\3\30\5\30"+
		"\u020d\n\30\3\30\3\30\3\31\3\31\5\31\u0213\n\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\7\32\u021b\n\32\f\32\16\32\u021e\13\32\3\32\3\32\3\33\3\33\5"+
		"\33\u0224\n\33\3\34\3\34\3\34\7\34\u0229\n\34\f\34\16\34\u022c\13\34\3"+
		"\34\3\34\3\35\7\35\u0231\n\35\f\35\16\35\u0234\13\35\3\35\3\35\3\35\3"+
		"\35\5\35\u023a\n\35\3\35\5\35\u023d\n\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\7\36\u0245\n\36\f\36\16\36\u0248\13\36\3\36\3\36\3\37\7\37\u024d\n\37"+
		"\f\37\16\37\u0250\13\37\3\37\3\37\3\37\5\37\u0255\n\37\3 \5 \u0258\n "+
		"\3 \7 \u025b\n \f \16 \u025e\13 \3 \3 \3 \3 \5 \u0264\n \3 \3 \5 \u0268"+
		"\n \3 \5 \u026b\n \3 \3 \3!\3!\3!\3!\3!\3!\7!\u0275\n!\f!\16!\u0278\13"+
		"!\3!\3!\5!\u027c\n!\3\"\7\"\u027f\n\"\f\"\16\"\u0282\13\"\3\"\3\"\5\""+
		"\u0286\n\"\3\"\5\"\u0289\n\"\3#\3#\3#\3$\5$\u028f\n$\3$\3$\5$\u0293\n"+
		"$\3$\3$\5$\u0297\n$\3$\3$\5$\u029b\n$\5$\u029d\n$\3%\3%\3%\3%\3%\3%\7"+
		"%\u02a5\n%\f%\16%\u02a8\13%\3%\5%\u02ab\n%\3%\3%\5%\u02af\n%\3&\3&\3&"+
		"\3&\3&\5&\u02b6\n&\3\'\7\'\u02b9\n\'\f\'\16\'\u02bc\13\'\3\'\3\'\3\'\5"+
		"\'\u02c1\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\7(\u02cd\n(\f(\16(\u02d0"+
		"\13(\3(\3(\3)\3)\3)\5)\u02d7\n)\3)\3)\5)\u02db\n)\3*\3*\5*\u02df\n*\3"+
		"+\3+\3+\7+\u02e4\n+\f+\16+\u02e7\13+\3+\5+\u02ea\n+\3,\3,\3,\3,\3,\3,"+
		"\3,\6,\u02f3\n,\r,\16,\u02f4\3,\5,\u02f8\n,\5,\u02fa\n,\3,\3,\3,\3,\3"+
		",\3,\7,\u0302\n,\f,\16,\u0305\13,\3,\5,\u0308\n,\5,\u030a\n,\3,\3,\3,"+
		"\5,\u030f\n,\3,\3,\3,\3,\7,\u0315\n,\f,\16,\u0318\13,\3,\5,\u031b\n,\5"+
		",\u031d\n,\3,\3,\5,\u0321\n,\3,\3,\3,\3,\7,\u0327\n,\f,\16,\u032a\13,"+
		"\3,\5,\u032d\n,\5,\u032f\n,\3,\5,\u0332\n,\3-\3-\3-\5-\u0337\n-\3-\3-"+
		"\3-\5-\u033c\n-\3-\3-\3-\3-\5-\u0342\n-\3-\3-\3-\5-\u0347\n-\3-\3-\5-"+
		"\u034b\n-\3-\3-\5-\u034f\n-\3-\5-\u0352\n-\3.\3.\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\7\61\u0360\n\61\f\61\16\61\u0363\13\61\3\61\3\61\3\61"+
		"\3\61\7\61\u0369\n\61\f\61\16\61\u036c\13\61\3\61\3\61\5\61\u0370\n\61"+
		"\3\62\7\62\u0373\n\62\f\62\16\62\u0376\13\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u037d\n\62\3\62\3\62\3\62\3\62\3\62\7\62\u0384\n\62\f\62\16\62\u0387"+
		"\13\62\3\62\3\62\3\62\3\62\3\62\5\62\u038e\n\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\7\64\u0396\n\64\f\64\16\64\u0399\13\64\3\64\3\64\3\64\3\64\3"+
		"\64\7\64\u03a0\n\64\f\64\16\64\u03a3\13\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\7\64\u03ad\n\64\f\64\16\64\u03b0\13\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\5\64\u03b8\n\64\3\64\3\64\5\64\u03bc\n\64\3\65\3\65\3\65"+
		"\3\66\7\66\u03c2\n\66\f\66\16\66\u03c5\13\66\3\66\3\66\5\66\u03c9\n\66"+
		"\3\66\5\66\u03cc\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u03e2\n\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u0411\n\67\3\67\5\67\u0414\n\67\3\67\3\67\3\67\5\67\u0419"+
		"\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u0420\n\67\5\67\u0422\n\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\7\67\u0434\n\67\f\67\16\67\u0437\13\67\38\38\38\38\38\38\38\58\u0440"+
		"\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\78\u0466\n8\f8\168\u0469\13"+
		"8\39\39\39\39\39\39\39\39\69\u0473\n9\r9\169\u0474\39\59\u0478\n9\59\u047a"+
		"\n9\39\39\59\u047e\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\79\u048d"+
		"\n9\f9\169\u0490\139\3:\3:\3:\3:\3:\3:\5:\u0498\n:\3;\3;\3;\5;\u049d\n"+
		";\5;\u049f\n;\3;\3;\3;\5;\u04a4\n;\3;\3;\3;\5;\u04a9\n;\3;\3;\3;\3;\3"+
		";\5;\u04b0\n;\3;\5;\u04b3\n;\3;\3;\3;\3;\3;\5;\u04ba\n;\3<\3<\3=\3=\3"+
		">\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3"+
		"H\3H\3H\5H\u04da\nH\3I\3I\3J\3J\3J\3J\3J\5J\u04e3\nJ\3K\3K\3K\3K\3K\3"+
		"K\7K\u04eb\nK\fK\16K\u04ee\13K\3K\5K\u04f1\nK\3K\3K\3K\5K\u04f6\nK\3K"+
		"\3K\3K\5K\u04fb\nK\3K\3K\3K\3K\7K\u0501\nK\fK\16K\u0504\13K\3K\5K\u0507"+
		"\nK\3K\3K\5K\u050b\nK\3L\3L\3L\5L\u0510\nL\3L\3L\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\7M\u051c\nM\fM\16M\u051f\13M\3M\5M\u0522\nM\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\7M\u052c\nM\fM\16M\u052f\13M\3M\5M\u0532\nM\3M\3M\5M\u0536\nM\3N\5N"+
		"\u0539\nN\3N\3N\3N\3N\7N\u053f\nN\fN\16N\u0542\13N\3N\3N\3N\3N\3N\3N\7"+
		"N\u054a\nN\fN\16N\u054d\13N\3N\3N\5N\u0551\nN\3O\3O\3O\5O\u0556\nO\3O"+
		"\3O\3P\3P\3P\3Q\7Q\u055e\nQ\fQ\16Q\u0561\13Q\3Q\3Q\3Q\3Q\3Q\7Q\u0568\n"+
		"Q\fQ\16Q\u056b\13Q\3Q\3Q\3Q\3Q\3Q\7Q\u0572\nQ\fQ\16Q\u0575\13Q\3Q\5Q\u0578"+
		"\nQ\3Q\3Q\5Q\u057c\nQ\3R\3R\3R\7R\u0581\nR\fR\16R\u0584\13R\3R\3R\3S\3"+
		"S\3S\3T\3T\7T\u058d\nT\fT\16T\u0590\13T\3T\3T\3U\3U\3U\3U\3U\5U\u0599"+
		"\nU\3V\3V\3V\5V\u059e\nV\3V\3V\3V\3V\3V\7V\u05a5\nV\fV\16V\u05a8\13V\3"+
		"V\3V\5V\u05ac\nV\5V\u05ae\nV\3W\3W\3W\5W\u05b3\nW\3W\3W\3W\3W\3W\7W\u05ba"+
		"\nW\fW\16W\u05bd\13W\3W\3W\5W\u05c1\nW\5W\u05c3\nW\3X\3X\5X\u05c7\nX\3"+
		"X\5X\u05ca\nX\3Y\7Y\u05cd\nY\fY\16Y\u05d0\13Y\3Y\3Y\5Y\u05d4\nY\3Y\3Y"+
		"\3Z\7Z\u05d9\nZ\fZ\16Z\u05dc\13Z\3Z\3Z\3Z\3Z\5Z\u05e2\nZ\3Z\3Z\3Z\3[\3"+
		"[\3[\7[\u05ea\n[\f[\16[\u05ed\13[\3[\3[\3\\\7\\\u05f2\n\\\f\\\16\\\u05f5"+
		"\13\\\3\\\3\\\3\\\7\\\u05fa\n\\\f\\\16\\\u05fd\13\\\3\\\3\\\3\\\3\\\3"+
		"\\\7\\\u0604\n\\\f\\\16\\\u0607\13\\\3\\\5\\\u060a\n\\\5\\\u060c\n\\\3"+
		"\\\3\\\7\\\u0610\n\\\f\\\16\\\u0613\13\\\3\\\3\\\3\\\3\\\5\\\u0619\n\\"+
		"\3\\\3\\\3\\\7\\\u061e\n\\\f\\\16\\\u0621\13\\\3\\\3\\\3\\\3\\\3\\\7\\"+
		"\u0628\n\\\f\\\16\\\u062b\13\\\3\\\3\\\3\\\7\\\u0630\n\\\f\\\16\\\u0633"+
		"\13\\\3\\\3\\\3\\\3\\\5\\\u0639\n\\\3\\\3\\\5\\\u063d\n\\\3]\3]\7]\u0641"+
		"\n]\f]\16]\u0644\13]\3^\3^\3^\3^\3^\3^\3^\3^\3^\7^\u064f\n^\f^\16^\u0652"+
		"\13^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u065e\n_\3_\3_\3_\3_\3_\3_\3_\5"+
		"_\u0667\n_\3`\5`\u066a\n`\3`\3`\3`\5`\u066f\n`\3`\3`\3`\5`\u0674\n`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\6`\u0681\n`\r`\16`\u0682\3`\5`\u0686\n"+
		"`\3`\3`\3`\3`\3`\3`\3`\7`\u068f\n`\f`\16`\u0692\13`\3`\5`\u0695\n`\3`"+
		"\3`\3`\5`\u069a\n`\3`\3`\3`\3`\7`\u06a0\n`\f`\16`\u06a3\13`\3`\5`\u06a6"+
		"\n`\3`\3`\3`\5`\u06ab\n`\3`\3`\3`\3`\7`\u06b1\n`\f`\16`\u06b4\13`\3`\5"+
		"`\u06b7\n`\3`\3`\5`\u06bb\n`\3a\3a\5a\u06bf\na\3a\5a\u06c2\na\3a\5a\u06c5"+
		"\na\3a\3a\3b\3b\3b\5b\u06cc\nb\3b\5b\u06cf\nb\3b\3b\3b\3b\3b\5b\u06d6"+
		"\nb\3b\3b\5b\u06da\nb\3c\5c\u06dd\nc\3c\3c\5c\u06e1\nc\3d\3d\3d\7d\u06e6"+
		"\nd\fd\16d\u06e9\13d\3d\3d\3e\3e\3e\3e\3e\3e\6e\u06f3\ne\re\16e\u06f4"+
		"\3e\5e\u06f8\ne\3e\3e\3e\3e\3e\3e\3e\5e\u0701\ne\3f\3f\3f\5f\u0706\nf"+
		"\3f\3f\3g\5g\u070b\ng\3g\3g\3h\3h\3h\3h\7h\u0713\nh\fh\16h\u0716\13h\3"+
		"h\5h\u0719\nh\5h\u071b\nh\3h\3h\3h\3h\3h\7h\u0722\nh\fh\16h\u0725\13h"+
		"\3h\5h\u0728\nh\5h\u072a\nh\3h\5h\u072d\nh\3i\3i\3i\3i\3i\5i\u0734\ni"+
		"\3i\3i\5i\u0738\ni\5i\u073a\ni\3j\3j\3k\3k\3l\3l\3m\7m\u0743\nm\fm\16"+
		"m\u0746\13m\3n\7n\u0749\nn\fn\16n\u074c\13n\3n\3n\3o\7o\u0751\no\fo\16"+
		"o\u0754\13o\3o\3o\3o\7o\u0759\no\fo\16o\u075c\13o\3p\3p\3p\5p\u0761\n"+
		"p\3q\3q\3q\3r\3r\3r\7r\u0769\nr\fr\16r\u076c\13r\3r\3r\5r\u0770\nr\3s"+
		"\3s\3s\7s\u0775\ns\fs\16s\u0778\13s\3t\3t\3t\7t\u077d\nt\ft\16t\u0780"+
		"\13t\3u\3u\3v\3v\3w\3w\5w\u0788\nw\3x\3x\3y\5y\u078d\ny\3y\3y\5y\u0791"+
		"\ny\3y\3y\5y\u0795\ny\3y\5y\u0798\ny\3y\2\6lnp\u00baz\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\2\32"+
		"\3\2\4\5\3\2LM\4\2\3\3\7\7\4\2\b\btt\4\2\b\b\63\63\4\2UUxx\3\2\177\u0080"+
		"\t\2\33\34\37\37EETT^^adhh\7\2\35\36!!QQTTeg\5\2$(,-\61\61\3\2EF\3\2I"+
		"K\4\2``bb\3\2\63\64\3\2\37\"\3\2\33\34\3\2=B\4\2)+/\60\5\2..\65\65\67"+
		";\4\2\33\33FF\4\2!!##\3\2\u0093\u0094\3\2\u0084\u0085\3\2\u0086\u0087"+
		"\2\u08a7\2\u0104\3\2\2\2\4\u0109\3\2\2\2\6\u010b\3\2\2\2\b\u010d\3\2\2"+
		"\2\n\u0112\3\2\2\2\f\u0115\3\2\2\2\16\u0142\3\2\2\2\20\u0144\3\2\2\2\22"+
		"\u0159\3\2\2\2\24\u015b\3\2\2\2\26\u015e\3\2\2\2\30\u0176\3\2\2\2\32\u0192"+
		"\3\2\2\2\34\u0194\3\2\2\2\36\u0199\3\2\2\2 \u01a6\3\2\2\2\"\u01ba\3\2"+
		"\2\2$\u01c1\3\2\2\2&\u01d6\3\2\2\2(\u01e2\3\2\2\2*\u01e9\3\2\2\2,\u01fc"+
		"\3\2\2\2.\u0202\3\2\2\2\60\u0210\3\2\2\2\62\u0216\3\2\2\2\64\u0221\3\2"+
		"\2\2\66\u0225\3\2\2\28\u0232\3\2\2\2:\u0240\3\2\2\2<\u024e\3\2\2\2>\u0257"+
		"\3\2\2\2@\u027b\3\2\2\2B\u0280\3\2\2\2D\u028a\3\2\2\2F\u029c\3\2\2\2H"+
		"\u02ae\3\2\2\2J\u02b5\3\2\2\2L\u02ba\3\2\2\2N\u02c4\3\2\2\2P\u02d3\3\2"+
		"\2\2R\u02de\3\2\2\2T\u02e0\3\2\2\2V\u0331\3\2\2\2X\u0351\3\2\2\2Z\u0353"+
		"\3\2\2\2\\\u0358\3\2\2\2^\u035b\3\2\2\2`\u0361\3\2\2\2b\u038d\3\2\2\2"+
		"d\u038f\3\2\2\2f\u03bb\3\2\2\2h\u03bd\3\2\2\2j\u03c3\3\2\2\2l\u03e1\3"+
		"\2\2\2n\u043f\3\2\2\2p\u047d\3\2\2\2r\u0497\3\2\2\2t\u04b9\3\2\2\2v\u04bb"+
		"\3\2\2\2x\u04bd\3\2\2\2z\u04bf\3\2\2\2|\u04c1\3\2\2\2~\u04c3\3\2\2\2\u0080"+
		"\u04c5\3\2\2\2\u0082\u04c7\3\2\2\2\u0084\u04c9\3\2\2\2\u0086\u04cb\3\2"+
		"\2\2\u0088\u04cd\3\2\2\2\u008a\u04cf\3\2\2\2\u008c\u04d1\3\2\2\2\u008e"+
		"\u04d9\3\2\2\2\u0090\u04db\3\2\2\2\u0092\u04e2\3\2\2\2\u0094\u050a\3\2"+
		"\2\2\u0096\u050f\3\2\2\2\u0098\u0535\3\2\2\2\u009a\u0550\3\2\2\2\u009c"+
		"\u0555\3\2\2\2\u009e\u0559\3\2\2\2\u00a0\u057b\3\2\2\2\u00a2\u057d\3\2"+
		"\2\2\u00a4\u0587\3\2\2\2\u00a6\u058a\3\2\2\2\u00a8\u0598\3\2\2\2\u00aa"+
		"\u05ad\3\2\2\2\u00ac\u05c2\3\2\2\2\u00ae\u05c4\3\2\2\2\u00b0\u05ce\3\2"+
		"\2\2\u00b2\u05da\3\2\2\2\u00b4\u05e6\3\2\2\2\u00b6\u063c\3\2\2\2\u00b8"+
		"\u063e\3\2\2\2\u00ba\u0645\3\2\2\2\u00bc\u0666\3\2\2\2\u00be\u06ba\3\2"+
		"\2\2\u00c0\u06bc\3\2\2\2\u00c2\u06d9\3\2\2\2\u00c4\u06e0\3\2\2\2\u00c6"+
		"\u06e2\3\2\2\2\u00c8\u0700\3\2\2\2\u00ca\u0705\3\2\2\2\u00cc\u070a\3\2"+
		"\2\2\u00ce\u072c\3\2\2\2\u00d0\u0739\3\2\2\2\u00d2\u073b\3\2\2\2\u00d4"+
		"\u073d\3\2\2\2\u00d6\u073f\3\2\2\2\u00d8\u0744\3\2\2\2\u00da\u074a\3\2"+
		"\2\2\u00dc\u0752\3\2\2\2\u00de\u075d\3\2\2\2\u00e0\u0762\3\2\2\2\u00e2"+
		"\u0765\3\2\2\2\u00e4\u0771\3\2\2\2\u00e6\u0779\3\2\2\2\u00e8\u0781\3\2"+
		"\2\2\u00ea\u0783\3\2\2\2\u00ec\u0785\3\2\2\2\u00ee\u0789\3\2\2\2\u00f0"+
		"\u0797\3\2\2\2\u00f2\u0103\5\b\5\2\u00f3\u0103\5\n\6\2\u00f4\u0103\5\24"+
		"\13\2\u00f5\u0103\5\26\f\2\u00f6\u0103\5.\30\2\u00f7\u0103\58\35\2\u00f8"+
		"\u0103\5$\23\2\u00f9\u0103\5*\26\2\u00fa\u0103\5> \2\u00fb\u0103\5Z.\2"+
		"\u00fc\u0103\5L\'\2\u00fd\u0103\5P)\2\u00fe\u0103\5f\64\2\u00ff\u0103"+
		"\5b\62\2\u0100\u0103\5j\66\2\u0101\u0103\5\4\3\2\u0102\u00f2\3\2\2\2\u0102"+
		"\u00f3\3\2\2\2\u0102\u00f4\3\2\2\2\u0102\u00f5\3\2\2\2\u0102\u00f6\3\2"+
		"\2\2\u0102\u00f7\3\2\2\2\u0102\u00f8\3\2\2\2\u0102\u00f9\3\2\2\2\u0102"+
		"\u00fa\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2"+
		"\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\2\2\3\u0108"+
		"\3\3\2\2\2\u0109\u010a\7\5\2\2\u010a\5\3\2\2\2\u010b\u010c\t\2\2\2\u010c"+
		"\7\3\2\2\2\u010d\u010e\7j\2\2\u010e\u0110\5\u00e4s\2\u010f\u0111\5\4\3"+
		"\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\t\3\2\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\5\16\b\2\u0114\13\3\2\2\2\u0115\u0117\7]\2\2\u0116"+
		"\u0118\t\3\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\5\u00e8u\2\u011a\r\3\2\2\2\u011b\u0143\5\22\n\2\u011c"+
		"\u011d\7L\2\2\u011d\u011f\5\20\t\2\u011e\u0120\5\f\7\2\u011f\u011e\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0143\3\2\2\2\u0121\u0122\7L\2\2\u0122"+
		"\u0127\5\20\t\2\u0123\u0125\t\4\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\5\22\n\2\u0127\u0124\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0143\3\2\2\2\u0129\u012a\7M\2\2\u012a\u012c\5\20"+
		"\t\2\u012b\u012d\5\f\7\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0143\3\2\2\2\u012e\u012f\7M\2\2\u012f\u0134\5\20\t\2\u0130\u0132\t\4"+
		"\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0135\5\22\n\2\u0134\u0131\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0143\3"+
		"\2\2\2\u0136\u0138\5\20\t\2\u0137\u0139\5\f\7\2\u0138\u0137\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u0143\3\2\2\2\u013a\u013f\5\20\t\2\u013b\u013d\t"+
		"\4\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\5\22\n\2\u013f\u013c\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3"+
		"\2\2\2\u0141\u0143\5\6\4\2\u0142\u011b\3\2\2\2\u0142\u011c\3\2\2\2\u0142"+
		"\u0121\3\2\2\2\u0142\u0129\3\2\2\2\u0142\u012e\3\2\2\2\u0142\u0136\3\2"+
		"\2\2\u0142\u013a\3\2\2\2\u0142\u0141\3\2\2\2\u0143\17\3\2\2\2\u0144\u0149"+
		"\5\u00e8u\2\u0145\u0146\t\4\2\2\u0146\u0148\5\u00e8u\2\u0147\u0145\3\2"+
		"\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\t\4\2\2\u014d\u014e\7\37"+
		"\2\2\u014e\21\3\2\2\2\u014f\u0150\7\r\2\2\u0150\u015a\7\16\2\2\u0151\u0155"+
		"\7\r\2\2\u0152\u0154\5\16\b\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u015a\7\16\2\2\u0159\u014f\3\2\2\2\u0159\u0151\3\2\2\2"+
		"\u015a\23\3\2\2\2\u015b\u015c\7l\2\2\u015c\25\3\2\2\2\u015d\u015f\5\u00a0"+
		"Q\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0163\3\2\2\2\u0160"+
		"\u0162\5\u00acW\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\5\u00d8m\2\u0167\u0168\7m\2\2\u0168\u016a\5\u00e8u\2\u0169\u016b"+
		"\5\u0094K\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2"+
		"\2\u016c\u016e\5\32\16\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u0171\5\\/\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0174\5\30\r\2\u0173\u0175\5\4\3\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\27\3\2\2\2\u0176\u017d\7\r\2"+
		"\2\u0177\u017c\5\"\22\2\u0178\u017c\5 \21\2\u0179\u017c\5\36\20\2\u017a"+
		"\u017c\5\6\4\2\u017b\u0177\3\2\2\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7\16"+
		"\2\2\u0181\31\3\2\2\2\u0182\u0183\7\t\2\2\u0183\u0193\7\n\2\2\u0184\u0185"+
		"\7\t\2\2\u0185\u018a\5\34\17\2\u0186\u0187\7\4\2\2\u0187\u0189\5\34\17"+
		"\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\7\4\2\2\u018e"+
		"\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\7\n"+
		"\2\2\u0191\u0193\3\2\2\2\u0192\u0182\3\2\2\2\u0192\u0184\3\2\2\2\u0193"+
		"\33\3\2\2\2\u0194\u0195\5\u00dco\2\u0195\35\3\2\2\2\u0196\u0198\5\u00ac"+
		"W\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\5\u00da"+
		"n\2\u019d\u019f\5\\/\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1"+
		"\3\2\2\2\u01a0\u01a2\5D#\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\37\3\2\2\2\u01a3\u01a5\5\u00acW\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2"+
		"\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01ab\5\u00dco\2\u01aa\u01ac\5\u0094K\2\u01ab\u01aa"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\5@!\2\u01ae"+
		"\u01b0\5\\/\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01b3\5^\60\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01b6\5N(\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2"+
		"\2\u01b6!\3\2\2\2\u01b7\u01b9\5\u00acW\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01be\5\u00dan\2\u01be\u01bf\5\30\r\2\u01bf#\3\2"+
		"\2\2\u01c0\u01c2\5\u00a0Q\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c6\3\2\2\2\u01c3\u01c5\5\u00acW\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01ca\5\u00d8m\2\u01ca\u01cb\7n\2\2\u01cb\u01cd\5"+
		"\u00e8u\2\u01cc\u01ce\5\u0094K\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2"+
		"\2\u01ce\u01d0\3\2\2\2\u01cf\u01d1\5,\27\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\5&\24\2\u01d3\u01d5\5\4\3\2\u01d4"+
		"\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5%\3\2\2\2\u01d6\u01dd\7\r\2\2"+
		"\u01d7\u01dc\5(\25\2\u01d8\u01dc\5 \21\2\u01d9\u01dc\5\36\20\2\u01da\u01dc"+
		"\5\6\4\2\u01db\u01d7\3\2\2\2\u01db\u01d8\3\2\2\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\7\16\2\2\u01e1"+
		"\'\3\2\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e6\5\u00e8u\2\u01e4\u01e5\7\65"+
		"\2\2\u01e5\u01e7\5p9\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7)"+
		"\3\2\2\2\u01e8\u01ea\5\u00a0Q\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2"+
		"\2\u01ea\u01ee\3\2\2\2\u01eb\u01ed\5\u00acW\2\u01ec\u01eb\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\5\u00d8m\2\u01f2\u01f3\7s\2\2\u01f3"+
		"\u01f5\5\u00e6t\2\u01f4\u01f6\5\u0094K\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f9\5,\27\2\u01f8\u01f7\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\5&\24\2\u01fb+\3\2\2\2"+
		"\u01fc\u01fd\t\5\2\2\u01fd\u01fe\5p9\2\u01fe-\3\2\2\2\u01ff\u0201\5\u00ac"+
		"W\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\5\u00d8"+
		"m\2\u0206\u0207\7o\2\2\u0207\u0209\5\u00e8u\2\u0208\u020a\5\60\31\2\u0209"+
		"\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u020d\5\\"+
		"/\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\5\62\32\2\u020f/\3\2\2\2\u0210\u0212\7\t\2\2\u0211\u0213\5p9\2"+
		"\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215"+
		"\7\n\2\2\u0215\61\3\2\2\2\u0216\u021c\7\r\2\2\u0217\u021b\5 \21\2\u0218"+
		"\u021b\5\64\33\2\u0219\u021b\5\6\4\2\u021a\u0217\3\2\2\2\u021a\u0218\3"+
		"\2\2\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\7\16"+
		"\2\2\u0220\63\3\2\2\2\u0221\u0223\5\u00e8u\2\u0222\u0224\5\66\34\2\u0223"+
		"\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\65\3\2\2\2\u0225\u022a\7\r\2"+
		"\2\u0226\u0229\5\36\20\2\u0227\u0229\5\6\4\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7\16\2\2\u022e"+
		"\67\3\2\2\2\u022f\u0231\5\u00acW\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2"+
		"\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0235\u0236\5\u00d8m\2\u0236\u0237\7p\2\2\u0237\u0239\5"+
		"\u00e8u\2\u0238\u023a\5\60\31\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2"+
		"\2\u023a\u023c\3\2\2\2\u023b\u023d\5\\/\2\u023c\u023b\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5:\36\2\u023f9\3\2\2\2\u0240"+
		"\u0246\7\r\2\2\u0241\u0245\5 \21\2\u0242\u0245\5<\37\2\u0243\u0245\5\6"+
		"\4\2\u0244\u0241\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245"+
		"\u0248\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0249\u024a\7\16\2\2\u024a;\3\2\2\2\u024b\u024d"+
		"\5\u00acW\2\u024c\u024b\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2"+
		"\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0254"+
		"\5\u00e8u\2\u0252\u0253\7\65\2\2\u0253\u0255\5l\67\2\u0254\u0252\3\2\2"+
		"\2\u0254\u0255\3\2\2\2\u0255=\3\2\2\2\u0256\u0258\5\u00a0Q\2\u0257\u0256"+
		"\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025c\3\2\2\2\u0259\u025b\5\u00acW"+
		"\2\u025a\u0259\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0260\5\u00d8m"+
		"\2\u0260\u0261\7}\2\2\u0261\u0263\5\u00e6t\2\u0262\u0264\5\u0094K\2\u0263"+
		"\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\5@"+
		"!\2\u0266\u0268\5\\/\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a"+
		"\3\2\2\2\u0269\u026b\5^\60\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026d\5N(\2\u026d?\3\2\2\2\u026e\u026f\7\t\2\2\u026f"+
		"\u027c\7\n\2\2\u0270\u0271\7\t\2\2\u0271\u0276\5B\"\2\u0272\u0273\7\4"+
		"\2\2\u0273\u0275\5B\"\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0279\u027a\7\n\2\2\u027a\u027c\3\2\2\2\u027b\u026e\3\2\2\2\u027b"+
		"\u0270\3\2\2\2\u027cA\3\2\2\2\u027d\u027f\5\u00acW\2\u027e\u027d\3\2\2"+
		"\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283"+
		"\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0285\5\u00dan\2\u0284\u0286\5\\/\2"+
		"\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2\2\2\u0287\u0289"+
		"\5D#\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289C\3\2\2\2\u028a\u028b"+
		"\7\65\2\2\u028b\u028c\5l\67\2\u028cE\3\2\2\2\u028d\u028f\7S\2\2\u028e"+
		"\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u029d\5H"+
		"%\2\u0291\u0293\7S\2\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0296\7\3\2\2\u0295\u0297\7L\2\2\u0296\u0295\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a\5\u00e6t\2\u0299\u029b"+
		"\5H%\2\u029a\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029d\3\2\2\2\u029c"+
		"\u028e\3\2\2\2\u029c\u0292\3\2\2\2\u029dG\3\2\2\2\u029e\u029f\7\t\2\2"+
		"\u029f\u02af\7\n\2\2\u02a0\u02a1\7\t\2\2\u02a1\u02a6\5J&\2\u02a2\u02a3"+
		"\7\4\2\2\u02a3\u02a5\5J&\2\u02a4\u02a2\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2"+
		"\2\2\u02a9\u02ab\7\4\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ad\7\n\2\2\u02ad\u02af\3\2\2\2\u02ae\u029e\3\2"+
		"\2\2\u02ae\u02a0\3\2\2\2\u02afI\3\2\2\2\u02b0\u02b1\5\u00e8u\2\u02b1\u02b2"+
		"\7\b\2\2\u02b2\u02b3\5l\67\2\u02b3\u02b6\3\2\2\2\u02b4\u02b6\5l\67\2\u02b5"+
		"\u02b0\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6K\3\2\2\2\u02b7\u02b9\5\u00ac"+
		"W\2\u02b8\u02b7\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\7|"+
		"\2\2\u02be\u02c0\5@!\2\u02bf\u02c1\5\\/\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\5N(\2\u02c3M\3\2\2\2\u02c4\u02ce"+
		"\7\r\2\2\u02c5\u02cd\5Z.\2\u02c6\u02cd\5L\'\2\u02c7\u02cd\5P)\2\u02c8"+
		"\u02cd\5f\64\2\u02c9\u02cd\5b\62\2\u02ca\u02cd\5j\66\2\u02cb\u02cd\5\4"+
		"\3\2\u02cc\u02c5\3\2\2\2\u02cc\u02c6\3\2\2\2\u02cc\u02c7\3\2\2\2\u02cc"+
		"\u02c8\3\2\2\2\u02cc\u02c9\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2"+
		"\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf"+
		"\u02d1\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d2\7\16\2\2\u02d2O\3\2\2\2"+
		"\u02d3\u02d4\7x\2\2\u02d4\u02d6\5R*\2\u02d5\u02d7\5\\/\2\u02d6\u02d5\3"+
		"\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d9\7\65\2\2\u02d9"+
		"\u02db\5j\66\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02dbQ\3\2\2\2"+
		"\u02dc\u02df\5V,\2\u02dd\u02df\5T+\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3"+
		"\2\2\2\u02dfS\3\2\2\2\u02e0\u02e5\5\u00dan\2\u02e1\u02e2\7\4\2\2\u02e2"+
		"\u02e4\5\u00dan\2\u02e3\u02e1\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3"+
		"\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8"+
		"\u02ea\7\4\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02eaU\3\2\2\2"+
		"\u02eb\u02f9\7\t\2\2\u02ec\u02ed\5X-\2\u02ed\u02ee\7\4\2\2\u02ee\u02fa"+
		"\3\2\2\2\u02ef\u02f2\5X-\2\u02f0\u02f1\7\4\2\2\u02f1\u02f3\5X-\2\u02f2"+
		"\u02f0\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2"+
		"\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f8\7\4\2\2\u02f7\u02f6\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02fa\3\2\2\2\u02f9\u02ec\3\2\2\2\u02f9\u02ef\3\2"+
		"\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u0332\7\n\2\2\u02fc"+
		"\u02fd\5\u00e6t\2\u02fd\u0309\7\t\2\2\u02fe\u0303\5X-\2\u02ff\u0300\7"+
		"\4\2\2\u0300\u0302\5X-\2\u0301\u02ff\3\2\2\2\u0302\u0305\3\2\2\2\u0303"+
		"\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2"+
		"\2\2\u0306\u0308\7\4\2\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u030a\3\2\2\2\u0309\u02fe\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2"+
		"\2\2\u030b\u030c\7\n\2\2\u030c\u0332\3\2\2\2\u030d\u030f\5\u00e6t\2\u030e"+
		"\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u031c\7\13"+
		"\2\2\u0311\u0316\5X-\2\u0312\u0313\7\4\2\2\u0313\u0315\5X-\2\u0314\u0312"+
		"\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031b\7\4\2\2\u031a\u0319\3\2"+
		"\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u0311\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0332\7\f\2\2\u031f\u0321\5\u00e6"+
		"t\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u032e\7\r\2\2\u0323\u0328\5X-\2\u0324\u0325\7\4\2\2\u0325\u0327\5X-\2"+
		"\u0326\u0324\3\2\2\2\u0327\u032a\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329"+
		"\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032b\u032d\7\4\2\2\u032c"+
		"\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e\u0323\3\2"+
		"\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332\7\16\2\2\u0331"+
		"\u02eb\3\2\2\2\u0331\u02fc\3\2\2\2\u0331\u030e\3\2\2\2\u0331\u0320\3\2"+
		"\2\2\u0332W\3\2\2\2\u0333\u0334\5\u00dan\2\u0334\u0335\7\b\2\2\u0335\u0337"+
		"\3\2\2\2\u0336\u0333\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u033b\3\2\2\2\u0338"+
		"\u0339\5\u00e8u\2\u0339\u033a\7\66\2\2\u033a\u033c\3\2\2\2\u033b\u0338"+
		"\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0352\5V,\2\u033e"+
		"\u033f\5\u00dan\2\u033f\u0340\7\b\2\2\u0340\u0342\3\2\2\2\u0341\u033e"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0346\3\2\2\2\u0343\u0344\5\u00e8u"+
		"\2\u0344\u0345\7\66\2\2\u0345\u0347\3\2\2\2\u0346\u0343\3\2\2\2\u0346"+
		"\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0352\5\u00e8u\2\u0349\u034b"+
		"\5\u00dan\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034c\3\2\2"+
		"\2\u034c\u034e\7^\2\2\u034d\u034f\5\u00e8u\2\u034e\u034d\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u0352\5\u00dan\2\u0351\u0336"+
		"\3\2\2\2\u0351\u0341\3\2\2\2\u0351\u034a\3\2\2\2\u0351\u0350\3\2\2\2\u0352"+
		"Y\3\2\2\2\u0353\u0354\7q\2\2\u0354\u0355\5\u00e8u\2\u0355\u0356\7\65\2"+
		"\2\u0356\u0357\5\u00e8u\2\u0357[\3\2\2\2\u0358\u0359\t\6\2\2\u0359\u035a"+
		"\5p9\2\u035a]\3\2\2\2\u035b\u035c\7 \2\2\u035c\u035d\5p9\2\u035d_\3\2"+
		"\2\2\u035e\u0360\5\u00acW\2\u035f\u035e\3\2\2\2\u0360\u0363\3\2\2\2\u0361"+
		"\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0364\3\2\2\2\u0363\u0361\3\2"+
		"\2\2\u0364\u0365\7\u0089\2\2\u0365\u0366\5n8\2\u0366\u036a\5N(\2\u0367"+
		"\u0369\5d\63\2\u0368\u0367\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2"+
		"\2\2\u036a\u036b\3\2\2\2\u036b\u036f\3\2\2\2\u036c\u036a\3\2\2\2\u036d"+
		"\u036e\7\u008a\2\2\u036e\u0370\5N(\2\u036f\u036d\3\2\2\2\u036f\u0370\3"+
		"\2\2\2\u0370a\3\2\2\2\u0371\u0373\5\u00acW\2\u0372\u0371\3\2\2\2\u0373"+
		"\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0377\3\2"+
		"\2\2\u0376\u0374\3\2\2\2\u0377\u0378\7\u0089\2\2\u0378\u037c\t\7\2\2\u0379"+
		"\u037d\5V,\2\u037a\u037d\5\u00e8u\2\u037b\u037d\7\u0092\2\2\u037c\u0379"+
		"\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"\u037f\7\65\2\2\u037f\u0380\5n8\2\u0380\u0381\5N(\2\u0381\u038e\3\2\2"+
		"\2\u0382\u0384\5\u00acW\2\u0383\u0382\3\2\2\2\u0384\u0387\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0385\3\2"+
		"\2\2\u0388\u0389\7\u0089\2\2\u0389\u038a\t\7\2\2\u038a\u038b\5n8\2\u038b"+
		"\u038c\5N(\2\u038c\u038e\3\2\2\2\u038d\u0374\3\2\2\2\u038d\u0385\3\2\2"+
		"\2\u038ec\3\2\2\2\u038f\u0390\7\u008a\2\2\u0390\u0391\7\u0089\2\2\u0391"+
		"\u0392\5n8\2\u0392\u0393\5N(\2\u0393e\3\2\2\2\u0394\u0396\5\u00acW\2\u0395"+
		"\u0394\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2"+
		"\2\2\u0398\u039a\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u039b\7v\2\2\u039b"+
		"\u039c\5n8\2\u039c\u039d\5N(\2\u039d\u03bc\3\2\2\2\u039e\u03a0\5\u00ac"+
		"W\2\u039f\u039e\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1"+
		"\u03a2\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03a5\7v"+
		"\2\2\u03a5\u03a6\7x\2\2\u03a6\u03a7\5R*\2\u03a7\u03a8\7\65\2\2\u03a8\u03a9"+
		"\5n8\2\u03a9\u03aa\5N(\2\u03aa\u03bc\3\2\2\2\u03ab\u03ad\5\u00acW\2\u03ac"+
		"\u03ab\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2"+
		"\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03b2\7w\2\2\u03b2"+
		"\u03b3\5R*\2\u03b3\u03b4\5\u0092J\2\u03b4\u03b7\5n8\2\u03b5\u03b6\7\u0089"+
		"\2\2\u03b6\u03b8\5n8\2\u03b7\u03b5\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9"+
		"\3\2\2\2\u03b9\u03ba\5N(\2\u03ba\u03bc\3\2\2\2\u03bb\u0397\3\2\2\2\u03bb"+
		"\u03a1\3\2\2\2\u03bb\u03ae\3\2\2\2\u03bcg\3\2\2\2\u03bd\u03be\7\u0089"+
		"\2\2\u03be\u03bf\5n8\2\u03bfi\3\2\2\2\u03c0\u03c2\5\u00acW\2\u03c1\u03c0"+
		"\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4"+
		"\u03c6\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03c8\5l\67\2\u03c7\u03c9\7S"+
		"\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca"+
		"\u03cc\5\4\3\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cck\3\2\2\2"+
		"\u03cd\u03ce\b\67\1\2\u03ce\u03cf\5v<\2\u03cf\u03d0\5l\67\35\u03d0\u03e2"+
		"\3\2\2\2\u03d1\u03d2\7\t\2\2\u03d2\u03d3\5l\67\2\u03d3\u03d4\7\n\2\2\u03d4"+
		"\u03e2\3\2\2\2\u03d5\u03e2\5t;\2\u03d6\u03e2\5`\61\2\u03d7\u03e2\5\u00c2"+
		"b\2\u03d8\u03e2\5\u00b0Y\2\u03d9\u03e2\5\u00b2Z\2\u03da\u03e2\5\u00c0"+
		"a\2\u03db\u03e2\5\u00aaV\2\u03dc\u03e2\5N(\2\u03dd\u03e2\5\u009eP\2\u03de"+
		"\u03e2\5\u00c8e\2\u03df\u03e2\5\u00ceh\2\u03e0\u03e2\5r:\2\u03e1\u03cd"+
		"\3\2\2\2\u03e1\u03d1\3\2\2\2\u03e1\u03d5\3\2\2\2\u03e1\u03d6\3\2\2\2\u03e1"+
		"\u03d7\3\2\2\2\u03e1\u03d8\3\2\2\2\u03e1\u03d9\3\2\2\2\u03e1\u03da\3\2"+
		"\2\2\u03e1\u03db\3\2\2\2\u03e1\u03dc\3\2\2\2\u03e1\u03dd\3\2\2\2\u03e1"+
		"\u03de\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e0\3\2\2\2\u03e2\u0435\3\2"+
		"\2\2\u03e3\u03e4\f\34\2\2\u03e4\u03e5\5\u0080A\2\u03e5\u03e6\5l\67\34"+
		"\u03e6\u0434\3\2\2\2\u03e7\u03e8\f\33\2\2\u03e8\u03e9\5\u0084C\2\u03e9"+
		"\u03ea\5l\67\34\u03ea\u0434\3\2\2\2\u03eb\u03ec\f\32\2\2\u03ec\u03ed\5"+
		"\u0086D\2\u03ed\u03ee\5l\67\33\u03ee\u0434\3\2\2\2\u03ef\u03f0\f\31\2"+
		"\2\u03f0\u03f1\5\u0088E\2\u03f1\u03f2\5l\67\32\u03f2\u0434\3\2\2\2\u03f3"+
		"\u03f4\f\30\2\2\u03f4\u03f5\5z>\2\u03f5\u03f6\5l\67\31\u03f6\u0434\3\2"+
		"\2\2\u03f7\u03f8\f\27\2\2\u03f8\u03f9\7_\2\2\u03f9\u0434\5l\67\30\u03fa"+
		"\u03fb\f\26\2\2\u03fb\u03fc\5~@\2\u03fc\u03fd\5l\67\27\u03fd\u0434\3\2"+
		"\2\2\u03fe\u03ff\f\23\2\2\u03ff\u0400\5\u0092J\2\u0400\u0401\5l\67\24"+
		"\u0401\u0434\3\2\2\2\u0402\u0403\f\21\2\2\u0403\u0404\5\u008aF\2\u0404"+
		"\u0405\5l\67\22\u0405\u0434\3\2\2\2\u0406\u0407\f#\2\2\u0407\u0434\5x"+
		"=\2\u0408\u0409\f\"\2\2\u0409\u0434\5\u00ccg\2\u040a\u040b\f!\2\2\u040b"+
		"\u0434\5\u0098M\2\u040c\u040d\f \2\2\u040d\u0434\5F$\2\u040e\u0410\f\37"+
		"\2\2\u040f\u0411\7S\2\2\u0410\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411"+
		"\u0413\3\2\2\2\u0412\u0414\7\3\2\2\u0413\u0412\3\2\2\2\u0413\u0414\3\2"+
		"\2\2\u0414\u0415\3\2\2\2\u0415\u0434\5N(\2\u0416\u0418\f\36\2\2\u0417"+
		"\u0419\7S\2\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2"+
		"\2\2\u041a\u041b\7\3\2\2\u041b\u0421\t\b\2\2\u041c\u041d\7]\2\2\u041d"+
		"\u041f\5\u00e8u\2\u041e\u0420\5\\/\2\u041f\u041e\3\2\2\2\u041f\u0420\3"+
		"\2\2\2\u0420\u0422\3\2\2\2\u0421\u041c\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0434\5\u00b4[\2\u0424\u0425\f\25\2\2\u0425\u0426"+
		"\5\u008eH\2\u0426\u0427\5p9\2\u0427\u0434\3\2\2\2\u0428\u0429\f\24\2\2"+
		"\u0429\u042a\5\u0090I\2\u042a\u042b\5p9\2\u042b\u0434\3\2\2\2\u042c\u042d"+
		"\f\22\2\2\u042d\u042e\7R\2\2\u042e\u0434\5p9\2\u042f\u0430\f\20\2\2\u0430"+
		"\u0431\5\u008cG\2\u0431\u0432\5p9\2\u0432\u0434\3\2\2\2\u0433\u03e3\3"+
		"\2\2\2\u0433\u03e7\3\2\2\2\u0433\u03eb\3\2\2\2\u0433\u03ef\3\2\2\2\u0433"+
		"\u03f3\3\2\2\2\u0433\u03f7\3\2\2\2\u0433\u03fa\3\2\2\2\u0433\u03fe\3\2"+
		"\2\2\u0433\u0402\3\2\2\2\u0433\u0406\3\2\2\2\u0433\u0408\3\2\2\2\u0433"+
		"\u040a\3\2\2\2\u0433\u040c\3\2\2\2\u0433\u040e\3\2\2\2\u0433\u0416\3\2"+
		"\2\2\u0433\u0424\3\2\2\2\u0433\u0428\3\2\2\2\u0433\u042c\3\2\2\2\u0433"+
		"\u042f\3\2\2\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2"+
		"\2\2\u0436m\3\2\2\2\u0437\u0435\3\2\2\2\u0438\u0439\b8\1\2\u0439\u043a"+
		"\5v<\2\u043a\u043b\5n8\21\u043b\u0440\3\2\2\2\u043c\u0440\5\u00c8e\2\u043d"+
		"\u0440\5\u00ceh\2\u043e\u0440\5r:\2\u043f\u0438\3\2\2\2\u043f\u043c\3"+
		"\2\2\2\u043f\u043d\3\2\2\2\u043f\u043e\3\2\2\2\u0440\u0467\3\2\2\2\u0441"+
		"\u0442\f\r\2\2\u0442\u0443\5\u0084C\2\u0443\u0444\5n8\16\u0444\u0466\3"+
		"\2\2\2\u0445\u0446\f\f\2\2\u0446\u0447\5\u0086D\2\u0447\u0448\5n8\r\u0448"+
		"\u0466\3\2\2\2\u0449\u044a\f\13\2\2\u044a\u044b\5\u0088E\2\u044b\u044c"+
		"\5n8\f\u044c\u0466\3\2\2\2\u044d\u044e\f\n\2\2\u044e\u044f\5~@\2\u044f"+
		"\u0450\5n8\13\u0450\u0466\3\2\2\2\u0451\u0452\f\t\2\2\u0452\u0453\5z>"+
		"\2\u0453\u0454\5n8\n\u0454\u0466\3\2\2\2\u0455\u0456\f\b\2\2\u0456\u0457"+
		"\5\u008eH\2\u0457\u0458\5n8\t\u0458\u0466\3\2\2\2\u0459\u045a\f\7\2\2"+
		"\u045a\u045b\7_\2\2\u045b\u0466\5n8\b\u045c\u045d\f\6\2\2\u045d\u045e"+
		"\7]\2\2\u045e\u0466\5n8\7\u045f\u0460\f\20\2\2\u0460\u0466\5F$\2\u0461"+
		"\u0462\f\17\2\2\u0462\u0466\5\u0098M\2\u0463\u0464\f\16\2\2\u0464\u0466"+
		"\5\u00ccg\2\u0465\u0441\3\2\2\2\u0465\u0445\3\2\2\2\u0465\u0449\3\2\2"+
		"\2\u0465\u044d\3\2\2\2\u0465\u0451\3\2\2\2\u0465\u0455\3\2\2\2\u0465\u0459"+
		"\3\2\2\2\u0465\u045c\3\2\2\2\u0465\u045f\3\2\2\2\u0465\u0461\3\2\2\2\u0465"+
		"\u0463\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2"+
		"\2\2\u0468o\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046b\b9\1\2\u046b\u0479"+
		"\7\t\2\2\u046c\u046d\5p9\2\u046d\u046e\7\4\2\2\u046e\u047a\3\2\2\2\u046f"+
		"\u0472\5p9\2\u0470\u0471\7\4\2\2\u0471\u0473\5p9\2\u0472\u0470\3\2\2\2"+
		"\u0473\u0474\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477"+
		"\3\2\2\2\u0476\u0478\7\4\2\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"\u047a\3\2\2\2\u0479\u046c\3\2\2\2\u0479\u046f\3\2\2\2\u0479\u047a\3\2"+
		"\2\2\u047a\u047b\3\2\2\2\u047b\u047e\7\n\2\2\u047c\u047e\5r:\2\u047d\u046a"+
		"\3\2\2\2\u047d\u047c\3\2\2\2\u047e\u048e\3\2\2\2\u047f\u0480\f\b\2\2\u0480"+
		"\u0481\5|?\2\u0481\u0482\5p9\t\u0482\u048d\3\2\2\2\u0483\u0484\f\7\2\2"+
		"\u0484\u0485\5\u0082B\2\u0485\u0486\5p9\b\u0486\u048d\3\2\2\2\u0487\u0488"+
		"\f\6\2\2\u0488\u0489\7\33\2\2\u0489\u048d\5p9\7\u048a\u048b\f\5\2\2\u048b"+
		"\u048d\5\u009aN\2\u048c\u047f\3\2\2\2\u048c\u0483\3\2\2\2\u048c\u0487"+
		"\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c\3\2\2\2\u048e"+
		"\u048f\3\2\2\2\u048fq\3\2\2\2\u0490\u048e\3\2\2\2\u0491\u0498\5\u00f0"+
		"y\2\u0492\u0498\5\u00ecw\2\u0493\u0498\5\u00dep\2\u0494\u0498\5\u00e0"+
		"q\2\u0495\u0498\5\u00e6t\2\u0496\u0498\7\u0092\2\2\u0497\u0491\3\2\2\2"+
		"\u0497\u0492\3\2\2\2\u0497\u0493\3\2\2\2\u0497\u0494\3\2\2\2\u0497\u0495"+
		"\3\2\2\2\u0497\u0496\3\2\2\2\u0498s\3\2\2\2\u0499\u049f\7\u008c\2\2\u049a"+
		"\u049c\7\u008d\2\2\u049b\u049d\5l\67\2\u049c\u049b\3\2\2\2\u049c\u049d"+
		"\3\2\2\2\u049d\u049f\3\2\2\2\u049e\u0499\3\2\2\2\u049e\u049a\3\2\2\2\u049f"+
		"\u04ba\3\2\2\2\u04a0\u04a3\7\u008f\2\2\u04a1\u04a2\7i\2\2\u04a2\u04a4"+
		"\5\u00e8u\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04ba\3\2\2"+
		"\2\u04a5\u04a8\7\u0090\2\2\u04a6\u04a7\7i\2\2\u04a7\u04a9\5\u00e8u\2\u04a8"+
		"\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ba\3\2\2\2\u04aa\u04ab\7\u0091"+
		"\2\2\u04ab\u04ba\5l\67\2\u04ac\u04af\7\u008e\2\2\u04ad\u04ae\7i\2\2\u04ae"+
		"\u04b0\5\u00e8u\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2"+
		"\3\2\2\2\u04b1\u04b3\5l\67\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04ba\3\2\2\2\u04b4\u04b5\7\u008e\2\2\u04b5\u04ba\7\u008f\2\2\u04b6\u04b7"+
		"\7\u008e\2\2\u04b7\u04b8\7\u0081\2\2\u04b8\u04ba\5l\67\2\u04b9\u049e\3"+
		"\2\2\2\u04b9\u04a0\3\2\2\2\u04b9\u04a5\3\2\2\2\u04b9\u04aa\3\2\2\2\u04b9"+
		"\u04ac\3\2\2\2\u04b9\u04b4\3\2\2\2\u04b9\u04b6\3\2\2\2\u04bau\3\2\2\2"+
		"\u04bb\u04bc\t\t\2\2\u04bcw\3\2\2\2\u04bd\u04be\t\n\2\2\u04bey\3\2\2\2"+
		"\u04bf\u04c0\t\13\2\2\u04c0{\3\2\2\2\u04c1\u04c2\t\f\2\2\u04c2}\3\2\2"+
		"\2\u04c3\u04c4\t\r\2\2\u04c4\177\3\2\2\2\u04c5\u04c6\t\16\2\2\u04c6\u0081"+
		"\3\2\2\2\u04c7\u04c8\t\17\2\2\u04c8\u0083\3\2\2\2\u04c9\u04ca\t\20\2\2"+
		"\u04ca\u0085\3\2\2\2\u04cb\u04cc\t\21\2\2\u04cc\u0087\3\2\2\2\u04cd\u04ce"+
		"\t\22\2\2\u04ce\u0089\3\2\2\2\u04cf\u04d0\t\23\2\2\u04d0\u008b\3\2\2\2"+
		"\u04d1\u04d2\t\24\2\2\u04d2\u008d\3\2\2\2\u04d3\u04da\7Z\2\2\u04d4\u04d5"+
		"\7Z\2\2\u04d5\u04da\7U\2\2\u04d6\u04da\7[\2\2\u04d7\u04da\7\\\2\2\u04d8"+
		"\u04da\7Y\2\2\u04d9\u04d3\3\2\2\2\u04d9\u04d4\3\2\2\2\u04d9\u04d6\3\2"+
		"\2\2\u04d9\u04d7\3\2\2\2\u04d9\u04d8\3\2\2\2\u04da\u008f\3\2\2\2\u04db"+
		"\u04dc\7]\2\2\u04dc\u0091\3\2\2\2\u04dd\u04e3\7W\2\2\u04de\u04df\7U\2"+
		"\2\u04df\u04e3\7W\2\2\u04e0\u04e3\7V\2\2\u04e1\u04e3\7X\2\2\u04e2\u04dd"+
		"\3\2\2\2\u04e2\u04de\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e1\3\2\2\2\u04e3"+
		"\u0093\3\2\2\2\u04e4\u04e5\7\17\2\2\u04e5\u050b\7\20\2\2\u04e6\u04e7\7"+
		"\17\2\2\u04e7\u04ec\5\u0096L\2\u04e8\u04e9\7\4\2\2\u04e9\u04eb\5\u0096"+
		"L\2\u04ea\u04e8\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec"+
		"\u04ed\3\2\2\2\u04ed\u04f0\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f1\7\4"+
		"\2\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2"+
		"\u04f3\7\20\2\2\u04f3\u050b\3\2\2\2\u04f4\u04f6\7\7\2\2\u04f5\u04f4\3"+
		"\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f8\7,\2\2\u04f8"+
		"\u050b\7\61\2\2\u04f9\u04fb\7\7\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3"+
		"\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\7,\2\2\u04fd\u0502\5\u0096L\2\u04fe"+
		"\u04ff\7\4\2\2\u04ff\u0501\5\u0096L\2\u0500\u04fe\3\2\2\2\u0501\u0504"+
		"\3\2\2\2\u0502\u0500\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0506\3\2\2\2\u0504"+
		"\u0502\3\2\2\2\u0505\u0507\7\4\2\2\u0506\u0505\3\2\2\2\u0506\u0507\3\2"+
		"\2\2\u0507\u0508\3\2\2\2\u0508\u0509\7\61\2\2\u0509\u050b\3\2\2\2\u050a"+
		"\u04e4\3\2\2\2\u050a\u04e6\3\2\2\2\u050a\u04f5\3\2\2\2\u050a\u04fa\3\2"+
		"\2\2\u050b\u0095\3\2\2\2\u050c\u050d\5\u00e8u\2\u050d\u050e\7\b\2\2\u050e"+
		"\u0510\3\2\2\2\u050f\u050c\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2"+
		"\2\2\u0511\u0512\5p9\2\u0512\u0097\3\2\2\2\u0513\u0514\7\7\2\2\u0514\u0515"+
		"\7,\2\2\u0515\u0536\7\61\2\2\u0516\u0517\7\7\2\2\u0517\u0518\7,\2\2\u0518"+
		"\u051d\5\u009cO\2\u0519\u051a\7\4\2\2\u051a\u051c\5\u009cO\2\u051b\u0519"+
		"\3\2\2\2\u051c\u051f\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e"+
		"\u0521\3\2\2\2\u051f\u051d\3\2\2\2\u0520\u0522\7\4\2\2\u0521\u0520\3\2"+
		"\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\7\61\2\2\u0524"+
		"\u0536\3\2\2\2\u0525\u0526\7\17\2\2\u0526\u0536\7\20\2\2\u0527\u0528\7"+
		"\17\2\2\u0528\u052d\5\u009cO\2\u0529\u052a\7\4\2\2\u052a\u052c\5\u009c"+
		"O\2\u052b\u0529\3\2\2\2\u052c\u052f\3\2\2\2\u052d\u052b\3\2\2\2\u052d"+
		"\u052e\3\2\2\2\u052e\u0531\3\2\2\2\u052f\u052d\3\2\2\2\u0530\u0532\7\4"+
		"\2\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533"+
		"\u0534\7\20\2\2\u0534\u0536\3\2\2\2\u0535\u0513\3\2\2\2\u0535\u0516\3"+
		"\2\2\2\u0535\u0525\3\2\2\2\u0535\u0527\3\2\2\2\u0536\u0099\3\2\2\2\u0537"+
		"\u0539\7\7\2\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a\3\2"+
		"\2\2\u053a\u053b\7,\2\2\u053b\u0540\5\u009cO\2\u053c\u053d\7\4\2\2\u053d"+
		"\u053f\5\u009cO\2\u053e\u053c\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e"+
		"\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542\u0540\3\2\2\2\u0543"+
		"\u0544\7\61\2\2\u0544\u0551\3\2\2\2\u0545\u0546\7\17\2\2\u0546\u054b\5"+
		"\u009cO\2\u0547\u0548\7\4\2\2\u0548\u054a\5\u009cO\2\u0549\u0547\3\2\2"+
		"\2\u054a\u054d\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054e"+
		"\3\2\2\2\u054d\u054b\3\2\2\2\u054e\u054f\7\20\2\2\u054f\u0551\3\2\2\2"+
		"\u0550\u0538\3\2\2\2\u0550\u0545\3\2\2\2\u0551\u009b\3\2\2\2\u0552\u0553"+
		"\5\u00e8u\2\u0553\u0554\7\b\2\2\u0554\u0556\3\2\2\2\u0555\u0552\3\2\2"+
		"\2\u0555\u0556\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\5p9\2\u0558\u009d"+
		"\3\2\2\2\u0559\u055a\7i\2\2\u055a\u055b\5\u00e8u\2\u055b\u009f\3\2\2\2"+
		"\u055c\u055e\5\u00acW\2\u055d\u055c\3\2\2\2\u055e\u0561\3\2\2\2\u055f"+
		"\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562\3\2\2\2\u0561\u055f\3\2"+
		"\2\2\u0562\u0563\5\u00d8m\2\u0563\u0564\7r\2\2\u0564\u0565\5\u00a2R\2"+
		"\u0565\u057c\3\2\2\2\u0566\u0568\5\u00acW\2\u0567\u0566\3\2\2\2\u0568"+
		"\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056c\3\2"+
		"\2\2\u056b\u0569\3\2\2\2\u056c\u056d\5\u00d8m\2\u056d\u056e\7r\2\2\u056e"+
		"\u0573\5\u00e8u\2\u056f\u0570\7\4\2\2\u0570\u0572\5\u00e8u\2\u0571\u056f"+
		"\3\2\2\2\u0572\u0575\3\2\2\2\u0573\u0571\3\2\2\2\u0573\u0574\3\2\2\2\u0574"+
		"\u0577\3\2\2\2\u0575\u0573\3\2\2\2\u0576\u0578\7\4\2\2\u0577\u0576\3\2"+
		"\2\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\5\u00a2R\2\u057a"+
		"\u057c\3\2\2\2\u057b\u055f\3\2\2\2\u057b\u0569\3\2\2\2\u057c\u00a1\3\2"+
		"\2\2\u057d\u0582\7\r\2\2\u057e\u0581\5\u00a4S\2\u057f\u0581\5\6\4\2\u0580"+
		"\u057e\3\2\2\2\u0580\u057f\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580\3\2"+
		"\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584\u0582\3\2\2\2\u0585"+
		"\u0586\7\16\2\2\u0586\u00a3\3\2\2\2\u0587\u0588\7u\2\2\u0588\u0589\5\u00a6"+
		"T\2\u0589\u00a5\3\2\2\2\u058a\u058e\7\r\2\2\u058b\u058d\5\u00a8U\2\u058c"+
		"\u058b\3\2\2\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2"+
		"\2\2\u058f\u0591\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u0592\7\16\2\2\u0592"+
		"\u00a7\3\2\2\2\u0593\u0594\5\u00e8u\2\u0594\u0595\7\b\2\2\u0595\u0596"+
		"\5p9\2\u0596\u0599\3\2\2\2\u0597\u0599\5\6\4\2\u0598\u0593\3\2\2\2\u0598"+
		"\u0597\3\2\2\2\u0599\u00a9\3\2\2\2\u059a\u059b\7L\2\2\u059b\u059d\5\u00ae"+
		"X\2\u059c\u059e\5\30\r\2\u059d\u059c\3\2\2\2\u059d\u059e\3\2\2\2\u059e"+
		"\u05ae\3\2\2\2\u059f\u05a0\7L\2\2\u05a0\u05a1\7\13\2\2\u05a1\u05a6\5\u00ae"+
		"X\2\u05a2\u05a3\7\4\2\2\u05a3\u05a5\5\u00aeX\2\u05a4\u05a2\3\2\2\2\u05a5"+
		"\u05a8\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a9\3\2"+
		"\2\2\u05a8\u05a6\3\2\2\2\u05a9\u05ab\7\f\2\2\u05aa\u05ac\5\30\r\2\u05ab"+
		"\u05aa\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ae\3\2\2\2\u05ad\u059a\3\2"+
		"\2\2\u05ad\u059f\3\2\2\2\u05ae\u00ab\3\2\2\2\u05af\u05b0\7M\2\2\u05b0"+
		"\u05b2\5\u00aeX\2\u05b1\u05b3\5\30\r\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3"+
		"\3\2\2\2\u05b3\u05c3\3\2\2\2\u05b4\u05b5\7M\2\2\u05b5\u05b6\7\13\2\2\u05b6"+
		"\u05bb\5\u00aeX\2\u05b7\u05b8\7\4\2\2\u05b8\u05ba\5\u00aeX\2\u05b9\u05b7"+
		"\3\2\2\2\u05ba\u05bd\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc"+
		"\u05be\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05c0\7\f\2\2\u05bf\u05c1\5\30"+
		"\r\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c3\3\2\2\2\u05c2"+
		"\u05af\3\2\2\2\u05c2\u05b4\3\2\2\2\u05c3\u00ad\3\2\2\2\u05c4\u05c6\5\u00e6"+
		"t\2\u05c5\u05c7\5H%\2\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9"+
		"\3\2\2\2\u05c8\u05ca\5\30\r\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2"+
		"\u05ca\u00af\3\2\2\2\u05cb\u05cd\5\u00acW\2\u05cc\u05cb\3\2\2\2\u05cd"+
		"\u05d0\3\2\2\2\u05ce\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\3\2"+
		"\2\2\u05d0\u05ce\3\2\2\2\u05d1\u05d3\7~\2\2\u05d2\u05d4\5p9\2\u05d3\u05d2"+
		"\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\5N(\2\u05d6"+
		"\u00b1\3\2\2\2\u05d7\u05d9\5\u00acW\2\u05d8\u05d7\3\2\2\2\u05d9\u05dc"+
		"\3\2\2\2\u05da\u05d8\3\2\2\2\u05da\u05db\3\2\2\2\u05db\u05dd\3\2\2\2\u05dc"+
		"\u05da\3\2\2\2\u05dd\u05e1\t\b\2\2\u05de\u05df\5\u00e8u\2\u05df\u05e0"+
		"\7\66\2\2\u05e0\u05e2\3\2\2\2\u05e1\u05de\3\2\2\2\u05e1\u05e2\3\2\2\2"+
		"\u05e2\u05e3\3\2\2\2\u05e3\u05e4\5n8\2\u05e4\u05e5\5\u00b4[\2\u05e5\u00b3"+
		"\3\2\2\2\u05e6\u05eb\7\r\2\2\u05e7\u05ea\5\u00b6\\\2\u05e8\u05ea\5\6\4"+
		"\2\u05e9\u05e7\3\2\2\2\u05e9\u05e8\3\2\2\2\u05ea\u05ed\3\2\2\2\u05eb\u05e9"+
		"\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ee"+
		"\u05ef\7\16\2\2\u05ef\u00b5\3\2\2\2\u05f0\u05f2\5\u00acW\2\u05f1\u05f0"+
		"\3\2\2\2\u05f2\u05f5\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4"+
		"\u05f6\3\2\2\2\u05f5\u05f3\3\2\2\2\u05f6\u05f7\7\u0081\2\2\u05f7\u063d"+
		"\5\u00e8u\2\u05f8\u05fa\5\u00acW\2\u05f9\u05f8\3\2\2\2\u05fa\u05fd\3\2"+
		"\2\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd"+
		"\u05fb\3\2\2\2\u05fe\u05ff\7\u0081\2\2\u05ff\u060b\7\13\2\2\u0600\u0605"+
		"\5\u00e8u\2\u0601\u0602\7\4\2\2\u0602\u0604\5\u00e8u\2\u0603\u0601\3\2"+
		"\2\2\u0604\u0607\3\2\2\2\u0605\u0603\3\2\2\2\u0605\u0606\3\2\2\2\u0606"+
		"\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0608\u060a\7\4\2\2\u0609\u0608\3\2"+
		"\2\2\u0609\u060a\3\2\2\2\u060a\u060c\3\2\2\2\u060b\u0600\3\2\2\2\u060b"+
		"\u060c\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u063d\7\f\2\2\u060e\u0610\5\u00ac"+
		"W\2\u060f\u060e\3\2\2\2\u0610\u0613\3\2\2\2\u0611\u060f\3\2\2\2\u0611"+
		"\u0612\3\2\2\2\u0612\u0614\3\2\2\2\u0613\u0611\3\2\2\2\u0614\u0615\7q"+
		"\2\2\u0615\u0618\5p9\2\u0616\u0617\7\u0089\2\2\u0617\u0619\5n8\2\u0618"+
		"\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\5\u00b8"+
		"]\2\u061b\u063d\3\2\2\2\u061c\u061e\5\u00acW\2\u061d\u061c\3\2\2\2\u061e"+
		"\u0621\3\2\2\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u0622\3\2"+
		"\2\2\u0621\u061f\3\2\2\2\u0622\u0623\7\u0083\2\2\u0623\u0624\5n8\2\u0624"+
		"\u0625\5\u00b8]\2\u0625\u063d\3\2\2\2\u0626\u0628\5\u00acW\2\u0627\u0626"+
		"\3\2\2\2\u0628\u062b\3\2\2\2\u0629\u0627\3\2\2\2\u0629\u062a\3\2\2\2\u062a"+
		"\u062c\3\2\2\2\u062b\u0629\3\2\2\2\u062c\u062d\7\u008a\2\2\u062d\u063d"+
		"\5\u00b8]\2\u062e\u0630\5\u00acW\2\u062f\u062e\3\2\2\2\u0630\u0633\3\2"+
		"\2\2\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0634\3\2\2\2\u0633"+
		"\u0631\3\2\2\2\u0634\u0635\7\u0082\2\2\u0635\u0638\5\u00ba^\2\u0636\u0637"+
		"\7\u0089\2\2\u0637\u0639\5n8\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2"+
		"\u0639\u063a\3\2\2\2\u063a\u063b\5\u00b8]\2\u063b\u063d\3\2\2\2\u063c"+
		"\u05f3\3\2\2\2\u063c\u05fb\3\2\2\2\u063c\u0611\3\2\2\2\u063c\u061f\3\2"+
		"\2\2\u063c\u0629\3\2\2\2\u063c\u0631\3\2\2\2\u063d\u00b7\3\2\2\2\u063e"+
		"\u0642\7\b\2\2\u063f\u0641\5l\67\2\u0640\u063f\3\2\2\2\u0641\u0644\3\2"+
		"\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u00b9\3\2\2\2\u0644"+
		"\u0642\3\2\2\2\u0645\u0646\b^\1\2\u0646\u0647\5\u00bc_\2\u0647\u0650\3"+
		"\2\2\2\u0648\u0649\f\5\2\2\u0649\u064a\t\25\2\2\u064a\u064f\5\u00ba^\6"+
		"\u064b\u064c\f\4\2\2\u064c\u064d\7_\2\2\u064d\u064f\5\u00ba^\5\u064e\u0648"+
		"\3\2\2\2\u064e\u064b\3\2\2\2\u064f\u0652\3\2\2\2\u0650\u064e\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u00bb\3\2\2\2\u0652\u0650\3\2\2\2\u0653\u0667\5\u00be"+
		"`\2\u0654\u0655\5\u00e8u\2\u0655\u0656\7\66\2\2\u0656\u0657\5\u00bc_\2"+
		"\u0657\u0667\3\2\2\2\u0658\u0659\5\u00dan\2\u0659\u065d\7\b\2\2\u065a"+
		"\u065b\5\u00e8u\2\u065b\u065c\7\66\2\2\u065c\u065e\3\2\2\2\u065d\u065a"+
		"\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\5\u00bc_"+
		"\2\u0660\u0667\3\2\2\2\u0661\u0667\5\u00dan\2\u0662\u0667\5\u00e6t\2\u0663"+
		"\u0667\5\u00ecw\2\u0664\u0667\5\u00f0y\2\u0665\u0667\7\u0092\2\2\u0666"+
		"\u0653\3\2\2\2\u0666\u0654\3\2\2\2\u0666\u0658\3\2\2\2\u0666\u0661\3\2"+
		"\2\2\u0666\u0662\3\2\2\2\u0666\u0663\3\2\2\2\u0666\u0664\3\2\2\2\u0666"+
		"\u0665\3\2\2\2\u0667\u00bd\3\2\2\2\u0668\u066a\5\u00e6t\2\u0669\u0668"+
		"\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066c\7\t\2\2\u066c"+
		"\u06bb\7\n\2\2\u066d\u066f\5\u00e6t\2\u066e\u066d\3\2\2\2\u066e\u066f"+
		"\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671\7\13\2\2\u0671\u06bb\7\f\2\2"+
		"\u0672\u0674\5\u00e6t\2\u0673\u0672\3\2\2\2\u0673\u0674\3\2\2\2\u0674"+
		"\u0675\3\2\2\2\u0675\u0676\7\r\2\2\u0676\u06bb\7\16\2\2\u0677\u0678\7"+
		"\t\2\2\u0678\u0679\5\u00bc_\2\u0679\u067a\7\4\2\2\u067a\u067b\7\n\2\2"+
		"\u067b\u06bb\3\2\2\2\u067c\u067d\7\t\2\2\u067d\u0680\5\u00bc_\2\u067e"+
		"\u067f\7\4\2\2\u067f\u0681\5\u00bc_\2\u0680\u067e\3\2\2\2\u0681\u0682"+
		"\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0685\3\2\2\2\u0684"+
		"\u0686\7\4\2\2\u0685\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0687\3\2"+
		"\2\2\u0687\u0688\7\n\2\2\u0688\u06bb\3\2\2\2\u0689\u068a\5\u00e6t\2\u068a"+
		"\u068b\7\t\2\2\u068b\u0690\5\u00bc_\2\u068c\u068d\7\4\2\2\u068d\u068f"+
		"\5\u00bc_\2\u068e\u068c\3\2\2\2\u068f\u0692\3\2\2\2\u0690\u068e\3\2\2"+
		"\2\u0690\u0691\3\2\2\2\u0691\u0694\3\2\2\2\u0692\u0690\3\2\2\2\u0693\u0695"+
		"\7\4\2\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696\3\2\2\2\u0696"+
		"\u0697\7\n\2\2\u0697\u06bb\3\2\2\2\u0698\u069a\5\u00e6t\2\u0699\u0698"+
		"\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069c\7\13\2\2"+
		"\u069c\u06a1\5\u00bc_\2\u069d\u069e\7\4\2\2\u069e\u06a0\5\u00bc_\2\u069f"+
		"\u069d\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f\3\2\2\2\u06a1\u06a2\3\2"+
		"\2\2\u06a2\u06a5\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4\u06a6\7\4\2\2\u06a5"+
		"\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06a8\7\f"+
		"\2\2\u06a8\u06bb\3\2\2\2\u06a9\u06ab\5\u00e6t\2\u06aa\u06a9\3\2\2\2\u06aa"+
		"\u06ab\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\7\r\2\2\u06ad\u06b2\5\u00bc"+
		"_\2\u06ae\u06af\7\4\2\2\u06af\u06b1\5\u00bc_\2\u06b0\u06ae\3\2\2\2\u06b1"+
		"\u06b4\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b6\3\2"+
		"\2\2\u06b4\u06b2\3\2\2\2\u06b5\u06b7\7\4\2\2\u06b6\u06b5\3\2\2\2\u06b6"+
		"\u06b7\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\7\16\2\2\u06b9\u06bb\3"+
		"\2\2\2\u06ba\u0669\3\2\2\2\u06ba\u066e\3\2\2\2\u06ba\u0673\3\2\2\2\u06ba"+
		"\u0677\3\2\2\2\u06ba\u067c\3\2\2\2\u06ba\u0689\3\2\2\2\u06ba\u0699\3\2"+
		"\2\2\u06ba\u06aa\3\2\2\2\u06bb\u00bf\3\2\2\2\u06bc\u06be\7{\2\2\u06bd"+
		"\u06bf\5\u0094K\2\u06be\u06bd\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c1"+
		"\3\2\2\2\u06c0\u06c2\5\32\16\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2\3\2\2\2"+
		"\u06c2\u06c4\3\2\2\2\u06c3\u06c5\5\\/\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5"+
		"\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7\5\30\r\2\u06c7\u00c1\3\2\2\2"+
		"\u06c8\u06c9\7z\2\2\u06c9\u06cb\5\u00dco\2\u06ca\u06cc\5\u009aN\2\u06cb"+
		"\u06ca\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06ce\3\2\2\2\u06cd\u06cf\5H"+
		"%\2\u06ce\u06cd\3\2\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0"+
		"\u06d1\5\u00c6d\2\u06d1\u06da\3\2\2\2\u06d2\u06d3\7z\2\2\u06d3\u06d5\5"+
		"\u00dco\2\u06d4\u06d6\5\u009aN\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2\2"+
		"\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\5H%\2\u06d8\u06da\3\2\2\2\u06d9\u06c8"+
		"\3\2\2\2\u06d9\u06d2\3\2\2\2\u06da\u00c3\3\2\2\2\u06db\u06dd\5H%\2\u06dc"+
		"\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e1\5\u00c6"+
		"d\2\u06df\u06e1\5H%\2\u06e0\u06dc\3\2\2\2\u06e0\u06df\3\2\2\2\u06e1\u00c5"+
		"\3\2\2\2\u06e2\u06e7\7\r\2\2\u06e3\u06e6\5J&\2\u06e4\u06e6\5\6\4\2\u06e5"+
		"\u06e3\3\2\2\2\u06e5\u06e4\3\2\2\2\u06e6\u06e9\3\2\2\2\u06e7\u06e5\3\2"+
		"\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06ea\3\2\2\2\u06e9\u06e7\3\2\2\2\u06ea"+
		"\u06eb\7\16\2\2\u06eb\u00c7\3\2\2\2\u06ec\u06ed\7\t\2\2\u06ed\u0701\7"+
		"\n\2\2\u06ee\u06ef\7\t\2\2\u06ef\u06f2\5\u00caf\2\u06f0\u06f1\7\4\2\2"+
		"\u06f1\u06f3\5\u00caf\2\u06f2\u06f0\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4"+
		"\u06f2\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f7\3\2\2\2\u06f6\u06f8\7\4"+
		"\2\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9"+
		"\u06fa\7\n\2\2\u06fa\u0701\3\2\2\2\u06fb\u06fc\7\t\2\2\u06fc\u06fd\5\u00ca"+
		"f\2\u06fd\u06fe\7\4\2\2\u06fe\u06ff\7\n\2\2\u06ff\u0701\3\2\2\2\u0700"+
		"\u06ec\3\2\2\2\u0700\u06ee\3\2\2\2\u0700\u06fb\3\2\2\2\u0701\u00c9\3\2"+
		"\2\2\u0702\u0703\5\u00e8u\2\u0703\u0704\7\b\2\2\u0704\u0706\3\2\2\2\u0705"+
		"\u0702\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\5l"+
		"\67\2\u0708\u00cb\3\2\2\2\u0709\u070b\7S\2\2\u070a\u0709\3\2\2\2\u070a"+
		"\u070b\3\2\2\2\u070b\u070c\3\2\2\2\u070c\u070d\5\u00ceh\2\u070d\u00cd"+
		"\3\2\2\2\u070e\u071a\7\13\2\2\u070f\u0714\5\u00d0i\2\u0710\u0711\7\4\2"+
		"\2\u0711\u0713\5\u00d0i\2\u0712\u0710\3\2\2\2\u0713\u0716\3\2\2\2\u0714"+
		"\u0712\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0718\3\2\2\2\u0716\u0714\3\2"+
		"\2\2\u0717\u0719\7\4\2\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719"+
		"\u071b\3\2\2\2\u071a\u070f\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u071c\3\2"+
		"\2\2\u071c\u072d\7\f\2\2\u071d\u0729\7\21\2\2\u071e\u0723\5\u00d0i\2\u071f"+
		"\u0720\7\4\2\2\u0720\u0722\5\u00d0i\2\u0721\u071f\3\2\2\2\u0722\u0725"+
		"\3\2\2\2\u0723\u0721\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0727\3\2\2\2\u0725"+
		"\u0723\3\2\2\2\u0726\u0728\7\4\2\2\u0727\u0726\3\2\2\2\u0727\u0728\3\2"+
		"\2\2\u0728\u072a\3\2\2\2\u0729\u071e\3\2\2\2\u0729\u072a\3\2\2\2\u072a"+
		"\u072b\3\2\2\2\u072b\u072d\7\22\2\2\u072c\u070e\3\2\2\2\u072c\u071d\3"+
		"\2\2\2\u072d\u00cf\3\2\2\2\u072e\u073a\7\b\2\2\u072f\u073a\7\7\2\2\u0730"+
		"\u0733\5\u00d2j\2\u0731\u0732\7\b\2\2\u0732\u0734\5\u00d4k\2\u0733\u0731"+
		"\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0737\3\2\2\2\u0735\u0736\7\b\2\2\u0736"+
		"\u0738\5\u00d6l\2\u0737\u0735\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u073a"+
		"\3\2\2\2\u0739\u072e\3\2\2\2\u0739\u072f\3\2\2\2\u0739\u0730\3\2\2\2\u073a"+
		"\u00d1\3\2\2\2\u073b\u073c\5n8\2\u073c\u00d3\3\2\2\2\u073d\u073e\5n8\2"+
		"\u073e\u00d5\3\2\2\2\u073f\u0740\5n8\2\u0740\u00d7\3\2\2\2\u0741\u0743"+
		"\5\u00e8u\2\u0742\u0741\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2"+
		"\2\u0744\u0745\3\2\2\2\u0745\u00d9\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u0749"+
		"\5\u00e8u\2\u0748\u0747\3\2\2\2\u0749\u074c\3\2\2\2\u074a\u0748\3\2\2"+
		"\2\u074a\u074b\3\2\2\2\u074b\u074d\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u074e"+
		"\5\u00e8u\2\u074e\u00db\3\2\2\2\u074f\u0751\5\u00e8u\2\u0750\u074f\3\2"+
		"\2\2\u0751\u0754\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753\3\2\2\2\u0753"+
		"\u0755\3\2\2\2\u0754\u0752\3\2\2\2\u0755\u075a\5\u00e8u\2\u0756\u0757"+
		"\7\7\2\2\u0757\u0759\5\u00e8u\2\u0758\u0756\3\2\2\2\u0759\u075c\3\2\2"+
		"\2\u075a\u0758\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u00dd\3\2\2\2\u075c\u075a"+
		"\3\2\2\2\u075d\u0760\7N\2\2\u075e\u0761\5\u00e8u\2\u075f\u0761\5\u00ea"+
		"v\2\u0760\u075e\3\2\2\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2\2\2\u0761"+
		"\u00df\3\2\2\2\u0762\u0763\t\26\2\2\u0763\u0764\7\u0084\2\2\u0764\u00e1"+
		"\3\2\2\2\u0765\u076a\5\u00e8u\2\u0766\u0767\7\7\2\2\u0767\u0769\5\u00e8"+
		"u\2\u0768\u0766\3\2\2\2\u0769\u076c\3\2\2\2\u076a\u0768\3\2\2\2\u076a"+
		"\u076b\3\2\2\2\u076b\u076f\3\2\2\2\u076c\u076a\3\2\2\2\u076d\u076e\7\3"+
		"\2\2\u076e\u0770\5\u00e8u\2\u076f\u076d\3\2\2\2\u076f\u0770\3\2\2\2\u0770"+
		"\u00e3\3\2\2\2\u0771\u0776\5\u00e8u\2\u0772\u0773\t\4\2\2\u0773\u0775"+
		"\5\u00e8u\2\u0774\u0772\3\2\2\2\u0775\u0778\3\2\2\2\u0776\u0774\3\2\2"+
		"\2\u0776\u0777\3\2\2\2\u0777\u00e5\3\2\2\2\u0778\u0776\3\2\2\2\u0779\u077e"+
		"\5\u00e8u\2\u077a\u077b\7\7\2\2\u077b\u077d\5\u00e8u\2\u077c\u077a\3\2"+
		"\2\2\u077d\u0780\3\2\2\2\u077e\u077c\3\2\2\2\u077e\u077f\3\2\2\2\u077f"+
		"\u00e7\3\2\2\2\u0780\u077e\3\2\2\2\u0781\u0782\t\27\2\2\u0782\u00e9\3"+
		"\2\2\2\u0783\u0784\t\30\2\2\u0784\u00eb\3\2\2\2\u0785\u0787\5\u00eav\2"+
		"\u0786\u0788\5\u00e8u\2\u0787\u0786\3\2\2\2\u0787\u0788\3\2\2\2\u0788"+
		"\u00ed\3\2\2\2\u0789\u078a\t\31\2\2\u078a\u00ef\3\2\2\2\u078b\u078d\5"+
		"\u00e8u\2\u078c\u078b\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078e\3\2\2\2"+
		"\u078e\u0798\7\u0086\2\2\u078f\u0791\5\u00e8u\2\u0790\u078f\3\2\2\2\u0790"+
		"\u0791\3\2\2\2\u0791\u0792\3\2\2\2\u0792\u0798\7\u0087\2\2\u0793\u0795"+
		"\5\u00e8u\2\u0794\u0793\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u0796\3\2\2"+
		"\2\u0796\u0798\7\u0088\2\2\u0797\u078c\3\2\2\2\u0797\u0790\3\2\2\2\u0797"+
		"\u0794\3\2\2\2\u0798\u00f1\3\2\2\2\u0111\u0102\u0104\u0110\u0117\u011f"+
		"\u0124\u0127\u012c\u0131\u0134\u0138\u013c\u013f\u0142\u0149\u0155\u0159"+
		"\u015e\u0163\u016a\u016d\u0170\u0174\u017b\u017d\u018a\u018e\u0192\u0199"+
		"\u019e\u01a1\u01a6\u01ab\u01af\u01b2\u01b5\u01ba\u01c1\u01c6\u01cd\u01d0"+
		"\u01d4\u01db\u01dd\u01e6\u01e9\u01ee\u01f5\u01f8\u0202\u0209\u020c\u0212"+
		"\u021a\u021c\u0223\u0228\u022a\u0232\u0239\u023c\u0244\u0246\u024e\u0254"+
		"\u0257\u025c\u0263\u0267\u026a\u0276\u027b\u0280\u0285\u0288\u028e\u0292"+
		"\u0296\u029a\u029c\u02a6\u02aa\u02ae\u02b5\u02ba\u02c0\u02cc\u02ce\u02d6"+
		"\u02da\u02de\u02e5\u02e9\u02f4\u02f7\u02f9\u0303\u0307\u0309\u030e\u0316"+
		"\u031a\u031c\u0320\u0328\u032c\u032e\u0331\u0336\u033b\u0341\u0346\u034a"+
		"\u034e\u0351\u0361\u036a\u036f\u0374\u037c\u0385\u038d\u0397\u03a1\u03ae"+
		"\u03b7\u03bb\u03c3\u03c8\u03cb\u03e1\u0410\u0413\u0418\u041f\u0421\u0433"+
		"\u0435\u043f\u0465\u0467\u0474\u0477\u0479\u047d\u048c\u048e\u0497\u049c"+
		"\u049e\u04a3\u04a8\u04af\u04b2\u04b9\u04d9\u04e2\u04ec\u04f0\u04f5\u04fa"+
		"\u0502\u0506\u050a\u050f\u051d\u0521\u052d\u0531\u0535\u0538\u0540\u054b"+
		"\u0550\u0555\u055f\u0569\u0573\u0577\u057b\u0580\u0582\u058e\u0598\u059d"+
		"\u05a6\u05ab\u05ad\u05b2\u05bb\u05c0\u05c2\u05c6\u05c9\u05ce\u05d3\u05da"+
		"\u05e1\u05e9\u05eb\u05f3\u05fb\u0605\u0609\u060b\u0611\u0618\u061f\u0629"+
		"\u0631\u0638\u063c\u0642\u064e\u0650\u065d\u0666\u0669\u066e\u0673\u0682"+
		"\u0685\u0690\u0694\u0699\u06a1\u06a5\u06aa\u06b2\u06b6\u06ba\u06be\u06c1"+
		"\u06c4\u06cb\u06ce\u06d5\u06d9\u06dc\u06e0\u06e5\u06e7\u06f4\u06f7\u0700"+
		"\u0705\u070a\u0714\u0718\u071a\u0723\u0727\u0729\u072c\u0733\u0737\u0739"+
		"\u0744\u074a\u0752\u075a\u0760\u076a\u076f\u0776\u077e\u0787\u078c\u0790"+
		"\u0794\u0797";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}