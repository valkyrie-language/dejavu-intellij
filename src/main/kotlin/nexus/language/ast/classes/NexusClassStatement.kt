package nexus.language.ast.classes

import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.RelatedItemLineMarkerInfo
import com.intellij.icons.AllIcons
import com.intellij.navigation.GotoRelatedItem
import com.intellij.navigation.ItemPresentation
import com.intellij.openapi.editor.markup.GutterIconRenderer
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.antlr.traversal
import nexus.language.ast.ValkyrieIdentifierNode
import nexus.language.ast.ValkyrieModifiedNode
import nexus.language.file.NexusFileNode
import nexus.language.file.NexusIconProvider
import nexus.language.psi.ValkyrieLineMarkElement
import nexus.language.psi.ValkyrieRewritableElement
import nexus.language.psi.ValkyrieScopeNode
import valkyrie.ide.formatter.ValkyrieRewriter
import valkyrie.ide.highlight.NexusHighlightColor
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter
import valkyrie.ide.view.IdentifierPresentation
import javax.swing.Icon


class NexusClassStatement(node: CompositeElement) : ValkyrieScopeNode(node), PsiNameIdentifierOwner, ValkyrieLineMarkElement,
    NexusHighlightElement, ValkyrieRewritableElement {
    private val _identifier by lazy { ValkyrieIdentifierNode.find(this)!! }
    val modifiers by lazy { ValkyrieModifiedNode.findModifiers(this) };

    override fun getName(): String {
        return _identifier.text;
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getNameIdentifier(): ValkyrieIdentifierNode {
        return _identifier;
    }

    override fun getBaseIcon(): Icon {
        return NexusIconProvider.Instance.CLASS
    }

    override fun getContainingFile(): NexusFileNode {
        return super.getContainingFile() as NexusFileNode
    }

    override fun getPresentation(): ItemPresentation {
        return IdentifierPresentation(_identifier, this.baseIcon)
    }


    fun getFields(): Array<NexusClassFieldNode> {
        val output = mutableListOf<NexusClassFieldNode>();
        this.traversal {
            if (it is NexusClassFieldNode) {
                output.add(it);
                false
            } else {
                true
            }
        }
        return output.toTypedArray()
    }

    override fun on_highlight(e: NodeHighlighter) {
        e.register(nameIdentifier, NexusHighlightColor.SYM_CLASS)
        e.register_modifiers(modifiers)
    }

    override fun on_rewrite(e: ValkyrieRewriter) {
        for (field in getFields()) {
            e.fixDelimiter(field, e.settings.class_field_trailing)
        }
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

