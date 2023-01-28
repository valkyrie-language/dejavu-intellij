package valkyrie.ide.codegen

import com.intellij.icons.ExpUiIcons
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

private val name = nexus.language.NexusBundle.message("action.generate.operators.name")
private val description = nexus.language.NexusBundle.message("action.generate.operators.help")


class GenerateOperators : AnAction(name, description, ExpUiIcons.FileTypes.Patch) {
    override fun actionPerformed(e: AnActionEvent) {

    }
}