package dejavu.language

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType

private const val LANGUAGE_ID = "Dejavu"


object DejavuLanguage : Language(dejavu.language.LANGUAGE_ID) {
    private fun readResolve(): Any = dejavu.language.DejavuLanguage
    override fun getID(): String {
        return dejavu.language.LANGUAGE_ID
    }
    override fun getDisplayName(): String {
        return super.getDisplayName()
    }

    override fun getAssociatedFileType(): LanguageFileType? {
        return super.getAssociatedFileType()
    }
    override fun getMimeTypes(): Array<String> {
        return arrayOf("text/x-dejavu")
    }
}