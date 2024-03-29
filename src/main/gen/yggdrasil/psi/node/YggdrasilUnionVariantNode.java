// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinUnionItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YggdrasilUnionVariantNode extends MixinUnionItem implements YggdrasilUnionVariant {

    public YggdrasilUnionVariantNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitUnionVariant(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public YggdrasilExpression getExpression() {
        return findNotNullChildByClass(YggdrasilExpression.class);
    }

    @Override
    @Nullable
    public YggdrasilTagBranch getTagBranch() {
        return findChildByClass(YggdrasilTagBranch.class);
    }

}
