package dejavu.language.file

import com.intellij.icons.AllIcons
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import javax.swing.Icon

class IconProvider : com.intellij.ide.IconProvider() {
    override fun getIcon(psiElement: PsiElement, flags: Int): Icon? {
        val file = psiElement.containingFile
        return when {
            file != null && file.name.endsWith(".dejavu") -> {
                Instance.File
            }

            else -> {
                null
            }
        }
    }

    object Instance {
        val File = IconLoader.getIcon("/icons/dejavu.svg", IconProvider::class.java)
        val SNIPPET = AllIcons.Actions.MoreHorizontal
        val CLASS = AllIcons.Nodes.Class
        val UNION = AllIcons.Nodes.Enum
        val TRAIT = AllIcons.Nodes.Interface
        val Function = AllIcons.Nodes.Function
    }
}