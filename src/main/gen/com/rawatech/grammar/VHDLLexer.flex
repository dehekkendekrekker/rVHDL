package com.rawatech.grammar;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.rawatech.psi.VHDLTypes.*;

%%

%{
  public _VHDLLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _VHDLLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
SIMPLE_NAME=[a-zA-Z]*
WHITE_SPACE=[ \t\n\x0B\f\r]+
COMMENT=--.*

%%
<YYINITIAL> {
  {WHITE_SPACE}              { return WHITE_SPACE; }

  "generic"                  { return GENERIC; }
  "generic_list"             { return GENERIC_LIST; }
  "port"                     { return PORT; }
  "port_list"                { return PORT_LIST; }
  "entity"                   { return ENTITY; }
  "is"                       { return IS; }
  "begin"                    { return BEGIN; }
  "entity_statement_part"    { return ENTITY_STATEMENT_PART; }
  "end"                      { return END; }

  {IDENTIFIER}               { return IDENTIFIER; }
  {SIMPLE_NAME}              { return SIMPLE_NAME; }
  {WHITE_SPACE}              { return WHITE_SPACE; }
  {COMMENT}                  { return COMMENT; }

}

[^] { return BAD_CHARACTER; }
