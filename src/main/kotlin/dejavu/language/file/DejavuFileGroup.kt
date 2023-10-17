package dejavu.language.file

import com.intellij.ide.projectView.ProjectViewNestingRulesProvider
import com.intellij.ide.projectView.ProjectViewNestingRulesProvider.Consumer
import org.jetbrains.annotations.NotNull

class DejavuFileGroup : ProjectViewNestingRulesProvider {
    override fun addFileNestingRules(@NotNull consumer: Consumer) {
        fold(consumer, "js", "ts", "cs", "rs")
        fold(consumer, "md")
    }
}

private fun fold(consumer: Consumer, vararg es: String) {
    for (e in es) {
        consumer.addNestingRule(".${e}.dj", ".${e}")
        consumer.addNestingRule(".${e}.dejavu", ".${e}")
    }
}