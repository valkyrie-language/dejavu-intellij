package dejavu.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.DejavuHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class DejavuDotCall(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement {
    val function by lazy { DejavuIdentifierNode.find(this) }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(function, DejavuHighlightColor.SYM_FUNCTION_FREE)
    }
}