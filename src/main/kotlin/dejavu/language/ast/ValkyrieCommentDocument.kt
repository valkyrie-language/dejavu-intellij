package dejavu.language.ast


import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiDocCommentBase
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.PsiTreeUtil
import dejavu.antlr.NexusAntlrLexer
import org.antlr.intellij.adaptor.lexer.TokenIElementType


class ValkyrieCommentDocument(node: CompositeElement) : ASTWrapperPsiElement(node), PsiDocCommentBase {
    private val documentText: String = node.text;

    override fun getTokenType(): IElementType {
        return TokenIElementType(NexusAntlrLexer.BLOCK_COMMENT, "CommentBlock", dejavu.language.DejavuLanguage)
    }
    override fun getOwner(): PsiElement? {
        return PsiTreeUtil.skipWhitespacesAndCommentsForward(this)
    }

    fun render(): String {
        return "<div>$documentText<div>"
    }
}

