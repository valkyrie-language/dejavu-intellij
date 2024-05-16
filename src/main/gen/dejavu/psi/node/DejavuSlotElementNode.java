// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;
import dejavu.psi.mixin.MixinSlot;
import dejavu.ide.highlight.NodeHighlighter;
import error.NonExistentClass;

public class DejavuSlotElementNode extends MixinSlot implements DejavuSlotElement {

  public DejavuSlotElementNode(NonExistentClass node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitSlotElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DejavuTemplateEnd getTemplateEnd() {
    return findNotNullChildByClass(DejavuTemplateEnd.class);
  }

  @Override
  @NotNull
  public DejavuTemplateSlot getTemplateSlot() {
    return findNotNullChildByClass(DejavuTemplateSlot.class);
  }

  @Override
  @NotNull
  public List<DejavuTextElements> getTextElementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuTextElements.class);
  }

}
