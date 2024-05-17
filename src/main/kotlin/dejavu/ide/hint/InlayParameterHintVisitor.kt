package dejavu.ide.hint

import com.intellij.codeInsight.hints.InlayInfo
import com.intellij.psi.PsiElement
import com.intellij.psi.util.endOffset
import dejavu.psi.node.DejavuFunctionCall
import dejavu.psi.node.DejavuVisitor

@Suppress("UnstableApiUsage")
class InlayParameterHintVisitor : DejavuVisitor() {
    private var info: MutableList<InlayInfo> = mutableListOf()

    override fun visitElement(element: PsiElement) {
        if (element is DejavuFunctionCall) {
            visitFunctionCall(element)
        }
    }

    override fun visitFunctionCall(o: DejavuFunctionCall) {
        o.argumentList?.firstChild?.endOffset?.let { hint(it, "x:") }
    }

    private fun hint(start: Int, text: String) {
        info.add(InlayInfo(text, start))
    }

    fun finish(): MutableList<InlayInfo> {
        return info
    }
}