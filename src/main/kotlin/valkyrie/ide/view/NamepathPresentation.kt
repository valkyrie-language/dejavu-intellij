package valkyrie.ide.view

import com.intellij.navigation.ColoredItemPresentation
import com.intellij.openapi.editor.colors.TextAttributesKey
import dejavu.language.ast.NexusNamepathNode
import valkyrie.ide.highlight.DejavuHighlightColor
import javax.swing.Icon


class NamepathPresentation(val name: NexusNamepathNode, private val icon: Icon) : ColoredItemPresentation {
    override fun getPresentableText(): String {
        return name.name
    }

    override fun getLocationString(): String {
        return name.namespace
    }

    override fun getIcon(unused: Boolean): Icon {
        return icon
    }

    override fun getTextAttributesKey(): TextAttributesKey {
        return DejavuHighlightColor.IDENTIFIER.textAttributesKey
    }
}