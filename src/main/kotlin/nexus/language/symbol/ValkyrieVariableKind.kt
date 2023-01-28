package nexus.language.symbol

import nexus.language.ast.ValkyrieIdentifierNode
import valkyrie.ide.highlight.ValkyrieHighlightColor

data class ValkyrieVariableKind(
    val identifier: ValkyrieIdentifierNode,
    val color: ValkyrieHighlightColor,
)