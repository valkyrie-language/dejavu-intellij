// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import dejavu.psi.DejavuElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DejavuUnionBodyNode extends DejavuElement implements DejavuUnionBody {

    public DejavuUnionBodyNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitUnionBody(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<DejavuUnionVariant> getUnionVariantList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuUnionVariant.class);
    }

}
