package valkyrie.language.antlr

import com.intellij.lexer.Lexer
import com.intellij.lexer.LexerPosition
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import nexus.language.antlr.NexusAntlrLexer
import nexus.language.antlr.NexusAntlrLexer.*
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import valkyrie.language.NexusLanguage

class NexusLexer : Lexer() {
    private var adaptor: ANTLRLexerAdaptor

    init {
        val lexer = NexusAntlrLexer(null)
        this.adaptor = ANTLRLexerAdaptor(NexusLanguage, lexer)
    }

    override fun start(buffer: CharSequence, startOffset: Int, endOffset: Int, initialState: Int) {
        return adaptor.start(buffer, startOffset, endOffset, initialState)
    }

    override fun getState(): Int {
        return adaptor.state
    }

    override fun getTokenType(): IElementType? {
        return adaptor.tokenType
    }

    override fun getTokenStart(): Int {
        return adaptor.tokenStart
    }

    override fun getTokenEnd(): Int {
        return adaptor.tokenEnd
    }

    override fun advance() {
        adaptor.advance()
    }

    override fun getCurrentPosition(): LexerPosition {
        return adaptor.currentPosition
    }

    override fun restore(position: LexerPosition) {
        adaptor.restore(position)
    }

    override fun getBufferSequence(): CharSequence {
        return adaptor.bufferSequence
    }

    override fun getBufferEnd(): Int {
        return adaptor.bufferEnd
    }

    companion object {
        val Keywords: TokenSet = PSIElementTypeFactory.createTokenSet(
            NexusLanguage,
            // declare keywords
            KW_NAMESPACE, KW_IMPORT, KW_AS,
            KW_CLASS, KW_TYPE,
            KW_UNION, KW_BITFLAGS,
            KW_TRAIT, KW_EXTENDS,
            KW_FUNCTION, KW_LAMBDA,
            KW_LET,
            //
            KW_TEMPLATE, KW_WHERE,
            // conditional
            KW_IF, KW_ELSE,
            // control flow
            KW_WHILE,
            KW_FOR, KW_IN,
            // which/match/catch
            KW_WITCH, KW_MATCH, KW_CATCH,
            KW_WITH, KW_WHEN, KW_CASE,
            KW_TRY,
            // control keywords
            RETURN,
            BREAK, CONTINUE,
            //
            KW_NEW, KW_OBJECT,
            SPECIAL,
            OP_AND_THEN, OP_OR_ELSE, OP_OR_DEFAULT, KW_NOT, KW_IS,
        )
        val OperatorPrefix: TokenSet = PSIElementTypeFactory.createTokenSet(
            NexusLanguage,
            OP_NOT, OP_DECONSTRUCT, OP_REFERENCE, OP_INVERSE, OP_ROOT3, OP_ROOT4, TEMPLATE_L

        )
        val OperatorInfix: TokenSet = PSIElementTypeFactory.createTokenSet(
            NexusLanguage,
            OP_ADD, OP_SUB,
            OP_MUL,
            OP_DIV, OP_REM, OP_DIV_REM,
            OP_POW,
            LOGIC_OR, LOGIC_AND, LOGIC_XOR, LOGIC_NOR, LOGIC_NAND, LOGIC_XAND,
            OP_OR, OP_AND, OP_BIND,
            OP_EQ, OP_NE, OP_EEE, OP_NEE,
            OP_LT, OP_LEQ, OP_LL, OP_LLL,
            OP_GT, OP_GEQ, OP_GG, OP_GGG,
            OP_LLE, OP_GGE,
            OP_UNTIL,
            OP_IN, OP_NOT_IN,
            OP_IS, OP_IS_NOT,
            OP_MAP, OP_APPLY2, OP_APPLY3
        )
        val OperatorSuffix: TokenSet = PSIElementTypeFactory.createTokenSet(
            NexusLanguage,
            OP_TEMPERATURE, OP_PERCENT, OP_TRANSPOSE, TEMPLATE_R
        )
        val Operators = TokenSet.orSet(OperatorPrefix, OperatorInfix, OperatorSuffix);
        val MacroOperators = PSIElementTypeFactory.createTokenSet(NexusLanguage, OP_HASH, OP_AT);

        val Comma: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage, COMMA);
        val Semicolon: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage, SEMICOLON);
        val Dot = TokenIElementType(DOT, ".", NexusLanguage);
        val Proportion = TokenIElementType(OP_PROPORTION, ".", NexusLanguage);
        val Integers: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage, INTEGER);
        val Decimals: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage, DECIMAL);
        val Strings: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage, STRING_SINGLE, STRING_DOUBLE);
        val Identifiers: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage, UNICODE_ID);

        val Comments: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage, BLOCK_COMMENT);
        val CompletionWords: TokenSet = PSIElementTypeFactory.createTokenSet(
            NexusLanguage,
            KW_IF,
            KW_ELSE,
            KW_TRAIT,
            UNICODE_ID,
        )
    }
}
