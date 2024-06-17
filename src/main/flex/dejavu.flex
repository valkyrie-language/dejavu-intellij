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

PROPORTION = ::|[∷]

TEMPLATE_X = [_\-~=?]
TEMPLATE_L = \{%{TEMPLATE_X}?
TEMPLATE_R = {TEMPLATE_X}?%\}


KW_TEMPLATE = template
KW_PROGRAM  = program
KW_CLASS    = class
KW_EXTENDS  = extends
KW_INHERITS = inherits
KW_EXTERNAL = external
KW_SLOT     = slot

KW_INCLUDE = include
KW_IMPORT  = import
KW_USING   = using

KW_LET = let

KW_INVOKE = invoke
KW_THEN   = then


KW_IF   = if
KW_ELSE = else

KW_LOOP  = loop
KW_WHILE = while
KW_UNTIL = until
KW_IN    = in

KW_AS = as


KW_MATCH = match
KW_WHEN  = when
KW_CASE  = case

KW_END = end


WHITE_SPACE = [\s\t]+
WHITE_TEXT  = [^{]+

%%

<YYINITIAL> {
	{TEMPLATE_L} {
          yybegin(ProgramContext);
          return TEMPLATE_L;
    }
    {WHITE_SPACE} { return WHITE_SPACE; }
    {WHITE_TEXT}  { return NORMAL_TEXT; }
	\{            { return NORMAL_TEXT; }
}

<ProgramContext> {
    {WHITE_SPACE}+     { return WHITE_SPACE; }
	{COMMENT_LINE}     { return COMMENT_LINE; }
	{COMMENT_BLOCK}    { return COMMENT_BLOCK; }
	{TEMPLATE_R} {
		  yybegin(YYINITIAL);
		  return TEMPLATE_R;
	}
}

// === infix operator ===
<ProgramContext> {
	"|>" { return OP_THEN; }
	{PROPORTION} { return PROPORTION; }
	\!= { return OP_NE; }
	==  { return OP_EQ; }
	=   { return BIND; }
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
//	"#" { return HASH; }
	"$" { return DOLLAR; }
	"@" { return AT; }
	"/" { return SLASH; }
	"." { return DOT; }
	"," { return COMMA; }
	"-" { return HYPHEN; }


	"^" { return OP_REMARK; }
//    "!" { return OP_NOT; }

//    "?" { return OP_OPTIONAL; }
    "*" { return OP_MANY; }
//    "+" { return OP_MANY1; }
}

<ProgramContext> {
    {INTEGER}     { return INTEGER; }
    {TEXT_SINGLE} { return TEXT_SINGLE; }
    {TEXT_DOUBLE} { return TEXT_DOUBLE; }
//    {REGULAR_RANGE} { return REGULAR_RANGE; }
//    {REGULAR_EXPRESSION} { return REGULAR_EXPRESSION;}
}

<ProgramContext> {
	{KW_TEMPLATE} { return KW_TEMPLATE; }
	{KW_PROGRAM}  { return KW_PROGRAM; }

    {KW_CLASS}   { return KW_CLASS; }
    {KW_EXTENDS} { return KW_EXTENDS; }

	{KW_USING}  { return KW_USING; }
    {KW_IMPORT} { return KW_IMPORT; }
    {KW_AS}     { return KW_AS; }


	{KW_LET} { return KW_LET; }

    {KW_IF}   { return KW_IF; }
    {KW_ELSE} { return KW_ELSE; }

	{KW_LOOP} { return KW_LOOP; }
	{KW_IN}   { return KW_IN; }

    {KW_WHILE} { return KW_WHILE; }
    {KW_UNTIL} { return KW_UNTIL; }


    {KW_MATCH} { return KW_MATCH; }
    {KW_WHEN}  { return KW_WHEN; }
    {KW_CASE}  { return KW_CASE; }

	{KW_INVOKE} { return KW_INVOKE; }

    {KW_SLOT} { return KW_SLOT; }
    {KW_END}  { return KW_END; }
}

<ProgramContext> {
    {ESCAPED}    { return ESCAPED; }
    {SYMBOW_RAW} { return SYMBOW_RAW; }
    {SYMBOL}     { return SYMBOL; }
}
// =====================================================================================================================
[^] { return BAD_CHARACTER; }
