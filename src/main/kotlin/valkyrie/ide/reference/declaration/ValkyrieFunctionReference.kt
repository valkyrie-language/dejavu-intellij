package valkyrie.ide.reference.declaration

import nexus.language.ast.NexusFunctionStatement
import nexus.language.ast.ValkyrieIdentifierNode

class ValkyrieFunctionReference(definition: NexusFunctionStatement, element: ValkyrieIdentifierNode) :
    ValkyrieReference(element, definition) {

}