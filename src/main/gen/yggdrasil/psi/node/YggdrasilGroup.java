// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface YggdrasilGroup extends PsiElement {

    @NotNull
    YggdrasilAnnotations getAnnotations();

    @Nullable
    YggdrasilGroupBody getGroupBody();

    @Nullable
    YggdrasilIdentifierFree getIdentifierFree();

    @NotNull
    List<YggdrasilGroupItemNode> getTokenList();

}
