package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import dejavu.psi.DejavuElement
import dejavu.psi.node.DejavuPattern
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import javax.swing.Icon

abstract class MixinPattern(node: ASTNode) : DejavuElement(node),
    DejavuPattern {


    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.AbstractClass
    }

    override fun highlight(highlighter: NodeHighlighter) {
        this.identifier?.let { highlighter.highlight(it, HighlightColor.SYM_LOCAL) }
    }


}


