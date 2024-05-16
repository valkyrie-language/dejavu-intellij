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

public class DejavuExpressionNode extends DejavuElement implements DejavuExpression {

  public DejavuExpressionNode(NonExistentClass node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DejavuInfix> getInfixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuInfix.class);
  }

  @Override
  @NotNull
  public List<DejavuTerm> getTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuTerm.class);
  }

}
