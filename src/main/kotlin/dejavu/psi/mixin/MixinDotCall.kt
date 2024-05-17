package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import dejavu.ide.highlight.HighlightColor
import dejavu.ide.highlight.NodeHighlighter
import dejavu.psi.DejavuElement
import dejavu.psi.node.DejavuDotCall
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




}


fun DejavuDotCall.highlight(highlighter: NodeHighlighter) {
    if (this.argumentList == null) {
        highlighter.highlight(this.identifierFree, HighlightColor.SYM_FIELD)
    } else {
        highlighter.highlight(this.identifierFree, HighlightColor.SYM_FUNCTION)
    }
}