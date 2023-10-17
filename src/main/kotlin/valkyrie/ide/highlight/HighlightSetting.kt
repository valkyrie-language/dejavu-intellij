package valkyrie.ide.highlight

import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import dejavu.language.file.DejavuIconProvider

class HighlightSetting : ColorSettingsPage {
    private val annotatorTags = NexusHighlightColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = NexusHighlightColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = dejavu.language.NexusBundle.message("filetype.name")

    override fun getIcon() = DejavuIconProvider.Instance.Valkyrie

    override fun getHighlighter() = TokenHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags

    override fun getDemoText(): String {
        val file = javaClass.getResource("/templates/code-highlight.dejavu");
        return file?.readText() ?: ""
    }
}

