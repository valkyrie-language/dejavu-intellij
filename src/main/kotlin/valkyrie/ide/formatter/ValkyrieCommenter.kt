package valkyrie.ide.formatter

import com.intellij.lang.CodeDocumentationAwareCommenter
import com.intellij.psi.PsiComment
import com.intellij.psi.tree.IElementType
import com.intellij.psi.util.elementType
import valkyrie.language.antlr.NexusLexer

//import valkyrie.language.psi.ValkyrieTypes

class ValkyrieCommenter : CodeDocumentationAwareCommenter {
    override fun getLineCommentPrefix() = "//"
    override fun getBlockCommentPrefix() = "/*"
    override fun getBlockCommentSuffix() = "*/"
    override fun getCommentedBlockCommentPrefix() = "*//*"
    override fun getCommentedBlockCommentSuffix() = "*//*"
    override fun getLineCommentPrefixes(): MutableList<String> {
        return super.getLineCommentPrefixes()
    }

    override fun blockCommentRequiresFullLineSelection(): Boolean {
        return false
    }

    override fun getLineCommentTokenType(): IElementType {
        return NexusLexer.CommentLine
    }

    override fun getBlockCommentTokenType(): IElementType {
        return NexusLexer.CommentBlock
    }

    override fun getDocumentationCommentTokenType(): IElementType? = null
    override fun getDocumentationCommentPrefix() = null
    override fun getDocumentationCommentSuffix() = null
    override fun getDocumentationCommentLinePrefix() = "//?"
    override fun isDocumentationComment(element: PsiComment?): Boolean {
        if (element == null || element.elementType != NexusLexer.CommentBlock) {
            return false
        }
        return element.text.startsWith(documentationCommentLinePrefix)
    }

    fun extractDocumentText(element: PsiComment): String? {
        if (element.elementType == NexusLexer.CommentLine && element.text.startsWith(documentationCommentLinePrefix)) {
            return element.text.substring(documentationCommentLinePrefix.length).trim()
        }
//        if (element.elementType == ValkyrieLexer.CommentBlock && element.text.startsWith(documentationCommentLinePrefix)) {
//            return element.text.substring(documentationCommentPrefix.length, element.text.length - documentationCommentSuffix.length).trim()
//        }
        return null
    }
}
