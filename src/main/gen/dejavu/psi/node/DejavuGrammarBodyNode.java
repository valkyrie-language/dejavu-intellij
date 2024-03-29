// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import dejavu.psi.DejavuElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DejavuGrammarBodyNode extends DejavuElement implements DejavuGrammarBody {

    public DejavuGrammarBodyNode(@NotNull ASTNode node) {
        super(node);
    }

    public void accept(@NotNull DejavuVisitor visitor) {
        visitor.visitGrammarBody(this);
    }

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof DejavuVisitor) accept((DejavuVisitor) visitor);
        else super.accept(visitor);
    }

    @Override
    @NotNull
    public List<DejavuGrammarTerm> getGrammarTermList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, DejavuGrammarTerm.class);
    }

}
