package valkyrie.language

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType

private const val LANGUAGE_ID = "Nexus"


object NexusLanguage : Language(LANGUAGE_ID) {
    private fun readResolve(): Any = NexusLanguage
    override fun getID(): String {
        return LANGUAGE_ID
    }
    override fun getDisplayName(): String {
        return super.getDisplayName()
    }

    override fun getAssociatedFileType(): LanguageFileType? {
        return super.getAssociatedFileType()
    }
    override fun getMimeTypes(): Array<String> {
        return arrayOf("text/x-valkyrie")
    }
}