// This is a generated file. Not intended for manual editing.
package dejavu.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import dejavu.psi.node.*;

public interface DejavuTypes {

  IElementType ANNOTATIONS = new DejavuElementType("ANNOTATIONS");
  IElementType ARGUMENT = new DejavuElementType("ARGUMENT");
  IElementType ATOMIC = new DejavuElementType("ATOMIC");
  IElementType ATTRIBUTE = new DejavuElementType("ATTRIBUTE");
  IElementType CATEGORY = new DejavuElementType("CATEGORY");
  IElementType CLASS = new DejavuElementType("CLASS");
  IElementType CLASS_BODY = new DejavuElementType("CLASS_BODY");
  IElementType CLASS_CAST = new DejavuElementType("CLASS_CAST");
  IElementType DEFINE_FUNCTION = new DejavuElementType("DEFINE_FUNCTION");
  IElementType DEFINE_UNION = new DejavuElementType("DEFINE_UNION");
  IElementType ESCAPE = new DejavuElementType("ESCAPE");
  IElementType EXPRESSION = new DejavuElementType("EXPRESSION");
  IElementType EXPRESSION_CHOICE = new DejavuElementType("EXPRESSION_CHOICE");
  IElementType EXPRESSION_GROUP = new DejavuElementType("EXPRESSION_GROUP");
  IElementType EXPRESSION_HARD = new DejavuElementType("EXPRESSION_HARD");
  IElementType EXPRESSION_SOFT = new DejavuElementType("EXPRESSION_SOFT");
  IElementType EXPRESSION_TAG = new DejavuElementType("EXPRESSION_TAG");
  IElementType FUNCTION_BLOCK = new DejavuElementType("FUNCTION_BLOCK");
  IElementType FUNCTION_CALL = new DejavuElementType("FUNCTION_CALL");
  IElementType FUNCTION_PARAMETER = new DejavuElementType("FUNCTION_PARAMETER");
  IElementType GRAMMAR = new DejavuElementType("GRAMMAR");
  IElementType GRAMMAR_BODY = new DejavuElementType("GRAMMAR_BODY");
  IElementType GRAMMAR_TERM = new DejavuElementType("GRAMMAR_TERM");
  IElementType GROUP = new DejavuElementType("GROUP");
  IElementType GROUP_BODY = new DejavuElementType("GROUP_BODY");
  IElementType GROUP_ITEM = new DejavuElementType("GROUP_ITEM");
  IElementType GROUP_TERM = new DejavuElementType("GROUP_TERM");
  IElementType IDENTIFIER = new DejavuElementType("IDENTIFIER");
  IElementType IDENTIFIER_FREE = new DejavuElementType("IDENTIFIER_FREE");
  IElementType KEY = new DejavuElementType("KEY");
  IElementType MODIFIER = new DejavuElementType("MODIFIER");
  IElementType NUMBER = new DejavuElementType("NUMBER");
  IElementType PAIR = new DejavuElementType("PAIR");
  IElementType PARAMETER = new DejavuElementType("PARAMETER");
  IElementType PREFIX = new DejavuElementType("PREFIX");
  IElementType RANGE = new DejavuElementType("RANGE");
  IElementType RANGE_LOWER = new DejavuElementType("RANGE_LOWER");
  IElementType RANGE_UPPER = new DejavuElementType("RANGE_UPPER");
  IElementType REGEX = new DejavuElementType("REGEX");
  IElementType STRING = new DejavuElementType("STRING");
  IElementType SUFFIX = new DejavuElementType("SUFFIX");
  IElementType TAG_BRANCH = new DejavuElementType("TAG_BRANCH");
  IElementType TEMPLATE_END = new DejavuElementType("TEMPLATE_END");
  IElementType TERM = new DejavuElementType("TERM");
  IElementType TUPLE = new DejavuElementType("TUPLE");
  IElementType UNION_BODY = new DejavuElementType("UNION_BODY");
  IElementType UNION_VARIANT = new DejavuElementType("UNION_VARIANT");
  IElementType USING = new DejavuElementType("USING");
  IElementType USING_ALIAS = new DejavuElementType("USING_ALIAS");
  IElementType USING_BODY = new DejavuElementType("USING_BODY");
  IElementType USING_TERM = new DejavuElementType("USING_TERM");
  IElementType VALUE = new DejavuElementType("VALUE");

