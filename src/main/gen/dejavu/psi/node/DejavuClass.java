// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface DejavuClass extends PsiElement {

    @NotNull
    DejavuAnnotations getAnnotations();

    @Nullable
    DejavuClassBody getClassBody();

    @Nullable
    DejavuClassCast getClassCast();

    @Nullable
    DejavuIdentifier getIdentifier();

    void createLookup(@NotNull List<LookupElement> completions);

}
