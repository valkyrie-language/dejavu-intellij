package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import dejavu.psi.DejavuElement
import dejavu.psi.node.DejavuDotCall
import dejavu.psi.node.DejavuFunctionCall
import dejavu.ide.highlight.HighlightColor
import dejavu.ide.highlight.NodeHighlighter
import javax.swing.Icon

abstract class MixinDotCall(node: ASTNode) : DejavuElement(node),
    NavigatablePsiElement,
    DejavuDotCall {

    override fun getName(): String? {
        return identifierFree.text
    }


    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.AbstractClass
    }

    override fun highlight(highlighter: NodeHighlighter) {
        if (this.argumentList == null) {
            highlighter.highlight(this.identifierFree, HighlightColor.SYM_FIELD)
        } else {
            highlighter.highlight(this.identifierFree, HighlightColor.SYM_FUNCTION)
        }
    }


}

abstract class MixinFunctionCall(node: ASTNode) : DejavuElement(node),
    NavigatablePsiElement,
    DejavuFunctionCall {

    override fun getName(): String? {
        return namepath.nameIdentifier?.text
    }


    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.AbstractClass
    }

    override fun highlight(highlighter: NodeHighlighter) {
        if (namepath.nameIdentifier == null) {
            return
        }
        val keywords = setOf("self", "true", "false", "null")
        val id = namepath.nameIdentifier!!;
        if (keywords.contains(name)) {
            highlighter.highlight(id, HighlightColor.KEYWORD)
        } else if (this.argumentList == null) {
            highlighter.highlight(id, HighlightColor.SYM_LOCAL)
        } else {
            highlighter.highlight(id, HighlightColor.SYM_FUNCTION)
        }
    }
}


