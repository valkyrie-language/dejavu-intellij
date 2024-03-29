// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DejavuGroupNode extends MixinGroup implements DejavuGroup {

    public DejavuGroupNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitGroup(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public DejavuAnnotations getAnnotations() {
        return findNotNullChildByClass(DejavuAnnotations.class);
    }

    @Override
    @Nullable
    public DejavuGroupBody getGroupBody() {
        return findChildByClass(DejavuGroupBody.class);
    }

    @Override
    @Nullable
    public DejavuIdentifierFree getIdentifierFree() {
        return findChildByClass(DejavuIdentifierFree.class);
    }

}
