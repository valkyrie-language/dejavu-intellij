package dejavu.ide.highlight


import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import dejavu.language.file.DejavuFileNode
import dejavu.psi.mixin.highlight
import dejavu.psi.node.*

class NodeHighlighter : DejavuVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null

    override fun visitUsingAlias(o: DejavuUsingAlias) {
        highlight(o.identifier, HighlightColor.SYM_FUNCTION)
        highlight(o.namepath.lastChild, HighlightColor.SYM_FUNCTION)
    }

    override fun visitPair(o: DejavuPair) {
        highlight(o.identifier, HighlightColor.SYM_FIELD)
    }

    override fun visitArgument(o: DejavuArgument) {
        o.identifier?.let { highlight(it, HighlightColor.SYM_ARGUMENT) }
    }

    override fun visitClassElement(o: DejavuClassElement) {
        o.namepath?.lastChild?.let { highlight(it, HighlightColor.SYM_CLASS) }
    }

    override fun visitLetStatement(o: DejavuLetStatement) {
        o.highlight(this)
    }

    override fun visitSlotElement(o: DejavuSlotElement) {
        o.highlight(this)
    }

    override fun visitDotCall(o: DejavuDotCall) {
        o.highlight(this)
    }

    override fun visitFunctionCall(o: DejavuFunctionCall) {
        o.highlight(this)
    }

    override fun visitPattern(o: DejavuPattern) {
        o.highlight(this)
    }

    fun highlight(element: PsiElement?, color: HighlightColor) {
        if (element == null) return
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)

        infoHolder?.add(builder.create())
    }

    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable,
    ): Boolean {
        infoHolder = holder
        action.run()

        return true
    }

    override fun clone(): HighlightVisitor = NodeHighlighter()

    override fun suitableForFile(file: PsiFile): Boolean = file is DejavuFileNode

    override fun visit(element: PsiElement) = element.accept(this)
}