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