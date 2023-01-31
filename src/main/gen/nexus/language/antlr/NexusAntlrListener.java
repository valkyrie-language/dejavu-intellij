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
     * Enter a parse tree produced by {@link NexusAntlrParser#any_text}.
     *
     * @param ctx the parse tree
     */
    void enterAny_text(NexusAntlrParser.Any_textContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#any_text}.
     *
     * @param ctx the parse tree
     */
    void exitAny_text(NexusAntlrParser.Any_textContext ctx);

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
     * Enter a parse tree produced by {@link NexusAntlrParser#if_statement}.
     *
     * @param ctx the parse tree
     */
    void enterIf_statement(NexusAntlrParser.If_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#if_statement}.
     *
     * @param ctx the parse tree
     */
    void exitIf_statement(NexusAntlrParser.If_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#if_begin}.
     *
     * @param ctx the parse tree
     */
    void enterIf_begin(NexusAntlrParser.If_beginContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#if_begin}.
     *
     * @param ctx the parse tree
     */
    void exitIf_begin(NexusAntlrParser.If_beginContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#else}.
     *
     * @param ctx the parse tree
     */
    void enterElse(NexusAntlrParser.ElseContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#else}.
     *
     * @param ctx the parse tree
     */
    void exitElse(NexusAntlrParser.ElseContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#if_end}.
     *
     * @param ctx the parse tree
     */
    void enterIf_end(NexusAntlrParser.If_endContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#if_end}.
     *
     * @param ctx the parse tree
     */
    void exitIf_end(NexusAntlrParser.If_endContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#for_statement}.
     *
     * @param ctx the parse tree
     */
    void enterFor_statement(NexusAntlrParser.For_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#for_statement}.
     *
     * @param ctx the parse tree
     */
    void exitFor_statement(NexusAntlrParser.For_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#for_begin}.
     *
     * @param ctx the parse tree
     */
    void enterFor_begin(NexusAntlrParser.For_beginContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#for_begin}.
     *
     * @param ctx the parse tree
     */
    void exitFor_begin(NexusAntlrParser.For_beginContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#for_end}.
     *
     * @param ctx the parse tree
     */
    void enterFor_end(NexusAntlrParser.For_endContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#for_end}.
     *
     * @param ctx the parse tree
     */
    void exitFor_end(NexusAntlrParser.For_endContext ctx);

    /**
     * Enter a parse tree produced by {@link NexusAntlrParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(NexusAntlrParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link NexusAntlrParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(NexusAntlrParser.ExpressionContext ctx);

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