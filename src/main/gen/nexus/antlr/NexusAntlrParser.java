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
		OP_PROPORTION=20, PARENTHESES_L=21, PARENTHESES_R=22, BRACKET_L=23, BRACKET_R=24, 
		BRACE_L=25, BRACE_R=26, GENERIC_L=27, GENERIC_R=28, RAW_ID=29, UNICODE_ID=30, 
		WHITE_SPACE=31, BLOCK_COMMENT=32, ERROR_CHARACTAR=33;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_any_text = 2, RULE_define_import = 3, 
		RULE_define_class = 4, RULE_if_statement = 5, RULE_if_then = 6, RULE_else_then = 7, 
		RULE_else_if = 8, RULE_if_end = 9, RULE_for_statement = 10, RULE_for_begin = 11, 
		RULE_for_pattern = 12, RULE_for_end = 13, RULE_slot_statement = 14, RULE_slot_begin = 15, 
		RULE_slot_end = 16, RULE_match_statement = 17, RULE_match_begin = 18, 
		RULE_case_branch = 19, RULE_match_end = 20, RULE_any_expression = 21, 
		RULE_expression = 22, RULE_modifiers = 23, RULE_modified_identifier = 24, 
		RULE_modified_namepath = 25, RULE_namepath_free = 26, RULE_namepath = 27, 
		RULE_identifier = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "any_text", "define_import", "define_class", 
			"if_statement", "if_then", "else_then", "else_if", "if_end", "for_statement", 
			"for_begin", "for_pattern", "for_end", "slot_statement", "slot_begin", 
			"slot_end", "match_statement", "match_begin", "case_branch", "match_end", 
			"any_expression", "expression", "modifiers", "modified_identifier", "modified_namepath", 
			"namepath_free", "namepath", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<<%'", "'<%'", null, null, null, "'%>'", "'.'", "','", "'using'", 
			"'class'", "'as'", "'in'", "'if'", "'else'", "'end'", "'for'", "'match'", 
			"'case'", "'block'", "'::'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'\\u27E8'", "'\\u27E9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEMPLATE_E", "TEMPLATE_L", "TEXT_SPACE", "TEXT_WORD", "TEXT", 
			"TEMPLATE_R", "DOT", "COMMA", "KW_IMPORT", "KW_CLASS", "KW_AS", "KW_IN", 
			"KW_IF", "KW_ELSE", "KW_END", "KW_FOR", "KW_MATCH", "KW_CASE", "KW_SLOT", 
			"OP_PROPORTION", "PARENTHESES_L", "PARENTHESES_R", "BRACKET_L", "BRACKET_R", 
			"BRACE_L", "BRACE_R", "GENERIC_L", "GENERIC_R", "RAW_ID", "UNICODE_ID", 
			"WHITE_SPACE", "BLOCK_COMMENT", "ERROR_CHARACTAR"
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(58);
					match(TEMPLATE_E);
					}
					break;
				case 2:
					{
					setState(59);
					define_import();
					}
					break;
				case 3:
					{
					setState(60);
					define_class();
					}
					break;
				case 4:
					{
					setState(61);
					if_statement();
					}
					break;
				case 5:
					{
					setState(62);
					for_statement();
					}
					break;
				case 6:
					{
					setState(63);
					slot_statement();
					}
					break;
				case 7:
					{
					setState(64);
					match_statement();
					}
					break;
				case 8:
					{
					setState(65);
					any_expression();
					}
					break;
				case 9:
					{
					setState(66);
					any_text();
					}
					break;
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				for_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
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
			setState(79);
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
			setState(81);
			match(TEMPLATE_L);
			setState(82);
			match(KW_IMPORT);
			setState(83);
			namepath_free();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(84);
				match(KW_AS);
				setState(85);
				identifier();
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IN) {
				{
				setState(88);
				match(KW_IN);
				setState(89);
				identifier();
				}
			}

			setState(92);
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
			setState(94);
			match(TEMPLATE_L);
			setState(95);
			match(KW_CLASS);
			setState(96);
			namepath_free();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IN) {
				{
				setState(97);
				match(KW_IN);
				setState(98);
				identifier();
				}
			}

			setState(101);
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
			setState(103);
			if_then();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					else_if();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(110);
				else_then();
				}
				break;
			}
			setState(113);
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
			setState(115);
			match(TEMPLATE_L);
			setState(116);
			match(KW_IF);
			setState(117);
			expression();
			setState(118);
			match(TEMPLATE_R);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					statements();
					}
					} 
				}
				setState(124);
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
			setState(125);
			match(TEMPLATE_L);
			setState(126);
			match(KW_ELSE);
			setState(127);
			match(TEMPLATE_R);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					statements();
					}
					} 
				}
				setState(133);
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
			setState(134);
			match(TEMPLATE_L);
			setState(135);
			match(KW_ELSE);
			setState(136);
			match(KW_IF);
			setState(137);
			expression();
			setState(138);
			match(TEMPLATE_R);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					statements();
					}
					} 
				}
				setState(144);
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
			setState(145);
			match(TEMPLATE_L);
			setState(146);
			match(KW_END);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(147);
				match(KW_IF);
				}
			}

			setState(150);
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
			setState(152);
			for_begin();
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(153);
				else_then();
				}
				break;
			}
			setState(156);
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
			setState(158);
			match(TEMPLATE_L);
			setState(159);
			match(KW_FOR);
			setState(160);
			for_pattern();
			setState(161);
			match(KW_IN);
			setState(162);
			((For_beginContext)_localctx).condition = expression();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(163);
				match(KW_IF);
				setState(164);
				((For_beginContext)_localctx).guard = expression();
				}
			}

			setState(167);
			match(TEMPLATE_R);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(168);
					statements();
					}
					} 
				}
				setState(173);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(PARENTHESES_L);
				setState(175);
				match(PARENTHESES_R);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(PARENTHESES_L);
				setState(177);
				modified_identifier();
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(178);
						match(COMMA);
						setState(179);
						modified_identifier();
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(185);
					match(COMMA);
					}
				}

				setState(188);
				match(PARENTHESES_R);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				modified_identifier();
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						match(COMMA);
						setState(192);
						modified_identifier();
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(198);
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
			setState(203);
			match(TEMPLATE_L);
			setState(204);
			match(KW_END);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(205);
				match(KW_FOR);
				}
			}

			setState(208);
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
			setState(210);
			slot_begin();
			setState(211);
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
			setState(213);
			match(TEMPLATE_L);
			setState(214);
			match(KW_SLOT);
			setState(215);
			identifier();
			setState(216);
			match(TEMPLATE_R);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					statements();
					}
					} 
				}
				setState(222);
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
			setState(223);
			match(TEMPLATE_L);
			setState(224);
			match(KW_END);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_SLOT) {
				{
				setState(225);
				match(KW_SLOT);
				}
			}

			setState(228);
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
		enterRule(_localctx, 34, RULE_match_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match_begin();
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					case_branch();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(237);
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
		enterRule(_localctx, 36, RULE_match_begin);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(TEMPLATE_L);
			setState(240);
			match(KW_MATCH);
			setState(241);
			expression();
			setState(242);
			match(TEMPLATE_R);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(243);
					statements();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 38, RULE_case_branch);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(TEMPLATE_L);
			setState(250);
			match(KW_CASE);
			setState(251);
			expression();
			setState(252);
			match(TEMPLATE_R);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					statements();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 40, RULE_match_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(TEMPLATE_L);
			setState(260);
			match(KW_END);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MATCH) {
				{
				setState(261);
				match(KW_MATCH);
				}
			}

			setState(264);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TEMPLATE_R() { return getToken(NexusAntlrParser.TEMPLATE_R, 0); }
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
		enterRule(_localctx, 42, RULE_any_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(TEMPLATE_L);
			setState(267);
			expression();
			setState(268);
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
		enterRule(_localctx, 44, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		enterRule(_localctx, 46, RULE_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RAW_ID || _la==UNICODE_ID) {
				{
				{
				setState(272);
				((ModifiersContext)_localctx).identifier = identifier();
				((ModifiersContext)_localctx).mods.add(((ModifiersContext)_localctx).identifier);
				}
				}
				setState(277);
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
		enterRule(_localctx, 48, RULE_modified_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					((Modified_identifierContext)_localctx).identifier = identifier();
					((Modified_identifierContext)_localctx).mods.add(((Modified_identifierContext)_localctx).identifier);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(284);
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
		enterRule(_localctx, 50, RULE_modified_namepath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					((Modified_namepathContext)_localctx).identifier = identifier();
					((Modified_namepathContext)_localctx).mods.add(((Modified_namepathContext)_localctx).identifier);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(292);
			((Modified_namepathContext)_localctx).identifier = identifier();
			((Modified_namepathContext)_localctx).path.add(((Modified_namepathContext)_localctx).identifier);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_PROPORTION) {
				{
				{
				setState(293);
				match(OP_PROPORTION);
				setState(294);
				((Modified_namepathContext)_localctx).identifier = identifier();
				((Modified_namepathContext)_localctx).path.add(((Modified_namepathContext)_localctx).identifier);
				}
				}
				setState(299);
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
		enterRule(_localctx, 52, RULE_namepath_free);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			identifier();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==OP_PROPORTION) {
				{
				{
				setState(301);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==OP_PROPORTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(302);
				identifier();
				}
				}
				setState(307);
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
		enterRule(_localctx, 54, RULE_namepath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			identifier();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_PROPORTION) {
				{
				{
				setState(309);
				match(OP_PROPORTION);
				setState(310);
				identifier();
				}
				}
				setState(315);
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
		enterRule(_localctx, 56, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		"\u0004\u0001!\u013f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"D\b\u0000\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"W\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004d\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005j\b\u0005\n\u0005\f\u0005m\t\u0005\u0001\u0005\u0003\u0005p\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006y\b\u0006\n\u0006\f\u0006|\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0082\b\u0007\n\u0007"+
		"\f\u0007\u0085\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u008d\b\b\n\b\f\b\u0090\t\b\u0001\t\u0001\t\u0001\t\u0003\t\u0095"+
		"\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u009b\b\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00a6\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00aa\b\u000b\n\u000b\f\u000b\u00ad\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00b5\b\f\n\f\f\f\u00b8\t\f\u0001\f\u0003\f"+
		"\u00bb\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00c2\b\f\n"+
		"\f\f\f\u00c5\t\f\u0001\f\u0003\f\u00c8\b\f\u0003\f\u00ca\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00cf\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00db\b\u000f\n\u000f\f\u000f\u00de\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00e3\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00e9\b\u0011\n\u0011\f\u0011\u00ec\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00f5\b\u0012\n\u0012\f\u0012\u00f8\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00ff\b\u0013"+
		"\n\u0013\f\u0013\u0102\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0107\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0005\u0017\u0112"+
		"\b\u0017\n\u0017\f\u0017\u0115\t\u0017\u0001\u0018\u0005\u0018\u0118\b"+
		"\u0018\n\u0018\f\u0018\u011b\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0005\u0019\u0120\b\u0019\n\u0019\f\u0019\u0123\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u0128\b\u0019\n\u0019\f\u0019\u012b\t\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0130\b\u001a\n\u001a"+
		"\f\u001a\u0133\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u0138\b\u001b\n\u001b\f\u001b\u013b\t\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0000\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0003\u0001\u0000"+
		"\u0003\u0005\u0002\u0000\u0007\u0007\u0014\u0014\u0001\u0000\u001d\u001e"+
		"\u014b\u0000E\u0001\u0000\u0000\u0000\u0002M\u0001\u0000\u0000\u0000\u0004"+
		"O\u0001\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000\b^\u0001\u0000"+
		"\u0000\u0000\ng\u0001\u0000\u0000\u0000\fs\u0001\u0000\u0000\u0000\u000e"+
		"}\u0001\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000\u0000\u0012\u0091"+
		"\u0001\u0000\u0000\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u009e"+
		"\u0001\u0000\u0000\u0000\u0018\u00c9\u0001\u0000\u0000\u0000\u001a\u00cb"+
		"\u0001\u0000\u0000\u0000\u001c\u00d2\u0001\u0000\u0000\u0000\u001e\u00d5"+
		"\u0001\u0000\u0000\u0000 \u00df\u0001\u0000\u0000\u0000\"\u00e6\u0001"+
		"\u0000\u0000\u0000$\u00ef\u0001\u0000\u0000\u0000&\u00f9\u0001\u0000\u0000"+
		"\u0000(\u0103\u0001\u0000\u0000\u0000*\u010a\u0001\u0000\u0000\u0000,"+
		"\u010e\u0001\u0000\u0000\u0000.\u0113\u0001\u0000\u0000\u00000\u0119\u0001"+
		"\u0000\u0000\u00002\u0121\u0001\u0000\u0000\u00004\u012c\u0001\u0000\u0000"+
		"\u00006\u0134\u0001\u0000\u0000\u00008\u013c\u0001\u0000\u0000\u0000:"+
		"D\u0005\u0001\u0000\u0000;D\u0003\u0006\u0003\u0000<D\u0003\b\u0004\u0000"+
		"=D\u0003\n\u0005\u0000>D\u0003\u0014\n\u0000?D\u0003\u001c\u000e\u0000"+
		"@D\u0003\"\u0011\u0000AD\u0003*\u0015\u0000BD\u0003\u0004\u0002\u0000"+
		"C:\u0001\u0000\u0000\u0000C;\u0001\u0000\u0000\u0000C<\u0001\u0000\u0000"+
		"\u0000C=\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000\u0000C?\u0001\u0000"+
		"\u0000\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HI\u0005\u0000\u0000\u0001I\u0001\u0001\u0000\u0000\u0000JN\u0003"+
		"\n\u0005\u0000KN\u0003\u0014\n\u0000LN\u0003\u0004\u0002\u0000MJ\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"N\u0003\u0001\u0000\u0000\u0000OP\u0007\u0000\u0000\u0000P\u0005\u0001"+
		"\u0000\u0000\u0000QR\u0005\u0002\u0000\u0000RS\u0005\t\u0000\u0000SV\u0003"+
		"4\u001a\u0000TU\u0005\u000b\u0000\u0000UW\u00038\u001c\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XY\u0005"+
		"\f\u0000\u0000Y[\u00038\u001c\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005\u0006\u0000\u0000"+
		"]\u0007\u0001\u0000\u0000\u0000^_\u0005\u0002\u0000\u0000_`\u0005\n\u0000"+
		"\u0000`c\u00034\u001a\u0000ab\u0005\f\u0000\u0000bd\u00038\u001c\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0006\u0000\u0000f\t\u0001\u0000\u0000\u0000gk\u0003\f"+
		"\u0006\u0000hj\u0003\u0010\b\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0003\u000e\u0007\u0000"+
		"on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qr\u0003\u0012\t\u0000r\u000b\u0001\u0000\u0000\u0000st\u0005\u0002"+
		"\u0000\u0000tu\u0005\r\u0000\u0000uv\u0003,\u0016\u0000vz\u0005\u0006"+
		"\u0000\u0000wy\u0003\u0002\u0001\u0000xw\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\r\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\u0002\u0000"+
		"\u0000~\u007f\u0005\u000e\u0000\u0000\u007f\u0083\u0005\u0006\u0000\u0000"+
		"\u0080\u0082\u0003\u0002\u0001\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u000f\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0002\u0000\u0000"+
		"\u0087\u0088\u0005\u000e\u0000\u0000\u0088\u0089\u0005\r\u0000\u0000\u0089"+
		"\u008a\u0003,\u0016\u0000\u008a\u008e\u0005\u0006\u0000\u0000\u008b\u008d"+
		"\u0003\u0002\u0001\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0011\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0094"+
		"\u0005\u000f\u0000\u0000\u0093\u0095\u0005\r\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u0006\u0000\u0000\u0097\u0013\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0003\u0016\u000b\u0000\u0099\u009b\u0003"+
		"\u000e\u0007\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0003"+
		"\u001a\r\u0000\u009d\u0015\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0002"+
		"\u0000\u0000\u009f\u00a0\u0005\u0010\u0000\u0000\u00a0\u00a1\u0003\u0018"+
		"\f\u0000\u00a1\u00a2\u0005\f\u0000\u0000\u00a2\u00a5\u0003,\u0016\u0000"+
		"\u00a3\u00a4\u0005\r\u0000\u0000\u00a4\u00a6\u0003,\u0016\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00ab\u0005\u0006\u0000\u0000\u00a8"+
		"\u00aa\u0003\u0002\u0001\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u0017\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0015\u0000\u0000\u00af"+
		"\u00ca\u0005\u0016\u0000\u0000\u00b0\u00b1\u0005\u0015\u0000\u0000\u00b1"+
		"\u00b6\u00030\u0018\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u00b5"+
		"\u00030\u0018\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0005\b\u0000\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0016\u0000\u0000\u00bd\u00ca\u0001\u0000"+
		"\u0000\u0000\u00be\u00c3\u00030\u0018\u0000\u00bf\u00c0\u0005\b\u0000"+
		"\u0000\u00c0\u00c2\u00030\u0018\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005\b\u0000\u0000\u00c7"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c9\u00ae\u0001\u0000\u0000\u0000\u00c9"+
		"\u00b0\u0001\u0000\u0000\u0000\u00c9\u00be\u0001\u0000\u0000\u0000\u00ca"+
		"\u0019\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc"+
		"\u00ce\u0005\u000f\u0000\u0000\u00cd\u00cf\u0005\u0010\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0006\u0000\u0000\u00d1"+
		"\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003\u001e\u000f\u0000\u00d3"+
		"\u00d4\u0003 \u0010\u0000\u00d4\u001d\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0002\u0000\u0000\u00d6\u00d7\u0005\u0013\u0000\u0000\u00d7\u00d8"+
		"\u00038\u001c\u0000\u00d8\u00dc\u0005\u0006\u0000\u0000\u00d9\u00db\u0003"+
		"\u0002\u0001\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u001f\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005\u0002\u0000\u0000\u00e0\u00e2\u0005"+
		"\u000f\u0000\u0000\u00e1\u00e3\u0005\u0013\u0000\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005\u0006\u0000\u0000\u00e5!\u0001\u0000"+
		"\u0000\u0000\u00e6\u00ea\u0003$\u0012\u0000\u00e7\u00e9\u0003&\u0013\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0003(\u0014\u0000\u00ee#\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005\u0002\u0000\u0000\u00f0\u00f1\u0005\u0011\u0000\u0000\u00f1\u00f2"+
		"\u0003,\u0016\u0000\u00f2\u00f6\u0005\u0006\u0000\u0000\u00f3\u00f5\u0003"+
		"\u0002\u0001\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7%\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0005\u0002\u0000\u0000\u00fa\u00fb\u0005\u0012"+
		"\u0000\u0000\u00fb\u00fc\u0003,\u0016\u0000\u00fc\u0100\u0005\u0006\u0000"+
		"\u0000\u00fd\u00ff\u0003\u0002\u0001\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\'\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0002\u0000\u0000"+
		"\u0104\u0106\u0005\u000f\u0000\u0000\u0105\u0107\u0005\u0011\u0000\u0000"+
		"\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0006\u0000\u0000"+
		"\u0109)\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0002\u0000\u0000\u010b"+
		"\u010c\u0003,\u0016\u0000\u010c\u010d\u0005\u0006\u0000\u0000\u010d+\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u00036\u001b\u0000\u010f-\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u00038\u001c\u0000\u0111\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114/\u0001\u0000\u0000\u0000\u0115"+
		"\u0113\u0001\u0000\u0000\u0000\u0116\u0118\u00038\u001c\u0000\u0117\u0116"+
		"\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011c"+
		"\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u00038\u001c\u0000\u011d1\u0001\u0000\u0000\u0000\u011e\u0120\u00038"+
		"\u001c\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000"+
		"\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0124\u0129\u00038\u001c\u0000\u0125\u0126\u0005\u0014\u0000"+
		"\u0000\u0126\u0128\u00038\u001c\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0001\u0000\u0000\u0000\u012a3\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012c\u0131\u00038\u001c\u0000\u012d\u012e"+
		"\u0007\u0001\u0000\u0000\u012e\u0130\u00038\u001c\u0000\u012f\u012d\u0001"+
		"\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u01325\u0001\u0000"+
		"\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0139\u00038\u001c"+
		"\u0000\u0135\u0136\u0005\u0014\u0000\u0000\u0136\u0138\u00038\u001c\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000"+
		"\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a7\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0007\u0002\u0000\u0000\u013d9\u0001\u0000\u0000\u0000!CEMVZck"+
		"oz\u0083\u008e\u0094\u009a\u00a5\u00ab\u00b6\u00ba\u00c3\u00c7\u00c9\u00ce"+
		"\u00dc\u00e2\u00ea\u00f6\u0100\u0106\u0113\u0119\u0121\u0129\u0131\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}