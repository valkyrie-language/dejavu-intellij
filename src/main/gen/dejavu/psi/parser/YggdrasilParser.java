// This is a generated file. Not intended for manual editing.
package dejavu.psi.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static dejavu.psi.DejavuTypes.*;
import static dejavu.psi.ParserExtension.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YggdrasilParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(IDENTIFIER, IDENTIFIER_FREE),
  };

  /* ********************************************************** */
  // (identifier BIND)? expression
  public static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT, "<argument>");
    r = argument_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (identifier BIND)?
  private static boolean argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0")) return false;
    argument_0_0(b, l + 1);
    return true;
  }

  // identifier BIND
  private static boolean argument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifier(b, l + 1);
    r = r && consumeToken(b, BIND);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PARENTHESIS_L (argument (COMMA argument)* COMMA?)? PARENTHESIS_R {
  // //    mixin = "dejavu.psi.mixin.MixinTuple"
  // }
  public static boolean argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list")) return false;
    if (!nextTokenIs(b, PARENTHESIS_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARENTHESIS_L);
    r = r && argument_list_1(b, l + 1);
    r = r && consumeToken(b, PARENTHESIS_R);
    r = r && argument_list_3(b, l + 1);
    exit_section_(b, m, ARGUMENT_LIST, r);
    return r;
  }

  // (argument (COMMA argument)* COMMA?)?
  private static boolean argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1")) return false;
    argument_list_1_0(b, l + 1);
    return true;
  }

  // argument (COMMA argument)* COMMA?
  private static boolean argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argument(b, l + 1);
    r = r && argument_list_1_0_1(b, l + 1);
    r = r && argument_list_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA argument)*
  private static boolean argument_list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argument_list_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argument_list_1_0_1", c)) break;
    }
    return true;
  }

  // COMMA argument
  private static boolean argument_list_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean argument_list_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinTuple"
  // }
  private static boolean argument_list_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // template-case text-elements*
  public static boolean case_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_case(b, l + 1);
    r = r && case_statement_1(b, l + 1);
    exit_section_(b, m, CASE_STATEMENT, r);
    return r;
  }

  // text-elements*
  private static boolean case_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_elements(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KW_CLASS namepath BRACE_L pair* BRACE_R
  public static boolean class_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_element")) return false;
    if (!nextTokenIs(b, KW_CLASS)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CLASS_ELEMENT, null);
    r = consumeToken(b, KW_CLASS);
    p = r; // pin = 1
    r = r && report_error_(b, namepath(b, l + 1));
    r = p && report_error_(b, consumeToken(b, BRACE_L)) && r;
    r = p && report_error_(b, class_element_3(b, l + 1)) && r;
    r = p && consumeToken(b, BRACE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // pair*
  private static boolean class_element_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_element_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pair(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_element_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_TEMPLATE namepath? program-element* TEMPLATE_R
  public static boolean declaration_template(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_template")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEMPLATE_L, KW_TEMPLATE);
    r = r && declaration_template_2(b, l + 1);
    r = r && declaration_template_3(b, l + 1);
    r = r && consumeToken(b, TEMPLATE_R);
    exit_section_(b, m, DECLARATION_TEMPLATE, r);
    return r;
  }

  // namepath?
  private static boolean declaration_template_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_template_2")) return false;
    namepath(b, l + 1);
    return true;
  }

  // program-element*
  private static boolean declaration_template_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_template_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!program_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_template_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // DOT identifier-free argument-list?
  public static boolean dot_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_call")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && identifier_free(b, l + 1);
    r = r && dot_call_2(b, l + 1);
    exit_section_(b, m, DOT_CALL, r);
    return r;
  }

  // argument-list?
  private static boolean dot_call_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dot_call_2")) return false;
    argument_list(b, l + 1);
    return true;
  }

    /* ********************************************************** */
    // each-statement else-statement? template-end
    public static boolean each_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "each_element")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = each_statement(b, l + 1);
        r = r && each_element_1(b, l + 1);
        r = r && template_end(b, l + 1);
        exit_section_(b, m, EACH_ELEMENT, r);
        return r;
    }

    // else-statement?
    private static boolean each_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "each_element_1")) return false;
        else_statement(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // each-template text-elements*
    public static boolean each_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "each_statement")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = each_template(b, l + 1);
        r = r && each_statement_1(b, l + 1);
        exit_section_(b, m, EACH_STATEMENT, r);
        return r;
    }

    // text-elements*
    private static boolean each_statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "each_statement_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "each_statement_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_LOOP pattern-bare KW_IN expression if-conditional? TEMPLATE_R
    public static boolean each_template(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "each_template")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, EACH_TEMPLATE, null);
        r = consumeTokens(b, 2, TEMPLATE_L, KW_LOOP);
        p = r; // pin = 2
        r = r && report_error_(b, pattern_bare(b, l + 1));
        r = p && report_error_(b, consumeToken(b, KW_IN)) && r;
        r = p && report_error_(b, expression(b, l + 1)) && r;
        r = p && report_error_(b, each_template_5(b, l + 1)) && r;
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // if-conditional?
    private static boolean each_template_5(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "each_template_5")) return false;
        if_conditional(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // template-else-if text-elements*
    public static boolean else_if_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "else_if_statement")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = template_else_if(b, l + 1);
        r = r && else_if_statement_1(b, l + 1);
        exit_section_(b, m, ELSE_IF_STATEMENT, r);
        return r;
    }

    // text-elements*
    private static boolean else_if_statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "else_if_statement_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "else_if_statement_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // template-else text-elements*
    public static boolean else_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "else_statement")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = template_else(b, l + 1);
        r = r && else_statement_1(b, l + 1);
        exit_section_(b, m, ELSE_STATEMENT, r);
        return r;
    }

    // text-elements*
    private static boolean else_statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "else_statement_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "else_statement_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // term (infix term)*
    public static boolean expression(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "expression")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
        r = term(b, l + 1);
        r = r && expression_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (infix term)*
    private static boolean expression_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "expression_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!expression_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "expression_1", c)) break;
        }
        return true;
    }

    // infix term
    private static boolean expression_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "expression_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = infix(b, l + 1);
        r = r && term(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // KW_EXTENDS (string | namepath)
    public static boolean extends_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "extends_element")) return false;
        if (!nextTokenIs(b, KW_EXTENDS)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, EXTENDS_ELEMENT, null);
        r = consumeToken(b, KW_EXTENDS);
        p = r; // pin = 1
        r = r && extends_element_1(b, l + 1);
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // string | namepath
    private static boolean extends_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "extends_element_1")) return false;
        boolean r;
        r = string(b, l + 1);
        if (!r) r = namepath(b, l + 1);
        return r;
    }

    /* ********************************************************** */
    // namepath argument-list?
    public static boolean function_call(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "function_call")) return false;
        if (!nextTokenIs(b, "<function call>", SYMBOL, SYMBOW_RAW)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, FUNCTION_CALL, "<function call>");
        r = namepath(b, l + 1);
        r = r && function_call_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // argument-list?
    private static boolean function_call_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "function_call_1")) return false;
        argument_list(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // SYMBOL | SYMBOW_RAW
    public static boolean identifier(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "identifier")) return false;
        if (!nextTokenIs(b, "<identifier>", SYMBOL, SYMBOW_RAW)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
        r = consumeToken(b, SYMBOL);
        if (!r) r = consumeToken(b, SYMBOW_RAW);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // SYMBOL | SYMBOW_RAW
    //   | KW_WHILE | KW_LOOP
    //   | KW_IF
    //   | KW_MATCH
    //   | KW_INVOKE
    //   | KW_SLOT
    public static boolean identifier_free(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "identifier_free")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, IDENTIFIER_FREE, "<identifier free>");
        r = consumeToken(b, SYMBOL);
        if (!r) r = consumeToken(b, SYMBOW_RAW);
        if (!r) r = consumeToken(b, KW_WHILE);
        if (!r) r = consumeToken(b, KW_LOOP);
        if (!r) r = consumeToken(b, KW_IF);
        if (!r) r = consumeToken(b, KW_MATCH);
        if (!r) r = consumeToken(b, KW_INVOKE);
        if (!r) r = consumeToken(b, KW_SLOT);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // KW_IF expression
    public static boolean if_conditional(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "if_conditional")) return false;
        if (!nextTokenIs(b, KW_IF)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, IF_CONDITIONAL, null);
        r = consumeToken(b, KW_IF);
        p = r; // pin = 1
        r = r && expression(b, l + 1);
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // if-statement else-if-statement* else-statement? template-end
    public static boolean if_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "if_element")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = if_statement(b, l + 1);
        r = r && if_element_1(b, l + 1);
        r = r && if_element_2(b, l + 1);
        r = r && template_end(b, l + 1);
        exit_section_(b, m, IF_ELEMENT, r);
        return r;
    }

    // else-if-statement*
    private static boolean if_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "if_element_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!else_if_statement(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "if_element_1", c)) break;
        }
        return true;
    }

    // else-statement?
    private static boolean if_element_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "if_element_2")) return false;
        else_statement(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // template-if text-elements*
    public static boolean if_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "if_statement")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = template_if(b, l + 1);
        r = r && if_statement_1(b, l + 1);
        exit_section_(b, m, IF_STATEMENT, r);
        return r;
    }

    // text-elements*
    private static boolean if_statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "if_statement_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "if_statement_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // OP_EQ | OP_NE | OP_THEN
    public static boolean infix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "infix")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, INFIX, "<infix>");
        r = consumeToken(b, OP_EQ);
        if (!r) r = consumeToken(b, OP_NE);
        if (!r) r = consumeToken(b, OP_THEN);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // template-invoke text-elements* template-end
    public static boolean invoke_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "invoke_element")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = template_invoke(b, l + 1);
        r = r && invoke_element_1(b, l + 1);
        r = r && template_end(b, l + 1);
        exit_section_(b, m, INVOKE_ELEMENT, r);
        return r;
    }

    // text-elements*
    private static boolean invoke_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "invoke_element_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "invoke_element_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // KW_LET identifier-free BIND expression
    public static boolean let_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "let_statement")) return false;
        if (!nextTokenIs(b, KW_LET)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, LET_STATEMENT, null);
        r = consumeToken(b, KW_LET);
        p = r; // pin = 1
        r = r && report_error_(b, identifier_free(b, l + 1));
        r = p && report_error_(b, consumeToken(b, BIND)) && r;
        r = p && expression(b, l + 1) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // case-statement
    //   | when-statement
    //   | else-statement
    public static boolean match_branch(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "match_branch")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = case_statement(b, l + 1);
        if (!r) r = when_statement(b, l + 1);
        if (!r) r = else_statement(b, l + 1);
        exit_section_(b, m, MATCH_BRANCH, r);
        return r;
    }

    /* ********************************************************** */
    // match-statement match-branch* template-end
    public static boolean match_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "match_element")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = match_statement(b, l + 1);
        r = r && match_element_1(b, l + 1);
        r = r && template_end(b, l + 1);
        exit_section_(b, m, MATCH_ELEMENT, r);
        return r;
    }

    // match-branch*
    private static boolean match_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "match_element_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!match_branch(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "match_element_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // template-match WHITE_SPACE*
    public static boolean match_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "match_statement")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = template_match(b, l + 1);
        r = r && match_statement_1(b, l + 1);
        exit_section_(b, m, MATCH_STATEMENT, r);
        return r;
    }

    // WHITE_SPACE*
    private static boolean match_statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "match_statement_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!consumeToken(b, WHITE_SPACE)) break;
            if (!empty_element_parsed_guard_(b, "match_statement_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // identifier (PROPORTION identifier)*
    public static boolean namepath(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "namepath")) return false;
        if (!nextTokenIs(b, "<namepath>", SYMBOL, SYMBOW_RAW)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, NAMEPATH, "<namepath>");
        r = identifier(b, l + 1);
        r = r && namepath_1(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (PROPORTION identifier)*
    private static boolean namepath_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "namepath_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!namepath_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "namepath_1", c)) break;
        }
        return true;
    }

    // PROPORTION identifier
    private static boolean namepath_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "namepath_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, PROPORTION);
        r = r && identifier(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    /* ********************************************************** */
    // INTEGER {
    // //    mixin = "dejavu.psi.mixin.MixinNumber"
    // }
    public static boolean number(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "number")) return false;
        if (!nextTokenIs(b, INTEGER)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, INTEGER);
        r = r && number_1(b, l + 1);
        exit_section_(b, m, NUMBER, r);
        return r;
    }

    // {
    // //    mixin = "dejavu.psi.mixin.MixinNumber"
    // }
    private static boolean number_1(PsiBuilder b, int l) {
        return true;
    }

    /* ********************************************************** */
    // identifier BIND expression
    public static boolean pair(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "pair")) return false;
        if (!nextTokenIs(b, "<pair>", SYMBOL, SYMBOW_RAW)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, PAIR, "<pair>");
        r = identifier(b, l + 1);
        r = r && consumeToken(b, BIND);
        r = r && expression(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // pattern-tuple | identifier
    public static boolean pattern(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "pattern")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, PATTERN, "<pattern>");
        r = pattern_tuple(b, l + 1);
        if (!r) r = identifier(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // pattern (COMMA pattern)* COMMA?
    public static boolean pattern_bare(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "pattern_bare")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, PATTERN_BARE, "<pattern bare>");
        r = pattern(b, l + 1);
        r = r && pattern_bare_1(b, l + 1);
        r = r && pattern_bare_2(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // (COMMA pattern)*
    private static boolean pattern_bare_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "pattern_bare_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!pattern_bare_1_0(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "pattern_bare_1", c)) break;
        }
        return true;
    }

    // COMMA pattern
    private static boolean pattern_bare_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "pattern_bare_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, COMMA);
        r = r && pattern(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // COMMA?
    private static boolean pattern_bare_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "pattern_bare_2")) return false;
        consumeToken(b, COMMA);
        return true;
    }

    /* ********************************************************** */
    // PARENTHESIS_L pattern-bare? PARENTHESIS_R
    public static boolean pattern_tuple(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "pattern_tuple")) return false;
        if (!nextTokenIs(b, PARENTHESIS_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, PARENTHESIS_L);
        r = r && pattern_tuple_1(b, l + 1);
        r = r && consumeToken(b, PARENTHESIS_R);
        exit_section_(b, m, PATTERN_TUPLE, r);
        return r;
    }

    // pattern-bare?
    private static boolean pattern_tuple_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "pattern_tuple_1")) return false;
        pattern_bare(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // OP_REMARK
    public static boolean prefix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "prefix")) return false;
        if (!nextTokenIs(b, OP_REMARK)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, OP_REMARK);
        exit_section_(b, m, PREFIX, r);
        return r;
    }

    /* ********************************************************** */
    // SEMICOLON
    //     | using-element
    //     | class-element
    //     | extends-element
    //     | let-statement
    public static boolean program_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "program_element")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, PROGRAM_ELEMENT, "<program element>");
        r = consumeToken(b, SEMICOLON);
        if (!r) r = using_element(b, l + 1);
        if (!r) r = class_element(b, l + 1);
        if (!r) r = extends_element(b, l + 1);
        if (!r) r = let_statement(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_PROGRAM program-element* TEMPLATE_R
    public static boolean program_template(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "program_template")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, PROGRAM_TEMPLATE, null);
        r = consumeTokens(b, 2, TEMPLATE_L, KW_PROGRAM);
        p = r; // pin = 2
        r = r && report_error_(b, program_template_2(b, l + 1));
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // program-element*
    private static boolean program_template_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "program_template_2")) return false;
        while (true) {
            int c = current_position_(b);
            if (!program_element(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "program_template_2", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // text-elements*
    static boolean root(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "root")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "root", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // template-slot text-elements* template-end
    public static boolean slot_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "slot_element")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = template_slot(b, l + 1);
        r = r && slot_element_1(b, l + 1);
        r = r && template_end(b, l + 1);
        exit_section_(b, m, SLOT_ELEMENT, r);
        return r;
    }

    // text-elements*
    private static boolean slot_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "slot_element_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "slot_element_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // TEXT_SINGLE | TEXT_DOUBLE
    public static boolean string(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "string")) return false;
        if (!nextTokenIs(b, "<string>", TEXT_DOUBLE, TEXT_SINGLE)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
        r = consumeToken(b, TEXT_SINGLE);
        if (!r) r = consumeToken(b, TEXT_DOUBLE);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // dot-call
    public static boolean suffix(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "suffix")) return false;
        if (!nextTokenIs(b, DOT)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = dot_call(b, l + 1);
        exit_section_(b, m, SUFFIX, r);
        return r;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_CASE pattern-bare if-conditional? TEMPLATE_R
    public static boolean template_case(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_case")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, TEMPLATE_CASE, null);
        r = consumeTokens(b, 2, TEMPLATE_L, KW_CASE);
        p = r; // pin = 2
        r = r && report_error_(b, pattern_bare(b, l + 1));
        r = p && report_error_(b, template_case_3(b, l + 1)) && r;
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // if-conditional?
    private static boolean template_case_3(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_case_3")) return false;
        if_conditional(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_ELSE TEMPLATE_R
    public static boolean template_else(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_else")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, TEMPLATE_ELSE, null);
        r = consumeTokens(b, 2, TEMPLATE_L, KW_ELSE, TEMPLATE_R);
        p = r; // pin = 2
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_ELSE KW_IF expression TEMPLATE_R
    public static boolean template_else_if(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_else_if")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, TEMPLATE_ELSE_IF, null);
        r = consumeTokens(b, 3, TEMPLATE_L, KW_ELSE, KW_IF);
        p = r; // pin = 3
        r = r && report_error_(b, expression(b, l + 1));
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // TEMPLATE_L (KW_END identifier-free? | identifier-free? KW_END) TEMPLATE_R
    public static boolean template_end(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_end")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, TEMPLATE_END, null);
        r = consumeToken(b, TEMPLATE_L);
        r = r && template_end_1(b, l + 1);
        p = r; // pin = 2
        r = r && consumeToken(b, TEMPLATE_R);
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // KW_END identifier-free? | identifier-free? KW_END
    private static boolean template_end_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_end_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = template_end_1_0(b, l + 1);
        if (!r) r = template_end_1_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // KW_END identifier-free?
    private static boolean template_end_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_end_1_0")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, KW_END);
        r = r && template_end_1_0_1(b, l + 1);
        exit_section_(b, m, null, r);
        return r;
    }

    // identifier-free?
    private static boolean template_end_1_0_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_end_1_0_1")) return false;
        identifier_free(b, l + 1);
        return true;
    }

    // identifier-free? KW_END
    private static boolean template_end_1_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_end_1_1")) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = template_end_1_1_0(b, l + 1);
        r = r && consumeToken(b, KW_END);
        exit_section_(b, m, null, r);
        return r;
    }

    // identifier-free?
    private static boolean template_end_1_1_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_end_1_1_0")) return false;
        identifier_free(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // TEMPLATE_L expression TEMPLATE_R {
    // }
    public static boolean template_expression(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_expression")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = consumeToken(b, TEMPLATE_L);
        r = r && expression(b, l + 1);
        r = r && consumeToken(b, TEMPLATE_R);
        r = r && template_expression_3(b, l + 1);
        exit_section_(b, m, TEMPLATE_EXPRESSION, r);
        return r;
    }

    // {
    // }
    private static boolean template_expression_3(PsiBuilder b, int l) {
        return true;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_IF expression TEMPLATE_R
    public static boolean template_if(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_if")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, TEMPLATE_IF, null);
        r = consumeTokens(b, 2, TEMPLATE_L, KW_IF);
        p = r; // pin = 2
        r = r && report_error_(b, expression(b, l + 1));
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_INVOKE expression TEMPLATE_R
    public static boolean template_invoke(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_invoke")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, TEMPLATE_INVOKE, null);
        r = consumeTokens(b, 2, TEMPLATE_L, KW_INVOKE);
        p = r; // pin = 2
        r = r && report_error_(b, expression(b, l + 1));
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_MATCH expression TEMPLATE_R
    public static boolean template_match(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_match")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, TEMPLATE_MATCH, null);
        r = consumeTokens(b, 2, TEMPLATE_L, KW_MATCH);
        p = r; // pin = 2
        r = r && report_error_(b, expression(b, l + 1));
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_SLOT identifier TEMPLATE_R
    public static boolean template_slot(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_slot")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, TEMPLATE_SLOT, null);
        r = consumeTokens(b, 2, TEMPLATE_L, KW_SLOT);
        p = r; // pin = 2
        r = r && report_error_(b, identifier(b, l + 1));
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_WHEN pattern TEMPLATE_R
    public static boolean template_when(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "template_when")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, TEMPLATE_WHEN, null);
        r = consumeTokens(b, 2, TEMPLATE_L, KW_WHEN);
        p = r; // pin = 2
        r = r && report_error_(b, pattern(b, l + 1));
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // prefix* value suffix*
    public static boolean term(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
        r = term_0(b, l + 1);
        r = r && value(b, l + 1);
        r = r && term_2(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // prefix*
    private static boolean term_0(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_0")) return false;
        while (true) {
            int c = current_position_(b);
            if (!prefix(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "term_0", c)) break;
        }
        return true;
    }

    // suffix*
    private static boolean term_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "term_2")) return false;
        while (true) {
            int c = current_position_(b);
            if (!suffix(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "term_2", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // WHITE_SPACE
    //     | declaration-template
    //     | program-template
    //     | if-element
    //     | while-element
    //     | until-element
    //     | each-element
    //     | match-element
    //     | slot-element
    //     | invoke-element
    //     | template-expression
    //     | NORMAL_TEXT
    public static boolean text_elements(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "text_elements")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, TEXT_ELEMENTS, "<text elements>");
        r = consumeToken(b, WHITE_SPACE);
        if (!r) r = declaration_template(b, l + 1);
        if (!r) r = program_template(b, l + 1);
        if (!r) r = if_element(b, l + 1);
        if (!r) r = while_element(b, l + 1);
        if (!r) r = until_element(b, l + 1);
        if (!r) r = each_element(b, l + 1);
        if (!r) r = match_element(b, l + 1);
        if (!r) r = slot_element(b, l + 1);
        if (!r) r = invoke_element(b, l + 1);
        if (!r) r = template_expression(b, l + 1);
        if (!r) r = consumeToken(b, NORMAL_TEXT);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // until-statement else-statement? template-end
    public static boolean until_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "until_element")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = until_statement(b, l + 1);
        r = r && until_element_1(b, l + 1);
        r = r && template_end(b, l + 1);
        exit_section_(b, m, UNTIL_ELEMENT, r);
        return r;
    }

    // else-statement?
    private static boolean until_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "until_element_1")) return false;
        else_statement(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // until-template text-elements*
    public static boolean until_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "until_statement")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = until_template(b, l + 1);
        r = r && until_statement_1(b, l + 1);
        exit_section_(b, m, UNTIL_STATEMENT, r);
        return r;
    }

    // text-elements*
    private static boolean until_statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "until_statement_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "until_statement_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_LOOP KW_UNTIL expression TEMPLATE_R
    public static boolean until_template(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "until_template")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, UNTIL_TEMPLATE, null);
        r = consumeTokens(b, 3, TEMPLATE_L, KW_LOOP, KW_UNTIL);
        p = r; // pin = 3
        r = r && report_error_(b, expression(b, l + 1));
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    /* ********************************************************** */
    // identifier BIND namepath {
    // }
    public static boolean using_alias(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "using_alias")) return false;
        if (!nextTokenIs(b, "<using alias>", SYMBOL, SYMBOW_RAW)) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, USING_ALIAS, "<using alias>");
        r = identifier(b, l + 1);
        r = r && consumeToken(b, BIND);
        r = r && namepath(b, l + 1);
        r = r && using_alias_3(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    // {
    // }
    private static boolean using_alias_3(PsiBuilder b, int l) {
        return true;
    }

    /* ********************************************************** */
    // KW_USING BRACE_L using-alias* BRACE_R
    public static boolean using_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "using_element")) return false;
        if (!nextTokenIs(b, KW_USING)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, USING_ELEMENT, null);
        r = consumeTokens(b, 1, KW_USING, BRACE_L);
        p = r; // pin = 1
        r = r && report_error_(b, using_element_2(b, l + 1));
        r = p && consumeToken(b, BRACE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

    // using-alias*
    private static boolean using_element_2(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "using_element_2")) return false;
        while (true) {
            int c = current_position_(b);
            if (!using_alias(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "using_element_2", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // number | string | function-call
    public static boolean value(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "value")) return false;
        boolean r;
        Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
        r = number(b, l + 1);
        if (!r) r = string(b, l + 1);
        if (!r) r = function_call(b, l + 1);
        exit_section_(b, l, m, r, false, null);
        return r;
    }

    /* ********************************************************** */
    // template-when text-elements*
    public static boolean when_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "when_statement")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = template_when(b, l + 1);
        r = r && when_statement_1(b, l + 1);
        exit_section_(b, m, WHEN_STATEMENT, r);
        return r;
    }

    // text-elements*
    private static boolean when_statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "when_statement_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "when_statement_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // while-statement else-statement? template-end
    public static boolean while_element(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "while_element")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = while_statement(b, l + 1);
        r = r && while_element_1(b, l + 1);
        r = r && template_end(b, l + 1);
        exit_section_(b, m, WHILE_ELEMENT, r);
        return r;
    }

    // else-statement?
    private static boolean while_element_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "while_element_1")) return false;
        else_statement(b, l + 1);
        return true;
    }

    /* ********************************************************** */
    // while-template text-elements*
    public static boolean while_statement(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "while_statement")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r;
        Marker m = enter_section_(b);
        r = while_template(b, l + 1);
        r = r && while_statement_1(b, l + 1);
        exit_section_(b, m, WHILE_STATEMENT, r);
        return r;
    }

    // text-elements*
    private static boolean while_statement_1(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "while_statement_1")) return false;
        while (true) {
            int c = current_position_(b);
            if (!text_elements(b, l + 1)) break;
            if (!empty_element_parsed_guard_(b, "while_statement_1", c)) break;
        }
        return true;
    }

    /* ********************************************************** */
    // TEMPLATE_L KW_LOOP KW_WHILE expression TEMPLATE_R
    public static boolean while_template(PsiBuilder b, int l) {
        if (!recursion_guard_(b, l, "while_template")) return false;
        if (!nextTokenIs(b, TEMPLATE_L)) return false;
        boolean r, p;
        Marker m = enter_section_(b, l, _NONE_, WHILE_TEMPLATE, null);
        r = consumeTokens(b, 3, TEMPLATE_L, KW_LOOP, KW_WHILE);
        p = r; // pin = 3
        r = r && report_error_(b, expression(b, l + 1));
        r = p && consumeToken(b, TEMPLATE_R) && r;
        exit_section_(b, l, m, r, p, null);
        return r || p;
    }

}
