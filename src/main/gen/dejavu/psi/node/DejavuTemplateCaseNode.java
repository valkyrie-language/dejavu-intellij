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

public class DejavuTemplateCaseNode extends DejavuElement implements DejavuTemplateCase {

  public DejavuTemplateCaseNode(NonExistentClass node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitTemplateCase(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DejavuIfConditional getIfConditional() {
    return findChildByClass(DejavuIfConditional.class);
  }

  @Override
  @Nullable
  public DejavuPatternBare getPatternBare() {
    return findChildByClass(DejavuPatternBare.class);
  }

}
