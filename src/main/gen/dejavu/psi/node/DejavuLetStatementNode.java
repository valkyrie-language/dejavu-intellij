// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dejavu.psi.DejavuTypes.*;
import dejavu.psi.mixin.MixinLet;
import dejavu.ide.highlight.NodeHighlighter;
import error.NonExistentClass;

public class DejavuLetStatementNode extends MixinLet implements DejavuLetStatement {

  public DejavuLetStatementNode(NonExistentClass node) {
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
