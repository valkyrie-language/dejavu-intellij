// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import valkyrie.ide.highlight.NodeHighlighter;

public interface DejavuPattern extends PsiElement {

  @Nullable
  DejavuIdentifier getIdentifier();

  @Nullable
  DejavuPatternTuple getPatternTuple();

  void highlight(@NotNull NodeHighlighter highlighter);

}
