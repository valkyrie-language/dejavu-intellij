package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import dejavu.psi.DejavuElement
import dejavu.psi.node.DejavuClassElement
import dejavu.psi.node.DejavuDotCall
import dejavu.psi.node.DejavuIdentifierNode
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import javax.swing.Icon

abstract class MixinClass(node: ASTNode) : DejavuElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    DejavuClassElement {

    override fun getNameIdentifier(): DejavuIdentifierNode? {
        return this.namepath?.identifierList?.lastOrNull() as? DejavuIdentifierNode
    }

    override fun getName(): String? {
        return nameIdentifier?.text
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.AbstractClass
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", baseIcon, null)
    }
}

abstract class MixinDotCall(node: ASTNode) : DejavuElement(node),
    NavigatablePsiElement,
    DejavuDotCall {

    override fun getName(): String? {
        return identifierFree.text
    }


    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.AbstractClass
    }

    fun highlight(highlighter: NodeHighlighter) {
        if (this.argumentList == null) {
            highlighter.highlight(this, HighlightColor.SYM_FIELD)
        }
        else {
            highlighter.highlight(this, HighlightColor.SYM_FUNCTION)
        }
    }


}

