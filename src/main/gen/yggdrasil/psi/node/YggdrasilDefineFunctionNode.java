// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinDefineFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YggdrasilDefineFunctionNode extends MixinDefineFunction implements YggdrasilDefineFunction {

    public YggdrasilDefineFunctionNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitDefineFunction(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public YggdrasilAnnotations getAnnotations() {
        return findNotNullChildByClass(YggdrasilAnnotations.class);
    }

    @Override
    @Nullable
    public YggdrasilFunctionBlock getFunctionBlock() {
        return findChildByClass(YggdrasilFunctionBlock.class);
    }

    @Override
    @Nullable
    public YggdrasilFunctionParameter getFunctionParameter() {
        return findChildByClass(YggdrasilFunctionParameter.class);
    }

    @Override
    @Nullable
    public YggdrasilIdentifierFree getIdentifierFree() {
        return findChildByClass(YggdrasilIdentifierFree.class);
    }

}
