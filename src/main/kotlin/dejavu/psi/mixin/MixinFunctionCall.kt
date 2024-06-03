package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import dejavu.ide.highlight.HighlightColor
import dejavu.ide.highlight.NodeHighlighter
import dejavu.psi.DejavuElement
import dejavu.psi.node.DejavuFunctionCall
import dejavu.psi.node.DejavuNamepathNode
import javax.swing.Icon

abstract class MixinFunctionCall(node: ASTNode) : DejavuElement(node), NavigatablePsiElement, DejavuFunctionCall {
    override fun getName(): String? {
        return (namepath as? DejavuNamepathNode)?.nameIdentifier?.text
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.AbstractClass
    }
}

fun DejavuFunctionCall.highlight(highlighter: NodeHighlighter) {
    this as MixinFunctionCall
    val id = (namepath as? DejavuNamepathNode)?.nameIdentifier ?: return;
    val keywords = setOf("self", "true", "false", "null")
    if (keywords.contains(name)) {
        highlighter.highlight(id, HighlightColor.KEYWORD)
    } else if (this.argumentList == null) {
        highlighter.highlight(id, HighlightColor.SYM_LOCAL)
    } else {
        highlighter.highlight(id, HighlightColor.SYM_FUNCTION)
    }
}