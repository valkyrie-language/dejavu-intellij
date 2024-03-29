package valkyrie.ide.view

import com.intellij.navigation.ColoredItemPresentation
import com.intellij.openapi.editor.colors.TextAttributesKey
import dejavu.psi.node.YggdrasilIdentifierNode
import valkyrie.ide.highlight.HighlightColor
import javax.swing.Icon

class IdentifierPresentation(val name: YggdrasilIdentifierNode?, private val icon: Icon) : ColoredItemPresentation {
    override fun getPresentableText(): String {
        return name?.name ?: "[Missing]"
    }

    override fun getIcon(unused: Boolean): Icon {
        return icon
    }

    override fun getTextAttributesKey(): TextAttributesKey {
        return HighlightColor.IDENTIFIER.textAttributesKey
    }

}