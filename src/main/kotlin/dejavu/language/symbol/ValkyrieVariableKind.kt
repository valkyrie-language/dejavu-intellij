package dejavu.language.symbol

import dejavu.language.ast.NexusIdentifierNode
import valkyrie.ide.highlight.NexusHighlightColor

data class ValkyrieVariableKind(
    val identifier: NexusIdentifierNode,
    val color: NexusHighlightColor,
)