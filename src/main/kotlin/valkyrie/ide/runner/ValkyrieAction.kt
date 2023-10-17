package valkyrie.ide.runner

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import javax.swing.Icon

open class ValkyrieAction(val id: String, val icon: Icon) :
    AnAction(dejavu.language.DejavuBundle.message("$id.name"), dejavu.language.DejavuBundle.message("$id.help"), icon) {
    override fun actionPerformed(e: AnActionEvent) {

    }
}