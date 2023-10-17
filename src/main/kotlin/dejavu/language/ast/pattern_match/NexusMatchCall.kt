package dejavu.language.ast.pattern_match

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import dejavu.language.ast.DejavuIdentifierNode
import valkyrie.ide.highlight.DejavuHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class NexusMatchCall(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement {
    val bind by lazy { DejavuIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        if (bind != null) {
            e.register(bind, DejavuHighlightColor.SYM_LOCAL)
        }
    }
}