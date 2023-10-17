package valkyrie.ide.reference.declaration

import dejavu.language.ast.DejavuIdentifierNode
import dejavu.language.ast.NexusFunctionStatement

class ValkyrieFunctionReference(definition: NexusFunctionStatement, element: DejavuIdentifierNode) :
    ValkyrieReference(element, definition) {

}