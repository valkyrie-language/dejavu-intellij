package nexus.language.ast.pattern_match

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.ast.ValkyrieIdentifierNode
import nexus.language.psi.ValkyrieHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.highlight.ValkyrieHighlightColor

class ValkyrieMatchCall(node: CompositeElement) : ASTWrapperPsiElement(node), ValkyrieHighlightElement {
    val bind by lazy { ValkyrieIdentifierNode.find(this) }
    override fun on_highlight(e: NodeHighlighter) {
        if (bind != null) {
            e.register(bind, ValkyrieHighlightColor.SYM_LOCAL)
        }
    }
}