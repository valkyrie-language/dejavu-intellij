package valkyrie.ide.matcher

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import dejavu.language.antlr.DejavuAntlrLexer
import dejavu.language.antlr.DejavuLexer
import org.antlr.intellij.adaptor.lexer.TokenIElementType


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
            DejavuLexer.Comments, TokenSet.orSet(
                TokenSet.create(TokenType.WHITE_SPACE),
//                COMMA,
                Instance.Right
            )
        )
        return next in insertPairBraceBefore
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    object Instance {
        val ParenthesisL = TokenIElementType(DejavuAntlrLexer.PARENTHESES_L, ")", dejavu.language.DejavuLanguage);
        val ParenthesisR = TokenIElementType(DejavuAntlrLexer.PARENTHESES_R, "(", dejavu.language.DejavuLanguage);
        val BracketL = TokenIElementType(DejavuAntlrLexer.BRACKET_L, "[", dejavu.language.DejavuLanguage);
        val BracketR = TokenIElementType(DejavuAntlrLexer.BRACKET_R, "]", dejavu.language.DejavuLanguage);
        val BraceL = TokenIElementType(DejavuAntlrLexer.BRACE_L, "{", dejavu.language.DejavuLanguage);
        val BraceR = TokenIElementType(DejavuAntlrLexer.BRACE_R, "}", dejavu.language.DejavuLanguage);

        val GenericL = TokenIElementType(DejavuAntlrLexer.GENERIC_L, "<", dejavu.language.DejavuLanguage);
        val GenericR = TokenIElementType(DejavuAntlrLexer.GENERIC_R, ">", dejavu.language.DejavuLanguage);

        val Left = TokenSet.create(
            ParenthesisL, BracketL, BraceL, GenericL
        )
        val Right = TokenSet.create(
            ParenthesisR, BracketR, BraceR, GenericR
        )
    }
}

