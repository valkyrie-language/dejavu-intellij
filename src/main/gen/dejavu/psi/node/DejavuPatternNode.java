// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;
import dejavu.psi.mixin.MixinPattern;

public class DejavuPatternNode extends MixinPattern implements DejavuPattern {

  public DejavuPatternNode(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DejavuIdentifier getIdentifier() {
    return findChildByClass(DejavuIdentifier.class);
  }

  @Override
  @Nullable
  public DejavuPatternTuple getPatternTuple() {
    return findChildByClass(DejavuPatternTuple.class);
  }

}
