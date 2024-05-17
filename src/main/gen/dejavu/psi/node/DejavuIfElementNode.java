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

public class DejavuIfElementNode extends DejavuElement implements DejavuIfElement {

  public DejavuIfElementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitIfElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DejavuElseIfStatement> getElseIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuElseIfStatement.class);
  }

  @Override
  @Nullable
  public DejavuElseStatement getElseStatement() {
    return findChildByClass(DejavuElseStatement.class);
  }

  @Override
  @NotNull
  public DejavuIfStatement getIfStatement() {
    return findNotNullChildByClass(DejavuIfStatement.class);
  }

  @Override
  @NotNull
  public DejavuTemplateEnd getTemplateEnd() {
    return findNotNullChildByClass(DejavuTemplateEnd.class);
  }

}
