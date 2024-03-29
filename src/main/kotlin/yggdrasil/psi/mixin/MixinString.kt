package dejavu.psi.mixin

import com.intellij.lang.ASTNode
import dejavu.psi.YggdrasilElement
import dejavu.psi.node.YggdrasilString

abstract class MixinString(node: ASTNode) : YggdrasilElement(node),
    YggdrasilString {


//    override fun getPresentation(): ItemPresentation? {
//        return PresentationData("YggdrasilClass", "YggdrasilClass", AllIcons.Nodes.Class, null)
//    }

}

