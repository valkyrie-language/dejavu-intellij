package valkyrie.ide.folding

import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.TokenType.WHITE_SPACE
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.elementType
import com.intellij.refactoring.suggested.endOffset
import com.intellij.refactoring.suggested.startOffset
import dejavu.psi.DejavuTypes.*
import dejavu.psi.node.*
import yggdrasil.antlr.childrenWithLeaves


class FoldingVisitor : DejavuVisitorRecursive() {

    private val descriptors: MutableList<FoldingDescriptor> = mutableListOf()

    override fun visitDeclarationTemplate(o: DejavuDeclarationTemplate) {
        o.findStartToken(KW_TEMPLATE) {
            fold(o, it.endOffset, o.lastChild.startOffset)
        }
    }

    override fun visitUsingElement(o: DejavuUsingElement) {
        o.findStartToken(BRACE_L) {
            fold(o, it.endOffset, o.lastChild.startOffset)
        }
    }

    override fun visitClassElement(o: DejavuClassElement) {
        o.findStartToken(BRACE_L) {
            fold(o, it.endOffset, o.lastChild.startOffset)
        }
    }

    override fun visitProgramTemplate(o: DejavuProgramTemplate) {
        o.findStartToken(KW_PROGRAM) {
            fold(o, it.endOffset, o.lastChild.startOffset)
        }
    }

    override fun visitIfElement(o: DejavuIfElement) {
        fold(o, o.ifStatement.templateIf.lastChild.startOffset, o.templateEnd.lastChild.startOffset)
    }

    override fun visitForElement(o: DejavuForElement) {
        var start = o.forStatement.templateFor.endOffset;
        val end = o.templateEnd.lastButWhitespace();
        o.forStatement.templateFor.findStartToken(KW_IN) {
            start = it.startOffset
        }
        fold(o, start, end)
    }

    override fun visitMatchElement(o: DejavuMatchElement) {
        val startNode = o.matchStatement.templateMatch.lastChild;
        val end = o.templateEnd.lastButWhitespace();
        fold(o, startNode.startOffset, end)
    }

    private fun fold(node: PsiElement, range: TextRange) {
        fold(node, range.startOffset, range.endOffset)
    }

    private fun PsiElement.findStartToken(token: IElementType, then: (PsiElement) -> Unit) {
        for (child in childrenWithLeaves) {
            if (child.elementType == token) {
                then(child)
            }
        }
    }

    private fun PsiElement.lastButWhitespace(): Int {
        val last = this.lastChild;
        return if (last.prevSibling.elementType == WHITE_SPACE) {
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


