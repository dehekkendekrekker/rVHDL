// This is a generated file. Not intended for manual editing.
package com.rawatech.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.rawatech.psi.VHDLTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class VHDLParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return VHDLFile(b, l + 1);
  }

  /* ********************************************************** */
  // entity_declaration
  public static boolean Definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Definition")) return false;
    if (!nextTokenIs(b, ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_declaration(b, l + 1);
    exit_section_(b, m, DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // Definition*
  static boolean VHDLFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VHDLFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VHDLFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // entity IDENTIFIER is
  //     entity_header
  // [ begin
  // entity_statement_part ]
  // end [ entity ] [ IDENTIFIER ]
  public static boolean entity_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration")) return false;
    if (!nextTokenIs(b, ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENTITY, IDENTIFIER, IS);
    r = r && entity_header(b, l + 1);
    r = r && entity_declaration_4(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && entity_declaration_6(b, l + 1);
    r = r && entity_declaration_7(b, l + 1);
    exit_section_(b, m, ENTITY_DECLARATION, r);
    return r;
  }

  // [ begin
  // entity_statement_part ]
  private static boolean entity_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_4")) return false;
    parseTokens(b, 0, BEGIN, ENTITY_STATEMENT_PART);
    return true;
  }

  // [ entity ]
  private static boolean entity_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_6")) return false;
    consumeToken(b, ENTITY);
    return true;
  }

  // [ IDENTIFIER ]
  private static boolean entity_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_7")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // [ generic_clause ]
  // [ port_clause ]
  public static boolean entity_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_HEADER, "<entity header>");
    r = entity_header_0(b, l + 1);
    r = r && entity_header_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ generic_clause ]
  private static boolean entity_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header_0")) return false;
    generic_clause(b, l + 1);
    return true;
  }

  // [ port_clause ]
  private static boolean entity_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header_1")) return false;
    port_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // generic ( generic_list )
  public static boolean generic_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_clause")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GENERIC);
    r = r && consumeToken(b, GENERIC_LIST);
    exit_section_(b, m, GENERIC_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // port ( port_list )
  public static boolean port_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_clause")) return false;
    if (!nextTokenIs(b, PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PORT);
    r = r && consumeToken(b, PORT_LIST);
    exit_section_(b, m, PORT_CLAUSE, r);
    return r;
  }

}
