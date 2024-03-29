package valkyrie.ide.folding

import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset
import dejavu.psi.node.DejavuForElement
import dejavu.psi.node.DejavuMatchElement


class FoldingVisitor : DejavuVisitorRecursive() {

    private val descriptors: MutableList<FoldingDescriptor> = mutableListOf()

    override fun visitMatchElement(o: DejavuMatchElement) {
        fold(o, o.matchStatement.templateMatch.endOffset, o.templateEnd.startOffset)
    }

    override fun visitForElement(o: DejavuForElement) {
        fold(o, o.forStatement.templateFor.endOffset, o.templateEnd.startOffset)
    }

    private fun fold(node: PsiElement, range: TextRange) {
        fold(node, range.startOffset, range.endOffset)
    }

    private fun fold(node: PsiElement, start: Int, end: Int) {
        if (end > start) {
            descriptors += FoldingDescriptor(node, TextRange(start, end))
        }
    }

    fun finish(): Array<FoldingDescriptor> {
        return descriptors.toTypedArray()
    }
}


