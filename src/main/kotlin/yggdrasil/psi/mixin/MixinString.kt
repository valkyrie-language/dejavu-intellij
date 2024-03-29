package dejavu.psi.mixin

import com.intellij.lang.ASTNode
import dejavu.psi.DejavuElement
import dejavu.psi.node.YggdrasilString

abstract class MixinString(node: ASTNode) : DejavuElement(node),
    YggdrasilString {


//    override fun getPresentation(): ItemPresentation? {
//        return PresentationData("YggdrasilClass", "YggdrasilClass", AllIcons.Nodes.Class, null)
//    }

}

