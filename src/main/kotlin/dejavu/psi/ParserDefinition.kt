package dejavu.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import dejavu.psi.parser.YggdrasilParser
import dejavu.language.DejavuLanguage
import yggdrasil.language.file.YggdrasilFileNode

object ParserDefinition : ParserDefinition {
    fun createLexer(): Lexer = FlexAdapter(_DejavuLexer(null))
    override fun createLexer(project: Project): Lexer = FlexAdapter(_DejavuLexer(null))
    override fun createParser(project: Project): PsiParser = YggdrasilParser()
    override fun getFileNodeType(): IFileElementType = IFileElementType(DejavuLanguage)
    override fun getCommentTokens(): TokenSet =
        TokenSet.create(DejavuTypes.COMMENT_LINE, DejavuTypes.COMMENT_BLOCK)

    override fun getStringLiteralElements(): TokenSet = TokenSet.create()
    override fun getWhitespaceTokens(): TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    override fun createElement(node: ASTNode): PsiElement = DejavuTypes.Factory.createElement(node)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = YggdrasilFileNode(viewProvider)
    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }
}