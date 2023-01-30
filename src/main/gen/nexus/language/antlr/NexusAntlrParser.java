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
            KW_CLASS = 7, KW_AS = 8, KW_IN = 9, KW_If = 10, KW_ELSE = 11, KW_END = 12, KW_FOR = 13,
            OP_PROPORTION = 14, DOT = 15, PARENTHESES_L = 16, PARENTHESES_R = 17, BRACKET_L = 18,
            BRACKET_R = 19, BRACE_L = 20, BRACE_R = 21, GENERIC_L = 22, GENERIC_R = 23, RAW_ID = 24,
            UNICODE_ID = 25, WHITE_SPACE = 26, BLOCK_COMMENT = 27, ERROR_CHARACTAR = 28;
    public static final int
            RULE_program = 0, RULE_define_import = 1, RULE_define_class = 2, RULE_namepath_free = 3,
            RULE_namepath = 4, RULE_identifier = 5;

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "define_import", "define_class", "namepath_free", "namepath",
                "identifier"
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
                "KW_IMPORT", "KW_CLASS", "KW_AS", "KW_IN", "KW_If", "KW_ELSE", "KW_END",
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

        public List<TerminalNode> TEXT_SPACE() {
            return getTokens(NexusAntlrParser.TEXT_SPACE);
        }

        public TerminalNode TEXT_SPACE(int i) {
            return getToken(NexusAntlrParser.TEXT_SPACE, i);
        }

        public List<TerminalNode> TEXT() {
            return getTokens(NexusAntlrParser.TEXT);
        }

        public TerminalNode TEXT(int i) {
            return getToken(NexusAntlrParser.TEXT, i);
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
                setState(19);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
                    {
                        setState(17);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(12);
                                match(TEMPLATE_LX);
                            }
                            break;
                            case 2: {
                                setState(13);
                                define_import();
                            }
                            break;
                            case 3: {
                                setState(14);
                                define_class();
                            }
                            break;
                            case 4: {
                                setState(15);
                                match(TEXT_SPACE);
                            }
                            break;
                            case 5: {
                                setState(16);
                                match(TEXT);
                            }
                            break;
                        }
                    }
                    setState(21);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(22);
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

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode KW_IN() {
            return getToken(NexusAntlrParser.KW_IN, 0);
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
        enterRule(_localctx, 2, RULE_define_import);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(24);
                match(TEMPLATE_L);
                setState(25);
                match(KW_IMPORT);
                setState(26);
                namepath_free();
                setState(29);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_AS) {
                    {
                        setState(27);
                        match(KW_AS);
                        setState(28);
                        identifier();
                    }
                }

                setState(33);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IN) {
                    {
                        setState(31);
                        match(KW_IN);
                        setState(32);
                        identifier();
                    }
                }

                setState(35);
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
        enterRule(_localctx, 4, RULE_define_class);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(37);
                match(TEMPLATE_L);
                setState(38);
                match(KW_CLASS);
                setState(39);
                namepath_free();
                setState(42);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IN) {
                    {
                        setState(40);
                        match(KW_IN);
                        setState(41);
                        identifier();
                    }
                }

                setState(44);
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
        enterRule(_localctx, 6, RULE_namepath_free);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(46);
                identifier();
                setState(51);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OP_PROPORTION || _la == DOT) {
                    {
                        {
                            setState(47);
                            _la = _input.LA(1);
                            if (!(_la == OP_PROPORTION || _la == DOT)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(48);
                            identifier();
                        }
                    }
                    setState(53);
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
        enterRule(_localctx, 8, RULE_namepath);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(54);
                identifier();
                setState(59);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OP_PROPORTION) {
                    {
                        {
                            setState(55);
                            match(OP_PROPORTION);
                            setState(56);
                            identifier();
                        }
                    }
                    setState(61);
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
        enterRule(_localctx, 10, RULE_identifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(62);
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
            "\u0004\u0001\u001cA\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001" +
                    "\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0003\u0001\u001e\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0003\u0002+\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0005\u00032\b\u0003\n\u0003\f\u00035\t\u0003" +
                    "\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004:\b\u0004\n\u0004\f\u0004" +
                    "=\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000" +
                    "\u0002\u0004\u0006\b\n\u0000\u0002\u0001\u0000\u000e\u000f\u0001\u0000" +
                    "\u0018\u0019D\u0000\u0013\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000" +
                    "\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000" +
                    "\b6\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000\u0000\f\u0012\u0005\u0001" +
                    "\u0000\u0000\r\u0012\u0003\u0002\u0001\u0000\u000e\u0012\u0003\u0004\u0002" +
                    "\u0000\u000f\u0012\u0005\u0003\u0000\u0000\u0010\u0012\u0005\u0004\u0000" +
                    "\u0000\u0011\f\u0001\u0000\u0000\u0000\u0011\r\u0001\u0000\u0000\u0000" +
                    "\u0011\u000e\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000" +
                    "\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000" +
                    "\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000" +
                    "\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000" +
                    "\u0016\u0017\u0005\u0000\u0000\u0001\u0017\u0001\u0001\u0000\u0000\u0000" +
                    "\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0005\u0006\u0000\u0000" +
                    "\u001a\u001d\u0003\u0006\u0003\u0000\u001b\u001c\u0005\b\u0000\u0000\u001c" +
                    "\u001e\u0003\n\u0005\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e" +
                    "\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f \u0005\t" +
                    "\u0000\u0000 \"\u0003\n\u0005\u0000!\u001f\u0001\u0000\u0000\u0000!\"" +
                    "\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\u0005\u0000" +
                    "\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0005\u0002\u0000\u0000&\'\u0005" +
                    "\u0007\u0000\u0000\'*\u0003\u0006\u0003\u0000()\u0005\t\u0000\u0000)+" +
                    "\u0003\n\u0005\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000" +
                    "+,\u0001\u0000\u0000\u0000,-\u0005\u0005\u0000\u0000-\u0005\u0001\u0000" +
                    "\u0000\u0000.3\u0003\n\u0005\u0000/0\u0007\u0000\u0000\u000002\u0003\n" +
                    "\u0005\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001" +
                    "\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000" +
                    "\u000053\u0001\u0000\u0000\u00006;\u0003\n\u0005\u000078\u0005\u000e\u0000" +
                    "\u00008:\u0003\n\u0005\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000" +
                    "\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\t\u0001\u0000" +
                    "\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0007\u0001\u0000\u0000?\u000b" +
                    "\u0001\u0000\u0000\u0000\u0007\u0011\u0013\u001d!*3;";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
	}
}