  IElementType ANGLE_L = new DejavuTokenType("<");
  IElementType ANGLE_R = new DejavuTokenType(">");
  IElementType AT = new DejavuTokenType("@");
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
  IElementType EQ = new DejavuTokenType("=");
  IElementType ESCAPED = new DejavuTokenType("\\escaped");
  IElementType HASH = new DejavuTokenType("HASH");
  IElementType HYPHEN = new DejavuTokenType("-");
  IElementType INTEGER = new DejavuTokenType("<<INTEGER>>");
  IElementType KW_AS = new DejavuTokenType("as");
  IElementType KW_CLASS = new DejavuTokenType("class");
  IElementType KW_CLIMB = new DejavuTokenType("climb");
  IElementType KW_END = new DejavuTokenType("KW_END");
  IElementType KW_FOR = new DejavuTokenType("KW_FOR");
  IElementType KW_GRAMMAR = new DejavuTokenType("grammar");
  IElementType KW_GROUP = new DejavuTokenType("group");
  IElementType KW_IF = new DejavuTokenType("KW_IF");
  IElementType KW_IMPORT = new DejavuTokenType("import");
  IElementType KW_MACRO = new DejavuTokenType("macro");
  IElementType KW_UNION = new DejavuTokenType("union");
  IElementType KW_USING = new DejavuTokenType("using");
  IElementType KW_WHILE = new DejavuTokenType("KW_WHILE");
  IElementType OP_AND = new DejavuTokenType("OP_AND");
  IElementType OP_CONCAT = new DejavuTokenType("~");
  IElementType OP_MANY = new DejavuTokenType("*");
  IElementType OP_MANY1 = new DejavuTokenType("OP_MANY1");
  IElementType OP_NOT = new DejavuTokenType("OP_NOT");
  IElementType OP_OPTIONAL = new DejavuTokenType("OP_OPTIONAL");
  IElementType OP_OR = new DejavuTokenType("|");
  IElementType OP_REMARK = new DejavuTokenType("^");
  IElementType PARENTHESIS_L = new DejavuTokenType("(");
  IElementType PARENTHESIS_R = new DejavuTokenType(")");
  IElementType PLACE_HOLDER = new DejavuTokenType("_");
  IElementType REFERENCE = new DejavuTokenType("$Symbol");
  IElementType REGULAR_EXPRESSION = new DejavuTokenType("REGULAR_EXPRESSION");
  IElementType REGULAR_RANGE = new DejavuTokenType("REGULAR_RANGE");
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

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ANNOTATIONS) {
        return new DejavuAnnotationsNode(node);
      }
      else if (type == ARGUMENT) {
        return new DejavuArgumentNode(node);
      }
      else if (type == ATOMIC) {
        return new DejavuAtomicNode(node);
      }
      else if (type == ATTRIBUTE) {
        return new DejavuAttributeNode(node);
      }
      else if (type == CATEGORY) {
        return new DejavuCategoryNode(node);
      }
      else if (type == CLASS) {
        return new DejavuClassNode(node);
      }
      else if (type == CLASS_BODY) {
        return new DejavuClassBodyNode(node);
      }
      else if (type == CLASS_CAST) {
        return new DejavuClassCastNode(node);
      }
      else if (type == DEFINE_FUNCTION) {
        return new DejavuDefineFunctionNode(node);
      }
      else if (type == DEFINE_UNION) {
        return new DejavuDefineUnionNode(node);
      }
      else if (type == ESCAPE) {
        return new DejavuEscapeNode(node);
      }
      else if (type == EXPRESSION_CHOICE) {
        return new DejavuExpressionChoiceNode(node);
      }
      else if (type == EXPRESSION_GROUP) {
        return new DejavuExpressionGroupNode(node);
      }
      else if (type == EXPRESSION_HARD) {
        return new DejavuExpressionHardNode(node);
      }
      else if (type == EXPRESSION_SOFT) {
        return new DejavuExpressionSoftNode(node);
      }
      else if (type == EXPRESSION_TAG) {
        return new DejavuExpressionTagNode(node);
      }
      else if (type == FUNCTION_BLOCK) {
        return new DejavuFunctionBlockNode(node);
      }
      else if (type == FUNCTION_CALL) {
        return new DejavuFunctionCallNode(node);
      }
      else if (type == FUNCTION_PARAMETER) {
        return new DejavuFunctionParameterNode(node);
      }
      else if (type == GRAMMAR) {
        return new DejavuGrammarNode(node);
      }
      else if (type == GRAMMAR_BODY) {
        return new DejavuGrammarBodyNode(node);
      }
      else if (type == GRAMMAR_TERM) {
        return new DejavuGrammarTermNode(node);
      }
      else if (type == GROUP) {
        return new DejavuGroupNode(node);
      }
      else if (type == GROUP_BODY) {
        return new DejavuGroupBodyNode(node);
      }
      else if (type == GROUP_ITEM) {
        return new DejavuGroupItemNode(node);
      }
      else if (type == GROUP_TERM) {
        return new DejavuGroupTermNode(node);
      }
      else if (type == IDENTIFIER) {
        return new DejavuIdentifierNode(node);
      }
      else if (type == IDENTIFIER_FREE) {
        return new DejavuIdentifierFreeNode(node);
      }
      else if (type == KEY) {
        return new DejavuKeyNode(node);
      }
      else if (type == MODIFIER) {
        return new DejavuModifierNode(node);
      }
      else if (type == NUMBER) {
        return new DejavuNumberNode(node);
      }
      else if (type == PAIR) {
        return new DejavuPairNode(node);
      }
      else if (type == PARAMETER) {
        return new DejavuParameterNode(node);
      }
      else if (type == PREFIX) {
        return new DejavuPrefixNode(node);
      }
      else if (type == RANGE) {
        return new DejavuRangeNode(node);
      }
      else if (type == RANGE_LOWER) {
        return new DejavuRangeLowerNode(node);
      }
      else if (type == RANGE_UPPER) {
        return new DejavuRangeUpperNode(node);
      }
      else if (type == REGEX) {
        return new DejavuRegexNode(node);
      }
      else if (type == STRING) {
        return new DejavuStringNode(node);
      }
      else if (type == SUFFIX) {
        return new DejavuSuffixNode(node);
      }
      else if (type == TAG_BRANCH) {
        return new DejavuTagBranchNode(node);
      }
      else if (type == TEMPLATE_END) {
        return new DejavuTemplateEndNode(node);
      }
      else if (type == TERM) {
        return new DejavuTermNode(node);
      }
      else if (type == TUPLE) {
        return new DejavuTupleNode(node);
      }
      else if (type == UNION_BODY) {
        return new DejavuUnionBodyNode(node);
      }
      else if (type == UNION_VARIANT) {
        return new DejavuUnionVariantNode(node);
      }
      else if (type == USING) {
        return new DejavuUsingNode(node);
      }
      else if (type == USING_ALIAS) {
        return new DejavuUsingAliasNode(node);
      }
      else if (type == USING_BODY) {
        return new DejavuUsingBodyNode(node);
      }
      else if (type == USING_TERM) {
        return new DejavuUsingTermNode(node);
      }
      else if (type == VALUE) {
        return new DejavuValueNode(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
