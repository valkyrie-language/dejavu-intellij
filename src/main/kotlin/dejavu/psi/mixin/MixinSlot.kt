package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import dejavu.ide.highlight.HighlightColor
import dejavu.ide.highlight.NodeHighlighter
import dejavu.psi.DejavuDeclare
import dejavu.psi.node.DejavuIdentifierNode
import dejavu.psi.node.DejavuSlotElement
import javax.swing.Icon

abstract class MixinSlot(node: ASTNode) : DejavuDeclare(node), DejavuSlotElement {
    override fun getNameIdentifier(): DejavuIdentifierNode? {
        return this.templateSlot.identifier as? DejavuIdentifierNode
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Gvariable
    }
}

fun DejavuSlotElement.highlight(highlighter: NodeHighlighter) {
    this as MixinSlot
    this.nameIdentifier?.let { highlighter.highlight(it, HighlightColor.SYM_BUILTIN) }
}

