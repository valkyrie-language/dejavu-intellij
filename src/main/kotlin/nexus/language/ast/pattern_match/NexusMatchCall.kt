package nexus.language.ast.pattern_match

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.ast.ValkyrieIdentifierNode
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class NexusMatchCall(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement {
    val bind by lazy { ValkyrieIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        if (bind != null) {
            e.register(bind, NexusHighlightColor.SYM_LOCAL)
        }
    }
}