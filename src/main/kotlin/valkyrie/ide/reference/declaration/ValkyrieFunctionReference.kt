package valkyrie.ide.reference.declaration

import nexus.language.ast.ValkyrieFunctionStatement
import nexus.language.ast.ValkyrieIdentifierNode

class ValkyrieFunctionReference(definition: ValkyrieFunctionStatement, element: ValkyrieIdentifierNode) :
    ValkyrieReference(element, definition) {

}