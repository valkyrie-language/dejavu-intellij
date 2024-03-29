// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;
import dejavu.psi.DejavuElement;

public class DejavuTextElementNode extends DejavuElement implements DejavuTextElement {

  public DejavuTextElementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitTextElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DejavuForElement getForElement() {
    return findChildByClass(DejavuForElement.class);
  }

  @Override
  @Nullable
  public DejavuIfElement getIfElement() {
    return findChildByClass(DejavuIfElement.class);
  }

  @Override
  @Nullable
  public DejavuInvokeElement getInvokeElement() {
    return findChildByClass(DejavuInvokeElement.class);
  }

  @Override
  @Nullable
  public DejavuMatchElement getMatchElement() {
    return findChildByClass(DejavuMatchElement.class);
  }

  @Override
  @Nullable
  public DejavuSlotElement getSlotElement() {
    return findChildByClass(DejavuSlotElement.class);
  }

  @Override
  @Nullable
  public DejavuWhileElement getWhileElement() {
    return findChildByClass(DejavuWhileElement.class);
  }

}
