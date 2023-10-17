package dejavu.language.ast.calls

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.psi.impl.source.tree.CompositeElement
import com.intellij.psi.util.elementType
import dejavu.antlr.NexusAntlrLexer.BRACKET_L
import dejavu.antlr.NexusAntlrLexer.BRACKET_R
import dejavu.antlr.childrenWithLeaves
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import valkyrie.ide.highlight.NexusHighlightElement
import valkyrie.ide.highlight.NodeHighlighter

class NexusAnnotation(node: CompositeElement) : ASTWrapperPsiElement(node), NexusHighlightElement {
    override fun on_highlight(e: NodeHighlighter) {
        val dye = PSIElementTypeFactory.createTokenSet(dejavu.language.DejavuLanguage, BRACKET_L, BRACKET_R);
        for (child in this.childrenWithLeaves) {
            if (dye.contains(child.elementType)) {
                e.register_macro(child)
            }
        }
    }
}