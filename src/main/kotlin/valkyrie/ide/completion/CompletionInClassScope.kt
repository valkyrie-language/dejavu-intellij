package valkyrie.ide.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PsiElementPattern
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement
import com.intellij.util.ProcessingContext
import nexus.language.file.NexusIconProvider
import valkyrie.ide.completion.TemplateReplaceElement.Companion.snippetFromPath


class CompletionInClassScope : CompletionProvider<CompletionParameters>() {
    var element: PsiElement? = null;
    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
        element = parameters.position
//        result.addTopMacros()
        addOperationDeclare(result)
        result.addLinkedTraitMethod("constructor", "Constructor")
        result.addLinkedTraitMethod("extractor", "Extractor")
        result.addLinkedTraitMethod("destructor", "Destructor")
        result.addLinkedTraitMethod("hash", "Hash")
        result.addLinkedTraitMethod("from", "From[T]", "value: T")
        result.addLinkedTraitMethod("apply", "Caller")
        result.addLinkedTraitMethod("unapply", "Extractor")
    }

    private fun CompletionResultSet.addLinkedTraitMethod(kind: String, trait: String, args: String = "") {
        val element = LookupElementBuilder.create(kind)
            .withIcon(NexusIconProvider.Instance.Function)
            .withTypeText(trait, NexusIconProvider.Instance.TRAIT, false)
            .withInsertHandler { context, _ ->
                val document = context.document
                document.replaceString(context.startOffset, context.tailOffset, "$kind($args) {}")
                context.editor.caretModel.moveToOffset(context.tailOffset - 1)
            }
        this.addElement(element)
    }

    private fun addOperationDeclare(result: CompletionResultSet) {
        result.addInfix("+", setOf("infix add", "infix plus"))
        result.addInfix("+=", setOf("infix add assign", "infix plus assign"))
        result.addInfix("-", setOf("infix sub", "infix minus"))
        result.addInfix("-=", setOf("infix sub assign", "infix minus assign"))
        result.addInfix("*", setOf("infix mul", "infix times"))
        result.addInfix("*=", setOf("infix mul assign", "infix mul assign"))
    }

    private fun CompletionResultSet.addInfix(show: String, lookup: Set<String> = setOf()) {
        if (element == null) {
            return
        }

        val item = snippetFromPath(
            element!!,
            "infix $show",
            "def_operator.ft",
            mapOf(
                "KIND" to "infix",
                "OPERATOR" to show
            )
        )
            .withIcon(NexusIconProvider.Instance.Operator)
            .withLookupStrings(lookup)
        addElement(item)
    }


    companion object {
        val Condition = triggerCondition();
    }
}

private fun triggerCondition(): PsiElementPattern.Capture<LeafPsiElement> {
    return PlatformPatterns.psiElement(LeafPsiElement::class.java).withLanguage(nexus.language.NexusLanguage);
}