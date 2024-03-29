package dejavu.psi.mixin

import com.intellij.icons.AllIcons
import com.intellij.lang.ASTNode
import dejavu.psi.DejavuElement
import dejavu.psi.node.DejavuMatchBranch
import dejavu.psi.node.DejavuMatchElement
import javax.swing.Icon

abstract class MixinMatch(node: ASTNode) : DejavuElement(node), DejavuMatchElement {
    override fun getBaseIcon(): Icon {
        return AllIcons.Nodes.Enum
    }

    override fun foldPlaceholder(): String {
        val count = matchBranchList.count { it is DejavuMatchBranch }
        return when (count) {
            0 -> "0 branch"
            1 -> "1 branch"
            else -> "$count branches"
        }
    }
}