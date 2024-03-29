// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import valkyrie.ide.highlight.NodeHighlighter;

public interface DejavuAttribute extends PsiElement {

    @NotNull
    DejavuIdentifier getIdentifier();

    @Nullable
    DejavuTuple getTuple();

    void highlight(@NotNull NodeHighlighter visitor);

}
