package nexus.language.ast

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import nexus.language.psi.ValkyrieHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class ValkyrieLetPatternItem : ASTWrapperPsiElement, ValkyrieHighlightElement {


    constructor(node: CompositeElement) : super(node) {

    }


    override fun on_highlight(e: NodeHighlighter) {

    }
}

