package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import com.intellij.psi.NavigatablePsiElement
import dejavu.ide.highlight.HighlightColor
import dejavu.ide.highlight.NodeHighlighter
import dejavu.psi.DejavuElement
import dejavu.psi.node.DejavuLetStatement
import javax.swing.Icon

abstract class MixinLet(node: ASTNode) : DejavuElement(node),
    NavigatablePsiElement,
    DejavuLetStatement {

    override fun getName(): String? {
        return identifierFree?.text
    }


    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.AbstractClass
    }


}


fun DejavuLetStatement.highlight(highlighter: NodeHighlighter) {
    this as MixinLet
    this.identifierFree?.let { highlighter.highlight(it, HighlightColor.SYM_LOCAL) }
}
