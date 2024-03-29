// This is a generated file. Not intended for manual editing.
package dejavu.psi.node;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface DejavuTerm extends DejavuExpression {

    @NotNull
    DejavuExpression getExpression();

    @NotNull
    List<DejavuPrefix> getPrefixList();

    @NotNull
    List<DejavuSuffix> getSuffixList();

}
