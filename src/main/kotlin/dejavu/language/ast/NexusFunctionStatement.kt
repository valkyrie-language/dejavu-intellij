package dejavu.language.ast

//import nexus.language.psi.ValkyrieGenericDefine
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import dejavu.language.file.DejavuIconProvider
import dejavu.language.psi.ValkyrieScopeNode
import valkyrie.ide.highlight.DejavuHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.IdentifierPresentation
import javax.swing.Icon

class NexusFunctionStatement(node: CompositeElement) : ValkyrieScopeNode(node), PsiNameIdentifierOwner, NexusHighlightElement {
    val namepath by lazy { NexusNamepathNode.find(this) }
    val modifiers by lazy { NexusModifiedNode.findModifiers(this) };
    override fun getName(): String {
        return namepath?.nameIdentifier?.name ?: "[Unknown Function]"
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): DejavuIdentifierNode? {
        return namepath?.nameIdentifier
    }

    override fun getBaseIcon(): Icon {
        return DejavuIconProvider.Instance.Function
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(namepath?.nameIdentifier, this.baseIcon)
    }


    override fun on_highlight(e: NodeHighlighter) {
        e.register(nameIdentifier, DejavuHighlightColor.SYM_FUNCTION_FREE)
        e.register_modifiers(modifiers)
    }
}

