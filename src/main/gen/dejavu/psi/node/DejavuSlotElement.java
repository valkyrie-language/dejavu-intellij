// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DejavuSlotElement extends PsiElement {

  @NotNull
  DejavuTemplateEnd getTemplateEnd();

  @NotNull
  DejavuTemplateSlot getTemplateSlot();

  @NotNull
  List<DejavuTextElements> getTextElementsList();

}
