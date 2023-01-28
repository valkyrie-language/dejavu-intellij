package valkyrie.ide.reference.declaration

import nexus.language.ast.ValkyrieIdentifierNode
import nexus.language.ast.classes.ValkyrieClassStatement

class ValkyrieClassReference(definition: ValkyrieClassStatement, element: ValkyrieIdentifierNode) : ValkyrieReference(element, definition) {

}

