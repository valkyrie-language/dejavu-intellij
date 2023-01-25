package valkyrie.ide.hint

//import valkyrie.language.psi_node.ValkyrieDefineStatementNode
//import valkyrie.language.psi_node.ValkyrieExtendsStatementNode
//import valkyrie.language.psi_node.ValkyrieUnionStatementNode
import com.intellij.codeInsight.hints.VcsCodeVisionLanguageContext
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import valkyrie.language.ast.ValkyrieFunctionStatement
import valkyrie.language.ast.classes.ValkyrieClassMethodNode
import valkyrie.language.ast.classes.ValkyrieClassStatement
import java.awt.event.MouseEvent

@Suppress("UnstableApiUsage")
class AuthorAbove : VcsCodeVisionLanguageContext {
    /// 额外的点击事件
    /// 本身会打开 Git Blame
    override fun handleClick(mouseEvent: MouseEvent, editor: Editor, element: PsiElement) {

    }

    override fun isAccepted(element: PsiElement): Boolean {
        return element is ValkyrieClassStatement
            || element is ValkyrieFunctionStatement
            || element is ValkyrieClassMethodNode
    }

    override fun isCustomFileAccepted(file: PsiFile): Boolean {
        return false
    }
}


