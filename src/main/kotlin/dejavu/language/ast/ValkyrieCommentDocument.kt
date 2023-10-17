package dejavu.language.ast


import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiDocCommentBase
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.PsiTreeUtil
import dejavu.language.DejavuLanguage
import dejavu.language.antlr.DejavuAntlrLexer
import org.antlr.intellij.adaptor.lexer.TokenIElementType


class ValkyrieCommentDocument(node: CompositeElement) : ASTWrapperPsiElement(node), PsiDocCommentBase {
    private val documentText: String = node.text;

    override fun getTokenType(): IElementType {
        return TokenIElementType(DejavuAntlrLexer.BLOCK_COMMENT, "CommentBlock", DejavuLanguage)
    }
    override fun getOwner(): PsiElement? {
        return PsiTreeUtil.skipWhitespacesAndCommentsForward(this)
    }

    fun render(): String {
        return "<div>$documentText<div>"
    }
}

