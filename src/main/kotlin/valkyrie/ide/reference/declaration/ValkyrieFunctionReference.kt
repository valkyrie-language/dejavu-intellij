package valkyrie.ide.reference.declaration

import dejavu.language.ast.NexusFunctionStatement
import dejavu.language.ast.NexusIdentifierNode

class ValkyrieFunctionReference(definition: NexusFunctionStatement, element: NexusIdentifierNode) :
    ValkyrieReference(element, definition) {

}