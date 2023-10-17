package valkyrie.ide.highlight

import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import dejavu.language.file.DejavuIconProvider

class HighlightSetting : ColorSettingsPage {
    private val annotatorTags = DejavuHighlightColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = DejavuHighlightColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = dejavu.language.DejavuBundle.message("filetype.name")

    override fun getIcon() = DejavuIconProvider.Instance.Valkyrie

    override fun getHighlighter() = TokenHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags

    override fun getDemoText(): String {
        val file = javaClass.getResource("/templates/code-highlight.dejavu");
        return file?.readText() ?: ""
    }
}

