// Generated from C:/Users/Dell/IdeaProjects/nexus-intellij/src/main/antlr/DejavuAntlr.g4 by ANTLR 4.13.1
package dejavu.language.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DejavuAntlrParser}.
 */
public interface DejavuAntlrListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(DejavuAntlrParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(DejavuAntlrParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#statements}.
     *
     * @param ctx the parse tree
     */
    void enterStatements(DejavuAntlrParser.StatementsContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#statements}.
     *
     * @param ctx the parse tree
     */
    void exitStatements(DejavuAntlrParser.StatementsContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#any_text}.
     *
     * @param ctx the parse tree
     */
    void enterAny_text(DejavuAntlrParser.Any_textContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#any_text}.
     *
     * @param ctx the parse tree
     */
    void exitAny_text(DejavuAntlrParser.Any_textContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#ie_template}.
     *
     * @param ctx the parse tree
     */
    void enterIe_template(DejavuAntlrParser.Ie_templateContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#ie_template}.
     *
     * @param ctx the parse tree
     */
    void exitIe_template(DejavuAntlrParser.Ie_templateContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#define_import}.
     *
     * @param ctx the parse tree
     */
    void enterDefine_import(DejavuAntlrParser.Define_importContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#define_import}.
     *
     * @param ctx the parse tree
     */
    void exitDefine_import(DejavuAntlrParser.Define_importContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#import_block}.
     *
     * @param ctx the parse tree
     */
    void enterImport_block(DejavuAntlrParser.Import_blockContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#import_block}.
     *
     * @param ctx the parse tree
     */
    void exitImport_block(DejavuAntlrParser.Import_blockContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#import_item}.
     *
     * @param ctx the parse tree
     */
    void enterImport_item(DejavuAntlrParser.Import_itemContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#import_item}.
     *
     * @param ctx the parse tree
     */
    void exitImport_item(DejavuAntlrParser.Import_itemContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#define_export}.
     *
     * @param ctx the parse tree
     */
    void enterDefine_export(DejavuAntlrParser.Define_exportContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#define_export}.
     *
     * @param ctx the parse tree
     */
    void exitDefine_export(DejavuAntlrParser.Define_exportContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#if_template}.
     *
     * @param ctx the parse tree
     */
    void enterIf_template(DejavuAntlrParser.If_templateContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#if_template}.
     *
     * @param ctx the parse tree
     */
    void exitIf_template(DejavuAntlrParser.If_templateContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#if_then}.
     *
     * @param ctx the parse tree
     */
    void enterIf_then(DejavuAntlrParser.If_thenContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#if_then}.
     *
     * @param ctx the parse tree
     */
    void exitIf_then(DejavuAntlrParser.If_thenContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#else_then}.
     *
     * @param ctx the parse tree
     */
    void enterElse_then(DejavuAntlrParser.Else_thenContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#else_then}.
     *
     * @param ctx the parse tree
     */
    void exitElse_then(DejavuAntlrParser.Else_thenContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#else_if}.
     *
     * @param ctx the parse tree
     */
    void enterElse_if(DejavuAntlrParser.Else_ifContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#else_if}.
     *
     * @param ctx the parse tree
     */
    void exitElse_if(DejavuAntlrParser.Else_ifContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#if_end}.
     *
     * @param ctx the parse tree
     */
    void enterIf_end(DejavuAntlrParser.If_endContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#if_end}.
     *
     * @param ctx the parse tree
     */
    void exitIf_end(DejavuAntlrParser.If_endContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#for_template}.
     *
     * @param ctx the parse tree
     */
    void enterFor_template(DejavuAntlrParser.For_templateContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#for_template}.
     *
     * @param ctx the parse tree
     */
    void exitFor_template(DejavuAntlrParser.For_templateContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#for_begin}.
     *
     * @param ctx the parse tree
     */
    void enterFor_begin(DejavuAntlrParser.For_beginContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#for_begin}.
     *
     * @param ctx the parse tree
     */
    void exitFor_begin(DejavuAntlrParser.For_beginContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#for_pattern}.
     *
     * @param ctx the parse tree
     */
    void enterFor_pattern(DejavuAntlrParser.For_patternContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#for_pattern}.
     *
     * @param ctx the parse tree
     */
    void exitFor_pattern(DejavuAntlrParser.For_patternContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#for_end}.
     *
     * @param ctx the parse tree
     */
    void enterFor_end(DejavuAntlrParser.For_endContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#for_end}.
     *
     * @param ctx the parse tree
     */
    void exitFor_end(DejavuAntlrParser.For_endContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#control_template}.
     *
     * @param ctx the parse tree
     */
    void enterControl_template(DejavuAntlrParser.Control_templateContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#control_template}.
     *
     * @param ctx the parse tree
     */
    void exitControl_template(DejavuAntlrParser.Control_templateContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#control_statement}.
     *
     * @param ctx the parse tree
     */
    void enterControl_statement(DejavuAntlrParser.Control_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#control_statement}.
     *
     * @param ctx the parse tree
     */
    void exitControl_statement(DejavuAntlrParser.Control_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#slot_statement}.
     *
     * @param ctx the parse tree
     */
    void enterSlot_statement(DejavuAntlrParser.Slot_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#slot_statement}.
     *
     * @param ctx the parse tree
     */
    void exitSlot_statement(DejavuAntlrParser.Slot_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#slot_begin}.
     *
     * @param ctx the parse tree
     */
    void enterSlot_begin(DejavuAntlrParser.Slot_beginContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#slot_begin}.
     *
     * @param ctx the parse tree
     */
    void exitSlot_begin(DejavuAntlrParser.Slot_beginContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#slot_end}.
     *
     * @param ctx the parse tree
     */
    void enterSlot_end(DejavuAntlrParser.Slot_endContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#slot_end}.
     *
     * @param ctx the parse tree
     */
    void exitSlot_end(DejavuAntlrParser.Slot_endContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#apply_statement}.
     *
     * @param ctx the parse tree
     */
    void enterApply_statement(DejavuAntlrParser.Apply_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#apply_statement}.
     *
     * @param ctx the parse tree
     */
    void exitApply_statement(DejavuAntlrParser.Apply_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#apply_begin}.
     *
     * @param ctx the parse tree
     */
    void enterApply_begin(DejavuAntlrParser.Apply_beginContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#apply_begin}.
     *
     * @param ctx the parse tree
     */
    void exitApply_begin(DejavuAntlrParser.Apply_beginContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#apply_end}.
     *
     * @param ctx the parse tree
     */
    void enterApply_end(DejavuAntlrParser.Apply_endContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#apply_end}.
     *
     * @param ctx the parse tree
     */
    void exitApply_end(DejavuAntlrParser.Apply_endContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#match_statement}.
     *
     * @param ctx the parse tree
     */
    void enterMatch_statement(DejavuAntlrParser.Match_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#match_statement}.
     *
     * @param ctx the parse tree
     */
    void exitMatch_statement(DejavuAntlrParser.Match_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#match_begin}.
     *
     * @param ctx the parse tree
     */
    void enterMatch_begin(DejavuAntlrParser.Match_beginContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#match_begin}.
     *
     * @param ctx the parse tree
     */
    void exitMatch_begin(DejavuAntlrParser.Match_beginContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#case_branch}.
     *
     * @param ctx the parse tree
     */
    void enterCase_branch(DejavuAntlrParser.Case_branchContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#case_branch}.
     *
     * @param ctx the parse tree
     */
    void exitCase_branch(DejavuAntlrParser.Case_branchContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#match_end}.
     *
     * @param ctx the parse tree
     */
    void enterMatch_end(DejavuAntlrParser.Match_endContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#match_end}.
     *
     * @param ctx the parse tree
     */
    void exitMatch_end(DejavuAntlrParser.Match_endContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#any_expression}.
     *
     * @param ctx the parse tree
     */
    void enterAny_expression(DejavuAntlrParser.Any_expressionContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#any_expression}.
     *
     * @param ctx the parse tree
     */
    void exitAny_expression(DejavuAntlrParser.Any_expressionContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterExpression(DejavuAntlrParser.ExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitExpression(DejavuAntlrParser.ExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#modifiers}.
     *
     * @param ctx the parse tree
     */
    void enterModifiers(DejavuAntlrParser.ModifiersContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#modifiers}.
     *
     * @param ctx the parse tree
     */
    void exitModifiers(DejavuAntlrParser.ModifiersContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#modified_identifier}.
     *
     * @param ctx the parse tree
     */
    void enterModified_identifier(DejavuAntlrParser.Modified_identifierContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#modified_identifier}.
     *
     * @param ctx the parse tree
     */
    void exitModified_identifier(DejavuAntlrParser.Modified_identifierContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#modified_namepath}.
     *
     * @param ctx the parse tree
     */
    void enterModified_namepath(DejavuAntlrParser.Modified_namepathContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#modified_namepath}.
     *
     * @param ctx the parse tree
     */
    void exitModified_namepath(DejavuAntlrParser.Modified_namepathContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#namepath_free}.
     *
     * @param ctx the parse tree
     */
    void enterNamepath_free(DejavuAntlrParser.Namepath_freeContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#namepath_free}.
     *
     * @param ctx the parse tree
     */
    void exitNamepath_free(DejavuAntlrParser.Namepath_freeContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#namepath}.
     *
     * @param ctx the parse tree
     */
    void enterNamepath(DejavuAntlrParser.NamepathContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#namepath}.
     *
     * @param ctx the parse tree
     */
    void exitNamepath(DejavuAntlrParser.NamepathContext ctx);

    /**
     * Enter a parse tree produced by {@link DejavuAntlrParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void enterIdentifier(DejavuAntlrParser.IdentifierContext ctx);

    /**
     * Exit a parse tree produced by {@link DejavuAntlrParser#identifier}.
     *
     * @param ctx the parse tree
     */
    void exitIdentifier(DejavuAntlrParser.IdentifierContext ctx);
}