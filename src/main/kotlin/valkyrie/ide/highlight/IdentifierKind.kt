package valkyrie.ide.highlight

import nexus.language.ast.ValkyrieIdentifierNode
import nexus.language.ast.classes.NexusClassFieldNode
import nexus.language.ast.classes.NexusClassMethodNode
import nexus.language.ast.classes.NexusClassStatement

//import nexus.language.psi_node.ValkyrieClassStatementNode
//import nexus.language.psi_node.ValkyrieTraitStatementNode

enum class IdentifierKind {
    Trait,
    Class,
    ClassField,
    ClassMethod,
    Variant,
    VariantItem;

    val color
        get() = when (this) {
            Trait -> NexusHighlightColor.SYM_TRAIT
            Class -> NexusHighlightColor.SYM_CLASS
            ClassField -> NexusHighlightColor.SYM_FIELD
            ClassMethod -> NexusHighlightColor.SYM_FUNCTION_SELF
            Variant -> NexusHighlightColor.SYM_VARIANT
            VariantItem -> NexusHighlightColor.SYM_FIELD
        }

    companion object {
        fun resolve(o: ValkyrieIdentifierNode): IdentifierKind? {
            return when (o.reference?.resolve()) {
                is NexusClassStatement -> Class
                is NexusClassFieldNode -> ClassField
                is NexusClassMethodNode -> ClassMethod
                else -> null
            }
        }
    }
}