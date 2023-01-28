package nexus.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.elementType
import nexus.language.antlr.NexusAntlrLexer.BRACKET_L
import nexus.language.antlr.NexusAntlrLexer.BRACKET_R
import nexus.language.antlr.childrenWithLeaves
import nexus.language.psi.ValkyrieHighlightElement
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import valkyrie.ide.highlight.NodeHighlighter

class ValkyrieAnnotation(node: CompositeElement) : ASTWrapperPsiElement(node), ValkyrieHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        val dye = PSIElementTypeFactory.createTokenSet(nexus.language.NexusLanguage, BRACKET_L, BRACKET_R);
        for (child in this.childrenWithLeaves) {
            if (dye.contains(child.elementType)) {
                e.register_macro(child)
            }
        }
    }
}