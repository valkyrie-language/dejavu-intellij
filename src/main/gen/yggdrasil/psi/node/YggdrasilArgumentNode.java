// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.YggdrasilElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YggdrasilArgumentNode extends YggdrasilElement implements YggdrasilArgument {

    public YggdrasilArgumentNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitArgument(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public YggdrasilIdentifierFree getIdentifierFree() {
        return findChildByClass(YggdrasilIdentifierFree.class);
    }

    @Override
    @NotNull
    public YggdrasilValue getValue() {
        return findNotNullChildByClass(YggdrasilValue.class);
    }

}
