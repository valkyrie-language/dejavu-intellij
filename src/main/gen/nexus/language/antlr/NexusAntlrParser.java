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

import java.util.ArrayList;
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
            TEMPLATE_E = 1, TEMPLATE_L = 2, TEXT_SPACE = 3, TEXT = 4, TEMPLATE_R = 5, DOT = 6,
            COMMA = 7, KW_IMPORT = 8, KW_CLASS = 9, KW_AS = 10, KW_IN = 11, KW_IF = 12, KW_ELSE = 13,
            KW_END = 14, KW_FOR = 15, OP_PROPORTION = 16, PARENTHESES_L = 17, PARENTHESES_R = 18,
            BRACKET_L = 19, BRACKET_R = 20, BRACE_L = 21, BRACE_R = 22, GENERIC_L = 23, GENERIC_R = 24,
            RAW_ID = 25, UNICODE_ID = 26, WHITE_SPACE = 27, BLOCK_COMMENT = 28, ERROR_CHARACTAR = 29;
    public static final int
            RULE_program = 0, RULE_statements = 1, RULE_any_text = 2, RULE_define_import = 3,
            RULE_define_class = 4, RULE_if_statement = 5, RULE_if_begin = 6, RULE_else = 7,
            RULE_else_if = 8, RULE_if_end = 9, RULE_for_statement = 10, RULE_for_begin = 11,
            RULE_for_pattern = 12, RULE_for_end = 13, RULE_expression = 14, RULE_modifiers = 15,
            RULE_modified_identifier = 16, RULE_modified_namepath = 17, RULE_namepath_free = 18,
            RULE_namepath = 19, RULE_identifier = 20;

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "statements", "any_text", "define_import", "define_class",
                "if_statement", "if_begin", "else", "else_if", "if_end", "for_statement",
                "for_begin", "for_pattern", "for_end", "expression", "modifiers", "modified_identifier",
                "modified_namepath", "namepath_free", "namepath", "identifier"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'<<%'", "'<%'", null, null, "'%>'", "'.'", "','", "'using'", "'class'",
                "'as'", "'in'", "'if'", "'else'", "'end'", "'for'", "'::'", "'('", "')'",
                "'['", "']'", "'{'", "'}'", "'\\u27E8'", "'\\u27E9'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "TEMPLATE_E", "TEMPLATE_L", "TEXT_SPACE", "TEXT", "TEMPLATE_R",
                "DOT", "COMMA", "KW_IMPORT", "KW_CLASS", "KW_AS", "KW_IN", "KW_IF", "KW_ELSE",
                "KW_END", "KW_FOR", "OP_PROPORTION", "PARENTHESES_L", "PARENTHESES_R",
                "BRACKET_L", "BRACKET_R", "BRACE_L", "BRACE_R", "GENERIC_L", "GENERIC_R",
                "RAW_ID", "UNICODE_ID", "WHITE_SPACE", "BLOCK_COMMENT", "ERROR_CHARACTAR"
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

        public List<TerminalNode> TEMPLATE_E() {
            return getTokens(NexusAntlrParser.TEMPLATE_E);
        }

        public TerminalNode TEMPLATE_E(int i) {
            return getToken(NexusAntlrParser.TEMPLATE_E, i);
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
                setState(50);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
                    {
                        setState(48);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(42);
                                match(TEMPLATE_E);
                            }
                            break;
                            case 2: {
                                setState(43);
                                define_import();
                            }
                            break;
                            case 3: {
                                setState(44);
                                define_class();
                            }
                            break;
                            case 4: {
                                setState(45);
                                if_statement();
                            }
                            break;
                            case 5: {
                                setState(46);
                                for_statement();
                            }
                            break;
                            case 6: {
                                setState(47);
                                any_text();
                            }
                            break;
                        }
                    }
                    setState(52);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(53);
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
    public static class StatementsContext extends ParserRuleContext {
        public If_statementContext if_statement() {
            return getRuleContext(If_statementContext.class, 0);
        }

        public For_statementContext for_statement() {
            return getRuleContext(For_statementContext.class, 0);
        }

        public Any_textContext any_text() {
            return getRuleContext(Any_textContext.class, 0);
        }

        public StatementsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statements;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterStatements(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitStatements(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitStatements(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementsContext statements() throws RecognitionException {
        StatementsContext _localctx = new StatementsContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statements);
        try {
            setState(58);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(55);
                    if_statement();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(56);
                    for_statement();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(57);
                    any_text();
                }
                break;
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
        enterRule(_localctx, 4, RULE_any_text);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(60);
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
        enterRule(_localctx, 6, RULE_define_import);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(62);
                match(TEMPLATE_L);
                setState(63);
                match(KW_IMPORT);
                setState(64);
                namepath_free();
                setState(67);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_AS) {
                    {
                        setState(65);
                        match(KW_AS);
                        setState(66);
                        identifier();
                    }
                }

                setState(71);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IN) {
                    {
                        setState(69);
                        match(KW_IN);
                        setState(70);
                        expression();
                    }
                }

                setState(73);
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

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
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
        enterRule(_localctx, 8, RULE_define_class);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(75);
                match(TEMPLATE_L);
                setState(76);
                match(KW_CLASS);
                setState(77);
                namepath_free();
                setState(80);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IN) {
                    {
                        setState(78);
                        match(KW_IN);
                        setState(79);
                        identifier();
                    }
                }

                setState(82);
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

        public List<Else_ifContext> else_if() {
            return getRuleContexts(Else_ifContext.class);
        }

        public Else_ifContext else_if(int i) {
            return getRuleContext(Else_ifContext.class, i);
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
        enterRule(_localctx, 10, RULE_if_statement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(84);
                if_begin();
                setState(88);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(85);
                                else_if();
                            }
                        }
                    }
                    setState(90);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                }
                setState(92);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                    case 1: {
                        setState(91);
                        else_();
                    }
                    break;
                }
                setState(94);
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

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
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
        enterRule(_localctx, 12, RULE_if_begin);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(96);
                match(TEMPLATE_L);
                setState(97);
                match(KW_IF);
                setState(98);
                expression();
                setState(99);
                match(TEMPLATE_R);
                setState(103);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(100);
                                statements();
                            }
                        }
                    }
                    setState(105);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
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

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
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
        enterRule(_localctx, 14, RULE_else);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(106);
                match(TEMPLATE_L);
                setState(107);
                match(KW_ELSE);
                setState(108);
                match(TEMPLATE_R);
                setState(112);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(109);
                                statements();
                            }
                        }
                    }
                    setState(114);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
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
    public static class Else_ifContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(NexusAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_ELSE() {
            return getToken(NexusAntlrParser.KW_ELSE, 0);
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

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
        }

        public Else_ifContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_else_if;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterElse_if(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitElse_if(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitElse_if(this);
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
                setState(115);
                match(TEMPLATE_L);
                setState(116);
                match(KW_ELSE);
                setState(117);
                match(KW_IF);
                setState(118);
                expression();
                setState(119);
                match(TEMPLATE_R);
                setState(123);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(120);
                                statements();
                            }
                        }
                    }
                    setState(125);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
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
        enterRule(_localctx, 18, RULE_if_end);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(126);
                match(TEMPLATE_L);
                setState(127);
                match(KW_END);
                setState(129);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IF) {
                    {
                        setState(128);
                        match(KW_IF);
                    }
                }

                setState(131);
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
        enterRule(_localctx, 20, RULE_for_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(133);
                for_begin();
                setState(135);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                    case 1: {
                        setState(134);
                        else_();
                    }
                    break;
                }
                setState(137);
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

        public For_patternContext for_pattern() {
            return getRuleContext(For_patternContext.class, 0);
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

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
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
        enterRule(_localctx, 22, RULE_for_begin);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(139);
                match(TEMPLATE_L);
                setState(140);
                match(KW_FOR);
                setState(141);
                for_pattern();
                setState(142);
                match(KW_IN);
                setState(143);
                ((For_beginContext) _localctx).condition = expression();
                setState(146);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IF) {
                    {
                        setState(144);
                        match(KW_IF);
                        setState(145);
                        ((For_beginContext) _localctx).guard = expression();
                    }
                }

                setState(148);
                match(TEMPLATE_R);
                setState(152);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(149);
                                statements();
                            }
                        }
                    }
                    setState(154);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
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
    public static class For_patternContext extends ParserRuleContext {
        public TerminalNode PARENTHESES_L() {
            return getToken(NexusAntlrParser.PARENTHESES_L, 0);
        }

        public TerminalNode PARENTHESES_R() {
            return getToken(NexusAntlrParser.PARENTHESES_R, 0);
        }

        public List<Modified_identifierContext> modified_identifier() {
            return getRuleContexts(Modified_identifierContext.class);
        }

        public Modified_identifierContext modified_identifier(int i) {
            return getRuleContext(Modified_identifierContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(NexusAntlrParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(NexusAntlrParser.COMMA, i);
        }

        public For_patternContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_pattern;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterFor_pattern(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitFor_pattern(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitFor_pattern(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_patternContext for_pattern() throws RecognitionException {
        For_patternContext _localctx = new For_patternContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_for_pattern);
        int _la;
        try {
            int _alt;
            setState(182);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(155);
                    match(PARENTHESES_L);
                    setState(156);
                    match(PARENTHESES_R);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(157);
                    match(PARENTHESES_L);
                    setState(158);
                    modified_identifier();
                    setState(163);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(159);
                                    match(COMMA);
                                    setState(160);
                                    modified_identifier();
                                }
                            }
                        }
                        setState(165);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                    }
                    setState(167);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMA) {
                        {
                            setState(166);
                            match(COMMA);
                        }
                    }

                    setState(169);
                    match(PARENTHESES_R);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(171);
                    modified_identifier();
                    setState(176);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(172);
                                    match(COMMA);
                                    setState(173);
                                    modified_identifier();
                                }
                            }
                        }
                        setState(178);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                    }
                    setState(180);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMA) {
                        {
                            setState(179);
                            match(COMMA);
                        }
                    }

                }
                break;
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
        enterRule(_localctx, 26, RULE_for_end);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(184);
                match(TEMPLATE_L);
                setState(185);
                match(KW_END);
                setState(187);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_FOR) {
                    {
                        setState(186);
                        match(KW_FOR);
                    }
                }

                setState(189);
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
        enterRule(_localctx, 28, RULE_expression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(191);
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
    public static class ModifiersContext extends ParserRuleContext {
        public IdentifierContext identifier;
        public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public ModifiersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_modifiers;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterModifiers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitModifiers(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitModifiers(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ModifiersContext modifiers() throws RecognitionException {
        ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_modifiers);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(196);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == RAW_ID || _la == UNICODE_ID) {
                    {
                        {
                            setState(193);
                            ((ModifiersContext) _localctx).identifier = identifier();
                            ((ModifiersContext) _localctx).mods.add(((ModifiersContext) _localctx).identifier);
                        }
                    }
                    setState(198);
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
    public static class Modified_identifierContext extends ParserRuleContext {
        public IdentifierContext identifier;
        public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
        public IdentifierContext id;

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public Modified_identifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_modified_identifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterModified_identifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitModified_identifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitModified_identifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Modified_identifierContext modified_identifier() throws RecognitionException {
        Modified_identifierContext _localctx = new Modified_identifierContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_modified_identifier);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(202);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(199);
                                ((Modified_identifierContext) _localctx).identifier = identifier();
                                ((Modified_identifierContext) _localctx).mods.add(((Modified_identifierContext) _localctx).identifier);
                            }
                        }
                    }
                    setState(204);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
                }
                setState(205);
                ((Modified_identifierContext) _localctx).id = identifier();
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
    public static class Modified_namepathContext extends ParserRuleContext {
        public IdentifierContext identifier;
        public List<IdentifierContext> mods = new ArrayList<IdentifierContext>();
        public List<IdentifierContext> path = new ArrayList<IdentifierContext>();

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

        public Modified_namepathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_modified_namepath;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterModified_namepath(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitModified_namepath(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitModified_namepath(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Modified_namepathContext modified_namepath() throws RecognitionException {
        Modified_namepathContext _localctx = new Modified_namepathContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_modified_namepath);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(210);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(207);
                                ((Modified_namepathContext) _localctx).identifier = identifier();
                                ((Modified_namepathContext) _localctx).mods.add(((Modified_namepathContext) _localctx).identifier);
                            }
                        }
                    }
                    setState(212);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 23, _ctx);
                }
                setState(213);
                ((Modified_namepathContext) _localctx).identifier = identifier();
                ((Modified_namepathContext) _localctx).path.add(((Modified_namepathContext) _localctx).identifier);
                setState(218);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OP_PROPORTION) {
                    {
                        {
                            setState(214);
                            match(OP_PROPORTION);
                            setState(215);
                            ((Modified_namepathContext) _localctx).identifier = identifier();
                            ((Modified_namepathContext) _localctx).path.add(((Modified_namepathContext) _localctx).identifier);
                        }
                    }
                    setState(220);
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
        enterRule(_localctx, 36, RULE_namepath_free);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(221);
                identifier();
                setState(226);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == DOT || _la == OP_PROPORTION) {
                    {
                        {
                            setState(222);
                            _la = _input.LA(1);
                            if (!(_la == DOT || _la == OP_PROPORTION)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(223);
                            identifier();
                        }
                    }
                    setState(228);
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
        enterRule(_localctx, 38, RULE_namepath);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(229);
                identifier();
                setState(234);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OP_PROPORTION) {
                    {
                        {
                            setState(230);
                            match(OP_PROPORTION);
                            setState(231);
                            identifier();
                        }
                    }
                    setState(236);
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
        enterRule(_localctx, 40, RULE_identifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(237);
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
            "\u0004\u0001\u001d\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001" +
                    "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004" +
                    "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007" +
                    "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b" +
                    "\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007" +
                    "\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007" +
                    "\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001" +
                    "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00001\b" +
                    "\u0000\n\u0000\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0001\u0002\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b" +
                    "\u0003\u0001\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0003\u0001" +
                    "\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003" +
                    "\u0004Q\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005" +
                    "\u0005W\b\u0005\n\u0005\f\u0005Z\t\u0005\u0001\u0005\u0003\u0005]\b\u0005" +
                    "\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
                    "\u0001\u0006\u0005\u0006f\b\u0006\n\u0006\f\u0006i\t\u0006\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007o\b\u0007\n\u0007\f\u0007" +
                    "r\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bz\b\b" +
                    "\n\b\f\b}\t\b\u0001\t\u0001\t\u0001\t\u0003\t\u0082\b\t\u0001\t\u0001" +
                    "\t\u0001\n\u0001\n\u0003\n\u0088\b\n\u0001\n\u0001\n\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003" +
                    "\u000b\u0093\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0097\b\u000b" +
                    "\n\u000b\f\u000b\u009a\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f" +
                    "\u0001\f\u0005\f\u00a2\b\f\n\f\f\f\u00a5\t\f\u0001\f\u0003\f\u00a8\b\f" +
                    "\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00af\b\f\n\f\f\f\u00b2" +
                    "\t\f\u0001\f\u0003\f\u00b5\b\f\u0003\f\u00b7\b\f\u0001\r\u0001\r\u0001" +
                    "\r\u0003\r\u00bc\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f" +
                    "\u0005\u000f\u00c3\b\u000f\n\u000f\f\u000f\u00c6\t\u000f\u0001\u0010\u0005" +
                    "\u0010\u00c9\b\u0010\n\u0010\f\u0010\u00cc\t\u0010\u0001\u0010\u0001\u0010" +
                    "\u0001\u0011\u0005\u0011\u00d1\b\u0011\n\u0011\f\u0011\u00d4\t\u0011\u0001" +
                    "\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d9\b\u0011\n\u0011\f\u0011" +
                    "\u00dc\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00e1\b" +
                    "\u0012\n\u0012\f\u0012\u00e4\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013" +
                    "\u0005\u0013\u00e9\b\u0013\n\u0013\f\u0013\u00ec\t\u0013\u0001\u0014\u0001" +
                    "\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e" +
                    "\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0003\u0001" +
                    "\u0000\u0003\u0004\u0002\u0000\u0006\u0006\u0010\u0010\u0001\u0000\u0019" +
                    "\u001a\u00fb\u00002\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000" +
                    "\u0004<\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bK\u0001" +
                    "\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000" +
                    "\u000ej\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012~" +
                    "\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u008b" +
                    "\u0001\u0000\u0000\u0000\u0018\u00b6\u0001\u0000\u0000\u0000\u001a\u00b8" +
                    "\u0001\u0000\u0000\u0000\u001c\u00bf\u0001\u0000\u0000\u0000\u001e\u00c4" +
                    "\u0001\u0000\u0000\u0000 \u00ca\u0001\u0000\u0000\u0000\"\u00d2\u0001" +
                    "\u0000\u0000\u0000$\u00dd\u0001\u0000\u0000\u0000&\u00e5\u0001\u0000\u0000" +
                    "\u0000(\u00ed\u0001\u0000\u0000\u0000*1\u0005\u0001\u0000\u0000+1\u0003" +
                    "\u0006\u0003\u0000,1\u0003\b\u0004\u0000-1\u0003\n\u0005\u0000.1\u0003" +
                    "\u0014\n\u0000/1\u0003\u0004\u0002\u00000*\u0001\u0000\u0000\u00000+\u0001" +
                    "\u0000\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u0000" +
                    "0.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000" +
                    "\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000" +
                    "\u0000\u000042\u0001\u0000\u0000\u000056\u0005\u0000\u0000\u00016\u0001" +
                    "\u0001\u0000\u0000\u00007;\u0003\n\u0005\u00008;\u0003\u0014\n\u00009" +
                    ";\u0003\u0004\u0002\u0000:7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000" +
                    "\u0000:9\u0001\u0000\u0000\u0000;\u0003\u0001\u0000\u0000\u0000<=\u0007" +
                    "\u0000\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005\u0002\u0000" +
                    "\u0000?@\u0005\b\u0000\u0000@C\u0003$\u0012\u0000AB\u0005\n\u0000\u0000" +
                    "BD\u0003(\u0014\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000" +
                    "DG\u0001\u0000\u0000\u0000EF\u0005\u000b\u0000\u0000FH\u0003\u001c\u000e" +
                    "\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000" +
                    "\u0000\u0000IJ\u0005\u0005\u0000\u0000J\u0007\u0001\u0000\u0000\u0000" +
                    "KL\u0005\u0002\u0000\u0000LM\u0005\t\u0000\u0000MP\u0003$\u0012\u0000" +
                    "NO\u0005\u000b\u0000\u0000OQ\u0003(\u0014\u0000PN\u0001\u0000\u0000\u0000" +
                    "PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\u0005\u0000" +
                    "\u0000S\t\u0001\u0000\u0000\u0000TX\u0003\f\u0006\u0000UW\u0003\u0010" +
                    "\b\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000" +
                    "\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001" +
                    "\u0000\u0000\u0000[]\u0003\u000e\u0007\u0000\\[\u0001\u0000\u0000\u0000" +
                    "\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0003\u0012\t" +
                    "\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0005\u0002\u0000\u0000ab\u0005" +
                    "\f\u0000\u0000bc\u0003\u001c\u000e\u0000cg\u0005\u0005\u0000\u0000df\u0003" +
                    "\u0002\u0001\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000" +
                    "ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\r\u0001\u0000\u0000" +
                    "\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0002\u0000\u0000kl\u0005\r\u0000" +
                    "\u0000lp\u0005\u0005\u0000\u0000mo\u0003\u0002\u0001\u0000nm\u0001\u0000" +
                    "\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001" +
                    "\u0000\u0000\u0000q\u000f\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000" +
                    "\u0000st\u0005\u0002\u0000\u0000tu\u0005\r\u0000\u0000uv\u0005\f\u0000" +
                    "\u0000vw\u0003\u001c\u000e\u0000w{\u0005\u0005\u0000\u0000xz\u0003\u0002" +
                    "\u0001\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001" +
                    "\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0011\u0001\u0000\u0000" +
                    "\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\u0002\u0000\u0000\u007f" +
                    "\u0081\u0005\u000e\u0000\u0000\u0080\u0082\u0005\f\u0000\u0000\u0081\u0080" +
                    "\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083" +
                    "\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0005\u0000\u0000\u0084\u0013" +
                    "\u0001\u0000\u0000\u0000\u0085\u0087\u0003\u0016\u000b\u0000\u0086\u0088" +
                    "\u0003\u000e\u0007\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088" +
                    "\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a" +
                    "\u0003\u001a\r\u0000\u008a\u0015\u0001\u0000\u0000\u0000\u008b\u008c\u0005" +
                    "\u0002\u0000\u0000\u008c\u008d\u0005\u000f\u0000\u0000\u008d\u008e\u0003" +
                    "\u0018\f\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u0092\u0003\u001c" +
                    "\u000e\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u0093\u0003\u001c\u000e" +
                    "\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000" +
                    "\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0098\u0005\u0005\u0000" +
                    "\u0000\u0095\u0097\u0003\u0002\u0001\u0000\u0096\u0095\u0001\u0000\u0000" +
                    "\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000" +
                    "\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0017\u0001\u0000\u0000" +
                    "\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0011\u0000" +
                    "\u0000\u009c\u00b7\u0005\u0012\u0000\u0000\u009d\u009e\u0005\u0011\u0000" +
                    "\u0000\u009e\u00a3\u0003 \u0010\u0000\u009f\u00a0\u0005\u0007\u0000\u0000" +
                    "\u00a0\u00a2\u0003 \u0010\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2" +
                    "\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3" +
                    "\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5" +
                    "\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0007\u0000\u0000\u00a7" +
                    "\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8" +
                    "\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0012\u0000\u0000\u00aa" +
                    "\u00b7\u0001\u0000\u0000\u0000\u00ab\u00b0\u0003 \u0010\u0000\u00ac\u00ad" +
                    "\u0005\u0007\u0000\u0000\u00ad\u00af\u0003 \u0010\u0000\u00ae\u00ac\u0001" +
                    "\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001" +
                    "\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001" +
                    "\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005" +
                    "\u0007\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001" +
                    "\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u009b\u0001" +
                    "\u0000\u0000\u0000\u00b6\u009d\u0001\u0000\u0000\u0000\u00b6\u00ab\u0001" +
                    "\u0000\u0000\u0000\u00b7\u0019\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005" +
                    "\u0002\u0000\u0000\u00b9\u00bb\u0005\u000e\u0000\u0000\u00ba\u00bc\u0005" +
                    "\u000f\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001" +
                    "\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0005" +
                    "\u0005\u0000\u0000\u00be\u001b\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003" +
                    "&\u0013\u0000\u00c0\u001d\u0001\u0000\u0000\u0000\u00c1\u00c3\u0003(\u0014" +
                    "\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000" +
                    "\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000" +
                    "\u0000\u00c5\u001f\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000" +
                    "\u0000\u00c7\u00c9\u0003(\u0014\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000" +
                    "\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000" +
                    "\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000" +
                    "\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003(\u0014\u0000\u00ce" +
                    "!\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003(\u0014\u0000\u00d0\u00cf\u0001" +
                    "\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001" +
                    "\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001" +
                    "\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00da\u0003" +
                    "(\u0014\u0000\u00d6\u00d7\u0005\u0010\u0000\u0000\u00d7\u00d9\u0003(\u0014" +
                    "\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000" +
                    "\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000" +
                    "\u0000\u00db#\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000" +
                    "\u00dd\u00e2\u0003(\u0014\u0000\u00de\u00df\u0007\u0001\u0000\u0000\u00df" +
                    "\u00e1\u0003(\u0014\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4" +
                    "\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3" +
                    "\u0001\u0000\u0000\u0000\u00e3%\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001" +
                    "\u0000\u0000\u0000\u00e5\u00ea\u0003(\u0014\u0000\u00e6\u00e7\u0005\u0010" +
                    "\u0000\u0000\u00e7\u00e9\u0003(\u0014\u0000\u00e8\u00e6\u0001\u0000\u0000" +
                    "\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000" +
                    "\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\'\u0001\u0000\u0000\u0000" +
                    "\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007\u0002\u0000\u0000" +
                    "\u00ee)\u0001\u0000\u0000\u0000\u001b02:CGPX\\gp{\u0081\u0087\u0092\u0098" +
                    "\u00a3\u00a7\u00b0\u00b4\u00b6\u00bb\u00c4\u00ca\u00d2\u00da\u00e2\u00ea";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}