lexer grammar DejavuAntlrLexer;

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
TEMPLATE_E: '<%!';
TEMPLATE_L: '<%' SPACE_CONTROL? -> mode(TEMPLATE_MODE);
TEXT_SPACE: [\p{White_Space}]+;
TEXT_WORD:  [\p{XID_start}] [\p{XID_continue}]*;
TEXT:       .+?;

mode TEMPLATE_MODE;
TEMPLATE_R: SPACE_CONTROL? '%>' -> mode(DEFAULT_MODE);

DOT:   '.';
COMMA: ',';

KW_EXPORT: 'export';
KW_IMPORT: 'import';
KW_AS:     'as';
KW_IN:     'in';

// conditional
KW_IF:   'if';
KW_ELSE: 'else';
KW_END:  'end';
// loop
KW_FOR: 'for';
// loop
KW_MATCH: 'match';
KW_CASE: 'case';
KW_WITH: 'with';
// slot
KW_SLOT: 'block';
KW_APPLY: 'apply';

OP_PROPORTION: '::';

PARENTHESES_L: '(';
PARENTHESES_R: ')';
BRACKET_L:     '[';
BRACKET_R:     ']';
BRACE_L:       '{';
BRACE_R:       '}';
GENERIC_L:     '⟨';
GENERIC_R:     '⟩';

// identifier
RAW_ID:     '`' ~[`]+ '`';
UNICODE_ID: [_\p{XID_start}] [\p{XID_continue}]*;
// skip
fragment SPACE_CONTROL: [._\-~=];
WHITE_SPACE:     [\p{White_Space}]+ -> channel(HIDDEN);
BLOCK_COMMENT:   '/*' .*? '*/';
ERROR_CHARACTAR: . -> channel(HIDDEN);

