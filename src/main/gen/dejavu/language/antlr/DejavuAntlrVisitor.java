// Generated from C:/Users/Dell/IdeaProjects/nexus-intellij/src/main/antlr/DejavuAntlr.g4 by ANTLR 4.13.1
package dejavu.language.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DejavuAntlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DejavuAntlrVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(DejavuAntlrParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#statements}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatements(DejavuAntlrParser.StatementsContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#any_text}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAny_text(DejavuAntlrParser.Any_textContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#ie_template}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIe_template(DejavuAntlrParser.Ie_templateContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#define_import}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefine_import(DejavuAntlrParser.Define_importContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#import_block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImport_block(DejavuAntlrParser.Import_blockContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#import_item}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImport_item(DejavuAntlrParser.Import_itemContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#define_export}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefine_export(DejavuAntlrParser.Define_exportContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#if_template}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_template(DejavuAntlrParser.If_templateContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#if_then}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_then(DejavuAntlrParser.If_thenContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#else_then}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElse_then(DejavuAntlrParser.Else_thenContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#else_if}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitElse_if(DejavuAntlrParser.Else_ifContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#if_end}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_end(DejavuAntlrParser.If_endContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#for_template}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor_template(DejavuAntlrParser.For_templateContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#for_begin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor_begin(DejavuAntlrParser.For_beginContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#for_pattern}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor_pattern(DejavuAntlrParser.For_patternContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#for_end}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor_end(DejavuAntlrParser.For_endContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#control_template}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitControl_template(DejavuAntlrParser.Control_templateContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#control_statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitControl_statement(DejavuAntlrParser.Control_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#slot_statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSlot_statement(DejavuAntlrParser.Slot_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#slot_begin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSlot_begin(DejavuAntlrParser.Slot_beginContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#slot_end}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSlot_end(DejavuAntlrParser.Slot_endContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#apply_statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitApply_statement(DejavuAntlrParser.Apply_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#apply_begin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitApply_begin(DejavuAntlrParser.Apply_beginContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#apply_end}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitApply_end(DejavuAntlrParser.Apply_endContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#match_statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMatch_statement(DejavuAntlrParser.Match_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#match_begin}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMatch_begin(DejavuAntlrParser.Match_beginContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#case_branch}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCase_branch(DejavuAntlrParser.Case_branchContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#match_end}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMatch_end(DejavuAntlrParser.Match_endContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#any_expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAny_expression(DejavuAntlrParser.Any_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpression(DejavuAntlrParser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#term}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTerm(DejavuAntlrParser.TermContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#atom}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAtom(DejavuAntlrParser.AtomContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#prefix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrefix(DejavuAntlrParser.PrefixContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#infix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInfix(DejavuAntlrParser.InfixContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#suffix}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSuffix(DejavuAntlrParser.SuffixContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#dot_call}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDot_call(DejavuAntlrParser.Dot_callContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#modifiers}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitModifiers(DejavuAntlrParser.ModifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#modified_identifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitModified_identifier(DejavuAntlrParser.Modified_identifierContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#modified_namepath}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitModified_namepath(DejavuAntlrParser.Modified_namepathContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#namepath_free}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamepath_free(DejavuAntlrParser.Namepath_freeContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#namepath}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNamepath(DejavuAntlrParser.NamepathContext ctx);

    /**
     * Visit a parse tree produced by {@link DejavuAntlrParser#identifier}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIdentifier(DejavuAntlrParser.IdentifierContext ctx);
}