package yggdrasil.settings

import com.intellij.lang.Language
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider
import dejavu.language.DejavuLanguage

class YggdrasilCodeStyleSettings : LanguageCodeStyleSettingsProvider() {
    override fun getLanguage(): Language {
        return DejavuLanguage
    }

    override fun getCodeSample(p0: SettingsType): String? {
        return null
    }
}