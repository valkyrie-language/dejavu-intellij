// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinUnion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DejavuDefineUnionNode extends MixinUnion implements DejavuDefineUnion {

    public DejavuDefineUnionNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitDefineUnion(this);
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
    public DejavuIdentifier getIdentifier() {
        return findChildByClass(DejavuIdentifier.class);
    }

    @Override
    @Nullable
    public DejavuUnionBody getUnionBody() {
        return findChildByClass(DejavuUnionBody.class);
    }

}
