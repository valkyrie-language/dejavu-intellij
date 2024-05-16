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

public class DejavuTermNode extends DejavuElement implements DejavuTerm {

  public DejavuTermNode(NonExistentClass node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitTerm(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DejavuPrefix> getPrefixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuPrefix.class);
  }

  @Override
  @NotNull
  public List<DejavuSuffix> getSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuSuffix.class);
  }

  @Override
  @NotNull
  public DejavuValue getValue() {
    return findNotNullChildByClass(DejavuValue.class);
  }

}
