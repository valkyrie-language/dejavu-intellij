// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface DejavuAnnotations extends PsiElement {

    @NotNull
    List<DejavuAttribute> getAttributeList();

    @NotNull
    List<DejavuModifier> getModifierList();

}
