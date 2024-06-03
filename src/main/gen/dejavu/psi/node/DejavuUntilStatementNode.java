// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static dejavu.psi.DejavuTypes.*;

import dejavu.psi.DejavuElement;

public class DejavuUntilStatementNode extends DejavuElement implements DejavuUntilStatement {

    public DejavuUntilStatementNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitUntilStatement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<DejavuTextElements> getTextElementsList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuTextElements.class);
    }

    @Override
    @NotNull
    public DejavuUntilTemplate getUntilTemplate() {
        return findNotNullChildByClass(DejavuUntilTemplate.class);
    }

}
