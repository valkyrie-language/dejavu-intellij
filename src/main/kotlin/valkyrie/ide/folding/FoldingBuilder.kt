package valkyrie.ide.folding

import com.intellij.lang.ASTNode
import com.intellij.lang.folding.FoldingBuilder
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.project.DumbAware
import com.intellij.psi.util.PsiTreeUtil
import dejavu.language.file.DejavuFileNode
import dejavu.psi.node.DejavuMatchElement
import dejavu.psi.node.DejavuUsingElement


class FoldingBuilder : FoldingBuilder, DumbAware {
    override fun buildFoldRegions(node: ASTNode, document: Document): Array<FoldingDescriptor> {
        val file = node.psi;
        if (file !is DejavuFileNode) {
            return emptyArray()
        }
        val visitor = FoldingVisitor()
        PsiTreeUtil.processElements(file) {
            it.accept(visitor);
            true
        }
        return visitor.finish()
    }


    override fun getPlaceholderText(node: ASTNode) = when (val o = node.psi) {
        is DejavuMatchElement -> {
            o.foldPlaceholder()
        }

        else -> "..."
    }

    override fun isCollapsedByDefault(node: ASTNode) = when (val o = node.psi) {
        is DejavuUsingElement -> {
            true
        }

        else -> false
    }
}
