package valkyrie.ide.runner

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import javax.swing.Icon

open class ValkyrieAction(val id: String, val icon: Icon) :
    AnAction(dejavu.language.NexusBundle.message("$id.name"), dejavu.language.NexusBundle.message("$id.help"), icon) {
    override fun actionPerformed(e: AnActionEvent) {

    }
}