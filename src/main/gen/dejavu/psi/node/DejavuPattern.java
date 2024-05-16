// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import dejavu.ide.highlight.NodeHighlighter;

public interface DejavuPattern extends PsiElement {

  @Nullable
  DejavuIdentifier getIdentifier();

  @Nullable
  DejavuPatternTuple getPatternTuple();

  void highlight(@NotNull NodeHighlighter highlighter);

}
