package nexus.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.antlr.childrenWithLeaves
import nexus.language.ast.ValkyrieNamepathNode
import nexus.language.psi.ValkyrieHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class ValkyrieAnnotationItem(node: CompositeElement) : ASTWrapperPsiElement(node), ValkyrieHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        val id = this.findChildByClass(ValkyrieNamepathNode::class.java) ?: return;
        for (node in id.childrenWithLeaves) {
            e.register_macro(node)
        }
    }
}

