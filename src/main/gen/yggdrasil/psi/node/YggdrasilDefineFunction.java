// This is a generated file. Not intended for manual editing.
package yggdrasil.psi.node;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface YggdrasilDefineFunction extends PsiElement {

    @NotNull
    YggdrasilAnnotations getAnnotations();

    @Nullable
    YggdrasilFunctionBlock getFunctionBlock();

    @Nullable
    YggdrasilFunctionParameter getFunctionParameter();

    @Nullable
    YggdrasilIdentifierFree getIdentifierFree();

    void createLookup(@NotNull List<LookupElement> completions);

}
