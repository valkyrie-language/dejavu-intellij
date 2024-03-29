// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;
import dejavu.psi.mixin.MixinImplements;

public class DejavuImplementElementNode extends MixinImplements implements DejavuImplementElement {

  public DejavuImplementElementNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitImplementElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DejavuString getString() {
    return findChildByClass(DejavuString.class);
  }

}
