package yggdrasil.language.symbol

import dejavu.psi.node.YggdrasilIdentifierNode
import valkyrie.ide.highlight.HighlightColor

data class ValkyrieVariableKind(
    val identifier: YggdrasilIdentifierNode,
    val color: HighlightColor,
)