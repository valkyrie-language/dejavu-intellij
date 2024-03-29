package dejavu.psi

import com.intellij.psi.tree.IElementType
import dejavu.language.DejavuLanguage

class DejavuTokenType(debugName: String) : IElementType(debugName, DejavuLanguage) {
    override fun toString(): String = "DejavuToken.${super.toString()}"
}