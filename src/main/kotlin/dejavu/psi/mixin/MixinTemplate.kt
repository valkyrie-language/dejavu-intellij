package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.util.lastLeaf
import dejavu.psi.DejavuElement
import dejavu.psi.node.DejavuDeclarationTemplate
import dejavu.psi.node.DejavuIdentifierNode
import javax.swing.Icon

abstract class MixinTemplate(node: ASTNode) : DejavuElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    DejavuDeclarationTemplate {

    override fun getName(): String? {
        return this.nameIdentifier?.name ?: "⟪anonymous⟫"
    }

    override fun getNameIdentifier(): DejavuIdentifierNode? {
        return this.namepath?.nameIdentifier as? DejavuIdentifierNode
    }


    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }


    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Controller
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", baseIcon, null)
    }
}