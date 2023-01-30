grammar NexusAntlr;

options {
	tokenVocab = NexusAntlrLexer;
}

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
program: (TEMPLATE_LX | define_import | define_class | TEXT_SPACE | TEXT)* EOF;

define_import
    : TEMPLATE_L KW_IMPORT namepath_free (KW_AS identifier)? (KW_IN identifier)? TEMPLATE_R
    ;
define_class: TEMPLATE_L KW_CLASS namepath_free (KW_IN identifier)? TEMPLATE_R;

// identifier
namepath_free: identifier ((OP_PROPORTION | DOT) identifier)*;
namepath:      identifier (OP_PROPORTION identifier)*;
identifier:    UNICODE_ID | RAW_ID;