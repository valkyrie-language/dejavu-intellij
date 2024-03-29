package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import dejavu.psi.YggdrasilElement
import dejavu.psi.node.YggdrasilAttribute
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter

abstract class MixinAttribute(node: ASTNode) : YggdrasilElement(node), YggdrasilAttribute {

    override fun getName(): String {
        return this.identifier.text ?: ""
    }

    override fun highlight(visitor: NodeHighlighter) {
        visitor.highlight(this.firstChild, HighlightColor.SYM_MACRO)
        visitor.highlight(this.identifier, HighlightColor.SYM_MACRO)
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData("@${name}", "", AllIcons.Nodes.Annotationtype, null)
    }
}

