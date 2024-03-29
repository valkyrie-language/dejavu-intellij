package dejavu.language

import com.intellij.lang.Language


private const val LANGUAGE_ID = "dejavu"


object DejavuLanguage : Language(LANGUAGE_ID) {
    private fun readResolve(): Any = DejavuLanguage
    override fun getID(): String {
        return LANGUAGE_ID
    }

    override fun getDisplayName(): String {
        return "Déjà vu"
    }

    override fun getMimeTypes(): Array<String> {
        return arrayOf("text/x-dejavu")
    }
}