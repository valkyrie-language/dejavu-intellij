// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DejavuClassNode extends MixinClass implements DejavuClass {

    public DejavuClassNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitClass(this);
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
    public DejavuClassBody getClassBody() {
        return findChildByClass(DejavuClassBody.class);
    }

    @Override
    @Nullable
    public DejavuClassCast getClassCast() {
        return findChildByClass(DejavuClassCast.class);
    }

    @Override
    @Nullable
    public DejavuIdentifier getIdentifier() {
        return findChildByClass(DejavuIdentifier.class);
    }

}
