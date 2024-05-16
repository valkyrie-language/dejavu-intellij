// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinLet;

public class DejavuLetStatementNode extends MixinLet implements DejavuLetStatement {

  public DejavuLetStatementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitLetStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DejavuExpression getExpression() {
    return findChildByClass(DejavuExpression.class);
  }

  @Override
  @Nullable
  public DejavuIdentifierFree getIdentifierFree() {
    return findChildByClass(DejavuIdentifierFree.class);
  }

}
