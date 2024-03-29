package dejavu.psi.mixin

import com.intellij.lang.ASTNode
import com.intellij.psi.impl.source.tree.SharedImplUtil
import dejavu.psi.DejavuElement
import valkyrie.ide.reference.declaration.ValkyrieReference
import yggdrasil.language.file.YggdrasilFileNode

abstract class MixinIdentifier(node: ASTNode) : DejavuElement(node) {
    override fun getContainingFile(): YggdrasilFileNode {
        return SharedImplUtil.getContainingFile(node) as YggdrasilFileNode
    }

    override fun getName(): String? {
        return this.text.trim('`')
    }


    override fun getReference(): ValkyrieReference? {
//        if (this.parent is YggdrasilClassNode) {
        return null
//        }
//        if (this.parent is YggdrasilDefineUnion) {
//            return null
//        }
//        return ValkyrieReference(this as YggdrasilIdentifierNode)
    }


//    override fun highlight(highlighter: NodeHighlighter) {
//        return when (this.text) {
//            "HIDE", "ANY", "INDENT", "DEDENT" -> highlighter.highlight(this, HighlightColor.SYM_MACRO)
//            "SOI", "START_OF_INPUT",
//            "EOI", "END_OF_INPUT",
//            "EOF", "END_OF_FILE",
//            "EOL", "END_OF_LINE",
//            "ROL", "REST_OF_LINE",
//            -> highlighter.highlight(this, HighlightColor.SYM_CONSTANT)
//
//            else -> {
//                if (this.reference != null) {
//                    this.reference!!.highlight(highlighter)
//                } else {
//
//                }
//
//
//            }
//        }
//    }


}