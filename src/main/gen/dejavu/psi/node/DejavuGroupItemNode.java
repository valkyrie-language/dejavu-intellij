// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import dejavu.psi.mixin.MixinGroupItem;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DejavuGroupItemNode extends MixinGroupItem implements DejavuGroupItem {

    public DejavuGroupItemNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitGroupItem(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<DejavuAttribute> getAttributeList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuAttribute.class);
    }

    @Override
    @NotNull
    public DejavuExpression getExpression() {
        return findNotNullChildByClass(DejavuExpression.class);
    }

    @Override
    @NotNull
    public List<DejavuIdentifier> getIdentifierList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuIdentifier.class);
    }

}
