package dejavu.psi;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dejavu.psi.DejavuTypes.*;

%%
%public
%class _DejavuLexer
%implements com.intellij.lexer.FlexLexer
%function advance
%type com.intellij.psi.tree.IElementType
%unicode

%state ProgramContext

WHITE_SPACE        = [\s\t]
REGULAR_EXPRESSION = \/([^\/\\]|\\.)+\/
REGULAR_RANGE      = \[[^\]]*\]
COMMENT_LINE       = [/]{2}[^\r\n]*
COMMENT_BLOCK      = [/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
TEXT_SINGLE        = '([^'])*'
TEXT_DOUBLE        = \"([^\"]|\\.)*\"

INTEGER = [0-9]+

SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
SYMBOW_RAW = `[^`]*`
ESCAPED = \\.

TEMPLATE_X = [_\-~=?]
TEMPLATE_L = <%{TEMPLATE_X}?
TEMPLATE_R = {TEMPLATE_X}?%>
KW_UNION   = union|enum|climb
KW_IMPORT  = import
KW_MACRO   = macro|function|func|fun|fn|def
KW_IF     = if
KW_ELSE     = else
KW_FOR   = for
KW_IN    = in
KW_WHILE   = while
KW_AS      = as
KW_END   = group|token

%%

<YYINITIAL> {
	{TEMPLATE_L} {
          yybegin(ProgramContext);
          return TEMPLATE_L;
    }
}

<ProgramContext> {
	{TEMPLATE_R} {
		  yybegin(YYINITIAL);
		  return TEMPLATE_R;
	}
    {WHITE_SPACE}+     { return WHITE_SPACE; }
	{COMMENT_LINE}     { return COMMENT_LINE; }
	{COMMENT_BLOCK}    { return COMMENT_BLOCK; }
}



<ProgramContext> {
	"(" { return PARENTHESIS_L; }
    ")" { return PARENTHESIS_R; }
    "[" { return BRACKET_L; }
    "]" { return BRACKET_R; }
	"{" { return BRACE_L; }
	"}" { return BRACE_R; }
	"<" { return ANGLE_L; }
	">" { return ANGLE_R; }
    "->" { return TO; }
    "|" { return OP_OR;}
    "~" { return OP_CONCAT;}

	":" { return COLON; }
	";" { return SEMICOLON; }
	"#" { return HASH; }
	"$" { return DOLLAR; }
	"@" { return AT; }
	"/" { return SLASH; }
	"." { return DOT; }
	"," { return COMMA; }
	"-" { return HYPHEN; }
	"=" { return EQ; }

	"^" { return OP_REMARK; }
    "!" { return OP_NOT; }

    "?" { return OP_OPTIONAL; }
    "*" { return OP_MANY; }
    "+" { return OP_MANY1; }
}

<ProgramContext> {
    {INTEGER} { return INTEGER; }
    {TEXT_SINGLE} { return TEXT_SINGLE; }
    {TEXT_DOUBLE} { return TEXT_DOUBLE; }
    {REGULAR_RANGE} { return REGULAR_RANGE; }
    {REGULAR_EXPRESSION} { return REGULAR_EXPRESSION;}
}

<ProgramContext> {
    {KW_FOR} { return KW_FOR; }
    {KW_IF} { return KW_IF; }
    {KW_END} { return KW_END; }
    {KW_WHILE} { return KW_WHILE; }
    {KW_UNION} { return KW_UNION; }
    {KW_IMPORT} { return KW_IMPORT; }
    {KW_AS} { return KW_AS; }
    {KW_MACRO} { return KW_MACRO; }

    {ESCAPED} { return ESCAPED; }
    {SYMBOW_RAW} { return SYMBOW_RAW; }
    {SYMBOL}  { return SYMBOL; }
}
// =====================================================================================================================
[^] { return BAD_CHARACTER; }
