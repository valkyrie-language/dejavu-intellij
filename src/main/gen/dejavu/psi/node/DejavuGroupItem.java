// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import valkyrie.ide.highlight.NodeHighlighter;

import java.util.List;

public interface DejavuGroupItem extends PsiElement {

    @NotNull
    List<DejavuAttribute> getAttributeList();

    @NotNull
    DejavuExpression getExpression();

    @NotNull
    List<DejavuIdentifier> getIdentifierList();

    void highlight(@NotNull NodeHighlighter highlighter);

    void createLookup(@NotNull List<LookupElement> completions);

}
