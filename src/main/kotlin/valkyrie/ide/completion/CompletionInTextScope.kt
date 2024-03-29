package valkyrie.ide.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.icons.AllIcons
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext
import dejavu.language.file.IconProvider

class CompletionInTextScope : CompletionProvider<CompletionParameters>() {
    var element: PsiElement? = null
    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
        element = parameters.position
        result.addTemplateSnippet("<for>", "for-in.dejavu", setOf("for-in"))
        result.addTemplateSnippet("<for-else>", "for-else.dejavu", setOf("for-else"))
        result.addTemplateSnippet("invoke", "invoke.dejavu")
    }

    private fun CompletionResultSet.addTemplateSnippet(id: String, file: String, lookup: Set<String> = setOf()) {
        if (element == null) {
            return
        }
        val item = TemplateReplaceElement.snippetFromPath(element!!, id, file)
            .bold()
            .withLookupStrings(lookup)
            .withIcon(IconProvider.Instance.SNIPPET)
        addElement(item)
    }

    private fun CompletionResultSet.addTemplate(vararg text: String) {
        for (s in text) {
            addElement(
                LookupElementBuilder.create(s).bold()
                    .withIcon(AllIcons.Actions.ProjectWideAnalysisOn)
            )
        }
    }

    private fun CompletionResultSet.addConstant(vararg texts: String) {
        for (s in texts) {

            addElement(
                LookupElementBuilder.create(s).bold()
                    .withIcon(AllIcons.Actions.ProjectWideAnalysisOff)
            )
        }
    }


}
