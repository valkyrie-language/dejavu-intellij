// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DejavuGroupItem extends PsiElement {

    @NotNull
    List<DejavuAttribute> getAttributeList();

    @NotNull
    DejavuExpression getExpression();

    @NotNull
    List<DejavuIdentifier> getIdentifierList();

}
