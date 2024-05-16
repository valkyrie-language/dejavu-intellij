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

public class DejavuProgramElementNode extends DejavuElement implements DejavuProgramElement {

  public DejavuProgramElementNode(NonExistentClass node) {
    super(node);
  }

  public void accept(@NotNull DejavuVisitor visitor) {
    visitor.visitProgramElement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DejavuVisitor) accept((DejavuVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DejavuClassElement getClassElement() {
    return findChildByClass(DejavuClassElement.class);
  }

  @Override
  @Nullable
  public DejavuExtendsElement getExtendsElement() {
    return findChildByClass(DejavuExtendsElement.class);
  }

  @Override
  @Nullable
  public DejavuLetStatement getLetStatement() {
    return findChildByClass(DejavuLetStatement.class);
  }

  @Override
  @Nullable
  public DejavuUsingElement getUsingElement() {
    return findChildByClass(DejavuUsingElement.class);
  }

}
