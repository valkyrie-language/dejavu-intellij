// Generated from C:/Users/Dell/IdeaProjects/nexus-intellij/src/main/antlr/NexusAntlr.g4 by ANTLR 4.13.1
package nexus.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NexusAntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEMPLATE_E=1, TEMPLATE_L=2, TEXT_SPACE=3, TEXT_WORD=4, TEXT=5, TEMPLATE_R=6, 
		DOT=7, COMMA=8, KW_IMPORT=9, KW_CLASS=10, KW_AS=11, KW_IN=12, KW_IF=13, 
		KW_ELSE=14, KW_END=15, KW_FOR=16, KW_MATCH=17, KW_CASE=18, KW_SLOT=19, 
		KW_APPLY=20, OP_PROPORTION=21, PARENTHESES_L=22, PARENTHESES_R=23, BRACKET_L=24, 
		BRACKET_R=25, BRACE_L=26, BRACE_R=27, GENERIC_L=28, GENERIC_R=29, RAW_ID=30, 
		UNICODE_ID=31, WHITE_SPACE=32, BLOCK_COMMENT=33, ERROR_CHARACTAR=34;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_any_text = 2, RULE_define_import = 3, 
		RULE_define_class = 4, RULE_if_statement = 5, RULE_if_then = 6, RULE_else_then = 7, 
		RULE_else_if = 8, RULE_if_end = 9, RULE_for_statement = 10, RULE_for_begin = 11, 
		RULE_for_pattern = 12, RULE_for_end = 13, RULE_slot_statement = 14, RULE_slot_begin = 15, 
		RULE_slot_end = 16, RULE_apply_statement = 17, RULE_apply_begin = 18, 
		RULE_apply_end = 19, RULE_match_statement = 20, RULE_match_begin = 21, 
		RULE_case_branch = 22, RULE_match_end = 23, RULE_any_expression = 24, 
		RULE_expression = 25, RULE_modifiers = 26, RULE_modified_identifier = 27, 
		RULE_modified_namepath = 28, RULE_namepath_free = 29, RULE_namepath = 30, 
		RULE_identifier = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "any_text", "define_import", "define_class", 
			"if_statement", "if_then", "else_then", "else_if", "if_end", "for_statement", 
			"for_begin", "for_pattern", "for_end", "slot_statement", "slot_begin", 
			"slot_end", "apply_statement", "apply_begin", "apply_end", "match_statement", 
			"match_begin", "case_branch", "match_end", "any_expression", "expression", 
			"modifiers", "modified_identifier", "modified_namepath", "namepath_free", 
			"namepath", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<<%'", null, null, null, null, null, "'.'", "','", "'using'", 
			"'class'", "'as'", "'in'", "'if'", "'else'", "'end'", "'for'", "'match'", 
			"'case'", "'block'", "'apply'", "'::'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'\\u27E8'", "'\\u27E9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEMPLATE_E", "TEMPLATE_L", "TEXT_SPACE", "TEXT_WORD", "TEXT", 
			"TEMPLATE_R", "DOT", "COMMA", "KW_IMPORT", "KW_CLASS", "KW_AS", "KW_IN", 
			"KW_IF", "KW_ELSE", "KW_END", "KW_FOR", "KW_MATCH", "KW_CASE", "KW_SLOT", 
			"KW_APPLY", "OP_PROPORTION", "PARENTHESES_L", "PARENTHESES_R", "BRACKET_L", 
			"BRACKET_R", "BRACE_L", "BRACE_R", "GENERIC_L", "GENERIC_R", "RAW_ID", 
			"UNICODE_ID", "WHITE_SPACE", "BLOCK_COMMENT", "ERROR_CHARACTAR"
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
	public String getGrammarFileName() { return "NexusAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NexusAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NexusAntlrParser.EOF, 0); }
		public List<TerminalNode> TEMPLATE_E() { return getTokens(NexusAntlrParser.TEMPLATE_E); }
		public TerminalNode TEMPLATE_E(int i) {
			return getToken(NexusAntlrParser.TEMPLATE_E, i);
		}
		public List<Define_importContext> define_import() {
			return getRuleContexts(Define_importContext.class);
		}
		public Define_importContext define_import(int i) {
			return getRuleContext(Define_importContext.class,i);
		}
		public List<Define_classContext> define_class() {
			return getRuleContexts(Define_classContext.class);
		}
		public Define_classContext define_class(int i) {
			return getRuleContext(Define_classContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<For_statementContext> for_statement() {
			return getRuleContexts(For_statementContext.class);
		}
		public For_statementContext for_statement(int i) {
			return getRuleContext(For_statementContext.class,i);
		}
		public List<Slot_statementContext> slot_statement() {
			return getRuleContexts(Slot_statementContext.class);
		}
		public Slot_statementContext slot_statement(int i) {
			return getRuleContext(Slot_statementContext.class,i);
		}
		public List<Apply_statementContext> apply_statement() {
			return getRuleContexts(Apply_statementContext.class);
		}
		public Apply_statementContext apply_statement(int i) {
			return getRuleContext(Apply_statementContext.class,i);
		}
		public List<Match_statementContext> match_statement() {
			return getRuleContexts(Match_statementContext.class);
		}
		public Match_statementContext match_statement(int i) {
			return getRuleContext(Match_statementContext.class,i);
		}
		public List<Any_expressionContext> any_expression() {
			return getRuleContexts(Any_expressionContext.class);
		}
		public Any_expressionContext any_expression(int i) {
			return getRuleContext(Any_expressionContext.class,i);
		}
		public List<Any_textContext> any_text() {
			return getRuleContexts(Any_textContext.class);
		}
		public Any_textContext any_text(int i) {
			return getRuleContext(Any_textContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(64);
					match(TEMPLATE_E);
					}
					break;
				case 2:
					{
					setState(65);
					define_import();
					}
					break;
				case 3:
					{
					setState(66);
					define_class();
					}
					break;
				case 4:
					{
					setState(67);
					if_statement();
					}
					break;
				case 5:
					{
					setState(68);
					for_statement();
					}
					break;
				case 6:
					{
					setState(69);
					slot_statement();
					}
					break;
				case 7:
					{
					setState(70);
					apply_statement();
					}
					break;
				case 8:
					{
					setState(71);
					match_statement();
					}
					break;
				case 9:
					{
					setState(72);
					any_expression();
					}
					break;
				case 10:
					{
					setState(73);
					any_text();
					}
					break;
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Any_textContext any_text() {
			return getRuleContext(Any_textContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				for_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				any_text();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Any_textContext extends ParserRuleContext {
		public TerminalNode TEXT_SPACE() { return getToken(NexusAntlrParser.TEXT_SPACE, 0); }
		public TerminalNode TEXT_WORD() { return getToken(NexusAntlrParser.TEXT_WORD, 0); }
		public TerminalNode TEXT() { return getToken(NexusAntlrParser.TEXT, 0); }
		public Any_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterAny_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitAny_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitAny_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_textContext any_text() throws RecognitionException {
		Any_textContext _localctx = new Any_textContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_any_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Define_importContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_IMPORT() { return getToken(NexusAntlrParser.KW_IMPORT, 0); }
		public Namepath_freeContext namepath_free() {
			return getRuleContext(Namepath_freeContext.class,0);
		}
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public TerminalNode KW_AS() { return getToken(NexusAntlrParser.KW_AS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode KW_IN() { return getToken(NexusAntlrParser.KW_IN, 0); }
		public Define_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterDefine_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitDefine_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitDefine_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_importContext define_import() throws RecognitionException {
		Define_importContext _localctx = new Define_importContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(TEMPLATE_L);
			setState(89);
			match(KW_IMPORT);
			setState(90);
			namepath_free();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(91);
				match(KW_AS);
				setState(92);
				identifier();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IN) {
				{
				setState(95);
				match(KW_IN);
				setState(96);
				identifier();
				}
			}

			setState(99);
			match(TEMPLATE_R);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Define_classContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_CLASS() { return getToken(NexusAntlrParser.KW_CLASS, 0); }
		public Namepath_freeContext namepath_free() {
			return getRuleContext(Namepath_freeContext.class,0);
		}
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public TerminalNode KW_IN() { return getToken(NexusAntlrParser.KW_IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Define_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterDefine_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitDefine_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitDefine_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_classContext define_class() throws RecognitionException {
		Define_classContext _localctx = new Define_classContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(TEMPLATE_L);
			setState(102);
			match(KW_CLASS);
			setState(103);
			namepath_free();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IN) {
				{
				setState(104);
				match(KW_IN);
				setState(105);
				identifier();
				}
			}

			setState(108);
			match(TEMPLATE_R);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public If_thenContext if_then() {
			return getRuleContext(If_thenContext.class,0);
		}
		public If_endContext if_end() {
			return getRuleContext(If_endContext.class,0);
		}
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public Else_thenContext else_then() {
			return getRuleContext(Else_thenContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			if_then();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					else_if();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(117);
				else_then();
				}
				break;
			}
			setState(120);
			if_end();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_thenContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_IF() { return getToken(NexusAntlrParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public If_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterIf_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitIf_then(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitIf_then(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_thenContext if_then() throws RecognitionException {
		If_thenContext _localctx = new If_thenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_then);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(TEMPLATE_L);
			setState(123);
			match(KW_IF);
			setState(124);
			expression();
			setState(125);
			match(TEMPLATE_R);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					statements();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_thenContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_ELSE() { return getToken(NexusAntlrParser.KW_ELSE, 0); }
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Else_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterElse_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitElse_then(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitElse_then(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_thenContext else_then() throws RecognitionException {
		Else_thenContext _localctx = new Else_thenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_then);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(TEMPLATE_L);
			setState(133);
			match(KW_ELSE);
			setState(134);
			match(TEMPLATE_R);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					statements();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_ELSE() { return getToken(NexusAntlrParser.KW_ELSE, 0); }
		public TerminalNode KW_IF() { return getToken(NexusAntlrParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitElse_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitElse_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(TEMPLATE_L);
			setState(142);
			match(KW_ELSE);
			setState(143);
			match(KW_IF);
			setState(144);
			expression();
			setState(145);
			match(TEMPLATE_R);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					statements();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_endContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_END() { return getToken(NexusAntlrParser.KW_END, 0); }
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public TerminalNode KW_IF() { return getToken(NexusAntlrParser.KW_IF, 0); }
		public If_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterIf_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitIf_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitIf_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_endContext if_end() throws RecognitionException {
		If_endContext _localctx = new If_endContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(TEMPLATE_L);
			setState(153);
			match(KW_END);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(154);
				match(KW_IF);
				}
			}

			setState(157);
			match(TEMPLATE_R);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public For_beginContext for_begin() {
			return getRuleContext(For_beginContext.class,0);
		}
		public For_endContext for_end() {
			return getRuleContext(For_endContext.class,0);
		}
		public Else_thenContext else_then() {
			return getRuleContext(Else_thenContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			for_begin();
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(160);
				else_then();
				}
				break;
			}
			setState(163);
			for_end();
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_beginContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext guard;
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_FOR() { return getToken(NexusAntlrParser.KW_FOR, 0); }
		public For_patternContext for_pattern() {
			return getRuleContext(For_patternContext.class,0);
		}
		public TerminalNode KW_IN() { return getToken(NexusAntlrParser.KW_IN, 0); }
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KW_IF() { return getToken(NexusAntlrParser.KW_IF, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public For_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterFor_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitFor_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitFor_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_beginContext for_begin() throws RecognitionException {
		For_beginContext _localctx = new For_beginContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_begin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(TEMPLATE_L);
			setState(166);
			match(KW_FOR);
			setState(167);
			for_pattern();
			setState(168);
			match(KW_IN);
			setState(169);
			((For_beginContext)_localctx).condition = expression();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(170);
				match(KW_IF);
				setState(171);
				((For_beginContext)_localctx).guard = expression();
				}
			}

			setState(174);
			match(TEMPLATE_R);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					statements();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_patternContext extends ParserRuleContext {
		public TerminalNode PARENTHESES_L() { return getToken(NexusAntlrParser.PARENTHESES_L, 0); }
		public TerminalNode PARENTHESES_R() { return getToken(NexusAntlrParser.PARENTHESES_R, 0); }
		public List<Modified_identifierContext> modified_identifier() {
			return getRuleContexts(Modified_identifierContext.class);
		}
		public Modified_identifierContext modified_identifier(int i) {
			return getRuleContext(Modified_identifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NexusAntlrParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NexusAntlrParser.COMMA, i);
		}
		public For_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterFor_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitFor_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitFor_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_patternContext for_pattern() throws RecognitionException {
		For_patternContext _localctx = new For_patternContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_pattern);
		int _la;
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(PARENTHESES_L);
				setState(182);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(PARENTHESES_L);
				setState(184);
				modified_identifier();
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(185);
						match(COMMA);
						setState(186);
						modified_identifier();
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(192);
					match(COMMA);
					}
				}

				setState(195);
				match(PARENTHESES_R);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				modified_identifier();
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						match(COMMA);
						setState(199);
						modified_identifier();
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(205);
					match(COMMA);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_endContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_END() { return getToken(NexusAntlrParser.KW_END, 0); }
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public TerminalNode KW_FOR() { return getToken(NexusAntlrParser.KW_FOR, 0); }
		public For_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterFor_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitFor_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitFor_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_endContext for_end() throws RecognitionException {
		For_endContext _localctx = new For_endContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(TEMPLATE_L);
			setState(211);
			match(KW_END);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(212);
				match(KW_FOR);
				}
			}

			setState(215);
			match(TEMPLATE_R);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Slot_statementContext extends ParserRuleContext {
		public Slot_beginContext slot_begin() {
			return getRuleContext(Slot_beginContext.class,0);
		}
		public Slot_endContext slot_end() {
			return getRuleContext(Slot_endContext.class,0);
		}
		public Slot_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterSlot_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitSlot_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitSlot_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slot_statementContext slot_statement() throws RecognitionException {
		Slot_statementContext _localctx = new Slot_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_slot_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			slot_begin();
			setState(218);
			slot_end();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Slot_beginContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_SLOT() { return getToken(NexusAntlrParser.KW_SLOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Slot_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterSlot_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitSlot_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitSlot_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slot_beginContext slot_begin() throws RecognitionException {
		Slot_beginContext _localctx = new Slot_beginContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_slot_begin);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(TEMPLATE_L);
			setState(221);
			match(KW_SLOT);
			setState(222);
			identifier();
			setState(223);
			match(TEMPLATE_R);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					statements();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Slot_endContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_END() { return getToken(NexusAntlrParser.KW_END, 0); }
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public TerminalNode KW_SLOT() { return getToken(NexusAntlrParser.KW_SLOT, 0); }
		public Slot_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slot_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterSlot_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitSlot_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitSlot_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slot_endContext slot_end() throws RecognitionException {
		Slot_endContext _localctx = new Slot_endContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_slot_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(TEMPLATE_L);
			setState(231);
			match(KW_END);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SLOT) {
				{
				setState(232);
				match(KW_SLOT);
				}
			}

			setState(235);
			match(TEMPLATE_R);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Apply_statementContext extends ParserRuleContext {
		public Apply_beginContext apply_begin() {
			return getRuleContext(Apply_beginContext.class,0);
		}
		public Apply_endContext apply_end() {
			return getRuleContext(Apply_endContext.class,0);
		}
		public Apply_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterApply_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitApply_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitApply_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Apply_statementContext apply_statement() throws RecognitionException {
		Apply_statementContext _localctx = new Apply_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_apply_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			apply_begin();
			setState(238);
			apply_end();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Apply_beginContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_APPLY() { return getToken(NexusAntlrParser.KW_APPLY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Apply_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterApply_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitApply_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitApply_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Apply_beginContext apply_begin() throws RecognitionException {
		Apply_beginContext _localctx = new Apply_beginContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_apply_begin);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(TEMPLATE_L);
			setState(241);
			match(KW_APPLY);
			setState(242);
			identifier();
			setState(243);
			match(TEMPLATE_R);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					statements();
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Apply_endContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_END() { return getToken(NexusAntlrParser.KW_END, 0); }
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public TerminalNode KW_APPLY() { return getToken(NexusAntlrParser.KW_APPLY, 0); }
		public Apply_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apply_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterApply_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitApply_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitApply_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Apply_endContext apply_end() throws RecognitionException {
		Apply_endContext _localctx = new Apply_endContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_apply_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(TEMPLATE_L);
			setState(251);
			match(KW_END);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_APPLY) {
				{
				setState(252);
				match(KW_APPLY);
				}
			}

			setState(255);
			match(TEMPLATE_R);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Match_statementContext extends ParserRuleContext {
		public Match_beginContext match_begin() {
			return getRuleContext(Match_beginContext.class,0);
		}
		public Match_endContext match_end() {
			return getRuleContext(Match_endContext.class,0);
		}
		public List<Case_branchContext> case_branch() {
			return getRuleContexts(Case_branchContext.class);
		}
		public Case_branchContext case_branch(int i) {
			return getRuleContext(Case_branchContext.class,i);
		}
		public Match_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterMatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitMatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitMatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_statementContext match_statement() throws RecognitionException {
		Match_statementContext _localctx = new Match_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_match_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match_begin();
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					case_branch();
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(264);
			match_end();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Match_beginContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_MATCH() { return getToken(NexusAntlrParser.KW_MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Match_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterMatch_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitMatch_begin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitMatch_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_beginContext match_begin() throws RecognitionException {
		Match_beginContext _localctx = new Match_beginContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_match_begin);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(TEMPLATE_L);
			setState(267);
			match(KW_MATCH);
			setState(268);
			expression();
			setState(269);
			match(TEMPLATE_R);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					statements();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_branchContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_CASE() { return getToken(NexusAntlrParser.KW_CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Case_branchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterCase_branch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitCase_branch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitCase_branch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_branchContext case_branch() throws RecognitionException {
		Case_branchContext _localctx = new Case_branchContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_case_branch);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(TEMPLATE_L);
			setState(277);
			match(KW_CASE);
			setState(278);
			expression();
			setState(279);
			match(TEMPLATE_R);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					statements();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Match_endContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode KW_END() { return getToken(NexusAntlrParser.KW_END, 0); }
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public TerminalNode KW_MATCH() { return getToken(NexusAntlrParser.KW_MATCH, 0); }
		public Match_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterMatch_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitMatch_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitMatch_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_endContext match_end() throws RecognitionException {
		Match_endContext _localctx = new Match_endContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_match_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(TEMPLATE_L);
			setState(287);
			match(KW_END);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MATCH) {
				{
				setState(288);
				match(KW_MATCH);
				}
			}

			setState(291);
			match(TEMPLATE_R);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Any_expressionContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_L() { return getToken(NexusAntlrParser.TEMPLATE_L, 0); }
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Any_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterAny_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitAny_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitAny_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_expressionContext any_expression() throws RecognitionException {
		Any_expressionContext _localctx = new Any_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_any_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(TEMPLATE_L);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RAW_ID || _la==UNICODE_ID) {
				{
				setState(294);
				expression();
				}
			}

			setState(297);
			match(TEMPLATE_R);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public NamepathContext namepath() {
			return getRuleContext(NamepathContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			namepath();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifiersContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(301);
				((ModifiersContext)_localctx).identifier = identifier();
				((ModifiersContext)_localctx).mods.add(((ModifiersContext)_localctx).identifier);
				}
				}
				setState(306);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterModified_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitModified_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitModified_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modified_identifierContext modified_identifier() throws RecognitionException {
		Modified_identifierContext _localctx = new Modified_identifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_modified_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					((Modified_identifierContext)_localctx).identifier = identifier();
					((Modified_identifierContext)_localctx).mods.add(((Modified_identifierContext)_localctx).identifier);
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(313);
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

	@SuppressWarnings("CheckReturnValue")
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
		public List<TerminalNode> OP_PROPORTION() { return getTokens(NexusAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(NexusAntlrParser.OP_PROPORTION, i);
		}
		public Modified_namepathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modified_namepath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterModified_namepath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitModified_namepath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitModified_namepath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modified_namepathContext modified_namepath() throws RecognitionException {
		Modified_namepathContext _localctx = new Modified_namepathContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_modified_namepath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					((Modified_namepathContext)_localctx).identifier = identifier();
					((Modified_namepathContext)_localctx).mods.add(((Modified_namepathContext)_localctx).identifier);
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(321);
			((Modified_namepathContext)_localctx).identifier = identifier();
			((Modified_namepathContext)_localctx).path.add(((Modified_namepathContext)_localctx).identifier);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_PROPORTION) {
				{
				{
				setState(322);
				match(OP_PROPORTION);
				setState(323);
				((Modified_namepathContext)_localctx).identifier = identifier();
				((Modified_namepathContext)_localctx).path.add(((Modified_namepathContext)_localctx).identifier);
				}
				}
				setState(328);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Namepath_freeContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(NexusAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(NexusAntlrParser.OP_PROPORTION, i);
		}
		public List<TerminalNode> DOT() { return getTokens(NexusAntlrParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(NexusAntlrParser.DOT, i);
		}
		public Namepath_freeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namepath_free; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterNamepath_free(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitNamepath_free(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitNamepath_free(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namepath_freeContext namepath_free() throws RecognitionException {
		Namepath_freeContext _localctx = new Namepath_freeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namepath_free);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			identifier();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==OP_PROPORTION) {
				{
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
				setState(331);
				identifier();
				}
				}
				setState(336);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NamepathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OP_PROPORTION() { return getTokens(NexusAntlrParser.OP_PROPORTION); }
		public TerminalNode OP_PROPORTION(int i) {
			return getToken(NexusAntlrParser.OP_PROPORTION, i);
		}
		public NamepathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namepath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterNamepath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitNamepath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitNamepath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamepathContext namepath() throws RecognitionException {
		NamepathContext _localctx = new NamepathContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_namepath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			identifier();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_PROPORTION) {
				{
				{
				setState(338);
				match(OP_PROPORTION);
				setState(339);
				identifier();
				}
				}
				setState(344);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode UNICODE_ID() { return getToken(NexusAntlrParser.UNICODE_ID, 0); }
		public TerminalNode RAW_ID() { return getToken(NexusAntlrParser.RAW_ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NexusAntlrListener ) ((NexusAntlrListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NexusAntlrVisitor ) return ((NexusAntlrVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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

	public static final String _serializedATN =
		"\u0004\u0001\"\u015c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000K\b\u0000\n\u0000\f\u0000N\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003^\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003b\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004k\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0005\u0005q\b\u0005\n\u0005\f\u0005t\t\u0005\u0001\u0005\u0003"+
		"\u0005w\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0080\b\u0006\n\u0006\f\u0006"+
		"\u0083\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0089\b\u0007\n\u0007\f\u0007\u008c\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0094\b\b\n\b\f\b\u0097\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u009c\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u00a2"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ad\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00b1\b\u000b\n\u000b\f\u000b\u00b4\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00bc\b\f\n\f\f\f\u00bf"+
		"\t\f\u0001\f\u0003\f\u00c2\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u00c9\b\f\n\f\f\f\u00cc\t\f\u0001\f\u0003\f\u00cf\b\f\u0003\f"+
		"\u00d1\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00d6\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00e2\b\u000f\n\u000f\f\u000f\u00e5\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ea\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00f6\b\u0012\n\u0012"+
		"\f\u0012\u00f9\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00fe\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0104\b\u0014\n\u0014\f\u0014\u0107\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0110"+
		"\b\u0015\n\u0015\f\u0015\u0113\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u011a\b\u0016\n\u0016\f\u0016\u011d"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0122\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0128\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0005\u001a"+
		"\u012f\b\u001a\n\u001a\f\u001a\u0132\t\u001a\u0001\u001b\u0005\u001b\u0135"+
		"\b\u001b\n\u001b\f\u001b\u0138\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0005\u001c\u013d\b\u001c\n\u001c\f\u001c\u0140\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0145\b\u001c\n\u001c\f\u001c\u0148\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u014d\b\u001d\n\u001d"+
		"\f\u001d\u0150\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0155\b\u001e\n\u001e\f\u001e\u0158\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0003\u0001\u0000"+
		"\u0003\u0005\u0002\u0000\u0007\u0007\u0015\u0015\u0001\u0000\u001e\u001f"+
		"\u0169\u0000L\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000\u0004"+
		"V\u0001\u0000\u0000\u0000\u0006X\u0001\u0000\u0000\u0000\be\u0001\u0000"+
		"\u0000\u0000\nn\u0001\u0000\u0000\u0000\fz\u0001\u0000\u0000\u0000\u000e"+
		"\u0084\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000\u0012"+
		"\u0098\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000\u0000\u0000\u0016"+
		"\u00a5\u0001\u0000\u0000\u0000\u0018\u00d0\u0001\u0000\u0000\u0000\u001a"+
		"\u00d2\u0001\u0000\u0000\u0000\u001c\u00d9\u0001\u0000\u0000\u0000\u001e"+
		"\u00dc\u0001\u0000\u0000\u0000 \u00e6\u0001\u0000\u0000\u0000\"\u00ed"+
		"\u0001\u0000\u0000\u0000$\u00f0\u0001\u0000\u0000\u0000&\u00fa\u0001\u0000"+
		"\u0000\u0000(\u0101\u0001\u0000\u0000\u0000*\u010a\u0001\u0000\u0000\u0000"+
		",\u0114\u0001\u0000\u0000\u0000.\u011e\u0001\u0000\u0000\u00000\u0125"+
		"\u0001\u0000\u0000\u00002\u012b\u0001\u0000\u0000\u00004\u0130\u0001\u0000"+
		"\u0000\u00006\u0136\u0001\u0000\u0000\u00008\u013e\u0001\u0000\u0000\u0000"+
		":\u0149\u0001\u0000\u0000\u0000<\u0151\u0001\u0000\u0000\u0000>\u0159"+
		"\u0001\u0000\u0000\u0000@K\u0005\u0001\u0000\u0000AK\u0003\u0006\u0003"+
		"\u0000BK\u0003\b\u0004\u0000CK\u0003\n\u0005\u0000DK\u0003\u0014\n\u0000"+
		"EK\u0003\u001c\u000e\u0000FK\u0003\"\u0011\u0000GK\u0003(\u0014\u0000"+
		"HK\u00030\u0018\u0000IK\u0003\u0004\u0002\u0000J@\u0001\u0000\u0000\u0000"+
		"JA\u0001\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000JC\u0001\u0000\u0000"+
		"\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001\u0000"+
		"\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000OP\u0005\u0000\u0000\u0001P\u0001\u0001\u0000\u0000\u0000QU\u0003"+
		"\n\u0005\u0000RU\u0003\u0014\n\u0000SU\u0003\u0004\u0002\u0000TQ\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000"+
		"U\u0003\u0001\u0000\u0000\u0000VW\u0007\u0000\u0000\u0000W\u0005\u0001"+
		"\u0000\u0000\u0000XY\u0005\u0002\u0000\u0000YZ\u0005\t\u0000\u0000Z]\u0003"+
		":\u001d\u0000[\\\u0005\u000b\u0000\u0000\\^\u0003>\u001f\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_`\u0005\f\u0000\u0000`b\u0003>\u001f\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0006\u0000"+
		"\u0000d\u0007\u0001\u0000\u0000\u0000ef\u0005\u0002\u0000\u0000fg\u0005"+
		"\n\u0000\u0000gj\u0003:\u001d\u0000hi\u0005\f\u0000\u0000ik\u0003>\u001f"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0005\u0006\u0000\u0000m\t\u0001\u0000\u0000\u0000nr\u0003"+
		"\f\u0006\u0000oq\u0003\u0010\b\u0000po\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uw\u0003\u000e\u0007"+
		"\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0003\u0012\t\u0000y\u000b\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0002\u0000\u0000{|\u0005\r\u0000\u0000|}\u00032\u0019\u0000}\u0081\u0005"+
		"\u0006\u0000\u0000~\u0080\u0003\u0002\u0001\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0002\u0000\u0000"+
		"\u0085\u0086\u0005\u000e\u0000\u0000\u0086\u008a\u0005\u0006\u0000\u0000"+
		"\u0087\u0089\u0003\u0002\u0001\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u000f\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0002\u0000\u0000"+
		"\u008e\u008f\u0005\u000e\u0000\u0000\u008f\u0090\u0005\r\u0000\u0000\u0090"+
		"\u0091\u00032\u0019\u0000\u0091\u0095\u0005\u0006\u0000\u0000\u0092\u0094"+
		"\u0003\u0002\u0001\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0011\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0002\u0000\u0000\u0099\u009b"+
		"\u0005\u000f\u0000\u0000\u009a\u009c\u0005\r\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0005\u0006\u0000\u0000\u009e\u0013\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0003\u0016\u000b\u0000\u00a0\u00a2\u0003"+
		"\u000e\u0007\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003"+
		"\u001a\r\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0002"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000\u00a7\u00a8\u0003\u0018"+
		"\f\u0000\u00a8\u00a9\u0005\f\u0000\u0000\u00a9\u00ac\u00032\u0019\u0000"+
		"\u00aa\u00ab\u0005\r\u0000\u0000\u00ab\u00ad\u00032\u0019\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b2\u0005\u0006\u0000\u0000\u00af"+
		"\u00b1\u0003\u0002\u0001\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u0017\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0016\u0000\u0000\u00b6"+
		"\u00d1\u0005\u0017\u0000\u0000\u00b7\u00b8\u0005\u0016\u0000\u0000\u00b8"+
		"\u00bd\u00036\u001b\u0000\u00b9\u00ba\u0005\b\u0000\u0000\u00ba\u00bc"+
		"\u00036\u001b\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u0005\b\u0000\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0017\u0000\u0000\u00c4\u00d1\u0001\u0000"+
		"\u0000\u0000\u00c5\u00ca\u00036\u001b\u0000\u00c6\u00c7\u0005\b\u0000"+
		"\u0000\u00c7\u00c9\u00036\u001b\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005\b\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d0\u00b5\u0001\u0000\u0000\u0000\u00d0"+
		"\u00b7\u0001\u0000\u0000\u0000\u00d0\u00c5\u0001\u0000\u0000\u0000\u00d1"+
		"\u0019\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0002\u0000\u0000\u00d3"+
		"\u00d5\u0005\u000f\u0000\u0000\u00d4\u00d6\u0005\u0010\u0000\u0000\u00d5"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0006\u0000\u0000\u00d8"+
		"\u001b\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u001e\u000f\u0000\u00da"+
		"\u00db\u0003 \u0010\u0000\u00db\u001d\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0002\u0000\u0000\u00dd\u00de\u0005\u0013\u0000\u0000\u00de\u00df"+
		"\u0003>\u001f\u0000\u00df\u00e3\u0005\u0006\u0000\u0000\u00e0\u00e2\u0003"+
		"\u0002\u0001\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u001f\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005\u0002\u0000\u0000\u00e7\u00e9\u0005"+
		"\u000f\u0000\u0000\u00e8\u00ea\u0005\u0013\u0000\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005\u0006\u0000\u0000\u00ec!\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0003$\u0012\u0000\u00ee\u00ef\u0003&\u0013\u0000"+
		"\u00ef#\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0002\u0000\u0000\u00f1"+
		"\u00f2\u0005\u0014\u0000\u0000\u00f2\u00f3\u0003>\u001f\u0000\u00f3\u00f7"+
		"\u0005\u0006\u0000\u0000\u00f4\u00f6\u0003\u0002\u0001\u0000\u00f5\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8%\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u0002\u0000\u0000\u00fb\u00fd\u0005\u000f\u0000\u0000\u00fc\u00fe\u0005"+
		"\u0014\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0005"+
		"\u0006\u0000\u0000\u0100\'\u0001\u0000\u0000\u0000\u0101\u0105\u0003*"+
		"\u0015\u0000\u0102\u0104\u0003,\u0016\u0000\u0103\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0003.\u0017\u0000"+
		"\u0109)\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0002\u0000\u0000\u010b"+
		"\u010c\u0005\u0011\u0000\u0000\u010c\u010d\u00032\u0019\u0000\u010d\u0111"+
		"\u0005\u0006\u0000\u0000\u010e\u0110\u0003\u0002\u0001\u0000\u010f\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112+\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u0005"+
		"\u0002\u0000\u0000\u0115\u0116\u0005\u0012\u0000\u0000\u0116\u0117\u0003"+
		"2\u0019\u0000\u0117\u011b\u0005\u0006\u0000\u0000\u0118\u011a\u0003\u0002"+
		"\u0001\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000"+
		"\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c-\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0005\u0002\u0000\u0000\u011f\u0121\u0005\u000f\u0000"+
		"\u0000\u0120\u0122\u0005\u0011\u0000\u0000\u0121\u0120\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005\u0006\u0000\u0000\u0124/\u0001\u0000\u0000\u0000"+
		"\u0125\u0127\u0005\u0002\u0000\u0000\u0126\u0128\u00032\u0019\u0000\u0127"+
		"\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0006\u0000\u0000\u012a"+
		"1\u0001\u0000\u0000\u0000\u012b\u012c\u0003<\u001e\u0000\u012c3\u0001"+
		"\u0000\u0000\u0000\u012d\u012f\u0003>\u001f\u0000\u012e\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u01315\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0135\u0003>\u001f\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0003>\u001f\u0000\u013a7\u0001\u0000\u0000\u0000\u013b\u013d"+
		"\u0003>\u001f\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u0140\u0001"+
		"\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u013e\u0001"+
		"\u0000\u0000\u0000\u0141\u0146\u0003>\u001f\u0000\u0142\u0143\u0005\u0015"+
		"\u0000\u0000\u0143\u0145\u0003>\u001f\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u01479\u0001\u0000\u0000\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014e\u0003>\u001f\u0000\u014a"+
		"\u014b\u0007\u0001\u0000\u0000\u014b\u014d\u0003>\u001f\u0000\u014c\u014a"+
		"\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f;\u0001"+
		"\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0156\u0003"+
		">\u001f\u0000\u0152\u0153\u0005\u0015\u0000\u0000\u0153\u0155\u0003>\u001f"+
		"\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157=\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0007\u0002\u0000\u0000\u015a?\u0001\u0000\u0000\u0000$J"+
		"LT]ajrv\u0081\u008a\u0095\u009b\u00a1\u00ac\u00b2\u00bd\u00c1\u00ca\u00ce"+
		"\u00d0\u00d5\u00e3\u00e9\u00f7\u00fd\u0105\u0111\u011b\u0121\u0127\u0130"+
		"\u0136\u013e\u0146\u014e\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}