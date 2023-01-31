// Generated from C:/Users/Dell/IdeaProjects/nexus-intellij/src/main/antlr/NexusAntlr.g4 by ANTLR 4.13.1
package nexus.language.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NexusAntlrParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            TEMPLATE_LX = 1, TEMPLATE_L = 2, TEXT_SPACE = 3, TEXT = 4, TEMPLATE_R = 5, KW_IMPORT = 6,
            KW_CLASS = 7, KW_AS = 8, KW_IN = 9, KW_IF = 10, KW_ELSE = 11, KW_END = 12, KW_FOR = 13,
            OP_PROPORTION = 14, DOT = 15, PARENTHESES_L = 16, PARENTHESES_R = 17, BRACKET_L = 18,
            BRACKET_R = 19, BRACE_L = 20, BRACE_R = 21, GENERIC_L = 22, GENERIC_R = 23, RAW_ID = 24,
            UNICODE_ID = 25, WHITE_SPACE = 26, BLOCK_COMMENT = 27, ERROR_CHARACTAR = 28;
    public static final int
            RULE_program = 0, RULE_any_text = 1, RULE_define_import = 2, RULE_define_class = 3,
            RULE_if_statement = 4, RULE_if_begin = 5, RULE_else = 6, RULE_if_end = 7,
            RULE_for_statement = 8, RULE_for_begin = 9, RULE_for_end = 10, RULE_expression = 11,
            RULE_namepath_free = 12, RULE_namepath = 13, RULE_identifier = 14;

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "any_text", "define_import", "define_class", "if_statement",
                "if_begin", "else", "if_end", "for_statement", "for_begin", "for_end",
                "expression", "namepath_free", "namepath", "identifier"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'<<%'", "'<%'", null, null, "'%>'", "'using'", "'class'", "'as'",
                "'in'", "'if'", "'else'", "'end'", "'for'", "'::'", "'.'", "'('", "')'",
                "'['", "']'", "'{'", "'}'", "'\\u27E8'", "'\\u27E9'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "TEMPLATE_LX", "TEMPLATE_L", "TEXT_SPACE", "TEXT", "TEMPLATE_R",
                "KW_IMPORT", "KW_CLASS", "KW_AS", "KW_IN", "KW_IF", "KW_ELSE", "KW_END",
                "KW_FOR", "OP_PROPORTION", "DOT", "PARENTHESES_L", "PARENTHESES_R", "BRACKET_L",
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
    public String getGrammarFileName() {
        return "NexusAntlr.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public NexusAntlrParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ProgramContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(NexusAntlrParser.EOF, 0);
        }

        public List<TerminalNode> TEMPLATE_LX() {
            return getTokens(NexusAntlrParser.TEMPLATE_LX);
        }

        public TerminalNode TEMPLATE_LX(int i) {
            return getToken(NexusAntlrParser.TEMPLATE_LX, i);
        }

        public List<Define_importContext> define_import() {
            return getRuleContexts(Define_importContext.class);
        }

        public Define_importContext define_import(int i) {
            return getRuleContext(Define_importContext.class, i);
        }

        public List<Define_classContext> define_class() {
            return getRuleContexts(Define_classContext.class);
        }

        public Define_classContext define_class(int i) {
            return getRuleContext(Define_classContext.class, i);
        }

        public List<If_statementContext> if_statement() {
            return getRuleContexts(If_statementContext.class);
        }

        public If_statementContext if_statement(int i) {
            return getRuleContext(If_statementContext.class, i);
        }

        public List<For_statementContext> for_statement() {
            return getRuleContexts(For_statementContext.class);
        }

        public For_statementContext for_statement(int i) {
            return getRuleContext(For_statementContext.class, i);
        }

        public List<Any_textContext> any_text() {
            return getRuleContexts(Any_textContext.class);
        }

        public Any_textContext any_text(int i) {
            return getRuleContext(Any_textContext.class, i);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitProgram(this);
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
                setState(38);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
                    {
                        setState(36);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(30);
                                match(TEMPLATE_LX);
                            }
                            break;
                            case 2: {
                                setState(31);
                                define_import();
                            }
                            break;
                            case 3: {
                                setState(32);
                                define_class();
                            }
                            break;
                            case 4: {
                                setState(33);
                                if_statement();
                            }
                            break;
                            case 5: {
                                setState(34);
                                for_statement();
                            }
                            break;
                            case 6: {
                                setState(35);
                                any_text();
                            }
                            break;
                        }
                    }
                    setState(40);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(41);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Any_textContext extends ParserRuleContext {
        public TerminalNode TEXT_SPACE() {
            return getToken(NexusAntlrParser.TEXT_SPACE, 0);
        }

        public TerminalNode TEXT() {
            return getToken(NexusAntlrParser.TEXT, 0);
        }

        public Any_textContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_any_text;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterAny_text(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitAny_text(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitAny_text(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Any_textContext any_text() throws RecognitionException {
        Any_textContext _localctx = new Any_textContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_any_text);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(43);
                _la = _input.LA(1);
                if (!(_la == TEXT_SPACE || _la == TEXT)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Define_importContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(NexusAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_IMPORT() {
            return getToken(NexusAntlrParser.KW_IMPORT, 0);
        }

        public Namepath_freeContext namepath_free() {
            return getRuleContext(Namepath_freeContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(NexusAntlrParser.TEMPLATE_R, 0);
        }

        public TerminalNode KW_AS() {
            return getToken(NexusAntlrParser.KW_AS, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode KW_IN() {
            return getToken(NexusAntlrParser.KW_IN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Define_importContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_define_import;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterDefine_import(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitDefine_import(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitDefine_import(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Define_importContext define_import() throws RecognitionException {
        Define_importContext _localctx = new Define_importContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_define_import);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(45);
                match(TEMPLATE_L);
                setState(46);
                match(KW_IMPORT);
                setState(47);
                namepath_free();
                setState(50);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_AS) {
                    {
                        setState(48);
                        match(KW_AS);
                        setState(49);
                        identifier();
                    }
                }

                setState(54);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IN) {
                    {
                        setState(52);
                        match(KW_IN);
                        setState(53);
                        expression();
                    }
                }

                setState(56);
                match(TEMPLATE_R);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Define_classContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(NexusAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_CLASS() {
            return getToken(NexusAntlrParser.KW_CLASS, 0);
        }

        public Namepath_freeContext namepath_free() {
            return getRuleContext(Namepath_freeContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(NexusAntlrParser.TEMPLATE_R, 0);
        }

        public TerminalNode KW_IN() {
            return getToken(NexusAntlrParser.KW_IN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Define_classContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_define_class;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterDefine_class(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitDefine_class(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitDefine_class(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Define_classContext define_class() throws RecognitionException {
        Define_classContext _localctx = new Define_classContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_define_class);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(58);
                match(TEMPLATE_L);
                setState(59);
                match(KW_CLASS);
                setState(60);
                namepath_free();
                setState(63);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IN) {
                    {
                        setState(61);
                        match(KW_IN);
                        setState(62);
                        expression();
                    }
                }

                setState(65);
                match(TEMPLATE_R);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class If_statementContext extends ParserRuleContext {
        public If_beginContext if_begin() {
            return getRuleContext(If_beginContext.class, 0);
        }

        public If_endContext if_end() {
            return getRuleContext(If_endContext.class, 0);
        }

        public ElseContext else_() {
            return getRuleContext(ElseContext.class, 0);
        }

        public If_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterIf_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitIf_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitIf_statement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_statementContext if_statement() throws RecognitionException {
        If_statementContext _localctx = new If_statementContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_if_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(67);
                if_begin();
                setState(69);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                    case 1: {
                        setState(68);
                        else_();
                    }
                    break;
                }
                setState(71);
                if_end();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class If_beginContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(NexusAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_IF() {
            return getToken(NexusAntlrParser.KW_IF, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(NexusAntlrParser.TEMPLATE_R, 0);
        }

        public List<Any_textContext> any_text() {
            return getRuleContexts(Any_textContext.class);
        }

        public Any_textContext any_text(int i) {
            return getRuleContext(Any_textContext.class, i);
        }

        public If_beginContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_begin;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterIf_begin(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitIf_begin(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitIf_begin(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_beginContext if_begin() throws RecognitionException {
        If_beginContext _localctx = new If_beginContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_if_begin);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                match(TEMPLATE_L);
                setState(74);
                match(KW_IF);
                setState(75);
                expression();
                setState(76);
                match(TEMPLATE_R);
                setState(80);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TEXT_SPACE || _la == TEXT) {
                    {
                        {
                            setState(77);
                            any_text();
                        }
                    }
                    setState(82);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ElseContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(NexusAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_ELSE() {
            return getToken(NexusAntlrParser.KW_ELSE, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(NexusAntlrParser.TEMPLATE_R, 0);
        }

        public List<Any_textContext> any_text() {
            return getRuleContexts(Any_textContext.class);
        }

        public Any_textContext any_text(int i) {
            return getRuleContext(Any_textContext.class, i);
        }

        public ElseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_else;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterElse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitElse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor) return ((NexusAntlrVisitor<? extends T>) visitor).visitElse(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ElseContext else_() throws RecognitionException {
        ElseContext _localctx = new ElseContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_else);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(83);
                match(TEMPLATE_L);
                setState(84);
                match(KW_ELSE);
                setState(85);
                match(TEMPLATE_R);
                setState(89);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TEXT_SPACE || _la == TEXT) {
                    {
                        {
                            setState(86);
                            any_text();
                        }
                    }
                    setState(91);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class If_endContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(NexusAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_END() {
            return getToken(NexusAntlrParser.KW_END, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(NexusAntlrParser.TEMPLATE_R, 0);
        }

        public TerminalNode KW_IF() {
            return getToken(NexusAntlrParser.KW_IF, 0);
        }

        public If_endContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_end;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterIf_end(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitIf_end(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitIf_end(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_endContext if_end() throws RecognitionException {
        If_endContext _localctx = new If_endContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_if_end);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                match(TEMPLATE_L);
                setState(93);
                match(KW_END);
                setState(95);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IF) {
                    {
                        setState(94);
                        match(KW_IF);
                    }
                }

                setState(97);
                match(TEMPLATE_R);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class For_statementContext extends ParserRuleContext {
        public For_beginContext for_begin() {
            return getRuleContext(For_beginContext.class, 0);
        }

        public For_endContext for_end() {
            return getRuleContext(For_endContext.class, 0);
        }

        public ElseContext else_() {
            return getRuleContext(ElseContext.class, 0);
        }

        public For_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterFor_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitFor_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitFor_statement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_statementContext for_statement() throws RecognitionException {
        For_statementContext _localctx = new For_statementContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_for_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(99);
                for_begin();
                setState(101);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                    case 1: {
                        setState(100);
                        else_();
                    }
                    break;
                }
                setState(103);
                for_end();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class For_beginContext extends ParserRuleContext {
        public ExpressionContext condition;
        public ExpressionContext guard;

        public TerminalNode TEMPLATE_L() {
            return getToken(NexusAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_FOR() {
            return getToken(NexusAntlrParser.KW_FOR, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode KW_IN() {
            return getToken(NexusAntlrParser.KW_IN, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(NexusAntlrParser.TEMPLATE_R, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode KW_IF() {
            return getToken(NexusAntlrParser.KW_IF, 0);
        }

        public List<Any_textContext> any_text() {
            return getRuleContexts(Any_textContext.class);
        }

        public Any_textContext any_text(int i) {
            return getRuleContext(Any_textContext.class, i);
        }

        public For_beginContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_begin;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterFor_begin(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitFor_begin(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitFor_begin(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_beginContext for_begin() throws RecognitionException {
        For_beginContext _localctx = new For_beginContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_for_begin);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(105);
                match(TEMPLATE_L);
                setState(106);
                match(KW_FOR);
                setState(107);
                identifier();
                setState(108);
                match(KW_IN);
                setState(109);
                ((For_beginContext) _localctx).condition = expression();
                setState(112);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IF) {
                    {
                        setState(110);
                        match(KW_IF);
                        setState(111);
                        ((For_beginContext) _localctx).guard = expression();
                    }
                }

                setState(114);
                match(TEMPLATE_R);
                setState(118);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TEXT_SPACE || _la == TEXT) {
                    {
                        {
                            setState(115);
                            any_text();
                        }
                    }
                    setState(120);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class For_endContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(NexusAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_END() {
            return getToken(NexusAntlrParser.KW_END, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(NexusAntlrParser.TEMPLATE_R, 0);
        }

        public TerminalNode KW_FOR() {
            return getToken(NexusAntlrParser.KW_FOR, 0);
        }

        public For_endContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_end;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterFor_end(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitFor_end(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitFor_end(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_endContext for_end() throws RecognitionException {
        For_endContext _localctx = new For_endContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_for_end);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(121);
                match(TEMPLATE_L);
                setState(122);
                match(KW_END);
                setState(124);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_FOR) {
                    {
                        setState(123);
                        match(KW_FOR);
                    }
                }

                setState(126);
                match(TEMPLATE_R);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExpressionContext extends ParserRuleContext {
        public NamepathContext namepath() {
            return getRuleContext(NamepathContext.class, 0);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(128);
                namepath();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(IdentifierContext.class, i);
        }

        public List<TerminalNode> OP_PROPORTION() {
            return getTokens(NexusAntlrParser.OP_PROPORTION);
        }

        public TerminalNode OP_PROPORTION(int i) {
            return getToken(NexusAntlrParser.OP_PROPORTION, i);
        }

        public List<TerminalNode> DOT() {
            return getTokens(NexusAntlrParser.DOT);
        }

        public TerminalNode DOT(int i) {
            return getToken(NexusAntlrParser.DOT, i);
        }

        public Namepath_freeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namepath_free;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterNamepath_free(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitNamepath_free(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitNamepath_free(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Namepath_freeContext namepath_free() throws RecognitionException {
        Namepath_freeContext _localctx = new Namepath_freeContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_namepath_free);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                identifier();
                setState(135);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OP_PROPORTION || _la == DOT) {
                    {
                        {
                            setState(131);
                            _la = _input.LA(1);
                            if (!(_la == OP_PROPORTION || _la == DOT)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(132);
                            identifier();
                        }
                    }
                    setState(137);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
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
            return getRuleContext(IdentifierContext.class, i);
        }

        public List<TerminalNode> OP_PROPORTION() {
            return getTokens(NexusAntlrParser.OP_PROPORTION);
        }

        public TerminalNode OP_PROPORTION(int i) {
            return getToken(NexusAntlrParser.OP_PROPORTION, i);
        }

        public NamepathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namepath;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterNamepath(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitNamepath(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitNamepath(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NamepathContext namepath() throws RecognitionException {
        NamepathContext _localctx = new NamepathContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_namepath);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(138);
                identifier();
                setState(143);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OP_PROPORTION) {
                    {
                        {
                            setState(139);
                            match(OP_PROPORTION);
                            setState(140);
                            identifier();
                        }
                    }
                    setState(145);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdentifierContext extends ParserRuleContext {
        public TerminalNode UNICODE_ID() {
            return getToken(NexusAntlrParser.UNICODE_ID, 0);
        }

        public TerminalNode RAW_ID() {
            return getToken(NexusAntlrParser.RAW_ID, 0);
        }

        public IdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierContext identifier() throws RecognitionException {
        IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_identifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                _la = _input.LA(1);
                if (!(_la == RAW_ID || _la == UNICODE_ID)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\u0004\u0001\u001c\u0095\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001" +
                    "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004" +
                    "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007" +
                    "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b" +
                    "\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001" +
                    "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b" +
                    "\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001" +
                    "\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003" +
                    "\u00023\b\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0003\u0003@\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004" +
                    "\u0003\u0004F\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005" +
                    "\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005O\b\u0005\n\u0005\f\u0005" +
                    "R\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006" +
                    "X\b\u0006\n\u0006\f\u0006[\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0003\u0007`\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b" +
                    "f\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t" +
                    "\u0001\t\u0003\tq\b\t\u0001\t\u0001\t\u0005\tu\b\t\n\t\f\tx\t\t\u0001" +
                    "\n\u0001\n\u0001\n\u0003\n}\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b" +
                    "\u0001\f\u0001\f\u0001\f\u0005\f\u0086\b\f\n\f\f\f\u0089\t\f\u0001\r\u0001" +
                    "\r\u0001\r\u0005\r\u008e\b\r\n\r\f\r\u0091\t\r\u0001\u000e\u0001\u000e" +
                    "\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010" +
                    "\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0003\u0001\u0000\u0003\u0004" +
                    "\u0001\u0000\u000e\u000f\u0001\u0000\u0018\u0019\u0098\u0000&\u0001\u0000" +
                    "\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000" +
                    "\u0006:\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nI\u0001\u0000" +
                    "\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000\u0000" +
                    "\u0010c\u0001\u0000\u0000\u0000\u0012i\u0001\u0000\u0000\u0000\u0014y" +
                    "\u0001\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u0082" +
                    "\u0001\u0000\u0000\u0000\u001a\u008a\u0001\u0000\u0000\u0000\u001c\u0092" +
                    "\u0001\u0000\u0000\u0000\u001e%\u0005\u0001\u0000\u0000\u001f%\u0003\u0004" +
                    "\u0002\u0000 %\u0003\u0006\u0003\u0000!%\u0003\b\u0004\u0000\"%\u0003" +
                    "\u0010\b\u0000#%\u0003\u0002\u0001\u0000$\u001e\u0001\u0000\u0000\u0000" +
                    "$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001\u0000" +
                    "\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%(\u0001" +
                    "\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000" +
                    "\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005\u0000\u0000" +
                    "\u0001*\u0001\u0001\u0000\u0000\u0000+,\u0007\u0000\u0000\u0000,\u0003" +
                    "\u0001\u0000\u0000\u0000-.\u0005\u0002\u0000\u0000./\u0005\u0006\u0000" +
                    "\u0000/2\u0003\u0018\f\u000001\u0005\b\u0000\u000013\u0003\u001c\u000e" +
                    "\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000036\u0001\u0000" +
                    "\u0000\u000045\u0005\t\u0000\u000057\u0003\u0016\u000b\u000064\u0001\u0000" +
                    "\u0000\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005" +
                    "\u0005\u0000\u00009\u0005\u0001\u0000\u0000\u0000:;\u0005\u0002\u0000" +
                    "\u0000;<\u0005\u0007\u0000\u0000<?\u0003\u0018\f\u0000=>\u0005\t\u0000" +
                    "\u0000>@\u0003\u0016\u000b\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000" +
                    "\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u0005\u0000\u0000B\u0007" +
                    "\u0001\u0000\u0000\u0000CE\u0003\n\u0005\u0000DF\u0003\f\u0006\u0000E" +
                    "D\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000" +
                    "\u0000GH\u0003\u000e\u0007\u0000H\t\u0001\u0000\u0000\u0000IJ\u0005\u0002" +
                    "\u0000\u0000JK\u0005\n\u0000\u0000KL\u0003\u0016\u000b\u0000LP\u0005\u0005" +
                    "\u0000\u0000MO\u0003\u0002\u0001\u0000NM\u0001\u0000\u0000\u0000OR\u0001" +
                    "\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000" +
                    "Q\u000b\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0002" +
                    "\u0000\u0000TU\u0005\u000b\u0000\u0000UY\u0005\u0005\u0000\u0000VX\u0003" +
                    "\u0002\u0001\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000" +
                    "YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\r\u0001\u0000\u0000" +
                    "\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0002\u0000\u0000]_\u0005\f" +
                    "\u0000\u0000^`\u0005\n\u0000\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000" +
                    "\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0005\u0000\u0000b\u000f" +
                    "\u0001\u0000\u0000\u0000ce\u0003\u0012\t\u0000df\u0003\f\u0006\u0000e" +
                    "d\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000" +
                    "\u0000gh\u0003\u0014\n\u0000h\u0011\u0001\u0000\u0000\u0000ij\u0005\u0002" +
                    "\u0000\u0000jk\u0005\r\u0000\u0000kl\u0003\u001c\u000e\u0000lm\u0005\t" +
                    "\u0000\u0000mp\u0003\u0016\u000b\u0000no\u0005\n\u0000\u0000oq\u0003\u0016" +
                    "\u000b\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001" +
                    "\u0000\u0000\u0000rv\u0005\u0005\u0000\u0000su\u0003\u0002\u0001\u0000" +
                    "ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000" +
                    "\u0000vw\u0001\u0000\u0000\u0000w\u0013\u0001\u0000\u0000\u0000xv\u0001" +
                    "\u0000\u0000\u0000yz\u0005\u0002\u0000\u0000z|\u0005\f\u0000\u0000{}\u0005" +
                    "\r\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001" +
                    "\u0000\u0000\u0000~\u007f\u0005\u0005\u0000\u0000\u007f\u0015\u0001\u0000" +
                    "\u0000\u0000\u0080\u0081\u0003\u001a\r\u0000\u0081\u0017\u0001\u0000\u0000" +
                    "\u0000\u0082\u0087\u0003\u001c\u000e\u0000\u0083\u0084\u0007\u0001\u0000" +
                    "\u0000\u0084\u0086\u0003\u001c\u000e\u0000\u0085\u0083\u0001\u0000\u0000" +
                    "\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000" +
                    "\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0019\u0001\u0000\u0000" +
                    "\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008f\u0003\u001c\u000e" +
                    "\u0000\u008b\u008c\u0005\u000e\u0000\u0000\u008c\u008e\u0003\u001c\u000e" +
                    "\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000" +
                    "\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000" +
                    "\u0000\u0090\u001b\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000" +
                    "\u0000\u0092\u0093\u0007\u0002\u0000\u0000\u0093\u001d\u0001\u0000\u0000" +
                    "\u0000\u000f$&26?EPY_epv|\u0087\u008f";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}