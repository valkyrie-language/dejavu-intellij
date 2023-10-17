package dejavu.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import dejavu.antlr.childrenWithLeaves
import dejavu.language.ast.NexusNamepathNode
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class NexusAnnotationItem(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        val id = this.findChildByClass(NexusNamepathNode::class.java) ?: return;
        for (node in id.childrenWithLeaves) {
            e.register_macro(node)
        }
    }
}

