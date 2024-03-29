// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;

import static dejavu.psi.DejavuTypes.*;

public class DejavuAtomicNode extends DejavuExpressionNode implements DejavuAtomic {

    public DejavuAtomicNode(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitAtomic(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public DejavuEscape getEscape() {
        return findChildByClass(DejavuEscape.class);
    }

    @Override
    @Nullable
    public DejavuFunctionCall getFunctionCall() {
        return findChildByClass(DejavuFunctionCall.class);
    }

    @Override
    @Nullable
    public DejavuIdentifierFree getIdentifierFree() {
        return findChildByClass(DejavuIdentifierFree.class);
    }

    @Override
    @Nullable
    public DejavuNumber getNumber() {
        return findChildByClass(DejavuNumber.class);
    }

    @Override
    @Nullable
    public DejavuRegex getRegex() {
        return findChildByClass(DejavuRegex.class);
    }

    @Override
    @Nullable
    public DejavuString getString() {
        return findChildByClass(DejavuString.class);
    }

}
