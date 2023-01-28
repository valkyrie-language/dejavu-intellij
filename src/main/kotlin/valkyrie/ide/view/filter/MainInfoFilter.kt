package valkyrie.ide.view.filter


import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.smartTree.ActionPresentation
import com.intellij.ide.util.treeView.smartTree.ActionPresentationData
import com.intellij.ide.util.treeView.smartTree.Filter
import com.intellij.ide.util.treeView.smartTree.TreeElement
import nexus.language.ast.classes.ValkyrieClassFieldNode
import nexus.language.ast.classes.ValkyrieClassMethodNode
import nexus.language.ast.classes.ValkyrieClassStatement
import valkyrie.ide.view.ValkyrieStructureItem


class MainInfoFilter : Filter {
    override fun getName() = "view.MainInfoFilter"

    override fun isReverted() = false
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        nexus.language.NexusBundle.message(this.name),
        null,
        AllIcons.Nodes.Favorite
    )

    override fun isVisible(node: TreeElement): Boolean {
        if (node is ValkyrieStructureItem) {
            when (node.node) {
                // class
                is ValkyrieClassStatement -> return true
                is ValkyrieClassFieldNode -> return true
                is ValkyrieClassMethodNode -> return true
            }
        }
        return false;
    }
}
