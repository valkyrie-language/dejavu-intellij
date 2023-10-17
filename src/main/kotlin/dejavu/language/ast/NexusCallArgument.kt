package dejavu.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import valkyrie.ide.highlight.DejavuHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter


class NexusCallArgument(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement {
    val key by lazy { DejavuIdentifierNode.find(this) }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(key, DejavuHighlightColor.SYM_ARG)
    }


}