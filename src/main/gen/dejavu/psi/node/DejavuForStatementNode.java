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
import error.NonExistentClass;

public class DejavuForStatementNode extends DejavuElement implements DejavuForStatement {

  public DejavuForStatementNode(NonExistentClass node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitForStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DejavuTemplateFor getTemplateFor() {
    return findNotNullChildByClass(DejavuTemplateFor.class);
  }

  @Override
  @NotNull
  public List<DejavuTextElements> getTextElementsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuTextElements.class);
  }

}
