package valkyrie.ide.actions.file_transform

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog.Builder
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import dejavu.language.file.DejavuIconProvider

class ValkyrieCreateFile :
    CreateFileFromTemplateAction(name, description, DejavuIconProvider.Instance.Valkyrie) {
    companion object {
        private val name = dejavu.language.DejavuBundle.message("action.create_file")
        private val description = dejavu.language.DejavuBundle.message("action.create_file.description")

        // See [resources/colors/fileTemplate]
        private const val templatePath = "Valkyrie File";
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: Builder) {
        builder.setTitle(name).addKind("Empty file", DejavuIconProvider.Instance.Valkyrie, templatePath)
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = name
}
