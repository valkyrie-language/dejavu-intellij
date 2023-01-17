package valkyrie.ide.reference.declaration

import valkyrie.language.ast.ValkyrieIdentifierNode
import valkyrie.language.ast.classes.ValkyrieClassStatement

class ValkyrieClassReference(definition: ValkyrieClassStatement, element: ValkyrieIdentifierNode) : ValkyrieReference(element, definition) {

}

