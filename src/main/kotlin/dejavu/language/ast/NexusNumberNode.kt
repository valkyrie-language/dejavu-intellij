package dejavu.language.ast

import com.intellij.lang.ASTNode
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import valkyrie.ide.highlight.DejavuHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class NexusNumberNode(node: ASTNode) : ANTLRPsiNode(node), NexusHighlightElement {
    val handler by lazy {
        PsiTreeUtil.getChildOfType(this, DejavuIdentifierNode::class.java)
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(handler, DejavuHighlightColor.SYM_MACRO)
    }
}