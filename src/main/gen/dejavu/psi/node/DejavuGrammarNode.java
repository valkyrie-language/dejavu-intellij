// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.mixin.MixinGrammar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DejavuGrammarNode extends MixinGrammar implements DejavuGrammar {

    public DejavuGrammarNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitGrammar(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public DejavuAnnotations getAnnotations() {
        return findNotNullChildByClass(DejavuAnnotations.class);
    }

    @Override
    @Nullable
    public DejavuGrammarBody getGrammarBody() {
        return findChildByClass(DejavuGrammarBody.class);
    }

    @Override
    @Nullable
    public DejavuIdentifier getIdentifier() {
        return findChildByClass(DejavuIdentifier.class);
    }

}
