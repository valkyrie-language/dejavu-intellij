grammar NexusAntlr;

options { tokenVocab = NexusAntlrLexer; }

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
program: (TEMPLATE_LX | template | TEXT_SPACE | TEXT)* EOF;

template: TEMPLATE_L TEMPLATE_R;

