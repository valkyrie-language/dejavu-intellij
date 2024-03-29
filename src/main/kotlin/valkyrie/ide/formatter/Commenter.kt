package valkyrie.ide.formatter

class Commenter : com.intellij.lang.Commenter {
    override fun getLineCommentPrefix() = null
    override fun getBlockCommentPrefix() = "/*"
    override fun getBlockCommentSuffix() = "*/"
    override fun getCommentedBlockCommentPrefix() = null
    override fun getCommentedBlockCommentSuffix() = null


    override fun blockCommentRequiresFullLineSelection(): Boolean {
        return false
    }
}
