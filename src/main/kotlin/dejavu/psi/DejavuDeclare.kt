package dejavu.psi

import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import dejavu.psi.node.DejavuIdentifierNode
import javax.swing.Icon

abstract class DejavuDeclare(node: ASTNode) : DejavuElement(node), PsiNameIdentifierOwner {
    abstract override fun getNameIdentifier(): DejavuIdentifierNode?;

    override fun getName(): String? {
        return nameIdentifier?.text
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", baseIcon, null)
    }
}