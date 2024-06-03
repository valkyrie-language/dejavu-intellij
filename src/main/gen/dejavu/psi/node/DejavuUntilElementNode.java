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

public class DejavuUntilElementNode extends DejavuElement implements DejavuUntilElement {

    public DejavuUntilElementNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitUntilElement(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public DejavuElseStatement getElseStatement() {
        return findChildByClass(DejavuElseStatement.class);
    }

    @Override
    @NotNull
    public DejavuTemplateEnd getTemplateEnd() {
        return findNotNullChildByClass(DejavuTemplateEnd.class);
    }

    @Override
    @NotNull
    public DejavuUntilStatement getUntilStatement() {
        return findNotNullChildByClass(DejavuUntilStatement.class);
    }

}
