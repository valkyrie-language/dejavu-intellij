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
import dejavu.psi.node.DejavuExtendsElement
import dejavu.psi.node.DejavuIdentifierNode
import javax.swing.Icon

abstract class MixinExtends(node: ASTNode) : DejavuElement(node),
    NavigatablePsiElement,
    DejavuExtendsElement {

    override fun getName(): String? {
        return this.string?.text
    }


    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.ModelClass
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", baseIcon, null)
    }
}