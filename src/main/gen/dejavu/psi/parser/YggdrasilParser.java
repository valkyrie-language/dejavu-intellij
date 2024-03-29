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
  // template-case text-element*
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

  // text-element*
  private static boolean case_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // template-else-if text-element*
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

  // text-element*
  private static boolean else_if_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_if_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "else_if_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // template-else text-element*
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

  // text-element*
  private static boolean else_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "else_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // value
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // for-statement else-statement? template-end
  public static boolean for_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_element")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = for_statement(b, l + 1);
    r = r && for_element_1(b, l + 1);
    r = r && template_end(b, l + 1);
    exit_section_(b, m, FOR_ELEMENT, r);
    return r;
  }

  // else-statement?
  private static boolean for_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_element_1")) return false;
    else_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // template-for text-element*
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_for(b, l + 1);
    r = r && for_statement_1(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // text-element*
  private static boolean for_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "for_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SYMBOL | SYMBOW_RAW {
  // //    mixin = "dejavu.psi.mixin.MixinIdentifier"
  // //    methods=[highlight]
  // }
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, "<identifier>", SYMBOL, SYMBOW_RAW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SYMBOW_RAW {
  // //    mixin = "dejavu.psi.mixin.MixinIdentifier"
  // //    methods=[highlight]
  // }
  private static boolean identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYMBOW_RAW);
    r = r && identifier_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // //    mixin = "dejavu.psi.mixin.MixinIdentifier"
  // //    methods=[highlight]
  // }
  private static boolean identifier_1_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // SYMBOL | SYMBOW_RAW
  //   | KW_WHILE | KW_FOR
  //   | KW_IF
  //   | KW_MATCH
  //   | KW_INVOKE
  public static boolean identifier_free(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_free")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER_FREE, "<identifier free>");
    r = consumeToken(b, SYMBOL);
    if (!r) r = consumeToken(b, SYMBOW_RAW);
    if (!r) r = consumeToken(b, KW_WHILE);
    if (!r) r = consumeToken(b, KW_FOR);
    if (!r) r = consumeToken(b, KW_IF);
    if (!r) r = consumeToken(b, KW_MATCH);
    if (!r) r = consumeToken(b, KW_INVOKE);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // template-if text-element*
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

  // text-element*
  private static boolean if_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "if_statement_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // template-invoke text-element* template-end
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

  // text-element*
  private static boolean invoke_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invoke_element_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "invoke_element_1", c)) break;
    }
    return true;
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
  // text-element*
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // template-slot text-element* template-end
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

  // text-element*
  private static boolean slot_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slot_element_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "slot_element_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_CASE identifier TEMPLATE_R
  public static boolean template_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_case")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_CASE, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_CASE);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // TEMPLATE_L KW_FOR identifier KW_IN expression TEMPLATE_R
  public static boolean template_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_for")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_FOR, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_FOR);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && report_error_(b, consumeToken(b, KW_IN)) && r;
    r = p && report_error_(b, expression(b, l + 1)) && r;
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
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
  // TEMPLATE_L KW_WHEN identifier TEMPLATE_R
  public static boolean template_when(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_when")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_WHEN, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_WHEN);
    p = r; // pin = 2
    r = r && report_error_(b, identifier(b, l + 1));
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATE_L KW_WHILE expression TEMPLATE_R
  public static boolean template_while(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_while")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE_WHILE, null);
    r = consumeTokens(b, 2, TEMPLATE_L, KW_WHILE);
    p = r; // pin = 2
    r = r && report_error_(b, expression(b, l + 1));
    r = p && consumeToken(b, TEMPLATE_R) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // if-element
  //   | while-element
  //   | for-element
  //   | match-element
  //   | slot-element
  //   | invoke-element
  //   | WHITE_SPACE
  //   | NORMAL_TEXT
  public static boolean text_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "text_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEXT_ELEMENT, "<text element>");
    r = if_element(b, l + 1);
    if (!r) r = while_element(b, l + 1);
    if (!r) r = for_element(b, l + 1);
    if (!r) r = match_element(b, l + 1);
    if (!r) r = slot_element(b, l + 1);
    if (!r) r = invoke_element(b, l + 1);
    if (!r) r = consumeToken(b, WHITE_SPACE);
    if (!r) r = consumeToken(b, NORMAL_TEXT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // number | identifier
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = number(b, l + 1);
    if (!r) r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // template-when text-element*
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

  // text-element*
  private static boolean when_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "when_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
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
  // template-while text-element*
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    if (!nextTokenIs(b, TEMPLATE_L)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = template_while(b, l + 1);
    r = r && while_statement_1(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  // text-element*
  private static boolean while_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!text_element(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "while_statement_1", c)) break;
    }
    return true;
  }

}
