// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinFunctionCall;

public class DejavuFunctionCallNode extends MixinFunctionCall implements DejavuFunctionCall {

  public DejavuFunctionCallNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitFunctionCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DejavuArgumentList getArgumentList() {
    return findChildByClass(DejavuArgumentList.class);
  }

  @Override
  @NotNull
  public DejavuNamepath getNamepath() {
    return findNotNullChildByClass(DejavuNamepath.class);
  }

}
