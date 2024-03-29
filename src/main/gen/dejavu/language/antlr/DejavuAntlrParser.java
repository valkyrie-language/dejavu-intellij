// Generated from C:/Users/Dell/IdeaProjects/nexus-intellij/src/main/antlr/DejavuAntlr.g4 by ANTLR 4.13.1
package dejavu.language.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DejavuAntlrParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            TEMPLATE_E = 1, TEMPLATE_L = 2, TEXT_SPACE = 3, TEXT_WORD = 4, TEXT = 5, TEMPLATE_R = 6,
            DOT = 7, COMMA = 8, COLON = 9, OP_NOT = 10, OP_ADD = 11, OP_SUB = 12, KW_EXPORT = 13,
            KW_IMPORT = 14, KW_AS = 15, KW_IN = 16, KW_IF = 17, KW_ELSE = 18, KW_END = 19, KW_FOR = 20,
            KW_MATCH = 21, KW_CASE = 22, KW_WITH = 23, KW_SLOT = 24, KW_APPLY = 25, KW_BREAK = 26,
            KW_CONTINUE = 27, OP_PROPORTION = 28, PARENTHESES_L = 29, PARENTHESES_R = 30,
            BRACKET_L = 31, BRACKET_R = 32, BRACE_L = 33, BRACE_R = 34, GENERIC_L = 35, GENERIC_R = 36,
            RAW_ID = 37, UNICODE_ID = 38, WHITE_SPACE = 39, BLOCK_COMMENT = 40, ERROR_CHARACTAR = 41;
    public static final int
            RULE_program = 0, RULE_statements = 1, RULE_any_text = 2, RULE_ie_template = 3,
            RULE_define_import = 4, RULE_import_block = 5, RULE_import_item = 6, RULE_define_export = 7,
            RULE_if_template = 8, RULE_if_then = 9, RULE_else_then = 10, RULE_else_if = 11,
            RULE_if_end = 12, RULE_for_template = 13, RULE_for_begin = 14, RULE_for_pattern = 15,
            RULE_for_end = 16, RULE_control_template = 17, RULE_control_statement = 18,
            RULE_slot_statement = 19, RULE_slot_begin = 20, RULE_slot_end = 21, RULE_apply_statement = 22,
            RULE_apply_begin = 23, RULE_apply_end = 24, RULE_match_statement = 25,
            RULE_match_begin = 26, RULE_case_branch = 27, RULE_match_end = 28, RULE_any_expression = 29,
            RULE_expression = 30, RULE_term = 31, RULE_atom = 32, RULE_prefix = 33,
            RULE_infix = 34, RULE_suffix = 35, RULE_dot_call = 36, RULE_call_term = 37,
            RULE_modifiers = 38, RULE_modified_identifier = 39, RULE_modified_namepath = 40,
            RULE_namepath_free = 41, RULE_namepath = 42, RULE_identifier = 43;

    private static String[] makeRuleNames() {
        return new String[]{
                "program", "statements", "any_text", "ie_template", "define_import",
                "import_block", "import_item", "define_export", "if_template", "if_then",
                "else_then", "else_if", "if_end", "for_template", "for_begin", "for_pattern",
                "for_end", "control_template", "control_statement", "slot_statement",
                "slot_begin", "slot_end", "apply_statement", "apply_begin", "apply_end",
                "match_statement", "match_begin", "case_branch", "match_end", "any_expression",
                "expression", "term", "atom", "prefix", "infix", "suffix", "dot_call",
                "call_term", "modifiers", "modified_identifier", "modified_namepath",
                "namepath_free", "namepath", "identifier"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'<%!'", null, null, null, null, null, "'.'", "','", "':'", "'!'",
                "'+'", "'-'", "'export'", "'import'", "'as'", "'in'", "'if'", "'else'",
                "'end'", "'for'", "'match'", "'case'", "'with'", "'block'", "'apply'",
                "'break'", "'continue'", "'::'", "'('", "')'", "'['", "']'", "'{'", "'}'",
                "'\\u27E8'", "'\\u27E9'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "TEMPLATE_E", "TEMPLATE_L", "TEXT_SPACE", "TEXT_WORD", "TEXT",
                "TEMPLATE_R", "DOT", "COMMA", "COLON", "OP_NOT", "OP_ADD", "OP_SUB",
                "KW_EXPORT", "KW_IMPORT", "KW_AS", "KW_IN", "KW_IF", "KW_ELSE", "KW_END",
                "KW_FOR", "KW_MATCH", "KW_CASE", "KW_WITH", "KW_SLOT", "KW_APPLY", "KW_BREAK",
                "KW_CONTINUE", "OP_PROPORTION", "PARENTHESES_L", "PARENTHESES_R", "BRACKET_L",
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
        return "DejavuAntlr.g4";
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

    public DejavuAntlrParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ProgramContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(DejavuAntlrParser.EOF, 0);
        }

        public List<TerminalNode> TEMPLATE_E() {
            return getTokens(DejavuAntlrParser.TEMPLATE_E);
        }

        public TerminalNode TEMPLATE_E(int i) {
            return getToken(DejavuAntlrParser.TEMPLATE_E, i);
        }

        public List<Ie_templateContext> ie_template() {
            return getRuleContexts(Ie_templateContext.class);
        }

        public Ie_templateContext ie_template(int i) {
            return getRuleContext(Ie_templateContext.class, i);
        }

        public List<If_templateContext> if_template() {
            return getRuleContexts(If_templateContext.class);
        }

        public If_templateContext if_template(int i) {
            return getRuleContext(If_templateContext.class, i);
        }

        public List<For_templateContext> for_template() {
            return getRuleContexts(For_templateContext.class);
        }

        public For_templateContext for_template(int i) {
            return getRuleContext(For_templateContext.class, i);
        }

        public List<Slot_statementContext> slot_statement() {
            return getRuleContexts(Slot_statementContext.class);
        }

        public Slot_statementContext slot_statement(int i) {
            return getRuleContext(Slot_statementContext.class, i);
        }

        public List<Apply_statementContext> apply_statement() {
            return getRuleContexts(Apply_statementContext.class);
        }

        public Apply_statementContext apply_statement(int i) {
            return getRuleContext(Apply_statementContext.class, i);
        }

        public List<Match_statementContext> match_statement() {
            return getRuleContexts(Match_statementContext.class);
        }

        public Match_statementContext match_statement(int i) {
            return getRuleContext(Match_statementContext.class, i);
        }

        public List<Any_expressionContext> any_expression() {
            return getRuleContexts(Any_expressionContext.class);
        }

        public Any_expressionContext any_expression(int i) {
            return getRuleContext(Any_expressionContext.class, i);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitProgram(this);
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
                setState(99);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
                    {
                        setState(97);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(88);
                                match(TEMPLATE_E);
                            }
                            break;
                            case 2: {
                                setState(89);
                                ie_template();
                            }
                            break;
                            case 3: {
                                setState(90);
                                if_template();
                            }
                            break;
                            case 4: {
                                setState(91);
                                for_template();
                            }
                            break;
                            case 5: {
                                setState(92);
                                slot_statement();
                            }
                            break;
                            case 6: {
                                setState(93);
                                apply_statement();
                            }
                            break;
                            case 7: {
                                setState(94);
                                match_statement();
                            }
                            break;
                            case 8: {
                                setState(95);
                                any_expression();
                            }
                            break;
                            case 9: {
                                setState(96);
                                any_text();
                            }
                            break;
                        }
                    }
                    setState(101);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(102);
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
        public If_templateContext if_template() {
            return getRuleContext(If_templateContext.class, 0);
        }

        public For_templateContext for_template() {
            return getRuleContext(For_templateContext.class, 0);
        }

        public Control_templateContext control_template() {
            return getRuleContext(Control_templateContext.class, 0);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterStatements(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitStatements(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitStatements(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementsContext statements() throws RecognitionException {
        StatementsContext _localctx = new StatementsContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statements);
        try {
            setState(108);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(104);
                    if_template();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(105);
                    for_template();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(106);
                    control_template();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(107);
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
            return getToken(DejavuAntlrParser.TEXT_SPACE, 0);
        }

        public TerminalNode TEXT_WORD() {
            return getToken(DejavuAntlrParser.TEXT_WORD, 0);
        }

        public TerminalNode TEXT() {
            return getToken(DejavuAntlrParser.TEXT, 0);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterAny_text(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitAny_text(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitAny_text(this);
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
                setState(110);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0))) {
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
    public static class Ie_templateContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public List<Define_importContext> define_import() {
            return getRuleContexts(Define_importContext.class);
        }

        public Define_importContext define_import(int i) {
            return getRuleContext(Define_importContext.class, i);
        }

        public List<Define_exportContext> define_export() {
            return getRuleContexts(Define_exportContext.class);
        }

        public Define_exportContext define_export(int i) {
            return getRuleContext(Define_exportContext.class, i);
        }

        public Ie_templateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ie_template;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterIe_template(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitIe_template(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitIe_template(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Ie_templateContext ie_template() throws RecognitionException {
        Ie_templateContext _localctx = new Ie_templateContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_ie_template);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(112);
                match(TEMPLATE_L);
                setState(115);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(115);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case KW_IMPORT: {
                                setState(113);
                                define_import();
                            }
                            break;
                            case KW_EXPORT: {
                                setState(114);
                                define_export();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(117);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == KW_EXPORT || _la == KW_IMPORT);
                setState(119);
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
    public static class Define_importContext extends ParserRuleContext {
        public TerminalNode KW_IMPORT() {
            return getToken(DejavuAntlrParser.KW_IMPORT, 0);
        }

        public Import_blockContext import_block() {
            return getRuleContext(Import_blockContext.class, 0);
        }

        public TerminalNode KW_WITH() {
            return getToken(DejavuAntlrParser.KW_WITH, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterDefine_import(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitDefine_import(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitDefine_import(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Define_importContext define_import() throws RecognitionException {
        Define_importContext _localctx = new Define_importContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_define_import);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(121);
                match(KW_IMPORT);
                setState(124);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_WITH) {
                    {
                        setState(122);
                        match(KW_WITH);
                        setState(123);
                        identifier();
                    }
                }

                setState(126);
                import_block();
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
    public static class Import_blockContext extends ParserRuleContext {
        public TerminalNode BRACE_L() {
            return getToken(DejavuAntlrParser.BRACE_L, 0);
        }

        public TerminalNode BRACE_R() {
            return getToken(DejavuAntlrParser.BRACE_R, 0);
        }

        public List<Import_itemContext> import_item() {
            return getRuleContexts(Import_itemContext.class);
        }

        public Import_itemContext import_item(int i) {
            return getRuleContext(Import_itemContext.class, i);
        }

        public Import_blockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_import_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterImport_block(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitImport_block(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitImport_block(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Import_blockContext import_block() throws RecognitionException {
        Import_blockContext _localctx = new Import_blockContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_import_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(128);
                match(BRACE_L);
                setState(132);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == RAW_ID || _la == UNICODE_ID) {
                    {
                        {
                            setState(129);
                            import_item();
                        }
                    }
                    setState(134);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(135);
                match(BRACE_R);
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
    public static class Import_itemContext extends ParserRuleContext {
        public Namepath_freeContext namepath_free() {
            return getRuleContext(Namepath_freeContext.class, 0);
        }

        public TerminalNode KW_AS() {
            return getToken(DejavuAntlrParser.KW_AS, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public Import_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_import_item;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterImport_item(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitImport_item(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitImport_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Import_itemContext import_item() throws RecognitionException {
        Import_itemContext _localctx = new Import_itemContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_import_item);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(137);
                namepath_free();
                setState(140);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_AS) {
                    {
                        setState(138);
                        match(KW_AS);
                        setState(139);
                        identifier();
                    }
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
    public static class Define_exportContext extends ParserRuleContext {
        public TerminalNode KW_EXPORT() {
            return getToken(DejavuAntlrParser.KW_EXPORT, 0);
        }

        public List<Namepath_freeContext> namepath_free() {
            return getRuleContexts(Namepath_freeContext.class);
        }

        public Namepath_freeContext namepath_free(int i) {
            return getRuleContext(Namepath_freeContext.class, i);
        }

        public TerminalNode KW_WITH() {
            return getToken(DejavuAntlrParser.KW_WITH, 0);
        }

        public Define_exportContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_define_export;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterDefine_export(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitDefine_export(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitDefine_export(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Define_exportContext define_export() throws RecognitionException {
        Define_exportContext _localctx = new Define_exportContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_define_export);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                match(KW_EXPORT);
                setState(143);
                namepath_free();
                setState(146);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_WITH) {
                    {
                        setState(144);
                        match(KW_WITH);
                        setState(145);
                        namepath_free();
                    }
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
    public static class If_templateContext extends ParserRuleContext {
        public If_thenContext if_then() {
            return getRuleContext(If_thenContext.class, 0);
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

        public Else_thenContext else_then() {
            return getRuleContext(Else_thenContext.class, 0);
        }

        public If_templateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_template;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterIf_template(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitIf_template(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitIf_template(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_templateContext if_template() throws RecognitionException {
        If_templateContext _localctx = new If_templateContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_if_template);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(148);
                if_then();
                setState(152);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(149);
                                else_if();
                            }
                        }
                    }
                    setState(154);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
                setState(156);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                    case 1: {
                        setState(155);
                        else_then();
                    }
                    break;
                }
                setState(158);
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
    public static class If_thenContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_IF() {
            return getToken(DejavuAntlrParser.KW_IF, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
        }

        public If_thenContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_then;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterIf_then(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitIf_then(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitIf_then(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_thenContext if_then() throws RecognitionException {
        If_thenContext _localctx = new If_thenContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_if_then);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(160);
                match(TEMPLATE_L);
                setState(161);
                match(KW_IF);
                setState(162);
                expression();
                setState(163);
                match(TEMPLATE_R);
                setState(167);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(164);
                                statements();
                            }
                        }
                    }
                    setState(169);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
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
    public static class Else_thenContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_ELSE() {
            return getToken(DejavuAntlrParser.KW_ELSE, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
        }

        public Else_thenContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_else_then;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterElse_then(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitElse_then(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitElse_then(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Else_thenContext else_then() throws RecognitionException {
        Else_thenContext _localctx = new Else_thenContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_else_then);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(170);
                match(TEMPLATE_L);
                setState(171);
                match(KW_ELSE);
                setState(172);
                match(TEMPLATE_R);
                setState(176);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(173);
                                statements();
                            }
                        }
                    }
                    setState(178);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
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
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_ELSE() {
            return getToken(DejavuAntlrParser.KW_ELSE, 0);
        }

        public TerminalNode KW_IF() {
            return getToken(DejavuAntlrParser.KW_IF, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterElse_if(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitElse_if(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitElse_if(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Else_ifContext else_if() throws RecognitionException {
        Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_else_if);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(179);
                match(TEMPLATE_L);
                setState(180);
                match(KW_ELSE);
                setState(181);
                match(KW_IF);
                setState(182);
                expression();
                setState(183);
                match(TEMPLATE_R);
                setState(187);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(184);
                                statements();
                            }
                        }
                    }
                    setState(189);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
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
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_END() {
            return getToken(DejavuAntlrParser.KW_END, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public TerminalNode KW_IF() {
            return getToken(DejavuAntlrParser.KW_IF, 0);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterIf_end(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitIf_end(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitIf_end(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_endContext if_end() throws RecognitionException {
        If_endContext _localctx = new If_endContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_if_end);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(190);
                match(TEMPLATE_L);
                setState(191);
                match(KW_END);
                setState(193);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IF) {
                    {
                        setState(192);
                        match(KW_IF);
                    }
                }

                setState(195);
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
    public static class For_templateContext extends ParserRuleContext {
        public For_beginContext for_begin() {
            return getRuleContext(For_beginContext.class, 0);
        }

        public For_endContext for_end() {
            return getRuleContext(For_endContext.class, 0);
        }

        public Else_thenContext else_then() {
            return getRuleContext(Else_thenContext.class, 0);
        }

        public For_templateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_for_template;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterFor_template(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitFor_template(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitFor_template(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_templateContext for_template() throws RecognitionException {
        For_templateContext _localctx = new For_templateContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_for_template);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(197);
                for_begin();
                setState(199);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                    case 1: {
                        setState(198);
                        else_then();
                    }
                    break;
                }
                setState(201);
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
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_FOR() {
            return getToken(DejavuAntlrParser.KW_FOR, 0);
        }

        public For_patternContext for_pattern() {
            return getRuleContext(For_patternContext.class, 0);
        }

        public TerminalNode KW_IN() {
            return getToken(DejavuAntlrParser.KW_IN, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public TerminalNode KW_IF() {
            return getToken(DejavuAntlrParser.KW_IF, 0);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterFor_begin(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitFor_begin(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitFor_begin(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_beginContext for_begin() throws RecognitionException {
        For_beginContext _localctx = new For_beginContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_for_begin);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(203);
                match(TEMPLATE_L);
                setState(204);
                match(KW_FOR);
                setState(205);
                for_pattern();
                setState(206);
                match(KW_IN);
                setState(207);
                ((For_beginContext) _localctx).condition = expression();
                setState(210);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_IF) {
                    {
                        setState(208);
                        match(KW_IF);
                        setState(209);
                        ((For_beginContext) _localctx).guard = expression();
                    }
                }

                setState(212);
                match(TEMPLATE_R);
                setState(216);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(213);
                                statements();
                            }
                        }
                    }
                    setState(218);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
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
            return getToken(DejavuAntlrParser.PARENTHESES_L, 0);
        }

        public TerminalNode PARENTHESES_R() {
            return getToken(DejavuAntlrParser.PARENTHESES_R, 0);
        }

        public List<Modified_identifierContext> modified_identifier() {
            return getRuleContexts(Modified_identifierContext.class);
        }

        public Modified_identifierContext modified_identifier(int i) {
            return getRuleContext(Modified_identifierContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(DejavuAntlrParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(DejavuAntlrParser.COMMA, i);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterFor_pattern(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitFor_pattern(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitFor_pattern(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_patternContext for_pattern() throws RecognitionException {
        For_patternContext _localctx = new For_patternContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_for_pattern);
        int _la;
        try {
            int _alt;
            setState(246);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(219);
                    match(PARENTHESES_L);
                    setState(220);
                    match(PARENTHESES_R);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(221);
                    match(PARENTHESES_L);
                    setState(222);
                    modified_identifier();
                    setState(227);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(223);
                                    match(COMMA);
                                    setState(224);
                                    modified_identifier();
                                }
                            }
                        }
                        setState(229);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
                    }
                    setState(231);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMA) {
                        {
                            setState(230);
                            match(COMMA);
                        }
                    }

                    setState(233);
                    match(PARENTHESES_R);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(235);
                    modified_identifier();
                    setState(240);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
                    while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                        if (_alt == 1) {
                            {
                                {
                                    setState(236);
                                    match(COMMA);
                                    setState(237);
                                    modified_identifier();
                                }
                            }
                        }
                        setState(242);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
                    }
                    setState(244);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == COMMA) {
                        {
                            setState(243);
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
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_END() {
            return getToken(DejavuAntlrParser.KW_END, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public TerminalNode KW_FOR() {
            return getToken(DejavuAntlrParser.KW_FOR, 0);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterFor_end(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitFor_end(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitFor_end(this);
            else return visitor.visitChildren(this);
        }
    }

    public final For_endContext for_end() throws RecognitionException {
        For_endContext _localctx = new For_endContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_for_end);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(248);
                match(TEMPLATE_L);
                setState(249);
                match(KW_END);
                setState(251);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_FOR) {
                    {
                        setState(250);
                        match(KW_FOR);
                    }
                }

                setState(253);
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
    public static class Control_templateContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public Control_statementContext control_statement() {
            return getRuleContext(Control_statementContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public Control_templateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_control_template;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterControl_template(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitControl_template(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitControl_template(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Control_templateContext control_template() throws RecognitionException {
        Control_templateContext _localctx = new Control_templateContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_control_template);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(255);
                match(TEMPLATE_L);
                setState(256);
                control_statement();
                setState(257);
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
    public static class Control_statementContext extends ParserRuleContext {
        public TerminalNode KW_BREAK() {
            return getToken(DejavuAntlrParser.KW_BREAK, 0);
        }

        public TerminalNode KW_CONTINUE() {
            return getToken(DejavuAntlrParser.KW_CONTINUE, 0);
        }

        public Control_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_control_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterControl_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitControl_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitControl_statement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Control_statementContext control_statement() throws RecognitionException {
        Control_statementContext _localctx = new Control_statementContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_control_statement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(259);
                _la = _input.LA(1);
                if (!(_la == KW_BREAK || _la == KW_CONTINUE)) {
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
    public static class Slot_statementContext extends ParserRuleContext {
        public Slot_beginContext slot_begin() {
            return getRuleContext(Slot_beginContext.class, 0);
        }

        public Slot_endContext slot_end() {
            return getRuleContext(Slot_endContext.class, 0);
        }

        public Slot_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_slot_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterSlot_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitSlot_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitSlot_statement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Slot_statementContext slot_statement() throws RecognitionException {
        Slot_statementContext _localctx = new Slot_statementContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_slot_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(261);
                slot_begin();
                setState(262);
                slot_end();
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
    public static class Slot_beginContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_SLOT() {
            return getToken(DejavuAntlrParser.KW_SLOT, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
        }

        public Slot_beginContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_slot_begin;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterSlot_begin(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitSlot_begin(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitSlot_begin(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Slot_beginContext slot_begin() throws RecognitionException {
        Slot_beginContext _localctx = new Slot_beginContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_slot_begin);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(264);
                match(TEMPLATE_L);
                setState(265);
                match(KW_SLOT);
                setState(266);
                identifier();
                setState(267);
                match(TEMPLATE_R);
                setState(271);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(268);
                                statements();
                            }
                        }
                    }
                    setState(273);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 24, _ctx);
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
    public static class Slot_endContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_END() {
            return getToken(DejavuAntlrParser.KW_END, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public TerminalNode KW_SLOT() {
            return getToken(DejavuAntlrParser.KW_SLOT, 0);
        }

        public Slot_endContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_slot_end;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterSlot_end(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitSlot_end(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitSlot_end(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Slot_endContext slot_end() throws RecognitionException {
        Slot_endContext _localctx = new Slot_endContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_slot_end);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(274);
                match(TEMPLATE_L);
                setState(275);
                match(KW_END);
                setState(277);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_SLOT) {
                    {
                        setState(276);
                        match(KW_SLOT);
                    }
                }

                setState(279);
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
    public static class Apply_statementContext extends ParserRuleContext {
        public Apply_beginContext apply_begin() {
            return getRuleContext(Apply_beginContext.class, 0);
        }

        public Apply_endContext apply_end() {
            return getRuleContext(Apply_endContext.class, 0);
        }

        public Apply_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_apply_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterApply_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitApply_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitApply_statement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Apply_statementContext apply_statement() throws RecognitionException {
        Apply_statementContext _localctx = new Apply_statementContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_apply_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(281);
                apply_begin();
                setState(282);
                apply_end();
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
    public static class Apply_beginContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_APPLY() {
            return getToken(DejavuAntlrParser.KW_APPLY, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
        }

        public Apply_beginContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_apply_begin;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterApply_begin(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitApply_begin(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitApply_begin(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Apply_beginContext apply_begin() throws RecognitionException {
        Apply_beginContext _localctx = new Apply_beginContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_apply_begin);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(284);
                match(TEMPLATE_L);
                setState(285);
                match(KW_APPLY);
                setState(286);
                identifier();
                setState(287);
                match(TEMPLATE_R);
                setState(291);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(288);
                                statements();
                            }
                        }
                    }
                    setState(293);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
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
    public static class Apply_endContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_END() {
            return getToken(DejavuAntlrParser.KW_END, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public TerminalNode KW_APPLY() {
            return getToken(DejavuAntlrParser.KW_APPLY, 0);
        }

        public Apply_endContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_apply_end;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterApply_end(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitApply_end(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitApply_end(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Apply_endContext apply_end() throws RecognitionException {
        Apply_endContext _localctx = new Apply_endContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_apply_end);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(294);
                match(TEMPLATE_L);
                setState(295);
                match(KW_END);
                setState(297);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_APPLY) {
                    {
                        setState(296);
                        match(KW_APPLY);
                    }
                }

                setState(299);
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
    public static class Match_statementContext extends ParserRuleContext {
        public Match_beginContext match_begin() {
            return getRuleContext(Match_beginContext.class, 0);
        }

        public Match_endContext match_end() {
            return getRuleContext(Match_endContext.class, 0);
        }

        public List<Case_branchContext> case_branch() {
            return getRuleContexts(Case_branchContext.class);
        }

        public Case_branchContext case_branch(int i) {
            return getRuleContext(Case_branchContext.class, i);
        }

        public Match_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_match_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterMatch_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitMatch_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitMatch_statement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Match_statementContext match_statement() throws RecognitionException {
        Match_statementContext _localctx = new Match_statementContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_match_statement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(301);
                match_begin();
                setState(305);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(302);
                                case_branch();
                            }
                        }
                    }
                    setState(307);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                }
                setState(308);
                match_end();
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
    public static class Match_beginContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_MATCH() {
            return getToken(DejavuAntlrParser.KW_MATCH, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
        }

        public Match_beginContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_match_begin;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterMatch_begin(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitMatch_begin(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitMatch_begin(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Match_beginContext match_begin() throws RecognitionException {
        Match_beginContext _localctx = new Match_beginContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_match_begin);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(310);
                match(TEMPLATE_L);
                setState(311);
                match(KW_MATCH);
                setState(312);
                expression();
                setState(313);
                match(TEMPLATE_R);
                setState(317);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(314);
                                statements();
                            }
                        }
                    }
                    setState(319);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
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
    public static class Case_branchContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_CASE() {
            return getToken(DejavuAntlrParser.KW_CASE, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
        }

        public Case_branchContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_case_branch;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterCase_branch(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitCase_branch(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitCase_branch(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Case_branchContext case_branch() throws RecognitionException {
        Case_branchContext _localctx = new Case_branchContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_case_branch);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(320);
                match(TEMPLATE_L);
                setState(321);
                match(KW_CASE);
                setState(322);
                expression();
                setState(323);
                match(TEMPLATE_R);
                setState(327);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(324);
                                statements();
                            }
                        }
                    }
                    setState(329);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 30, _ctx);
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
    public static class Match_endContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode KW_END() {
            return getToken(DejavuAntlrParser.KW_END, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public TerminalNode KW_MATCH() {
            return getToken(DejavuAntlrParser.KW_MATCH, 0);
        }

        public Match_endContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_match_end;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterMatch_end(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitMatch_end(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitMatch_end(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Match_endContext match_end() throws RecognitionException {
        Match_endContext _localctx = new Match_endContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_match_end);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(330);
                match(TEMPLATE_L);
                setState(331);
                match(KW_END);
                setState(333);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == KW_MATCH) {
                    {
                        setState(332);
                        match(KW_MATCH);
                    }
                }

                setState(335);
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
    public static class Any_expressionContext extends ParserRuleContext {
        public TerminalNode TEMPLATE_L() {
            return getToken(DejavuAntlrParser.TEMPLATE_L, 0);
        }

        public TerminalNode TEMPLATE_R() {
            return getToken(DejavuAntlrParser.TEMPLATE_R, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public Any_expressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_any_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterAny_expression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitAny_expression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitAny_expression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Any_expressionContext any_expression() throws RecognitionException {
        Any_expressionContext _localctx = new Any_expressionContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_any_expression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(337);
                match(TEMPLATE_L);
                setState(339);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412316867584L) != 0)) {
                    {
                        setState(338);
                        expression();
                    }
                }

                setState(341);
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
        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public List<InfixContext> infix() {
            return getRuleContexts(InfixContext.class);
        }

        public InfixContext infix(int i) {
            return getRuleContext(InfixContext.class, i);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_expression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(343);
                term();
                setState(349);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OP_ADD || _la == OP_SUB) {
                    {
                        {
                            setState(344);
                            infix();
                            setState(345);
                            term();
                        }
                    }
                    setState(351);
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
    public static class TermContext extends ParserRuleContext {
        public AtomContext atom() {
            return getRuleContext(AtomContext.class, 0);
        }

        public List<PrefixContext> prefix() {
            return getRuleContexts(PrefixContext.class);
        }

        public PrefixContext prefix(int i) {
            return getRuleContext(PrefixContext.class, i);
        }

        public List<SuffixContext> suffix() {
            return getRuleContexts(SuffixContext.class);
        }

        public SuffixContext suffix(int i) {
            return getRuleContext(SuffixContext.class, i);
        }

        public TermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_term;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterTerm(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitTerm(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitTerm(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TermContext term() throws RecognitionException {
        TermContext _localctx = new TermContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_term);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(355);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) {
                    {
                        {
                            setState(352);
                            prefix();
                        }
                    }
                    setState(357);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(358);
                atom();
                setState(362);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == DOT) {
                    {
                        {
                            setState(359);
                            suffix();
                        }
                    }
                    setState(364);
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
    public static class AtomContext extends ParserRuleContext {
        public NamepathContext namepath() {
            return getRuleContext(NamepathContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public AtomContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atom;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterAtom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitAtom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitAtom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AtomContext atom() throws RecognitionException {
        AtomContext _localctx = new AtomContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_atom);
        try {
            setState(367);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(365);
                    namepath();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(366);
                    identifier();
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
    public static class PrefixContext extends ParserRuleContext {
        public TerminalNode OP_NOT() {
            return getToken(DejavuAntlrParser.OP_NOT, 0);
        }

        public TerminalNode OP_ADD() {
            return getToken(DejavuAntlrParser.OP_ADD, 0);
        }

        public TerminalNode OP_SUB() {
            return getToken(DejavuAntlrParser.OP_SUB, 0);
        }

        public PrefixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prefix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterPrefix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitPrefix(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitPrefix(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PrefixContext prefix() throws RecognitionException {
        PrefixContext _localctx = new PrefixContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_prefix);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(369);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0))) {
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
    public static class InfixContext extends ParserRuleContext {
        public TerminalNode OP_ADD() {
            return getToken(DejavuAntlrParser.OP_ADD, 0);
        }

        public TerminalNode OP_SUB() {
            return getToken(DejavuAntlrParser.OP_SUB, 0);
        }

        public InfixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_infix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterInfix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitInfix(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitInfix(this);
            else return visitor.visitChildren(this);
        }
    }

    public final InfixContext infix() throws RecognitionException {
        InfixContext _localctx = new InfixContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_infix);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(371);
                _la = _input.LA(1);
                if (!(_la == OP_ADD || _la == OP_SUB)) {
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
    public static class SuffixContext extends ParserRuleContext {
        public Dot_callContext dot_call() {
            return getRuleContext(Dot_callContext.class, 0);
        }

        public SuffixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_suffix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterSuffix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitSuffix(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitSuffix(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SuffixContext suffix() throws RecognitionException {
        SuffixContext _localctx = new SuffixContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_suffix);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(373);
                dot_call();
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
    public static class Dot_callContext extends ParserRuleContext {
        public TerminalNode DOT() {
            return getToken(DejavuAntlrParser.DOT, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode PARENTHESES_L() {
            return getToken(DejavuAntlrParser.PARENTHESES_L, 0);
        }

        public TerminalNode PARENTHESES_R() {
            return getToken(DejavuAntlrParser.PARENTHESES_R, 0);
        }

        public List<Call_termContext> call_term() {
            return getRuleContexts(Call_termContext.class);
        }

        public Call_termContext call_term(int i) {
            return getRuleContext(Call_termContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(DejavuAntlrParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(DejavuAntlrParser.COMMA, i);
        }

        public Dot_callContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dot_call;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterDot_call(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitDot_call(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitDot_call(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Dot_callContext dot_call() throws RecognitionException {
        Dot_callContext _localctx = new Dot_callContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_dot_call);
        int _la;
        try {
            int _alt;
            setState(395);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 40, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(375);
                    match(DOT);
                    setState(376);
                    identifier();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(377);
                    match(DOT);
                    setState(378);
                    identifier();
                    setState(379);
                    match(PARENTHESES_L);
                    setState(391);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 412316867584L) != 0)) {
                        {
                            setState(380);
                            call_term();
                            setState(385);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 37, _ctx);
                            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                                if (_alt == 1) {
                                    {
                                        {
                                            setState(381);
                                            match(COMMA);
                                            setState(382);
                                            call_term();
                                        }
                                    }
                                }
                                setState(387);
                                _errHandler.sync(this);
                                _alt = getInterpreter().adaptivePredict(_input, 37, _ctx);
                            }
                            setState(389);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == COMMA) {
                                {
                                    setState(388);
                                    match(COMMA);
                                }
                            }

                        }
                    }

                    setState(393);
                    match(PARENTHESES_R);
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
    public static class Call_termContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode COLON() {
            return getToken(DejavuAntlrParser.COLON, 0);
        }

        public Call_termContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_call_term;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterCall_term(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitCall_term(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitCall_term(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Call_termContext call_term() throws RecognitionException {
        Call_termContext _localctx = new Call_termContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_call_term);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(400);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                    case 1: {
                        setState(397);
                        identifier();
                        setState(398);
                        match(COLON);
                    }
                    break;
                }
                setState(402);
                expression();
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterModifiers(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitModifiers(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitModifiers(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ModifiersContext modifiers() throws RecognitionException {
        ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_modifiers);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(407);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == RAW_ID || _la == UNICODE_ID) {
                    {
                        {
                            setState(404);
                            ((ModifiersContext) _localctx).identifier = identifier();
                            ((ModifiersContext) _localctx).mods.add(((ModifiersContext) _localctx).identifier);
                        }
                    }
                    setState(409);
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
            if (listener instanceof DejavuAntlrListener)
                ((DejavuAntlrListener) listener).enterModified_identifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitModified_identifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitModified_identifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Modified_identifierContext modified_identifier() throws RecognitionException {
        Modified_identifierContext _localctx = new Modified_identifierContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_modified_identifier);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(413);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(410);
                                ((Modified_identifierContext) _localctx).identifier = identifier();
                                ((Modified_identifierContext) _localctx).mods.add(((Modified_identifierContext) _localctx).identifier);
                            }
                        }
                    }
                    setState(415);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 43, _ctx);
                }
                setState(416);
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
            return getTokens(DejavuAntlrParser.OP_PROPORTION);
        }

        public TerminalNode OP_PROPORTION(int i) {
            return getToken(DejavuAntlrParser.OP_PROPORTION, i);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterModified_namepath(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitModified_namepath(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitModified_namepath(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Modified_namepathContext modified_namepath() throws RecognitionException {
        Modified_namepathContext _localctx = new Modified_namepathContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_modified_namepath);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(421);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(418);
                                ((Modified_namepathContext) _localctx).identifier = identifier();
                                ((Modified_namepathContext) _localctx).mods.add(((Modified_namepathContext) _localctx).identifier);
                            }
                        }
                    }
                    setState(423);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
                }
                setState(424);
                ((Modified_namepathContext) _localctx).identifier = identifier();
                ((Modified_namepathContext) _localctx).path.add(((Modified_namepathContext) _localctx).identifier);
                setState(429);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OP_PROPORTION) {
                    {
                        {
                            setState(425);
                            match(OP_PROPORTION);
                            setState(426);
                            ((Modified_namepathContext) _localctx).identifier = identifier();
                            ((Modified_namepathContext) _localctx).path.add(((Modified_namepathContext) _localctx).identifier);
                        }
                    }
                    setState(431);
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
            return getTokens(DejavuAntlrParser.OP_PROPORTION);
        }

        public TerminalNode OP_PROPORTION(int i) {
            return getToken(DejavuAntlrParser.OP_PROPORTION, i);
        }

        public List<TerminalNode> DOT() {
            return getTokens(DejavuAntlrParser.DOT);
        }

        public TerminalNode DOT(int i) {
            return getToken(DejavuAntlrParser.DOT, i);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterNamepath_free(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitNamepath_free(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitNamepath_free(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Namepath_freeContext namepath_free() throws RecognitionException {
        Namepath_freeContext _localctx = new Namepath_freeContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_namepath_free);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(432);
                identifier();
                setState(437);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == DOT || _la == OP_PROPORTION) {
                    {
                        {
                            setState(433);
                            _la = _input.LA(1);
                            if (!(_la == DOT || _la == OP_PROPORTION)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                            setState(434);
                            identifier();
                        }
                    }
                    setState(439);
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
            return getTokens(DejavuAntlrParser.OP_PROPORTION);
        }

        public TerminalNode OP_PROPORTION(int i) {
            return getToken(DejavuAntlrParser.OP_PROPORTION, i);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterNamepath(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitNamepath(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitNamepath(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NamepathContext namepath() throws RecognitionException {
        NamepathContext _localctx = new NamepathContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_namepath);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(440);
                identifier();
                setState(445);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OP_PROPORTION) {
                    {
                        {
                            setState(441);
                            match(OP_PROPORTION);
                            setState(442);
                            identifier();
                        }
                    }
                    setState(447);
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
            return getToken(DejavuAntlrParser.UNICODE_ID, 0);
        }

        public TerminalNode RAW_ID() {
            return getToken(DejavuAntlrParser.RAW_ID, 0);
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
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).enterIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof DejavuAntlrListener) ((DejavuAntlrListener) listener).exitIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof DejavuAntlrVisitor)
                return ((DejavuAntlrVisitor<? extends T>) visitor).visitIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierContext identifier() throws RecognitionException {
        IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_identifier);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(448);
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
            "\u0004\u0001)\u01c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
                    "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
                    "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
                    "\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b" +
                    "\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e" +
                    "\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002" +
                    "#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002" +
                    "(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0005\u0000b\b\u0000\n\u0000\f\u0000e\t\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001" +
                    "m\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0004\u0003t\b\u0003\u000b\u0003\f\u0003u\u0001\u0003\u0001\u0003\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0003\u0004}\b\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u0083\b\u0005\n\u0005\f\u0005" +
                    "\u0086\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006" +
                    "\u0003\u0006\u008d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
                    "\u0003\u0007\u0093\b\u0007\u0001\b\u0001\b\u0005\b\u0097\b\b\n\b\f\b\u009a" +
                    "\t\b\u0001\b\u0003\b\u009d\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t" +
                    "\u0001\t\u0001\t\u0005\t\u00a6\b\t\n\t\f\t\u00a9\t\t\u0001\n\u0001\n\u0001" +
                    "\n\u0001\n\u0005\n\u00af\b\n\n\n\f\n\u00b2\t\n\u0001\u000b\u0001\u000b" +
                    "\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ba\b\u000b" +
                    "\n\u000b\f\u000b\u00bd\t\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00c2\b" +
                    "\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00c8\b\r\u0001\r\u0001\r\u0001" +
                    "\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001" +
                    "\u000e\u0003\u000e\u00d3\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00d7" +
                    "\b\u000e\n\u000e\f\u000e\u00da\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f" +
                    "\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e2\b\u000f\n\u000f" +
                    "\f\u000f\u00e5\t\u000f\u0001\u000f\u0003\u000f\u00e8\b\u000f\u0001\u000f" +
                    "\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ef\b\u000f" +
                    "\n\u000f\f\u000f\u00f2\t\u000f\u0001\u000f\u0003\u000f\u00f5\b\u000f\u0003" +
                    "\u000f\u00f7\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00fc" +
                    "\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001" +
                    "\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001" +
                    "\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u010e" +
                    "\b\u0014\n\u0014\f\u0014\u0111\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015" +
                    "\u0003\u0015\u0116\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016" +
                    "\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017" +
                    "\u0005\u0017\u0122\b\u0017\n\u0017\f\u0017\u0125\t\u0017\u0001\u0018\u0001" +
                    "\u0018\u0001\u0018\u0003\u0018\u012a\b\u0018\u0001\u0018\u0001\u0018\u0001" +
                    "\u0019\u0001\u0019\u0005\u0019\u0130\b\u0019\n\u0019\f\u0019\u0133\t\u0019" +
                    "\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a" +
                    "\u0001\u001a\u0005\u001a\u013c\b\u001a\n\u001a\f\u001a\u013f\t\u001a\u0001" +
                    "\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0146" +
                    "\b\u001b\n\u001b\f\u001b\u0149\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c" +
                    "\u0003\u001c\u014e\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d" +
                    "\u0003\u001d\u0154\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e" +
                    "\u0001\u001e\u0001\u001e\u0005\u001e\u015c\b\u001e\n\u001e\f\u001e\u015f" +
                    "\t\u001e\u0001\u001f\u0005\u001f\u0162\b\u001f\n\u001f\f\u001f\u0165\t" +
                    "\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0169\b\u001f\n\u001f\f\u001f" +
                    "\u016c\t\u001f\u0001 \u0001 \u0003 \u0170\b \u0001!\u0001!\u0001\"\u0001" +
                    "\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001" +
                    "$\u0005$\u0180\b$\n$\f$\u0183\t$\u0001$\u0003$\u0186\b$\u0003$\u0188\b" +
                    "$\u0001$\u0001$\u0003$\u018c\b$\u0001%\u0001%\u0001%\u0003%\u0191\b%\u0001" +
                    "%\u0001%\u0001&\u0005&\u0196\b&\n&\f&\u0199\t&\u0001\'\u0005\'\u019c\b" +
                    "\'\n\'\f\'\u019f\t\'\u0001\'\u0001\'\u0001(\u0005(\u01a4\b(\n(\f(\u01a7" +
                    "\t(\u0001(\u0001(\u0001(\u0005(\u01ac\b(\n(\f(\u01af\t(\u0001)\u0001)" +
                    "\u0001)\u0005)\u01b4\b)\n)\f)\u01b7\t)\u0001*\u0001*\u0001*\u0005*\u01bc" +
                    "\b*\n*\f*\u01bf\t*\u0001+\u0001+\u0001+\u0000\u0000,\u0000\u0002\u0004" +
                    "\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"" +
                    "$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0006\u0001\u0000\u0003\u0005\u0001\u0000" +
                    "\u001a\u001b\u0001\u0000\n\f\u0001\u0000\u000b\f\u0002\u0000\u0007\u0007" +
                    "\u001c\u001c\u0001\u0000%&\u01d0\u0000c\u0001\u0000\u0000\u0000\u0002" +
                    "l\u0001\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000\u0006p\u0001" +
                    "\u0000\u0000\u0000\by\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000" +
                    "\u0000\f\u0089\u0001\u0000\u0000\u0000\u000e\u008e\u0001\u0000\u0000\u0000" +
                    "\u0010\u0094\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000\u0000\u0000" +
                    "\u0014\u00aa\u0001\u0000\u0000\u0000\u0016\u00b3\u0001\u0000\u0000\u0000" +
                    "\u0018\u00be\u0001\u0000\u0000\u0000\u001a\u00c5\u0001\u0000\u0000\u0000" +
                    "\u001c\u00cb\u0001\u0000\u0000\u0000\u001e\u00f6\u0001\u0000\u0000\u0000" +
                    " \u00f8\u0001\u0000\u0000\u0000\"\u00ff\u0001\u0000\u0000\u0000$\u0103" +
                    "\u0001\u0000\u0000\u0000&\u0105\u0001\u0000\u0000\u0000(\u0108\u0001\u0000" +
                    "\u0000\u0000*\u0112\u0001\u0000\u0000\u0000,\u0119\u0001\u0000\u0000\u0000" +
                    ".\u011c\u0001\u0000\u0000\u00000\u0126\u0001\u0000\u0000\u00002\u012d" +
                    "\u0001\u0000\u0000\u00004\u0136\u0001\u0000\u0000\u00006\u0140\u0001\u0000" +
                    "\u0000\u00008\u014a\u0001\u0000\u0000\u0000:\u0151\u0001\u0000\u0000\u0000" +
                    "<\u0157\u0001\u0000\u0000\u0000>\u0163\u0001\u0000\u0000\u0000@\u016f" +
                    "\u0001\u0000\u0000\u0000B\u0171\u0001\u0000\u0000\u0000D\u0173\u0001\u0000" +
                    "\u0000\u0000F\u0175\u0001\u0000\u0000\u0000H\u018b\u0001\u0000\u0000\u0000" +
                    "J\u0190\u0001\u0000\u0000\u0000L\u0197\u0001\u0000\u0000\u0000N\u019d" +
                    "\u0001\u0000\u0000\u0000P\u01a5\u0001\u0000\u0000\u0000R\u01b0\u0001\u0000" +
                    "\u0000\u0000T\u01b8\u0001\u0000\u0000\u0000V\u01c0\u0001\u0000\u0000\u0000" +
                    "Xb\u0005\u0001\u0000\u0000Yb\u0003\u0006\u0003\u0000Zb\u0003\u0010\b\u0000" +
                    "[b\u0003\u001a\r\u0000\\b\u0003&\u0013\u0000]b\u0003,\u0016\u0000^b\u0003" +
                    "2\u0019\u0000_b\u0003:\u001d\u0000`b\u0003\u0004\u0002\u0000aX\u0001\u0000" +
                    "\u0000\u0000aY\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000a[\u0001" +
                    "\u0000\u0000\u0000a\\\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000" +
                    "a^\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000" +
                    "\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000" +
                    "\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005" +
                    "\u0000\u0000\u0001g\u0001\u0001\u0000\u0000\u0000hm\u0003\u0010\b\u0000" +
                    "im\u0003\u001a\r\u0000jm\u0003\"\u0011\u0000km\u0003\u0004\u0002\u0000" +
                    "lh\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000" +
                    "\u0000lk\u0001\u0000\u0000\u0000m\u0003\u0001\u0000\u0000\u0000no\u0007" +
                    "\u0000\u0000\u0000o\u0005\u0001\u0000\u0000\u0000ps\u0005\u0002\u0000" +
                    "\u0000qt\u0003\b\u0004\u0000rt\u0003\u000e\u0007\u0000sq\u0001\u0000\u0000" +
                    "\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000" +
                    "\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0005" +
                    "\u0006\u0000\u0000x\u0007\u0001\u0000\u0000\u0000y|\u0005\u000e\u0000" +
                    "\u0000z{\u0005\u0017\u0000\u0000{}\u0003V+\u0000|z\u0001\u0000\u0000\u0000" +
                    "|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0003\n\u0005" +
                    "\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080\u0084\u0005!\u0000\u0000" +
                    "\u0081\u0083\u0003\f\u0006\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083" +
                    "\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084" +
                    "\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086" +
                    "\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005\"\u0000\u0000\u0088\u000b" +
                    "\u0001\u0000\u0000\u0000\u0089\u008c\u0003R)\u0000\u008a\u008b\u0005\u000f" +
                    "\u0000\u0000\u008b\u008d\u0003V+\u0000\u008c\u008a\u0001\u0000\u0000\u0000" +
                    "\u008c\u008d\u0001\u0000\u0000\u0000\u008d\r\u0001\u0000\u0000\u0000\u008e" +
                    "\u008f\u0005\r\u0000\u0000\u008f\u0092\u0003R)\u0000\u0090\u0091\u0005" +
                    "\u0017\u0000\u0000\u0091\u0093\u0003R)\u0000\u0092\u0090\u0001\u0000\u0000" +
                    "\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u000f\u0001\u0000\u0000" +
                    "\u0000\u0094\u0098\u0003\u0012\t\u0000\u0095\u0097\u0003\u0016\u000b\u0000" +
                    "\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000" +
                    "\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000" +
                    "\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000" +
                    "\u009b\u009d\u0003\u0014\n\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c" +
                    "\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e" +
                    "\u009f\u0003\u0018\f\u0000\u009f\u0011\u0001\u0000\u0000\u0000\u00a0\u00a1" +
                    "\u0005\u0002\u0000\u0000\u00a1\u00a2\u0005\u0011\u0000\u0000\u00a2\u00a3" +
                    "\u0003<\u001e\u0000\u00a3\u00a7\u0005\u0006\u0000\u0000\u00a4\u00a6\u0003" +
                    "\u0002\u0001\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001" +
                    "\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001" +
                    "\u0000\u0000\u0000\u00a8\u0013\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001" +
                    "\u0000\u0000\u0000\u00aa\u00ab\u0005\u0002\u0000\u0000\u00ab\u00ac\u0005" +
                    "\u0012\u0000\u0000\u00ac\u00b0\u0005\u0006\u0000\u0000\u00ad\u00af\u0003" +
                    "\u0002\u0001\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001" +
                    "\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001" +
                    "\u0000\u0000\u0000\u00b1\u0015\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001" +
                    "\u0000\u0000\u0000\u00b3\u00b4\u0005\u0002\u0000\u0000\u00b4\u00b5\u0005" +
                    "\u0012\u0000\u0000\u00b5\u00b6\u0005\u0011\u0000\u0000\u00b6\u00b7\u0003" +
                    "<\u001e\u0000\u00b7\u00bb\u0005\u0006\u0000\u0000\u00b8\u00ba\u0003\u0002" +
                    "\u0001\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000" +
                    "\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000" +
                    "\u0000\u0000\u00bc\u0017\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000" +
                    "\u0000\u0000\u00be\u00bf\u0005\u0002\u0000\u0000\u00bf\u00c1\u0005\u0013" +
                    "\u0000\u0000\u00c0\u00c2\u0005\u0011\u0000\u0000\u00c1\u00c0\u0001\u0000" +
                    "\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000" +
                    "\u0000\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u0019\u0001\u0000" +
                    "\u0000\u0000\u00c5\u00c7\u0003\u001c\u000e\u0000\u00c6\u00c8\u0003\u0014" +
                    "\n\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000" +
                    "\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003 \u0010\u0000" +
                    "\u00ca\u001b\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000" +
                    "\u00cc\u00cd\u0005\u0014\u0000\u0000\u00cd\u00ce\u0003\u001e\u000f\u0000" +
                    "\u00ce\u00cf\u0005\u0010\u0000\u0000\u00cf\u00d2\u0003<\u001e\u0000\u00d0" +
                    "\u00d1\u0005\u0011\u0000\u0000\u00d1\u00d3\u0003<\u001e\u0000\u00d2\u00d0" +
                    "\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4" +
                    "\u0001\u0000\u0000\u0000\u00d4\u00d8\u0005\u0006\u0000\u0000\u00d5\u00d7" +
                    "\u0003\u0002\u0001\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da" +
                    "\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9" +
                    "\u0001\u0000\u0000\u0000\u00d9\u001d\u0001\u0000\u0000\u0000\u00da\u00d8" +
                    "\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001d\u0000\u0000\u00dc\u00f7" +
                    "\u0005\u001e\u0000\u0000\u00dd\u00de\u0005\u001d\u0000\u0000\u00de\u00e3" +
                    "\u0003N\'\u0000\u00df\u00e0\u0005\b\u0000\u0000\u00e0\u00e2\u0003N\'\u0000" +
                    "\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000" +
                    "\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000" +
                    "\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000" +
                    "\u00e6\u00e8\u0005\b\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7" +
                    "\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9" +
                    "\u00ea\u0005\u001e\u0000\u0000\u00ea\u00f7\u0001\u0000\u0000\u0000\u00eb" +
                    "\u00f0\u0003N\'\u0000\u00ec\u00ed\u0005\b\u0000\u0000\u00ed\u00ef\u0003" +
                    "N\'\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000" +
                    "\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000" +
                    "\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000" +
                    "\u0000\u0000\u00f3\u00f5\u0005\b\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000" +
                    "\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000" +
                    "\u0000\u00f6\u00db\u0001\u0000\u0000\u0000\u00f6\u00dd\u0001\u0000\u0000" +
                    "\u0000\u00f6\u00eb\u0001\u0000\u0000\u0000\u00f7\u001f\u0001\u0000\u0000" +
                    "\u0000\u00f8\u00f9\u0005\u0002\u0000\u0000\u00f9\u00fb\u0005\u0013\u0000" +
                    "\u0000\u00fa\u00fc\u0005\u0014\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000" +
                    "\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000" +
                    "\u0000\u00fd\u00fe\u0005\u0006\u0000\u0000\u00fe!\u0001\u0000\u0000\u0000" +
                    "\u00ff\u0100\u0005\u0002\u0000\u0000\u0100\u0101\u0003$\u0012\u0000\u0101" +
                    "\u0102\u0005\u0006\u0000\u0000\u0102#\u0001\u0000\u0000\u0000\u0103\u0104" +
                    "\u0007\u0001\u0000\u0000\u0104%\u0001\u0000\u0000\u0000\u0105\u0106\u0003" +
                    "(\u0014\u0000\u0106\u0107\u0003*\u0015\u0000\u0107\'\u0001\u0000\u0000" +
                    "\u0000\u0108\u0109\u0005\u0002\u0000\u0000\u0109\u010a\u0005\u0018\u0000" +
                    "\u0000\u010a\u010b\u0003V+\u0000\u010b\u010f\u0005\u0006\u0000\u0000\u010c" +
                    "\u010e\u0003\u0002\u0001\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e" +
                    "\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f" +
                    "\u0110\u0001\u0000\u0000\u0000\u0110)\u0001\u0000\u0000\u0000\u0111\u010f" +
                    "\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0002\u0000\u0000\u0113\u0115" +
                    "\u0005\u0013\u0000\u0000\u0114\u0116\u0005\u0018\u0000\u0000\u0115\u0114" +
                    "\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117" +
                    "\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0006\u0000\u0000\u0118+\u0001" +
                    "\u0000\u0000\u0000\u0119\u011a\u0003.\u0017\u0000\u011a\u011b\u00030\u0018" +
                    "\u0000\u011b-\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0002\u0000\u0000" +
                    "\u011d\u011e\u0005\u0019\u0000\u0000\u011e\u011f\u0003V+\u0000\u011f\u0123" +
                    "\u0005\u0006\u0000\u0000\u0120\u0122\u0003\u0002\u0001\u0000\u0121\u0120" +
                    "\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121" +
                    "\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124/\u0001" +
                    "\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u0005" +
                    "\u0002\u0000\u0000\u0127\u0129\u0005\u0013\u0000\u0000\u0128\u012a\u0005" +
                    "\u0019\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001" +
                    "\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005" +
                    "\u0006\u0000\u0000\u012c1\u0001\u0000\u0000\u0000\u012d\u0131\u00034\u001a" +
                    "\u0000\u012e\u0130\u00036\u001b\u0000\u012f\u012e\u0001\u0000\u0000\u0000" +
                    "\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000" +
                    "\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000" +
                    "\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u00038\u001c\u0000\u0135" +
                    "3\u0001\u0000\u0000\u0000\u0136\u0137\u0005\u0002\u0000\u0000\u0137\u0138" +
                    "\u0005\u0015\u0000\u0000\u0138\u0139\u0003<\u001e\u0000\u0139\u013d\u0005" +
                    "\u0006\u0000\u0000\u013a\u013c\u0003\u0002\u0001\u0000\u013b\u013a\u0001" +
                    "\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001" +
                    "\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e5\u0001\u0000" +
                    "\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0002" +
                    "\u0000\u0000\u0141\u0142\u0005\u0016\u0000\u0000\u0142\u0143\u0003<\u001e" +
                    "\u0000\u0143\u0147\u0005\u0006\u0000\u0000\u0144\u0146\u0003\u0002\u0001" +
                    "\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000" +
                    "\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000" +
                    "\u0000\u01487\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000" +
                    "\u014a\u014b\u0005\u0002\u0000\u0000\u014b\u014d\u0005\u0013\u0000\u0000" +
                    "\u014c\u014e\u0005\u0015\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000" +
                    "\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000" +
                    "\u014f\u0150\u0005\u0006\u0000\u0000\u01509\u0001\u0000\u0000\u0000\u0151" +
                    "\u0153\u0005\u0002\u0000\u0000\u0152\u0154\u0003<\u001e\u0000\u0153\u0152" +
                    "\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155" +
                    "\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0006\u0000\u0000\u0156;\u0001" +
                    "\u0000\u0000\u0000\u0157\u015d\u0003>\u001f\u0000\u0158\u0159\u0003D\"" +
                    "\u0000\u0159\u015a\u0003>\u001f\u0000\u015a\u015c\u0001\u0000\u0000\u0000" +
                    "\u015b\u0158\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000" +
                    "\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000" +
                    "\u015e=\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160" +
                    "\u0162\u0003B!\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0165\u0001" +
                    "\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001" +
                    "\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0163\u0001" +
                    "\u0000\u0000\u0000\u0166\u016a\u0003@ \u0000\u0167\u0169\u0003F#\u0000" +
                    "\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000" +
                    "\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000" +
                    "\u016b?\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d" +
                    "\u0170\u0003T*\u0000\u016e\u0170\u0003V+\u0000\u016f\u016d\u0001\u0000" +
                    "\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170A\u0001\u0000\u0000" +
                    "\u0000\u0171\u0172\u0007\u0002\u0000\u0000\u0172C\u0001\u0000\u0000\u0000" +
                    "\u0173\u0174\u0007\u0003\u0000\u0000\u0174E\u0001\u0000\u0000\u0000\u0175" +
                    "\u0176\u0003H$\u0000\u0176G\u0001\u0000\u0000\u0000\u0177\u0178\u0005" +
                    "\u0007\u0000\u0000\u0178\u018c\u0003V+\u0000\u0179\u017a\u0005\u0007\u0000" +
                    "\u0000\u017a\u017b\u0003V+\u0000\u017b\u0187\u0005\u001d\u0000\u0000\u017c" +
                    "\u0181\u0003J%\u0000\u017d\u017e\u0005\b\u0000\u0000\u017e\u0180\u0003" +
                    "J%\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000" +
                    "\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000" +
                    "\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000" +
                    "\u0000\u0184\u0186\u0005\b\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000" +
                    "\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000" +
                    "\u0187\u017c\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000" +
                    "\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u001e\u0000\u0000" +
                    "\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0177\u0001\u0000\u0000\u0000" +
                    "\u018b\u0179\u0001\u0000\u0000\u0000\u018cI\u0001\u0000\u0000\u0000\u018d" +
                    "\u018e\u0003V+\u0000\u018e\u018f\u0005\t\u0000\u0000\u018f\u0191\u0001" +
                    "\u0000\u0000\u0000\u0190\u018d\u0001\u0000\u0000\u0000\u0190\u0191\u0001" +
                    "\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0003" +
                    "<\u001e\u0000\u0193K\u0001\u0000\u0000\u0000\u0194\u0196\u0003V+\u0000" +
                    "\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000" +
                    "\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000" +
                    "\u0198M\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a" +
                    "\u019c\u0003V+\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c\u019f\u0001" +
                    "\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001" +
                    "\u0000\u0000\u0000\u019e\u01a0\u0001\u0000\u0000\u0000\u019f\u019d\u0001" +
                    "\u0000\u0000\u0000\u01a0\u01a1\u0003V+\u0000\u01a1O\u0001\u0000\u0000" +
                    "\u0000\u01a2\u01a4\u0003V+\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4" +
                    "\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5" +
                    "\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7" +
                    "\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ad\u0003V+\u0000\u01a9\u01aa\u0005" +
                    "\u001c\u0000\u0000\u01aa\u01ac\u0003V+\u0000\u01ab\u01a9\u0001\u0000\u0000" +
                    "\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000" +
                    "\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01aeQ\u0001\u0000\u0000\u0000" +
                    "\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b5\u0003V+\u0000\u01b1\u01b2" +
                    "\u0007\u0004\u0000\u0000\u01b2\u01b4\u0003V+\u0000\u01b3\u01b1\u0001\u0000" +
                    "\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000" +
                    "\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6S\u0001\u0000\u0000" +
                    "\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01bd\u0003V+\u0000\u01b9" +
                    "\u01ba\u0005\u001c\u0000\u0000\u01ba\u01bc\u0003V+\u0000\u01bb\u01b9\u0001" +
                    "\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001" +
                    "\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01beU\u0001\u0000" +
                    "\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c1\u0007\u0005" +
                    "\u0000\u0000\u01c1W\u0001\u0000\u0000\u00000aclsu|\u0084\u008c\u0092\u0098" +
                    "\u009c\u00a7\u00b0\u00bb\u00c1\u00c7\u00d2\u00d8\u00e3\u00e7\u00f0\u00f4" +
                    "\u00f6\u00fb\u010f\u0115\u0123\u0129\u0131\u013d\u0147\u014d\u0153\u015d" +
                    "\u0163\u016a\u016f\u0181\u0185\u0187\u018b\u0190\u0197\u019d\u01a5\u01ad" +
                    "\u01b5\u01bd";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}