package valkyrie.ide.matcher

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import nexus.language.antlr.NexusAntlrLexer
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import valkyrie.language.ValkyrieLanguage
import valkyrie.language.antlr.ValkyrieLexer


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
            ValkyrieLexer.Comments, TokenSet.orSet(
                TokenSet.create(TokenType.WHITE_SPACE),
//                COMMA,
                Instance.Right
            )
        )
        return next in insertPairBraceBefore
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    object Instance {
        val ParenthesisL = TokenIElementType(NexusAntlrLexer.PARENTHESES_L, ")", ValkyrieLanguage);
        val ParenthesisR = TokenIElementType(NexusAntlrLexer.PARENTHESES_R, "(", ValkyrieLanguage);
        val BracketL = TokenIElementType(NexusAntlrLexer.BRACKET_L, "[", ValkyrieLanguage);
        val BracketR = TokenIElementType(NexusAntlrLexer.BRACKET_R, "]", ValkyrieLanguage);
        val BraceL = TokenIElementType(NexusAntlrLexer.BRACE_L, "{", ValkyrieLanguage);
        val BraceR = TokenIElementType(NexusAntlrLexer.BRACE_R, "}", ValkyrieLanguage);

        val GenericL = TokenIElementType(NexusAntlrLexer.GENERIC_L, "<", ValkyrieLanguage);
        val GenericR = TokenIElementType(NexusAntlrLexer.GENERIC_R, ">", ValkyrieLanguage);

        val Left = TokenSet.create(
            ParenthesisL, BracketL, BraceL, GenericL
        )
        val Right = TokenSet.create(
            ParenthesisR, BracketR, BraceR, GenericR
        )
    }
}

