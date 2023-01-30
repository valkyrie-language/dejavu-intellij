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
     * Enter a parse tree produced by {@link NexusAntlrParser#define_import}.
     *
     * @param ctx the parse tree
     */
    void enterDefine_import(NexusAntlrParser.Define_importContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#define_import}.
     *
     * @param ctx the parse tree
     */
    void exitDefine_import(NexusAntlrParser.Define_importContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#define_class}.
     *
     * @param ctx the parse tree
     */
    void enterDefine_class(NexusAntlrParser.Define_classContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#define_class}.
     *
     * @param ctx the parse tree
     */
    void exitDefine_class(NexusAntlrParser.Define_classContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#namepath_free}.
     *
     * @param ctx the parse tree
     */
    void enterNamepath_free(NexusAntlrParser.Namepath_freeContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#namepath_free}.
     *
     * @param ctx the parse tree
     */
    void exitNamepath_free(NexusAntlrParser.Namepath_freeContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#namepath}.
     *
     * @param ctx the parse tree
     */
    void enterNamepath(NexusAntlrParser.NamepathContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#namepath}.
     *
     * @param ctx the parse tree
     */
    void exitNamepath(NexusAntlrParser.NamepathContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifier(NexusAntlrParser.IdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifier(NexusAntlrParser.IdentifierContext ctx);
}