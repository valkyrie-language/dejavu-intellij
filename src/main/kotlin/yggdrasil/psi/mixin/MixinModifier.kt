package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import dejavu.psi.DejavuElement
import dejavu.psi.node.YggdrasilModifier
import javax.swing.Icon

abstract class MixinModifier(node: ASTNode) : DejavuElement(node), YggdrasilModifier {
    override fun getName(): String {
        return this.identifier.text ?: ""
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Annotationtype
    }


    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", baseIcon, null)
    }
}

