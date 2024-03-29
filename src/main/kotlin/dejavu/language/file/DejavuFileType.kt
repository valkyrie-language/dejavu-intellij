package dejavu.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import dejavu.language.DejavuLanguage
import dejavu.language.file.IconProvider
import javax.swing.Icon

object DejavuFileType : LanguageFileType(DejavuLanguage) {
    override fun getName(): String = DejavuLanguage.id

    override fun getDescription(): String = yggdrasil.language.YggdrasilBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "dejavu;"

    override fun getIcon(): Icon = IconProvider.Instance.File
}