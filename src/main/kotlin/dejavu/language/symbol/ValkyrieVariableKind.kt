package dejavu.language.symbol

import dejavu.language.ast.DejavuIdentifierNode
import valkyrie.ide.highlight.DejavuHighlightColor

data class ValkyrieVariableKind(
    val identifier: DejavuIdentifierNode,
    val color: DejavuHighlightColor,
)