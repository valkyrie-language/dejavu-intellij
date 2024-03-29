package dejavu.psi.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import dejavu.psi.DejavuElement
import dejavu.psi.node.DejavuIdentifierNode
import dejavu.psi.node.DejavuNamepath
import valkyrie.ide.reference.declaration.ValkyrieReference

abstract class MixinNamepath(node: ASTNode) : DejavuElement(node), DejavuNamepath {
    override fun getNameIdentifier(): DejavuIdentifierNode {
        return this.identifierList.last() as DejavuIdentifierNode
    }

    override fun getName(): String? {
        return nameIdentifier.name
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }


    override fun getReference(): ValkyrieReference? {
//        if (this.parent is YggdrasilClassNode) {
        return null
//        }
//        if (this.parent is YggdrasilDefineUnion) {
//            return null
//        }
//        return ValkyrieReference(this as YggdrasilIdentifierNode)
    }


}