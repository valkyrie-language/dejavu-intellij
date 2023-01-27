// Generated from C:/Users/Dell/IdeaProjects/nexus-intellij/src/main/antlr/NexusAntlr.g4 by ANTLR 4.13.1
package nexus.language.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NexusAntlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface NexusAntlrVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(NexusAntlrParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#template}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTemplate(NexusAntlrParser.TemplateContext ctx);
}