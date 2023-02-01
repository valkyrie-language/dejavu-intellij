package nexus.language.symbol

import nexus.language.ast.ValkyrieIdentifierNode
import valkyrie.ide.highlight.NexusHighlightColor

data class ValkyrieVariableKind(
    val identifier: ValkyrieIdentifierNode,
    val color: NexusHighlightColor,
)