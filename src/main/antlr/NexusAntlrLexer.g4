lexer grammar NexusAntlrLexer;


TEMPLATE_LX: '<<%';
TEMPLATE_L:  '<%' -> mode(TEMPLATE_MODE);
TEXT_SPACE:  [\p{White_Space}]+;
TEXT:        .+?;

mode TEMPLATE_MODE
    ;
TEMPLATE_R: '%>' -> mode(DEFAULT_MODE);

KW_FOR: 'for';
KW_AS:  'as';
KW_IN:  'in';

PARENTHESES_L: '(';
PARENTHESES_R: ')';
BRACKET_L: '[';
BRACKET_R: ']';
BRACE_L: '{';
BRACE_R: '}';
GENERIC_L: '<';
GENERIC_R: '>';



// skip
WHITE_SPACE:     [\p{White_Space}]+ -> channel(HIDDEN);
BLOCK_COMMENT : '#' [^%]+?;
ERROR_CHARACTAR: . -> channel(HIDDEN);
