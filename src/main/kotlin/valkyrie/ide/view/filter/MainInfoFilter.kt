package valkyrie.ide.view.filter


import com.intellij.icons.AllIcons
import com.intellij.ide.util.treeView.smartTree.ActionPresentation
import com.intellij.ide.util.treeView.smartTree.ActionPresentationData
import com.intellij.ide.util.treeView.smartTree.Filter
import com.intellij.ide.util.treeView.smartTree.TreeElement
import dejavu.language.ast.classes.NexusClassFieldNode
import dejavu.language.ast.classes.NexusClassMethodNode
import dejavu.language.ast.classes.NexusClassStatement
import valkyrie.ide.view.ValkyrieStructureItem


class MainInfoFilter : Filter {
    override fun getName() = "view.MainInfoFilter"

    override fun isReverted() = false
    override fun getPresentation(): ActionPresentation = ActionPresentationData(
        dejavu.language.DejavuBundle.message(this.name),
        null,
        AllIcons.Nodes.Favorite
    )

    override fun isVisible(node: TreeElement): Boolean {
        if (node is ValkyrieStructureItem) {
            when (node.node) {
                // class
                is NexusClassStatement -> return true
                is NexusClassFieldNode -> return true
                is NexusClassMethodNode -> return true
            }
        }
        return false;
    }
}
