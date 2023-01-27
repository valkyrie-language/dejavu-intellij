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
            TEMPLATE_LX = 1, TEMPLATE_L = 2, TEXT_SPACE = 3, TEXT = 4, TEMPLATE_R = 5, KW_FOR = 6,
            KW_AS = 7, KW_IN = 8, WHITE_SPACE = 9, ERROR_CHARACTAR = 10;
    public static final int
            RULE_program = 0, RULE_template = 1;

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "template"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'<<%'", "'<%'", null, null, "'%>'", "'for'", "'as'", "'in'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "TEMPLATE_LX", "TEMPLATE_L", "TEXT_SPACE", "TEXT", "TEMPLATE_R",
                "KW_FOR", "KW_AS", "KW_IN", "WHITE_SPACE", "ERROR_CHARACTAR"
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

        public List<TemplateContext> template() {
            return getRuleContexts(TemplateContext.class);
        }

        public TemplateContext template(int i) {
            return getRuleContext(TemplateContext.class, i);
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
                setState(10);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
                    {
                        setState(8);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case TEMPLATE_LX: {
                                setState(4);
                                match(TEMPLATE_LX);
                            }
                            break;
                            case TEMPLATE_L: {
                                setState(5);
                                template();
                            }
                            break;
                            case TEXT_SPACE: {
                                setState(6);
                                match(TEXT_SPACE);
                            }
                            break;
                            case TEXT: {
                                setState(7);
                                match(TEXT);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(12);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(13);
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
    public static class TemplateContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(NexusAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(NexusAntlrParser.TEMPLATE_R, 0);
        }

        public TemplateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_template;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).enterTemplate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NexusAntlrListener) ((NexusAntlrListener) listener).exitTemplate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NexusAntlrVisitor)
                return ((NexusAntlrVisitor<? extends T>) visitor).visitTemplate(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TemplateContext template() throws RecognitionException {
        TemplateContext _localctx = new TemplateContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_template);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(15);
                match(TEMPLATE_L);
                setState(16);
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

    public static final String _serializedATN =
            "\u0004\u0001\n\u0013\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001" +
                    "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\t\b\u0000\n\u0000" +
                    "\f\u0000\f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0014\u0000" +
                    "\n\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004\t" +
                    "\u0005\u0001\u0000\u0000\u0005\t\u0003\u0002\u0001\u0000\u0006\t\u0005" +
                    "\u0003\u0000\u0000\u0007\t\u0005\u0004\u0000\u0000\b\u0004\u0001\u0000" +
                    "\u0000\u0000\b\u0005\u0001\u0000\u0000\u0000\b\u0006\u0001\u0000\u0000" +
                    "\u0000\b\u0007\u0001\u0000\u0000\u0000\t\f\u0001\u0000\u0000\u0000\n\b" +
                    "\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b\r\u0001" +
                    "\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000\r\u000e\u0005\u0000\u0000" +
                    "\u0001\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0002\u0000" +
                    "\u0000\u0010\u0011\u0005\u0005\u0000\u0000\u0011\u0003\u0001\u0000\u0000" +
                    "\u0000\u0002\b\n";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}