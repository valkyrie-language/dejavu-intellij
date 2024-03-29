package dejavu.psi

import com.intellij.psi.tree.IElementType
import yggdrasil.language.DejavuLanguage

class DejavuElementType(debugName: String) : IElementType(debugName, DejavuLanguage) {
    override fun toString(): String = "YggdrasilElement.${super.toString()}"
}