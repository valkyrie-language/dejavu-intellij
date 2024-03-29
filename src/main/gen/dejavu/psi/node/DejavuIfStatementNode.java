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

public class DejavuIfStatementNode extends DejavuElement implements DejavuIfStatement {

  public DejavuIfStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DejavuTemplateIf getTemplateIf() {
    return findNotNullChildByClass(DejavuTemplateIf.class);
  }

  @Override
  @NotNull
  public List<DejavuTextElements> getTextElementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuTextElements.class);
  }

}
