// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinGrammar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YggdrasilGrammarNode extends MixinGrammar implements YggdrasilGrammar {

    public YggdrasilGrammarNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitGrammar(this);
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
    public YggdrasilGrammarBody getGrammarBody() {
        return findChildByClass(YggdrasilGrammarBody.class);
    }

    @Override
    @Nullable
    public YggdrasilIdentifier getIdentifier() {
        return findChildByClass(YggdrasilIdentifier.class);
    }

}
