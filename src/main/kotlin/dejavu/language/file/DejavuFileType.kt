package dejavu.language.file

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object DejavuFileType : LanguageFileType(dejavu.language.DejavuLanguage) {
    override fun getName(): String = dejavu.language.DejavuLanguage.id

    override fun getDescription(): String = dejavu.language.DejavuBundle.message("filetype.description")

    override fun getDefaultExtension(): String = "ne;nexus;"

    override fun getIcon(): Icon = DejavuIconProvider.Instance.Valkyrie

}