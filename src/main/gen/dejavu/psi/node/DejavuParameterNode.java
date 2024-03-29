// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.DejavuElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DejavuParameterNode extends DejavuElement implements DejavuParameter {

    public DejavuParameterNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitParameter(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public DejavuExpression getExpression() {
        return findChildByClass(DejavuExpression.class);
    }

    @Override
    @NotNull
    public DejavuIdentifier getIdentifier() {
        return findNotNullChildByClass(DejavuIdentifier.class);
    }

}
