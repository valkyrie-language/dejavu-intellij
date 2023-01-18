package valkyrie.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import valkyrie.language.NexusBundle
import valkyrie.language.NexusLanguage
import javax.swing.Icon

object NexusFileType : LanguageFileType(NexusLanguage) {
    override fun getName(): String = NexusLanguage.id

    override fun getDescription(): String = NexusBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "vk;valkyrie;"

    override fun getIcon(): Icon = NexusIconProvider.Instance.Valkyrie

}