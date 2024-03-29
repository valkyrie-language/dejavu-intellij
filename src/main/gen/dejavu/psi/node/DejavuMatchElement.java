// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DejavuMatchElement extends PsiElement {

  @NotNull
  List<DejavuMatchBranch> getMatchBranchList();

  @NotNull
  DejavuMatchStatement getMatchStatement();

  @NotNull
  DejavuTemplateEnd getTemplateEnd();

  @NotNull
  String foldPlaceholder();

}
