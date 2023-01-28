package valkyrie.ide.highlight


import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import valkyrie.ide.matcher.ValkyrieBracketMatch


class TokenHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer {
        return nexus.language.antlr.NexusLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        val key = getTokenColor(tokenType);
        return if (key == null) {
            TextAttributesKey.EMPTY_ARRAY
        } else {
            arrayOf(key)
        }
    }

    private fun getTokenColor(tokenType: IElementType): TextAttributesKey? {
        val hash = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage);
        return when {
            nexus.language.antlr.NexusLexer.Keywords.contains(tokenType) -> ValkyrieHighlightColor.KEYWORD.textAttributesKey
            nexus.language.antlr.NexusLexer.Operators.contains(tokenType) -> DefaultLanguageHighlighterColors.OPERATION_SIGN
            nexus.language.antlr.NexusLexer.MacroOperators.contains(tokenType) -> ValkyrieHighlightColor.SYM_MACRO.textAttributesKey
            nexus.language.antlr.NexusLexer.Integers.contains(tokenType) -> ValkyrieHighlightColor.INTEGER.textAttributesKey
            nexus.language.antlr.NexusLexer.Decimals.contains(tokenType) -> ValkyrieHighlightColor.DECIMAL.textAttributesKey
            nexus.language.antlr.NexusLexer.Strings.contains(tokenType) -> ValkyrieHighlightColor.STRING.textAttributesKey
            nexus.language.antlr.NexusLexer.Comments.contains(tokenType) -> DefaultLanguageHighlighterColors.LINE_COMMENT
            // inherit
            nexus.language.antlr.NexusLexer.Comma.contains(tokenType) -> DefaultLanguageHighlighterColors.COMMA
            nexus.language.antlr.NexusLexer.Semicolon.contains(tokenType) -> DefaultLanguageHighlighterColors.SEMICOLON

            else -> {
                when (tokenType) {
                    ValkyrieBracketMatch.Instance.ParenthesisL, ValkyrieBracketMatch.Instance.ParenthesisR -> DefaultLanguageHighlighterColors.PARENTHESES
                    ValkyrieBracketMatch.Instance.BracketL, ValkyrieBracketMatch.Instance.BracketR -> DefaultLanguageHighlighterColors.BRACKETS
                    ValkyrieBracketMatch.Instance.BraceL, ValkyrieBracketMatch.Instance.BraceR -> DefaultLanguageHighlighterColors.BRACES
                    //
//                    COLON, OP_SET -> ValkyrieHighlightColor.ASSIGN
                    // 原子类型
//                    BYTE -> ValkyrieHighlightColor.INTEGER
//                    COLOUR -> ValkyrieHighlightColor.INTEGER
//                    NUMBER_SUFFIX -> ValkyrieHighlightColor.OP_NUMBER
                    // 错误
                    TokenType.BAD_CHARACTER -> com.intellij.openapi.editor.HighlighterColors.BAD_CHARACTER
                    else -> null
                }
            }
        }
    }
}
