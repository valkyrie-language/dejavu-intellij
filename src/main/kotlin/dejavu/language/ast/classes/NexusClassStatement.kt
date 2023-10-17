package dejavu.language.ast.classes

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.icons.AllIcons
import com.intellij.navigation.GotoRelatedItem
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import dejavu.language.ast.DejavuIdentifierNode
import dejavu.language.ast.NexusNamepathNode
import dejavu.language.file.DejavuFileNode
import dejavu.language.file.DejavuIconProvider
import dejavu.language.psi.ValkyrieLineMarkElement
import dejavu.language.psi.ValkyrieScopeNode
import valkyrie.ide.highlight.DejavuHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.NamepathPresentation
import javax.swing.Icon


class NexusClassStatement(node: CompositeElement) : ValkyrieScopeNode(node), PsiNameIdentifierOwner, ValkyrieLineMarkElement,
    NexusHighlightElement {
    private val _path by lazy { NexusNamepathNode.find(this)!! }

    override fun getName(): String {
        return nameIdentifier.text;
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): DejavuIdentifierNode {
        return _path.nameIdentifier;
    }

    override fun getBaseIcon(): Icon {
        return DejavuIconProvider.Instance.CLASS
    }

    override fun getContainingFile(): DejavuFileNode {
        return super.getContainingFile() as DejavuFileNode
    }

    override fun getPresentation(): ItemPresentation {
        return NamepathPresentation(_path, this.baseIcon)
    }

    override fun on_highlight(e: NodeHighlighter) {
        val lang = DejavuIdentifierNode.find(this)
        if (lang != null) {
            e.register(lang, DejavuHighlightColor.SYM_LANGUAGE)
        }

        e.register(nameIdentifier, DejavuHighlightColor.SYM_CLASS)
    }

    override fun on_line_mark(e: MutableCollection<in LineMarkerInfo<*>>) {
        val info = RelatedItemLineMarkerInfo(
            nameIdentifier.firstChild,
            nameIdentifier.textRange,
            AllIcons.Gutter.OverridenMethod,
            null,
            null,
            GutterIconRenderer.Alignment.RIGHT // 上
        ) { mutableListOf(GotoRelatedItem(this)) }
        e.add(info)
    }
}

