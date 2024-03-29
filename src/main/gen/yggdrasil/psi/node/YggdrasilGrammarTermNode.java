// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import dejavu.psi.YggdrasilElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class YggdrasilGrammarTermNode extends YggdrasilElement implements YggdrasilGrammarTerm {

    public YggdrasilGrammarTermNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull YggdrasilVisitor visitor) {
        visitor.visitGrammarTerm(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof YggdrasilVisitor) accept((YggdrasilVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @Nullable
    public YggdrasilPair getPair() {
        return findChildByClass(YggdrasilPair.class);
    }

}
