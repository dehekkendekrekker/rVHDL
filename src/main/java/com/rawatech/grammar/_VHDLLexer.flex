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

LOWERCASE_RE=[a-z]+
UPPERCASE_RE=[A-Z]+
DIGIT_RE=[0-9]+
WHITE_SPACE=[ \t\n\x0B\f\r]+
COMMENT=--.*
ADDING_OPERATOR_RE=[+\-&]+
RELATIONAL_OPERATOR_RE==|"/"=|<|<=|>|>=
SIGN_RE=[+\-]
MULTIPLYING_OPERATOR_RE=\*|"/"|mod|rem

%%
<YYINITIAL> {
  {WHITE_SPACE}                  { return WHITE_SPACE; }

  "."                            { return DOT; }
  ","                            { return COMMA; }
  ":"                            { return COLON; }
  ":="                           { return COLONEQUALS; }
  ";"                            { return SEMICOLON; }
  "+"                            { return PLUS; }
  "-"                            { return MINUS; }
  "\\"                           { return BACKSLASH; }
  "_"                            { return UNDERLINE; }
  "#"                            { return HASH; }
  "'"                            { return QUOTE; }
  "=>"                           { return RARROW; }
  "<="                           { return LARROW; }
  "**"                           { return STARSTAR; }
  "="                            { return EQUALS; }
  "<>"                           { return RANGE_RE; }
  "|"                            { return PIPE; }
  "\""                           { return DQUOTE; }
  "access"                       { return ACCESS; }
  "open"                         { return OPEN; }
  "alias"                        { return ALIAS; }
  "is"                           { return IS; }
  "new"                          { return NEW; }
  "architecture"                 { return ARCHITECTURE; }
  "of"                           { return OF; }
  "begin"                        { return BEGIN; }
  "end"                          { return END; }
  "assert"                       { return ASSERT; }
  "report"                       { return REPORT; }
  "severity"                     { return SEVERITY; }
  "attribute"                    { return ATTRIBUTE; }
  "B"                            { return B; }
  "O"                            { return O; }
  "X"                            { return X; }
  "format_effector"              { return FORMAT_EFFECTOR; }
  "for"                          { return FOR; }
  "block"                        { return BLOCK; }
  "case"                         { return CASE; }
  "when"                         { return WHEN; }
  "others"                       { return OTHERS; }
  "use"                          { return USE; }
  "component"                    { return COMPONENT; }
  "until"                        { return UNTIL; }
  "else"                         { return ELSE; }
  "configuration"                { return CONFIGURATION; }
  "constant"                     { return CONSTANT; }
  "array"                        { return ARRAY; }
  "to"                           { return TO; }
  "downto"                       { return DOWNTO; }
  "disconnect"                   { return DISCONNECT; }
  "after"                        { return AFTER; }
  "entity"                       { return ENTITY; }
  "procedure"                    { return PROCEDURE; }
  "function"                     { return FUNCTION; }
  "package"                      { return PACKAGE; }
  "type"                         { return TYPE; }
  "subtype"                      { return SUBTYPE; }
  "signal"                       { return SIGNAL; }
  "variable"                     { return VARIABLE; }
  "label"                        { return LABEL; }
  "all"                          { return ALL; }
  "exit"                         { return EXIT; }
  "E"                            { return E; }
  "and"                          { return AND; }
  "or"                           { return OR; }
  "xor"                          { return XOR; }
  "nand"                         { return NAND; }
  "nor"                          { return NOR; }
  "digit"                        { return DIGIT; }
  "abs"                          { return ABS; }
  "not"                          { return NOT; }
  "file"                         { return FILE; }
  "generate"                     { return GENERATE; }
  "if"                           { return IF; }
  "generic"                      { return GENERIC; }
  "map"                          { return MAP; }
  "LOWER_CASE_RE"                { return LOWER_CASE_RE; }
  "then"                         { return THEN; }
  "elsif"                        { return ELSIF; }
  "in"                           { return IN; }
  "bus"                          { return BUS; }
  "while"                        { return WHILE; }
  "library"                      { return LIBRARY; }
  "null"                         { return NULL; }
  "loop"                         { return LOOP; }
  "out"                          { return OUT; }
  "inout"                        { return INOUT; }
  "buffer"                       { return BUFFER; }
  "linkage"                      { return LINKAGE; }
  "next"                         { return NEXT; }
  "guarded"                      { return GUARDED; }
  "transport"                    { return TRANSPORT; }
  "body"                         { return BODY; }
  "units"                        { return UNITS; }
  "port"                         { return PORT; }
  "ame"                          { return AME; }
  "process"                      { return PROCESS; }
  "record"                       { return RECORD; }
  "return"                       { return RETURN; }
  "with"                         { return WITH; }
  "select"                       { return SELECT; }
  "on"                           { return ON; }
  "register"                     { return REGISTER; }
  "wait"                         { return WAIT; }

  {LOWERCASE_RE}                 { return LOWERCASE_RE; }
  {UPPERCASE_RE}                 { return UPPERCASE_RE; }
  {DIGIT_RE}                     { return DIGIT_RE; }
  {WHITE_SPACE}                  { return WHITE_SPACE; }
  {COMMENT}                      { return COMMENT; }
  {ADDING_OPERATOR_RE}           { return ADDING_OPERATOR_RE; }
  {RELATIONAL_OPERATOR_RE}       { return RELATIONAL_OPERATOR_RE; }
  {SIGN_RE}                      { return SIGN_RE; }
  {MULTIPLYING_OPERATOR_RE}      { return MULTIPLYING_OPERATOR_RE; }

}

[^] { return BAD_CHARACTER; }
