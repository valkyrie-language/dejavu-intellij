package valkyrie.ide.actions.ast_transform

import com.intellij.codeInsight.intention.PriorityAction
import com.intellij.codeInspection.LocalQuickFixAndIntentionActionOnPsiElement
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.Iconable
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.CheckUtil
import dejavu.language.file.DejavuFileNode
import dejavu.language.file.DejavuIconProvider
import javax.swing.Icon

class CreateNamespace(private val element: DejavuFileNode) : LocalQuickFixAndIntentionActionOnPsiElement(element), PriorityAction, Iconable {
    override fun startInWriteAction(): Boolean {
        return true
    }

    override fun getFamilyName(): String {
        return "getFamilyName"
    }

    override fun getText(): String {
        return dejavu.language.DejavuBundle.message("action.create.namespace.name")
    }

    fun getDescription(): String {
        return dejavu.language.DejavuBundle.message("action.create.namespace.help")
    }

    override fun invoke(project: Project, file: PsiFile, editor: Editor?, startElement: PsiElement, endElement: PsiElement) {
        CheckUtil.checkWritable(element)
        editor!!.document.insertString(0, "namespace std.create.test;\n")
    }

    override fun getIcon(flags: Int): Icon {
        return DejavuIconProvider.Instance.NAMESPACE
    }

    override fun getPriority(): PriorityAction.Priority {
        return PriorityAction.Priority.LOW
    }
}