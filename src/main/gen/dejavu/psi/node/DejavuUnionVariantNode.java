// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinUnionItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DejavuUnionVariantNode extends MixinUnionItem implements DejavuUnionVariant {

    public DejavuUnionVariantNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitUnionVariant(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public DejavuExpression getExpression() {
        return findNotNullChildByClass(DejavuExpression.class);
    }

    @Override
    @Nullable
    public DejavuTagBranch getTagBranch() {
        return findChildByClass(DejavuTagBranch.class);
    }

}
