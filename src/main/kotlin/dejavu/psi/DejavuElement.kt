package dejavu.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import javax.swing.Icon

open class DejavuElement(node: ASTNode) : ASTWrapperPsiElement(node) {
    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Gvariable
    }
}

