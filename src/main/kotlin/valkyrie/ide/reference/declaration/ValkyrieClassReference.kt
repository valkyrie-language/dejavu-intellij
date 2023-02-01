package valkyrie.ide.reference.declaration

import nexus.language.ast.ValkyrieIdentifierNode
import nexus.language.ast.classes.NexusClassStatement

class ValkyrieClassReference(definition: NexusClassStatement, element: ValkyrieIdentifierNode) : ValkyrieReference(element, definition) {

}

