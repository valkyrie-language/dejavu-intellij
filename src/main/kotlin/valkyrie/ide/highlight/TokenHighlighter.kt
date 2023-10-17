package valkyrie.ide.highlight


import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import dejavu.language.antlr.DejavuLexer
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import valkyrie.ide.matcher.ValkyrieBracketMatch


class TokenHighlighter : SyntaxHighlighter {
    override fun getHighlightingLexer(): Lexer {
        return DejavuLexer()
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
        val hash = PSIElementTypeFactory.createTokenSet(dejavu.language.DejavuLanguage);
        return when {
            DejavuLexer.Keywords.contains(tokenType) -> DejavuHighlightColor.KEYWORD.textAttributesKey
            DejavuLexer.Operators.contains(tokenType) -> DefaultLanguageHighlighterColors.OPERATION_SIGN
            DejavuLexer.MacroOperators.contains(tokenType) -> DejavuHighlightColor.SYM_MACRO.textAttributesKey
            DejavuLexer.Integers.contains(tokenType) -> DejavuHighlightColor.INTEGER.textAttributesKey
            DejavuLexer.Decimals.contains(tokenType) -> DejavuHighlightColor.DECIMAL.textAttributesKey
            DejavuLexer.Strings.contains(tokenType) -> DejavuHighlightColor.STRING.textAttributesKey
            DejavuLexer.Comments.contains(tokenType) -> DefaultLanguageHighlighterColors.LINE_COMMENT
            // inherit
            DejavuLexer.Comma.contains(tokenType) -> DefaultLanguageHighlighterColors.COMMA
            DejavuLexer.Semicolon.contains(tokenType) -> DefaultLanguageHighlighterColors.SEMICOLON
            DejavuLexer.Escapes.contains(tokenType) -> DejavuHighlightColor.STRING_ESCAPED.textAttributesKey

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
