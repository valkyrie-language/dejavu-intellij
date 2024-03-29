// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DejavuIfElement extends PsiElement {

  @NotNull
  List<DejavuElseIfStatement> getElseIfStatementList();

  @Nullable
  DejavuElseStatement getElseStatement();

  @NotNull
  DejavuIfStatement getIfStatement();

  @NotNull
  DejavuTemplateEnd getTemplateEnd();

}
