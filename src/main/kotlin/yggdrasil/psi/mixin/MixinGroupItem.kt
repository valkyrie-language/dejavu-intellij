package dejavu.psi.mixin

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.icons.AllIcons
import com.intellij.ide.projectView.PresentationData
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import dejavu.psi.DejavuElement
import dejavu.psi.node.YggdrasilGroupItem
import dejavu.psi.node.YggdrasilIdentifierNode
import valkyrie.ide.highlight.HighlightColor
import valkyrie.ide.highlight.NodeHighlighter
import javax.swing.Icon

abstract class MixinGroupItem(node: ASTNode) : DejavuElement(node),
    NavigatablePsiElement,
    PsiNameIdentifierOwner,
    YggdrasilGroupItem {
    override fun getNavigationElement(): PsiElement {
        return nameIdentifier ?: this
    }

    override fun getNameIdentifier(): YggdrasilIdentifierNode? {
        return this.identifierList.lastOrNull() as? YggdrasilIdentifierNode
    }


    override fun getName(): String {
        return nameIdentifier?.name ?: "⟪anonymous⟫"
    }


    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }

    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Constant
    }

    override fun getPresentation(): ItemPresentation? {
        return PresentationData(name, "", baseIcon, null)
    }

    override fun highlight(highlighter: NodeHighlighter) {
        this.identifierList.forEach {
            if (it == this.identifierList.lastOrNull()) {
                highlighter.highlight(it, HighlightColor.SYM_CONSTANT)
            } else {
                highlighter.highlight(it, HighlightColor.KEYWORD)
            }
        }
    }

    override fun createLookup(completions: MutableList<LookupElement>) {
        this.nameIdentifier?.let {
            completions.add(
                LookupElementBuilder.create(it)
                    .withIcon(baseIcon)
                    .withCaseSensitivity(false)
                    .withTypeText("withTypeText")
                    .withPresentableText(name)
                    .withTailText(" atomic", true)
            )
        }
    }
}

