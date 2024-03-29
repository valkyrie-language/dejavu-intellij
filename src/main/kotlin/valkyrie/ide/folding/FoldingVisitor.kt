package valkyrie.ide.folding

import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.TokenType.WHITE_SPACE
import com.intellij.psi.util.elementType
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset
import dejavu.psi.DejavuTypes.*
import dejavu.psi.node.*
import yggdrasil.antlr.childrenWithLeaves


class FoldingVisitor : DejavuVisitorRecursive() {

    private val descriptors: MutableList<FoldingDescriptor> = mutableListOf()

    override fun visitDeclarationTemplate(o: DejavuDeclarationTemplate) {
        for (child in o.childrenWithLeaves) {
            if (child.elementType == KW_TEMPLATE) {
                fold(o, child.endOffset, o.lastChild.startOffset)
            }
        }
    }

    override fun visitUsingElement(o: DejavuUsingElement) {
        for (child in o.childrenWithLeaves) {
            if (child.elementType == BRACE_L) {
                fold(o, child.endOffset, o.lastChild.startOffset)
            }
        }
    }

    override fun visitProgramTemplate(o: DejavuProgramTemplate) {
        for (child in o.childrenWithLeaves) {
            if (child.elementType == KW_PROGRAM) {
                if (child.prevSibling.elementType == WHITE_SPACE) {
                    fold(o, child.endOffset, o.lastChild.startOffset - 1)
                } else {
                    fold(o, child.endOffset, o.lastChild.startOffset)
                }
            }
        }
    }

    override fun visitIfElement(o: DejavuIfElement) {
        fold(o, o.ifStatement.templateIf.lastChild.startOffset, o.templateEnd.lastChild.startOffset)
    }

    override fun visitForElement(o: DejavuForElement) {
        var start = o.forStatement.templateFor.endOffset;
        val endNode = o.templateEnd.lastChild;
        for (child in o.forStatement.templateFor.childrenWithLeaves) {
            if (child.elementType == KW_IN) {
                start = child.startOffset
            }
        }
        if (endNode.prevSibling.elementType == WHITE_SPACE) {
            fold(o, start, endNode.startOffset - 1)
        } else {
            fold(o, start, endNode.startOffset)
        }
    }

    override fun visitMatchElement(o: DejavuMatchElement) {
        val startNode = o.matchStatement.templateMatch.lastChild;
        val endNode = o.templateEnd.lastChild;
        if (endNode.prevSibling.elementType == WHITE_SPACE) {
            fold(o, startNode.startOffset, endNode.startOffset - 1)
        } else {
            fold(o, startNode.startOffset, endNode.startOffset)
        }
    }

    private fun fold(node: PsiElement, range: TextRange) {
        fold(node, range.startOffset, range.endOffset)
    }

    private fun PsiElement.endButWhitespace(): Int {
        val last = this.lastChild;
        return if (last.elementType == WHITE_SPACE) {
            last.startOffset - 1
        } else {
            last.startOffset
        }
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


