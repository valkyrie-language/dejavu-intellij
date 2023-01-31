// Generated from C:/Users/Dell/IdeaProjects/nexus-intellij/src/main/antlr/NexusAntlr.g4 by ANTLR 4.13.1
package nexus.language.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NexusAntlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
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
     * Visit a parse tree produced by {@link NexusAntlrParser#any_text}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAny_text(NexusAntlrParser.Any_textContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#define_import}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefine_import(NexusAntlrParser.Define_importContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#define_class}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefine_class(NexusAntlrParser.Define_classContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#if_statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_statement(NexusAntlrParser.If_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#if_begin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_begin(NexusAntlrParser.If_beginContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#else}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElse(NexusAntlrParser.ElseContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#if_end}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_end(NexusAntlrParser.If_endContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#for_statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor_statement(NexusAntlrParser.For_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#for_begin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor_begin(NexusAntlrParser.For_beginContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#for_end}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor_end(NexusAntlrParser.For_endContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression(NexusAntlrParser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#namepath_free}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamepath_free(NexusAntlrParser.Namepath_freeContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#namepath}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamepath(NexusAntlrParser.NamepathContext ctx);

    /**
     * Visit a parse tree produced by {@link NexusAntlrParser#identifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifier(NexusAntlrParser.IdentifierContext ctx);
}