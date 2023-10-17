package dejavu.language.ast


import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.PsiTreeUtil
import dejavu.language.antlr.childrenWithLeaves
import dejavu.language.psi.types.ValkyrieModifiedType
import org.jetbrains.annotations.Unmodifiable

class NexusModifiedNode(node: CompositeElement, val kind: ValkyrieModifiedType) : ASTWrapperPsiElement(node) {
    private fun filterAll(): @Unmodifiable MutableList<DejavuIdentifierNode> {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuIdentifierNode::class.java)
    }

    fun findModifiers(): List<DejavuIdentifierNode> {
        return when (kind) {
            ValkyrieModifiedType.Pure -> {
                filterAll()
            }

            ValkyrieModifiedType.ModifiedIdentifier -> {
                filterAll().dropLast(1)
            }

            ValkyrieModifiedType.ModifiedNamepath -> {
                val items = mutableListOf<DejavuIdentifierNode>();
                for (child in this.childrenWithLeaves) {
                    if (child is PsiWhiteSpace) {
                        continue;
                    } else if (child is DejavuIdentifierNode) {
                        items.add(child)
                    } else {
                        break;
                    }
                }
                return items.dropLast(1)
            }
        }
    }

    fun findIdentifier(): DejavuIdentifierNode? {
        return if (kind == ValkyrieModifiedType.Pure) {
            null
        } else {
            filterAll().lastOrNull()
        }
    }

    fun findNamepath(): List<DejavuIdentifierNode> {
        return emptyList()
    }


    companion object {
        // Need to be lazy, otherwise it will be an infinite loop
        fun findModifiers(node: PsiElement): List<DejavuIdentifierNode> {
            val proxy = PsiTreeUtil.getChildOfType(node, NexusModifiedNode::class.java)
            return proxy?.findModifiers() ?: listOf()
        }

        fun findNamepath(node: PsiElement): List<DejavuIdentifierNode> {
            val proxy = PsiTreeUtil.getChildOfType(node, NexusModifiedNode::class.java)
            return proxy?.findNamepath() ?: listOf()
        }

        // Need to be lazy, otherwise it will be an infinite loop
        fun findIdentifier(node: PsiElement): DejavuIdentifierNode? {
            val proxy = PsiTreeUtil.getChildOfType(node, NexusModifiedNode::class.java)
            return proxy?.findIdentifier()
        }

    }
}

