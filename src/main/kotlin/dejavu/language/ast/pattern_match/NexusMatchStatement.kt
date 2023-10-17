package dejavu.language.ast.pattern_match

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.impl.source.tree.CompositeElement
import dejavu.language.ast.DejavuIdentifierNode
import dejavu.language.psi.ValkyrieScopeNode
import valkyrie.ide.highlight.DejavuHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import javax.swing.Icon

class NexusMatchStatement(node: CompositeElement) : ValkyrieScopeNode(node), NexusHighlightElement {
    val bind by lazy { DejavuIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        if (bind != null) {
            // maybe mutable
            e.register(bind, DejavuHighlightColor.SYM_LOCAL)
        }
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Actions.InlayRenameInNoCodeFilesActive
    }

    override fun getPresentation(): ItemPresentation {
        return PresentationData("match", null, this.baseIcon, null)
    }
}

