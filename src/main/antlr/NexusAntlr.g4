grammar NexusAntlr;

options {
	tokenVocab = NexusAntlrLexer;
}

// $antlr-format useTab false, columnLimit 144
// $antlr-format alignColons hanging, alignSemicolons hanging, alignFirstTokens true
program
    : (TEMPLATE_LX | define_import | define_class | if_statement | for_statement | any_text)* EOF
    ;
any_text: (TEXT_SPACE | TEXT);
// import
define_import
    : TEMPLATE_L KW_IMPORT namepath_free (KW_AS identifier)? (KW_IN expression)? TEMPLATE_R
    ;
define_class: TEMPLATE_L KW_CLASS namepath_free (KW_IN expression)? TEMPLATE_R;
// if
if_statement: if_begin else? if_end;
if_begin:     TEMPLATE_L KW_IF expression TEMPLATE_R any_text*;
else:         TEMPLATE_L KW_ELSE TEMPLATE_R any_text*;
if_end:       TEMPLATE_L KW_END KW_IF? TEMPLATE_R;

// for
for_statement: for_begin else? for_end;
for_begin
    : TEMPLATE_L KW_FOR identifier KW_IN condition = expression (
        KW_IF guard = expression
    )? TEMPLATE_R any_text*
    ;

for_end: TEMPLATE_L KW_END KW_FOR? TEMPLATE_R;

// expression
expression: namepath;

// identifier
namepath_free: identifier ((OP_PROPORTION | DOT) identifier)*;
namepath:      identifier (OP_PROPORTION identifier)*;
identifier:    UNICODE_ID | RAW_ID;