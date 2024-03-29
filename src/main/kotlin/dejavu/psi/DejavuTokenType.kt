package dejavu.psi

import com.intellij.psi.tree.IElementType
import yggdrasil.language.DejavuLanguage

class DejavuTokenType(debugName: String) : IElementType(debugName, DejavuLanguage) {
    override fun toString(): String = "YggdrasilToken.${super.toString()}"
}