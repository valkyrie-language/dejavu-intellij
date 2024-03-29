// This is a generated file. Not intended for manual editing.
package dejavu.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import dejavu.psi.node.*;

public interface DejavuTypes {

  IElementType ARGUMENT = new DejavuElementType("ARGUMENT");
  IElementType ARGUMENT_LIST = new DejavuElementType("ARGUMENT_LIST");
  IElementType CASE_STATEMENT = new DejavuElementType("CASE_STATEMENT");
  IElementType CLASS_ELEMENT = new DejavuElementType("CLASS_ELEMENT");
  IElementType DECLARATION_TEMPLATE = new DejavuElementType("DECLARATION_TEMPLATE");
  IElementType DOT_CALL = new DejavuElementType("DOT_CALL");
  IElementType ELSE_IF_STATEMENT = new DejavuElementType("ELSE_IF_STATEMENT");
  IElementType ELSE_STATEMENT = new DejavuElementType("ELSE_STATEMENT");
  IElementType EXPRESSION = new DejavuElementType("EXPRESSION");
  IElementType EXTENDS_ELEMENT = new DejavuElementType("EXTENDS_ELEMENT");
  IElementType FOR_ELEMENT = new DejavuElementType("FOR_ELEMENT");
  IElementType FOR_STATEMENT = new DejavuElementType("FOR_STATEMENT");
  IElementType FUNCTION_CALL = new DejavuElementType("FUNCTION_CALL");
  IElementType IDENTIFIER = new DejavuElementType("IDENTIFIER");
  IElementType IDENTIFIER_FREE = new DejavuElementType("IDENTIFIER_FREE");
  IElementType IF_CONDITIONAL = new DejavuElementType("IF_CONDITIONAL");
  IElementType IF_ELEMENT = new DejavuElementType("IF_ELEMENT");
  IElementType IF_STATEMENT = new DejavuElementType("IF_STATEMENT");
  IElementType INFIX = new DejavuElementType("INFIX");
  IElementType INVOKE_ELEMENT = new DejavuElementType("INVOKE_ELEMENT");
  IElementType LET_STATEMENT = new DejavuElementType("LET_STATEMENT");
  IElementType MATCH_BRANCH = new DejavuElementType("MATCH_BRANCH");
  IElementType MATCH_ELEMENT = new DejavuElementType("MATCH_ELEMENT");
  IElementType MATCH_STATEMENT = new DejavuElementType("MATCH_STATEMENT");
  IElementType NAMEPATH = new DejavuElementType("NAMEPATH");
  IElementType NUMBER = new DejavuElementType("NUMBER");
  IElementType PAIR = new DejavuElementType("PAIR");
  IElementType PATTERN = new DejavuElementType("PATTERN");
  IElementType PATTERN_BARE = new DejavuElementType("PATTERN_BARE");
  IElementType PATTERN_TUPLE = new DejavuElementType("PATTERN_TUPLE");
  IElementType PREFIX = new DejavuElementType("PREFIX");
  IElementType PROGRAM_ELEMENT = new DejavuElementType("PROGRAM_ELEMENT");
  IElementType PROGRAM_TEMPLATE = new DejavuElementType("PROGRAM_TEMPLATE");
  IElementType SLOT_ELEMENT = new DejavuElementType("SLOT_ELEMENT");
  IElementType STRING = new DejavuElementType("STRING");
  IElementType SUFFIX = new DejavuElementType("SUFFIX");
  IElementType TEMPLATE_CASE = new DejavuElementType("TEMPLATE_CASE");
  IElementType TEMPLATE_ELSE = new DejavuElementType("TEMPLATE_ELSE");
  IElementType TEMPLATE_ELSE_IF = new DejavuElementType("TEMPLATE_ELSE_IF");
  IElementType TEMPLATE_END = new DejavuElementType("TEMPLATE_END");
  IElementType TEMPLATE_EXPRESSION = new DejavuElementType("TEMPLATE_EXPRESSION");
  IElementType TEMPLATE_FOR = new DejavuElementType("TEMPLATE_FOR");
  IElementType TEMPLATE_IF = new DejavuElementType("TEMPLATE_IF");
  IElementType TEMPLATE_INVOKE = new DejavuElementType("TEMPLATE_INVOKE");
  IElementType TEMPLATE_MATCH = new DejavuElementType("TEMPLATE_MATCH");
  IElementType TEMPLATE_SLOT = new DejavuElementType("TEMPLATE_SLOT");
  IElementType TEMPLATE_WHEN = new DejavuElementType("TEMPLATE_WHEN");
  IElementType TEMPLATE_WHILE = new DejavuElementType("TEMPLATE_WHILE");
  IElementType TERM = new DejavuElementType("TERM");
  IElementType TEXT_ELEMENTS = new DejavuElementType("TEXT_ELEMENTS");
  IElementType USING_ALIAS = new DejavuElementType("USING_ALIAS");
  IElementType USING_ELEMENT = new DejavuElementType("USING_ELEMENT");
  IElementType VALUE = new DejavuElementType("VALUE");
  IElementType WHEN_STATEMENT = new DejavuElementType("WHEN_STATEMENT");
  IElementType WHILE_ELEMENT = new DejavuElementType("WHILE_ELEMENT");
  IElementType WHILE_STATEMENT = new DejavuElementType("WHILE_STATEMENT");

