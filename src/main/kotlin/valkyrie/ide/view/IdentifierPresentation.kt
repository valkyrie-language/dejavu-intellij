package valkyrie.ide.view

import com.intellij.navigation.ColoredItemPresentation
import com.intellij.openapi.editor.colors.TextAttributesKey
import dejavu.language.ast.DejavuIdentifierNode
import valkyrie.ide.highlight.DejavuHighlightColor
import javax.swing.Icon

class IdentifierPresentation(val name: DejavuIdentifierNode?, private val icon: Icon) : ColoredItemPresentation {
    override fun getPresentableText(): String {
        return name?.name ?: "[Missing]"
    }

    override fun getIcon(unused: Boolean): Icon {
        return icon
    }

    override fun getTextAttributesKey(): TextAttributesKey {
        return DejavuHighlightColor.IDENTIFIER.textAttributesKey
    }

}