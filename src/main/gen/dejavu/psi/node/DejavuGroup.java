// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DejavuGroup extends PsiElement {

    @NotNull
    DejavuAnnotations getAnnotations();

    @Nullable
    DejavuGroupBody getGroupBody();

    @Nullable
    DejavuIdentifierFree getIdentifierFree();

    //WARNING: getTokenList(...) is skipped
    //matching getTokenList(DejavuGroup, ...)
    //methods are not found in DejavuPsiExtension

}
