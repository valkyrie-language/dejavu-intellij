package yggdrasil.language

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType


private const val LANGUAGE_ID = "dejavu"


object DejavuLanguage : Language(LANGUAGE_ID) {
    private fun readResolve(): Any = DejavuLanguage
    override fun getID(): String {
        return LANGUAGE_ID
    }

    override fun getDisplayName(): String {
        return "Déjà vu"
    }

    override fun getAssociatedFileType(): LanguageFileType? {
        return super.getAssociatedFileType()
    }

    override fun getMimeTypes(): Array<String> {
        return arrayOf("text/x-dejavu")
    }
}