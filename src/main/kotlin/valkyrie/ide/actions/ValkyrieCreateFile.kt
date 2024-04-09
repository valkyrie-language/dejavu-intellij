package valkyrie.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog.Builder
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import dejavu.language.file.IconProvider

class ValkyrieCreateFile :
    CreateFileFromTemplateAction(name, description, IconProvider.Instance.File) {
    companion object {
        private val name = yggdrasil.language.YggdrasilBundle.message("action.create_file")
        private val description = yggdrasil.language.YggdrasilBundle.message("action.create_file.description")

        // See [resources/colors/fileTemplate]
        private const val templatePath = "Valkyrie File"
    }

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: Builder) {
        builder.setTitle(name).addKind("Empty file", IconProvider.Instance.File, templatePath)
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = name
}
