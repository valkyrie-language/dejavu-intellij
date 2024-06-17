package dejavu.ide.hint

import com.intellij.codeInsight.hints.VcsCodeVisionLanguageContext
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import dejavu.psi.node.DejavuDeclarationTemplate
import dejavu.psi.node.DejavuSlotElement
import java.awt.event.MouseEvent

@Suppress("UnstableApiUsage")
class AuthorAbove : VcsCodeVisionLanguageContext {
    /// 额外的点击事件
    /// 本身会打开 Git Blame
    override fun handleClick(mouseEvent: MouseEvent, editor: Editor, element: PsiElement) {

    }

    override fun isAccepted(element: PsiElement): Boolean {
        return element is DejavuSlotElement
            || element is DejavuDeclarationTemplate
//            || element is YggdrasilClimbStatement
//            || element is YggdrasilGrammarNode
    }

    override fun computeEffectiveRange(element: PsiElement): TextRange {
        return super.computeEffectiveRange(element)
    }

    override fun isCustomFileAccepted(file: PsiFile): Boolean {
        return false
    }
}


