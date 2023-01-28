package valkyrie.ide.codegen

import com.intellij.icons.AllIcons
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent


private val name = nexus.language.NexusBundle.message("action.generate.properties.name")
private val description = nexus.language.NexusBundle.message("action.generate.properties.help")


class GenerateProperties : AnAction(name, description, AllIcons.Nodes.Property) {
    override fun actionPerformed(e: AnActionEvent) {

    }

    override fun getTemplateText(): String? {
        return super.getTemplateText()
    }
}