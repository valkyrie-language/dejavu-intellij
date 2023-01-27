// Generated from C:/Users/Dell/IdeaProjects/nexus-intellij/src/main/antlr/NexusAntlr.g4 by ANTLR 4.13.1
package nexus.language.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NexusAntlrParser}.
 */
public interface NexusAntlrListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(NexusAntlrParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(NexusAntlrParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#template}.
     *
     * @param ctx the parse tree
     */
    void enterTemplate(NexusAntlrParser.TemplateContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#template}.
     *
     * @param ctx the parse tree
     */
    void exitTemplate(NexusAntlrParser.TemplateContext ctx);
}