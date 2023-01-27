package valkyrie.language.antlr

import com.intellij.lexer.Lexer
import com.intellij.lexer.LexerPosition
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import nexus.language.antlr.NexusAntlrLexer
import nexus.language.antlr.NexusAntlrLexer.*
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
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
            KW_AS,
            //

            // conditional

            // control flow

            KW_FOR, KW_IN,
            // which/match/catch

            // control keywords

            //

        )
        val OperatorPrefix: TokenSet = PSIElementTypeFactory.createTokenSet(
            NexusLanguage,
            TEMPLATE_L

        )
        val OperatorInfix: TokenSet = PSIElementTypeFactory.createTokenSet(
            NexusLanguage,


            )
        val OperatorSuffix: TokenSet = PSIElementTypeFactory.createTokenSet(
            NexusLanguage,
            TEMPLATE_R
        )
        val Operators = TokenSet.orSet(OperatorPrefix, OperatorInfix, OperatorSuffix);
        val MacroOperators = PSIElementTypeFactory.createTokenSet(NexusLanguage);

        val Comma: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage);
        val Semicolon: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage);
        val Integers: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage);
        val Decimals: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage);
        val Strings: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage);
        val Identifiers: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage);

        val Comments: TokenSet = PSIElementTypeFactory.createTokenSet(NexusLanguage);
        val CompletionWords: TokenSet = PSIElementTypeFactory.createTokenSet(
            NexusLanguage,

            )
    }
}
