package dejavu.language.antlr

import com.intellij.lexer.Lexer
import com.intellij.lexer.LexerPosition
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import dejavu.language.DejavuLanguage
import dejavu.language.antlr.DejavuAntlrLexer.*
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory

class NexusLexer : Lexer() {
    private var adaptor: ANTLRLexerAdaptor

    init {
        val lexer = DejavuAntlrLexer(null)
        this.adaptor = ANTLRLexerAdaptor(DejavuLanguage, lexer)
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
            DejavuLanguage,
            // declare keywords
            KW_IMPORT, KW_AS, KW_IN,

            //

            // conditional
            KW_IF, KW_ELSE, KW_END,
            // control flow

            KW_FOR, KW_IN,
            // which/match/catch
            KW_MATCH, KW_CASE,
            // control keywords
            KW_SLOT,
            //

        )
        val OperatorPrefix: TokenSet = PSIElementTypeFactory.createTokenSet(
            DejavuLanguage,
            TEMPLATE_L

        )
        val OperatorInfix: TokenSet = PSIElementTypeFactory.createTokenSet(
            DejavuLanguage,


            )
        val OperatorSuffix: TokenSet = PSIElementTypeFactory.createTokenSet(
            DejavuLanguage,
            TEMPLATE_R
        )
        val Operators = TokenSet.orSet(
            OperatorPrefix,
            OperatorInfix,
            OperatorSuffix
        );
        val MacroOperators = PSIElementTypeFactory.createTokenSet(DejavuLanguage);
        val Escapes: TokenSet = PSIElementTypeFactory.createTokenSet(DejavuLanguage, TEMPLATE_E);
        val Comma: TokenSet = PSIElementTypeFactory.createTokenSet(DejavuLanguage);
        val Semicolon: TokenSet = PSIElementTypeFactory.createTokenSet(DejavuLanguage);
        val Integers: TokenSet = PSIElementTypeFactory.createTokenSet(DejavuLanguage);
        val Decimals: TokenSet = PSIElementTypeFactory.createTokenSet(DejavuLanguage);
        val Strings: TokenSet = PSIElementTypeFactory.createTokenSet(DejavuLanguage);
        val Identifiers: TokenSet = PSIElementTypeFactory.createTokenSet(DejavuLanguage);

        val Comments: TokenSet = PSIElementTypeFactory.createTokenSet(DejavuLanguage);
        val CompletionWords: TokenSet = PSIElementTypeFactory.createTokenSet(
            DejavuLanguage,

            )
    }
}
