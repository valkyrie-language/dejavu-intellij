// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YggdrasilExpressionSoftNode extends YggdrasilExpressionNode implements YggdrasilExpressionSoft {

    public YggdrasilExpressionSoftNode(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitExpressionSoft(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<YggdrasilExpression> getExpressionList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, YggdrasilExpression.class);
    }

}
