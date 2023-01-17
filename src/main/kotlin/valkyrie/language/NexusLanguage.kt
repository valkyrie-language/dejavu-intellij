package valkyrie.language

import com.intellij.lang.Language

private const val LANGUAGE_ID = "Nexus"


object NexusLanguage : Language(LANGUAGE_ID) {
    private fun readResolve(): Any = NexusLanguage
    override fun getDisplayName(): String {
        return super.getDisplayName()
    }

    override fun getMimeTypes(): Array<String> {
        return arrayOf("text/x-valkyrie")
    }
}