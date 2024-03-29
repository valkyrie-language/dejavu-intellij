// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import java.util.List;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DejavuAtomic extends DejavuExpression {

    @Nullable
    DejavuEscape getEscape();

    @Nullable
    DejavuFunctionCall getFunctionCall();

    @Nullable
    DejavuIdentifierFree getIdentifierFree();

    @Nullable
    DejavuNumber getNumber();

    @Nullable
    DejavuRegex getRegex();

    @Nullable
    DejavuString getString();

}
