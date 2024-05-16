// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import dejavu.ide.highlight.NodeHighlighter;

public interface DejavuDotCall extends PsiElement {

  @Nullable
  DejavuArgumentList getArgumentList();

  @NotNull
  DejavuIdentifierFree getIdentifierFree();

  void highlight(@NotNull NodeHighlighter highlighter);

}
