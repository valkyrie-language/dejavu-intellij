// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.DejavuElement;
import org.jetbrains.annotations.NotNull;

public class DejavuTagBranchNode extends DejavuElement implements DejavuTagBranch {

    public DejavuTagBranchNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitTagBranch(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public DejavuIdentifierFree getIdentifierFree() {
        return findNotNullChildByClass(DejavuIdentifierFree.class);
    }

}
