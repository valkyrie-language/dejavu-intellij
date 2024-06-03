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

public class DejavuTextElementsNode extends DejavuElement implements DejavuTextElements {

  public DejavuTextElementsNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitTextElements(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DejavuDeclarationTemplate getDeclarationTemplate() {
    return findChildByClass(DejavuDeclarationTemplate.class);
  }

  @Override
  @Nullable
  public DejavuEachElement getEachElement() {
      return findChildByClass(DejavuEachElement.class);
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
    public DejavuProgramTemplate getProgramTemplate() {
        return findChildByClass(DejavuProgramTemplate.class);
    }

    @Override
    @Nullable
    public DejavuSlotElement getSlotElement() {
        return findChildByClass(DejavuSlotElement.class);
    }

    @Override
    @Nullable
    public DejavuTemplateExpression getTemplateExpression() {
        return findChildByClass(DejavuTemplateExpression.class);
    }

    @Override
    @Nullable
    public DejavuUntilElement getUntilElement() {
        return findChildByClass(DejavuUntilElement.class);
    }

    @Override
    @Nullable
    public DejavuWhileElement getWhileElement() {
        return findChildByClass(DejavuWhileElement.class);
    }

}
