package dejavu.ide.highlight


import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase.pack
import com.intellij.psi.tree.IElementType
import dejavu.psi.DejavuTypes.*
import dejavu.psi.DejavuParserDefinition

class TokenHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer {
        return DejavuParserDefinition.createLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): HighlightColor? {
        return when (tokenType) {
            KW_TEMPLATE, KW_PROGRAM, KW_EXTENDS, KW_SLOT,
            KW_USING, KW_IMPORT, KW_AS,
            KW_CLASS, KW_LET,
            KW_IF, KW_ELSE,
            KW_LOOP, KW_IN, KW_WHILE, KW_UNTIL,
//            KW_SLOT,
            KW_MATCH, KW_WHEN, KW_CASE,
            KW_MACRO, KW_INVOKE,
            KW_END,
                -> HighlightColor.KEYWORD
            // operations
            TEMPLATE_L, TEMPLATE_R -> HighlightColor.SYM_BUILTIN
            COLON -> HighlightColor.OPERATION
            BIND, OP_EQ, OP_NE, OP_THEN -> HighlightColor.OPERATION
            OP_OR -> HighlightColor.OPERATION
            // literals
            TEXT_SINGLE, TEXT_DOUBLE -> HighlightColor.STRING
            ESCAPED -> HighlightColor.STRING_ESCAPED
            INTEGER -> HighlightColor.INTEGER
            // comments
            COMMENT_LINE -> HighlightColor.COMMENT_LINE
            COMMENT_BLOCK -> HighlightColor.COMMENT_BLOCK
            // errors
//            TokenType.BAD_CHARACTER -> YggdrasilHighlightColor.BAD_CHARACTER

            else -> null
        }
    }
}
