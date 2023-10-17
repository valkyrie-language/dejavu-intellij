lexer grammar NexusAntlrLexer;

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
TEMPLATE_E: '<<%';
TEMPLATE_L: '<%' WHITE_CONTROL? -> mode(TEMPLATE_MODE);
TEXT_SPACE: [\p{White_Space}]+;
TEXT_WORD:  [\p{XID_start}] [\p{XID_continue}]*;
TEXT:       .+?;

mode TEMPLATE_MODE;
TEMPLATE_R: WHITE_CONTROL? '%>' -> mode(DEFAULT_MODE);

DOT:   '.';
COMMA: ',';

KW_IMPORT: 'using';
KW_CLASS:  'class';
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
fragment WHITE_CONTROL: [_\-=];
WHITE_SPACE:     [\p{White_Space}]+ -> channel(HIDDEN);
BLOCK_COMMENT:   '/*' .*? '*/';
ERROR_CHARACTAR: . -> channel(HIDDEN);

