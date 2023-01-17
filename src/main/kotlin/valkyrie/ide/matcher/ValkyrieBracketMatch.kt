package valkyrie.ide.matcher

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import nexus.language.antlr.NexusAntlrLexer
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import valkyrie.language.NexusLanguage
import valkyrie.language.antlr.NexusLexer


class ValkyrieBracketMatch : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = arrayOf(
        BracePair(Instance.BraceL, Instance.BraceR, true),
        BracePair(Instance.BracketL, Instance.BracketR, true),
        BracePair(Instance.ParenthesisL, Instance.ParenthesisR, true),
        BracePair(Instance.GenericL, Instance.GenericR, true),
//        BracePair(STRING_START, STRING_END, true),
    )

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean {
        val insertPairBraceBefore = TokenSet.orSet(
            NexusLexer.Comments, TokenSet.orSet(
                TokenSet.create(TokenType.WHITE_SPACE),
//                COMMA,
                Instance.Right
            )
        )
        return next in insertPairBraceBefore
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    object Instance {
        val ParenthesisL = TokenIElementType(NexusAntlrLexer.PARENTHESES_L, ")", NexusLanguage);
        val ParenthesisR = TokenIElementType(NexusAntlrLexer.PARENTHESES_R, "(", NexusLanguage);
        val BracketL = TokenIElementType(NexusAntlrLexer.BRACKET_L, "[", NexusLanguage);
        val BracketR = TokenIElementType(NexusAntlrLexer.BRACKET_R, "]", NexusLanguage);
        val BraceL = TokenIElementType(NexusAntlrLexer.BRACE_L, "{", NexusLanguage);
        val BraceR = TokenIElementType(NexusAntlrLexer.BRACE_R, "}", NexusLanguage);

        val GenericL = TokenIElementType(NexusAntlrLexer.GENERIC_L, "<", NexusLanguage);
        val GenericR = TokenIElementType(NexusAntlrLexer.GENERIC_R, ">", NexusLanguage);

        val Left = TokenSet.create(
            ParenthesisL, BracketL, BraceL, GenericL
        )
        val Right = TokenSet.create(
            ParenthesisR, BracketR, BraceR, GenericR
        )
    }
}

