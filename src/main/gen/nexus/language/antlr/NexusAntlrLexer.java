// Generated from C:/Users/Dell/IdeaProjects/nexus-intellij/src/main/antlr/NexusAntlrLexer.g4 by ANTLR 4.13.1
package nexus.language.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class NexusAntlrLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            TEMPLATE_LX = 1, TEMPLATE_L = 2, TEXT_SPACE = 3, TEXT = 4, TEMPLATE_R = 5, KW_FOR = 6,
            KW_AS = 7, KW_IN = 8, PARENTHESES_L = 9, PARENTHESES_R = 10, BRACKET_L = 11, BRACKET_R = 12,
            BRACE_L = 13, BRACE_R = 14, GENERIC_L = 15, GENERIC_R = 16, WHITE_SPACE = 17, BLOCK_COMMENT = 18,
            ERROR_CHARACTAR = 19;
    public static final int
            TEMPLATE_MODE = 1;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE", "TEMPLATE_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "TEMPLATE_LX", "TEMPLATE_L", "TEXT_SPACE", "TEXT", "TEMPLATE_R", "KW_FOR",
                "KW_AS", "KW_IN", "PARENTHESES_L", "PARENTHESES_R", "BRACKET_L", "BRACKET_R",
                "BRACE_L", "BRACE_R", "GENERIC_L", "GENERIC_R", "WHITE_SPACE", "BLOCK_COMMENT",
                "ERROR_CHARACTAR"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'<<%'", "'<%'", null, null, "'%>'", "'for'", "'as'", "'in'", "'('",
                "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "TEMPLATE_LX", "TEMPLATE_L", "TEXT_SPACE", "TEXT", "TEMPLATE_R",
                "KW_FOR", "KW_AS", "KW_IN", "PARENTHESES_L", "PARENTHESES_R", "BRACKET_L",
                "BRACKET_R", "BRACE_L", "BRACE_R", "GENERIC_L", "GENERIC_R", "WHITE_SPACE",
                "BLOCK_COMMENT", "ERROR_CHARACTAR"
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


    public NexusAntlrLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "NexusAntlrLexer.g4";
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\u0004\u0000\u0013k\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007" +
                    "\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007" +
                    "\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007" +
                    "\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n" +
                    "\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002" +
                    "\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002" +
                    "\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001" +
                    "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0002\u0004\u00023\b\u0002\u000b\u0002\f\u00024\u0001\u0003" +
                    "\u0004\u00038\b\u0003\u000b\u0003\f\u00039\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001" +
                    "\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001" +
                    "\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f" +
                    "\u0001\u000f\u0001\u0010\u0004\u0010\\\b\u0010\u000b\u0010\f\u0010]\u0001" +
                    "\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011d\b\u0011\u000b" +
                    "\u0011\f\u0011e\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0002" +
                    "9e\u0000\u0013\u0002\u0001\u0004\u0002\u0006\u0003\b\u0004\n\u0005\f\u0006" +
                    "\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016\u000b\u0018\f\u001a\r\u001c" +
                    "\u000e\u001e\u000f \u0010\"\u0011$\u0012&\u0013\u0002\u0000\u0001\u0002" +
                    "\n\u0000\t\r  \u0085\u0085\u00a0\u00a0\u1680\u1680\u2000\u200a\u2028\u2029" +
                    "\u202f\u202f\u205f\u205f\u3000\u3000\u0002\u0000%%^^m\u0000\u0002\u0001" +
                    "\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001" +
                    "\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000\u0001\n\u0001\u0000" +
                    "\u0000\u0000\u0001\f\u0001\u0000\u0000\u0000\u0001\u000e\u0001\u0000\u0000" +
                    "\u0000\u0001\u0010\u0001\u0000\u0000\u0000\u0001\u0012\u0001\u0000\u0000" +
                    "\u0000\u0001\u0014\u0001\u0000\u0000\u0000\u0001\u0016\u0001\u0000\u0000" +
                    "\u0000\u0001\u0018\u0001\u0000\u0000\u0000\u0001\u001a\u0001\u0000\u0000" +
                    "\u0000\u0001\u001c\u0001\u0000\u0000\u0000\u0001\u001e\u0001\u0000\u0000" +
                    "\u0000\u0001 \u0001\u0000\u0000\u0000\u0001\"\u0001\u0000\u0000\u0000" +
                    "\u0001$\u0001\u0000\u0000\u0000\u0001&\u0001\u0000\u0000\u0000\u0002(" +
                    "\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00062\u0001\u0000" +
                    "\u0000\u0000\b7\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\f@" +
                    "\u0001\u0000\u0000\u0000\u000eD\u0001\u0000\u0000\u0000\u0010G\u0001\u0000" +
                    "\u0000\u0000\u0012J\u0001\u0000\u0000\u0000\u0014L\u0001\u0000\u0000\u0000" +
                    "\u0016N\u0001\u0000\u0000\u0000\u0018P\u0001\u0000\u0000\u0000\u001aR" +
                    "\u0001\u0000\u0000\u0000\u001cT\u0001\u0000\u0000\u0000\u001eV\u0001\u0000" +
                    "\u0000\u0000 X\u0001\u0000\u0000\u0000\"[\u0001\u0000\u0000\u0000$a\u0001" +
                    "\u0000\u0000\u0000&g\u0001\u0000\u0000\u0000()\u0005<\u0000\u0000)*\u0005" +
                    "<\u0000\u0000*+\u0005%\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005" +
                    "<\u0000\u0000-.\u0005%\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0001" +
                    "\u0000\u00000\u0005\u0001\u0000\u0000\u000013\u0007\u0000\u0000\u0000" +
                    "21\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000" +
                    "\u000045\u0001\u0000\u0000\u00005\u0007\u0001\u0000\u0000\u000068\t\u0000" +
                    "\u0000\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0001" +
                    "\u0000\u0000\u000097\u0001\u0000\u0000\u0000:\t\u0001\u0000\u0000\u0000" +
                    ";<\u0005%\u0000\u0000<=\u0005>\u0000\u0000=>\u0001\u0000\u0000\u0000>" +
                    "?\u0006\u0004\u0001\u0000?\u000b\u0001\u0000\u0000\u0000@A\u0005f\u0000" +
                    "\u0000AB\u0005o\u0000\u0000BC\u0005r\u0000\u0000C\r\u0001\u0000\u0000" +
                    "\u0000DE\u0005a\u0000\u0000EF\u0005s\u0000\u0000F\u000f\u0001\u0000\u0000" +
                    "\u0000GH\u0005i\u0000\u0000HI\u0005n\u0000\u0000I\u0011\u0001\u0000\u0000" +
                    "\u0000JK\u0005(\u0000\u0000K\u0013\u0001\u0000\u0000\u0000LM\u0005)\u0000" +
                    "\u0000M\u0015\u0001\u0000\u0000\u0000NO\u0005[\u0000\u0000O\u0017\u0001" +
                    "\u0000\u0000\u0000PQ\u0005]\u0000\u0000Q\u0019\u0001\u0000\u0000\u0000" +
                    "RS\u0005{\u0000\u0000S\u001b\u0001\u0000\u0000\u0000TU\u0005}\u0000\u0000" +
                    "U\u001d\u0001\u0000\u0000\u0000VW\u0005<\u0000\u0000W\u001f\u0001\u0000" +
                    "\u0000\u0000XY\u0005>\u0000\u0000Y!\u0001\u0000\u0000\u0000Z\\\u0007\u0000" +
                    "\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001" +
                    "\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000" +
                    "_`\u0006\u0010\u0002\u0000`#\u0001\u0000\u0000\u0000ac\u0005#\u0000\u0000" +
                    "bd\u0007\u0001\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000" +
                    "\u0000ef\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000f%\u0001\u0000" +
                    "\u0000\u0000gh\t\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0006\u0012" +
                    "\u0002\u0000j\'\u0001\u0000\u0000\u0000\u0006\u0000\u000149]e\u0003\u0002" +
                    "\u0001\u0000\u0002\u0000\u0000\u0000\u0001\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}