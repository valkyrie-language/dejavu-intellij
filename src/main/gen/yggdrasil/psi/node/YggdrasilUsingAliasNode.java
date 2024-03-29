// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.YggdrasilElement;
import org.jetbrains.annotations.NotNull;

public class YggdrasilUsingAliasNode extends YggdrasilElement implements YggdrasilUsingAlias {

    public YggdrasilUsingAliasNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitUsingAlias(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public YggdrasilIdentifierFree getIdentifierFree() {
        return findNotNullChildByClass(YggdrasilIdentifierFree.class);
    }

    @Override
    @NotNull
    public YggdrasilKey getKey() {
        return findNotNullChildByClass(YggdrasilKey.class);
    }

}