  IElementType ANGLE_L = new DejavuTokenType("<");
  IElementType ANGLE_R = new DejavuTokenType(">");
  IElementType AT = new DejavuTokenType("@");
  IElementType BIND = new DejavuTokenType("=");
  IElementType BRACE_L = new DejavuTokenType("{");
  IElementType BRACE_R = new DejavuTokenType("}");
  IElementType BRACKET_L = new DejavuTokenType("[");
  IElementType BRACKET_R = new DejavuTokenType("]");
  IElementType COLON = new DejavuTokenType(":");
  IElementType COMMA = new DejavuTokenType(",");
  IElementType COMMENT_BLOCK = new DejavuTokenType("Comment Block");
  IElementType COMMENT_LINE = new DejavuTokenType("Comment");
  IElementType DOLLAR = new DejavuTokenType("$");
  IElementType DOT = new DejavuTokenType(".");
  IElementType ESCAPED = new DejavuTokenType("\\escaped");
  IElementType HYPHEN = new DejavuTokenType("-");
  IElementType INTEGER = new DejavuTokenType("<<INTEGER>>");
  IElementType KW_AS = new DejavuTokenType("as");
  IElementType KW_CASE = new DejavuTokenType("KW_CASE");
  IElementType KW_CLASS = new DejavuTokenType("class");
  IElementType KW_CLIMB = new DejavuTokenType("climb");
  IElementType KW_ELSE = new DejavuTokenType("KW_ELSE");
  IElementType KW_END = new DejavuTokenType("KW_END");
  IElementType KW_EXTENDS = new DejavuTokenType("KW_EXTENDS");
  IElementType KW_FOR = new DejavuTokenType("KW_FOR");
  IElementType KW_GRAMMAR = new DejavuTokenType("grammar");
  IElementType KW_GROUP = new DejavuTokenType("group");
  IElementType KW_IF = new DejavuTokenType("KW_IF");
  IElementType KW_IMPORT = new DejavuTokenType("import");
  IElementType KW_IN = new DejavuTokenType("KW_IN");
  IElementType KW_INVOKE = new DejavuTokenType("KW_INVOKE");
  IElementType KW_LET = new DejavuTokenType("KW_LET");
  IElementType KW_MACRO = new DejavuTokenType("macro");
  IElementType KW_MATCH = new DejavuTokenType("KW_MATCH");
  IElementType KW_PROGRAM = new DejavuTokenType("KW_PROGRAM");
  IElementType KW_SLOT = new DejavuTokenType("KW_SLOT");
  IElementType KW_TEMPLATE = new DejavuTokenType("KW_TEMPLATE");
  IElementType KW_UNION = new DejavuTokenType("union");
  IElementType KW_USING = new DejavuTokenType("using");
  IElementType KW_WHEN = new DejavuTokenType("KW_WHEN");
  IElementType KW_WHILE = new DejavuTokenType("KW_WHILE");
  IElementType NORMAL_TEXT = new DejavuTokenType("NORMAL_TEXT");
  IElementType OP_CONCAT = new DejavuTokenType("~");
  IElementType OP_EQ = new DejavuTokenType("OP_EQ");
  IElementType OP_MANY = new DejavuTokenType("*");
  IElementType OP_NE = new DejavuTokenType("OP_NE");
  IElementType OP_OR = new DejavuTokenType("|");
  IElementType OP_REMARK = new DejavuTokenType("^");
  IElementType OP_THEN = new DejavuTokenType("OP_THEN");
  IElementType PARENTHESIS_L = new DejavuTokenType("(");
  IElementType PARENTHESIS_R = new DejavuTokenType(")");
  IElementType PLACE_HOLDER = new DejavuTokenType("_");
  IElementType PROPORTION = new DejavuTokenType("PROPORTION");
  IElementType REFERENCE = new DejavuTokenType("$Symbol");
  IElementType SELECTION_LINE = new DejavuTokenType("SELECTION_LINE");
  IElementType SEMICOLON = new DejavuTokenType(";");
  IElementType SLASH = new DejavuTokenType("/");
  IElementType SYMBOL = new DejavuTokenType("Symbol");
  IElementType SYMBOW_RAW = new DejavuTokenType("SYMBOW_RAW");
  IElementType TEMPLATE_L = new DejavuTokenType("TEMPLATE_L");
  IElementType TEMPLATE_R = new DejavuTokenType("TEMPLATE_R");
  IElementType TEXT_DOUBLE = new DejavuTokenType("TEXT_DOUBLE");
  IElementType TEXT_SINGLE = new DejavuTokenType("TEXT_SINGLE");
  IElementType TO = new DejavuTokenType("->");
  IElementType URL = new DejavuTokenType("Url");
  IElementType VERSION = new DejavuTokenType("<<semver>>");
  IElementType WHITE_SPACE = new DejavuTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENT) {
        return new DejavuArgumentNode(node);
      }
      else if (type == ARGUMENT_LIST) {
        return new DejavuArgumentListNode(node);
      }
      else if (type == CASE_STATEMENT) {
        return new DejavuCaseStatementNode(node);
      }
      else if (type == CLASS_ELEMENT) {
        return new DejavuClassElementNode(node);
      }
      else if (type == DECLARATION_TEMPLATE) {
        return new DejavuDeclarationTemplateNode(node);
      }
      else if (type == DOT_CALL) {
        return new DejavuDotCallNode(node);
      }
      else if (type == ELSE_IF_STATEMENT) {
        return new DejavuElseIfStatementNode(node);
      }
      else if (type == ELSE_STATEMENT) {
        return new DejavuElseStatementNode(node);
      }
      else if (type == EXPRESSION) {
        return new DejavuExpressionNode(node);
      }
      else if (type == EXTENDS_ELEMENT) {
        return new DejavuExtendsElementNode(node);
      }
      else if (type == FOR_ELEMENT) {
        return new DejavuForElementNode(node);
      }
      else if (type == FOR_STATEMENT) {
        return new DejavuForStatementNode(node);
      }
      else if (type == FUNCTION_CALL) {
        return new DejavuFunctionCallNode(node);
      }
      else if (type == IDENTIFIER) {
        return new DejavuIdentifierNode(node);
      }
      else if (type == IDENTIFIER_FREE) {
        return new DejavuIdentifierFreeNode(node);
      }
      else if (type == IF_CONDITIONAL) {
        return new DejavuIfConditionalNode(node);
      }
      else if (type == IF_ELEMENT) {
        return new DejavuIfElementNode(node);
      }
      else if (type == IF_STATEMENT) {
        return new DejavuIfStatementNode(node);
      }
      else if (type == INFIX) {
        return new DejavuInfixNode(node);
      }
      else if (type == INVOKE_ELEMENT) {
        return new DejavuInvokeElementNode(node);
      }
      else if (type == LET_STATEMENT) {
        return new DejavuLetStatementNode(node);
      }
      else if (type == MATCH_BRANCH) {
        return new DejavuMatchBranchNode(node);
      }
      else if (type == MATCH_ELEMENT) {
        return new DejavuMatchElementNode(node);
      }
      else if (type == MATCH_STATEMENT) {
        return new DejavuMatchStatementNode(node);
      }
      else if (type == NAMEPATH) {
        return new DejavuNamepathNode(node);
      }
      else if (type == NUMBER) {
        return new DejavuNumberNode(node);
      }
      else if (type == PAIR) {
        return new DejavuPairNode(node);
      }
      else if (type == PATTERN) {
        return new DejavuPatternNode(node);
      }
      else if (type == PATTERN_BARE) {
        return new DejavuPatternBareNode(node);
      }
      else if (type == PATTERN_TUPLE) {
        return new DejavuPatternTupleNode(node);
      }
      else if (type == PREFIX) {
        return new DejavuPrefixNode(node);
      }
      else if (type == PROGRAM_ELEMENT) {
        return new DejavuProgramElementNode(node);
      }
      else if (type == PROGRAM_TEMPLATE) {
        return new DejavuProgramTemplateNode(node);
      }
      else if (type == SLOT_ELEMENT) {
        return new DejavuSlotElementNode(node);
      }
      else if (type == STRING) {
        return new DejavuStringNode(node);
      }
      else if (type == SUFFIX) {
        return new DejavuSuffixNode(node);
      }
      else if (type == TEMPLATE_CASE) {
        return new DejavuTemplateCaseNode(node);
      }
      else if (type == TEMPLATE_ELSE) {
        return new DejavuTemplateElseNode(node);
      }
      else if (type == TEMPLATE_ELSE_IF) {
        return new DejavuTemplateElseIfNode(node);
      }
      else if (type == TEMPLATE_END) {
        return new DejavuTemplateEndNode(node);
      }
      else if (type == TEMPLATE_EXPRESSION) {
        return new DejavuTemplateExpressionNode(node);
      }
      else if (type == TEMPLATE_FOR) {
        return new DejavuTemplateForNode(node);
      }
      else if (type == TEMPLATE_IF) {
        return new DejavuTemplateIfNode(node);
      }
      else if (type == TEMPLATE_INVOKE) {
        return new DejavuTemplateInvokeNode(node);
      }
      else if (type == TEMPLATE_MATCH) {
        return new DejavuTemplateMatchNode(node);
      }
      else if (type == TEMPLATE_SLOT) {
        return new DejavuTemplateSlotNode(node);
      }
      else if (type == TEMPLATE_WHEN) {
        return new DejavuTemplateWhenNode(node);
      }
      else if (type == TEMPLATE_WHILE) {
        return new DejavuTemplateWhileNode(node);
      }
      else if (type == TERM) {
        return new DejavuTermNode(node);
      }
      else if (type == TEXT_ELEMENTS) {
        return new DejavuTextElementsNode(node);
      }
      else if (type == USING_ALIAS) {
        return new DejavuUsingAliasNode(node);
      }
      else if (type == USING_ELEMENT) {
        return new DejavuUsingElementNode(node);
      }
      else if (type == VALUE) {
        return new DejavuValueNode(node);
      }
      else if (type == WHEN_STATEMENT) {
        return new DejavuWhenStatementNode(node);
      }
      else if (type == WHILE_ELEMENT) {
        return new DejavuWhileElementNode(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new DejavuWhileStatementNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
