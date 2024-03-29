// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.DejavuElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DejavuRangeNode extends DejavuElement implements DejavuRange {

    public DejavuRangeNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitRange(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public DejavuRangeLower getRangeLower() {
        return findChildByClass(DejavuRangeLower.class);
    }

    @Override
    @Nullable
    public DejavuRangeUpper getRangeUpper() {
        return findChildByClass(DejavuRangeUpper.class);
    }

}
