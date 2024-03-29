// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.DejavuElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DejavuArgumentNode extends DejavuElement implements DejavuArgument {

    public DejavuArgumentNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitArgument(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public DejavuIdentifierFree getIdentifierFree() {
        return findChildByClass(DejavuIdentifierFree.class);
    }

    @Override
    @NotNull
    public DejavuValue getValue() {
        return findNotNullChildByClass(DejavuValue.class);
    }

}
