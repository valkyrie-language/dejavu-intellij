package nexus.language.ast.pattern_match

import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.ast.ValkyrieIdentifierNode
import nexus.language.psi.ValkyrieHighlightElement
import nexus.language.psi.ValkyrieScopeNode
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.ValkyrieHighlightColor
import javax.swing.Icon

class ValkyrieMatchStatement(node: CompositeElement) : ValkyrieScopeNode(node), ValkyrieHighlightElement {
    val bind by lazy { ValkyrieIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        if (bind != null) {
            // maybe mutable
            e.register(bind, ValkyrieHighlightColor.SYM_LOCAL)
        }
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Actions.InlayRenameInNoCodeFilesActive
    }

    override fun getPresentation(): ItemPresentation {
        return PresentationData("match", null, this.baseIcon, null)
    }
}

