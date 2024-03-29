// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinAttribute;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DejavuAttributeNode extends MixinAttribute implements DejavuAttribute {

    public DejavuAttributeNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitAttribute(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public DejavuIdentifier getIdentifier() {
        return findNotNullChildByClass(DejavuIdentifier.class);
    }

    @Override
    @Nullable
    public DejavuTuple getTuple() {
        return findChildByClass(DejavuTuple.class);
    }

}
