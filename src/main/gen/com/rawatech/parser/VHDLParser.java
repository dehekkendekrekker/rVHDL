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
  // design_file
  static boolean VHDLFile(PsiBuilder b, int l) {
    return design_file(b, l + 1);
  }

  /* ********************************************************** */
  // decimal_literal | based_literal
  public static boolean abstract_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_literal")) return false;
    if (!nextTokenIs(b, DIGIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimal_literal(b, l + 1);
    if (!r) r = based_literal(b, l + 1);
    exit_section_(b, m, ABSTRACT_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // ACCESS subtype_indication
  public static boolean access_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_type_definition")) return false;
    if (!nextTokenIs(b, ACCESS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACCESS);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, ACCESS_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // expression
  // 	| signal_name
  // 	| variable_name
  // 	| file_name
  // 	| OPEN
  public static boolean actual_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_DESIGNATOR, "<actual designator>");
    r = expression(b, l + 1);
    if (!r) r = consumeToken(b, SIGNAL_NAME);
    if (!r) r = consumeToken(b, VARIABLE_NAME);
    if (!r) r = consumeToken(b, FILE_NAME);
    if (!r) r = consumeToken(b, OPEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // parameter_association_list
  public static boolean actual_parameter_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_parameter_part")) return false;
    if (!nextTokenIs(b, PARAMETER_ASSOCIATION_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAMETER_ASSOCIATION_LIST);
    exit_section_(b, m, ACTUAL_PARAMETER_PART, r);
    return r;
  }

  /* ********************************************************** */
  // actual_designator
  // 	| function_name ( actual_designator )
  // 	| type_mark ( actual_designator )
  public static boolean actual_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTUAL_PART, "<actual part>");
    r = actual_designator(b, l + 1);
    if (!r) r = actual_part_1(b, l + 1);
    if (!r) r = actual_part_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // function_name ( actual_designator )
  private static boolean actual_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION_NAME);
    r = r && actual_part_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( actual_designator )
  private static boolean actual_part_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actual_designator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark ( actual_designator )
  private static boolean actual_part_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && actual_part_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( actual_designator )
  private static boolean actual_part_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "actual_part_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actual_designator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PLUS | MINUS  | AMPERSAND
  public static boolean adding_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "adding_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDING_OPERATOR, "<adding operator>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, AMPERSAND);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // element_association { COMMA element_association }
  public static boolean aggregate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aggregate")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AGGREGATE, "<aggregate>");
    r = element_association(b, l + 1);
    r = r && aggregate_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA element_association
  private static boolean aggregate_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aggregate_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && element_association(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ALIAS alias_designator [ COLON subtype_indication ] IS name [ signature ] 	SEMICOLON
  public static boolean alias_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration")) return false;
    if (!nextTokenIs(b, ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALIAS);
    r = r && alias_designator(b, l + 1);
    r = r && alias_declaration_2(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && name(b, l + 1);
    r = r && alias_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ALIAS_DECLARATION, r);
    return r;
  }

  // [ COLON subtype_indication ]
  private static boolean alias_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_2")) return false;
    alias_declaration_2_0(b, l + 1);
    return true;
  }

  // COLON subtype_indication
  private static boolean alias_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ signature ]
  private static boolean alias_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_declaration_5")) return false;
    signature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier | character_literal | operator_symbol
  public static boolean alias_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIAS_DESIGNATOR, "<alias designator>");
    r = identifier(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NEW subtype_indication
  // 	| NEW qualified_expression
  public static boolean allocator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allocator")) return false;
    if (!nextTokenIs(b, NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = allocator_0(b, l + 1);
    if (!r) r = allocator_1(b, l + 1);
    exit_section_(b, m, ALLOCATOR, r);
    return r;
  }

  // NEW subtype_indication
  private static boolean allocator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allocator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NEW qualified_expression
  private static boolean allocator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allocator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEW);
    r = r && qualified_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ARCHITECTURE identifier OF entity_name IS
  // 		architecture_declarative_part
  // 	BEGIN
  // 		architecture_statement_part
  // 	END [ ARCHITECTURE ] [ architecture_simple_name ] SEMICOLON
  public static boolean architecture_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_body")) return false;
    if (!nextTokenIs(b, ARCHITECTURE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARCHITECTURE);
    r = r && identifier(b, l + 1);
    r = r && consumeTokens(b, 0, OF, ENTITY_NAME, IS);
    r = r && architecture_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && architecture_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && architecture_body_9(b, l + 1);
    r = r && architecture_body_10(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ARCHITECTURE_BODY, r);
    return r;
  }

  // [ ARCHITECTURE ]
  private static boolean architecture_body_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_body_9")) return false;
    consumeToken(b, ARCHITECTURE);
    return true;
  }

  // [ architecture_simple_name ]
  private static boolean architecture_body_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_body_10")) return false;
    consumeToken(b, ARCHITECTURE_SIMPLE_NAME);
    return true;
  }

  /* ********************************************************** */
  // { block_declarative_item }
  public static boolean architecture_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_declarative_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARCHITECTURE_DECLARATIVE_PART, "<architecture declarative part>");
    r = block_declarative_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { concurrent_statement }
  public static boolean architecture_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "architecture_statement_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARCHITECTURE_STATEMENT_PART, "<architecture statement part>");
    r = concurrent_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unconstrained_array_definition	|   constrained_array_definition
  public static boolean array_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unconstrained_array_definition(b, l + 1);
    if (!r) r = constrained_array_definition(b, l + 1);
    exit_section_(b, m, ARRAY_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // ASSERT condition
  // 		[ REPORT expression ]
  // 		[ SEVERITY expression ]
  public static boolean assertion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion")) return false;
    if (!nextTokenIs(b, ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSERT);
    r = r && condition(b, l + 1);
    r = r && assertion_2(b, l + 1);
    r = r && assertion_3(b, l + 1);
    exit_section_(b, m, ASSERTION, r);
    return r;
  }

  // [ REPORT expression ]
  private static boolean assertion_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_2")) return false;
    assertion_2_0(b, l + 1);
    return true;
  }

  // REPORT expression
  private static boolean assertion_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REPORT);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ SEVERITY expression ]
  private static boolean assertion_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_3")) return false;
    assertion_3_0(b, l + 1);
    return true;
  }

  // SEVERITY expression
  private static boolean assertion_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEVERITY);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] assertion SEMICOLON
  public static boolean assertion_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSERTION_STATEMENT, "<assertion statement>");
    r = assertion_statement_0(b, l + 1);
    r = r && assertion(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean assertion_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_statement_0")) return false;
    assertion_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean assertion_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertion_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ formal_part RARROW ] actual_part
  public static boolean association_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSOCIATION_ELEMENT, "<association element>");
    r = association_element_0(b, l + 1);
    r = r && actual_part(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ formal_part RARROW ]
  private static boolean association_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_element_0")) return false;
    association_element_0_0(b, l + 1);
    return true;
  }

  // formal_part RARROW
  private static boolean association_element_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_element_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_part(b, l + 1);
    r = r && consumeToken(b, RARROW);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // association_element { COMMA association_element }
  public static boolean association_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSOCIATION_LIST, "<association list>");
    r = association_element(b, l + 1);
    r = r && association_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA association_element
  private static boolean association_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "association_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && association_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATTRIBUTE identifier COLON type_mark SEMICOLON
  public static boolean attribute_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_declaration")) return false;
    if (!nextTokenIs(b, ATTRIBUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTRIBUTE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type_mark(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ATTRIBUTE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // attribute_simple_name
  public static boolean attribute_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_designator")) return false;
    if (!nextTokenIs(b, ATTRIBUTE_SIMPLE_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTRIBUTE_SIMPLE_NAME);
    exit_section_(b, m, ATTRIBUTE_DESIGNATOR, r);
    return r;
  }

  /* ********************************************************** */
  // prefix [ signature ] QUOTE attribute_designator [ ( expression ) ]
  public static boolean attribute_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE_NAME, "<attribute name>");
    r = prefix(b, l + 1);
    r = r && attribute_name_1(b, l + 1);
    r = r && consumeToken(b, QUOTE);
    r = r && attribute_designator(b, l + 1);
    r = r && attribute_name_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ signature ]
  private static boolean attribute_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_1")) return false;
    signature(b, l + 1);
    return true;
  }

  // [ ( expression ) ]
  private static boolean attribute_name_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_4")) return false;
    attribute_name_4_0(b, l + 1);
    return true;
  }

  // ( expression )
  private static boolean attribute_name_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ATTRIBUTE attribute_designator OF entity_specification IS expression SEMICOLON
  public static boolean attribute_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_specification")) return false;
    if (!nextTokenIs(b, ATTRIBUTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTRIBUTE);
    r = r && attribute_designator(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && entity_specification(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ATTRIBUTE_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // integer
  public static boolean base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base")) return false;
    if (!nextTokenIs(b, DIGIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer(b, l + 1);
    exit_section_(b, m, BASE, r);
    return r;
  }

  /* ********************************************************** */
  // B | O | X
  public static boolean base_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_SPECIFIER, "<base specifier>");
    r = consumeToken(b, B);
    if (!r) r = consumeToken(b, O);
    if (!r) r = consumeToken(b, X);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier SEMICOLON
  public static boolean base_unit_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_unit_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_UNIT_DECLARATION, "<base unit declaration>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // extended_digit { [ underline ] extended_digit }
  public static boolean based_integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "based_integer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASED_INTEGER, "<based integer>");
    r = extended_digit(b, l + 1);
    r = r && based_integer_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ underline ] extended_digit
  private static boolean based_integer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "based_integer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = based_integer_1_0(b, l + 1);
    r = r && extended_digit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ underline ]
  private static boolean based_integer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "based_integer_1_0")) return false;
    consumeToken(b, UNDERLINE);
    return true;
  }

  /* ********************************************************** */
  // base HASH based_integer [ DOT based_integer ] HASH [ exponent ]
  public static boolean based_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "based_literal")) return false;
    if (!nextTokenIs(b, DIGIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base(b, l + 1);
    r = r && consumeToken(b, HASH);
    r = r && based_integer(b, l + 1);
    r = r && based_literal_3(b, l + 1);
    r = r && consumeToken(b, HASH);
    r = r && based_literal_5(b, l + 1);
    exit_section_(b, m, BASED_LITERAL, r);
    return r;
  }

  // [ DOT based_integer ]
  private static boolean based_literal_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "based_literal_3")) return false;
    based_literal_3_0(b, l + 1);
    return true;
  }

  // DOT based_integer
  private static boolean based_literal_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "based_literal_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && based_integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ exponent ]
  private static boolean based_literal_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "based_literal_5")) return false;
    exponent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // basic_graphic_character | format_effector
  public static boolean basic_character(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_character")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_CHARACTER, "<basic character>");
    r = basic_graphic_character(b, l + 1);
    if (!r) r = consumeToken(b, FORMAT_EFFECTOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // upper_case_letter | digit | special_character| space_character
  public static boolean basic_graphic_character(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_graphic_character")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_GRAPHIC_CHARACTER, "<basic graphic character>");
    r = consumeToken(b, UPPER_CASE_LETTER);
    if (!r) r = consumeToken(b, DIGIT);
    if (!r) r = consumeToken(b, SPECIAL_CHARACTER);
    if (!r) r = consumeToken(b, SPACE_CHARACTER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // letter { [ underline ] letter_or_digit }
  public static boolean basic_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_identifier")) return false;
    if (!nextTokenIs(b, "<basic identifier>", LOWER_CASE_LETTER, UPPER_CASE_LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_IDENTIFIER, "<basic identifier>");
    r = letter(b, l + 1);
    r = r && basic_identifier_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ underline ] letter_or_digit
  private static boolean basic_identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_identifier_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = basic_identifier_1_0(b, l + 1);
    r = r && letter_or_digit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ underline ]
  private static boolean basic_identifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basic_identifier_1_0")) return false;
    consumeToken(b, UNDERLINE);
    return true;
  }

  /* ********************************************************** */
  // [ USE entity_aspect ]
  // 	[ generic_map_aspect ]
  // 	[ port_map_aspect ]
  public static boolean binding_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINDING_INDICATION, "<binding indication>");
    r = binding_indication_0(b, l + 1);
    r = r && binding_indication_1(b, l + 1);
    r = r && binding_indication_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ USE entity_aspect ]
  private static boolean binding_indication_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_0")) return false;
    binding_indication_0_0(b, l + 1);
    return true;
  }

  // USE entity_aspect
  private static boolean binding_indication_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && entity_aspect(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ generic_map_aspect ]
  private static boolean binding_indication_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_1")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  // [ port_map_aspect ]
  private static boolean binding_indication_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_indication_2")) return false;
    port_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // base_specifier " bit_value "
  public static boolean bit_string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_string_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_STRING_LITERAL, "<bit string literal>");
    r = base_specifier(b, l + 1);
    r = r && consumeToken(b, " bit_value ");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // extended_digit { [ underline ] extended_digit }
  public static boolean bit_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_VALUE, "<bit value>");
    r = extended_digit(b, l + 1);
    r = r && bit_value_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ underline ] extended_digit
  private static boolean bit_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bit_value_1_0(b, l + 1);
    r = r && extended_digit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ underline ]
  private static boolean bit_value_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_value_1_0")) return false;
    consumeToken(b, UNDERLINE);
    return true;
  }

  /* ********************************************************** */
  // FOR block_specification
  // 		{ use_clause }
  // 		{ configuration_item }
  // 	END FOR SEMICOLON
  public static boolean block_configuration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && block_specification(b, l + 1);
    r = r && block_configuration_2(b, l + 1);
    r = r && block_configuration_3(b, l + 1);
    r = r && consumeTokens(b, 0, END, FOR, SEMICOLON);
    exit_section_(b, m, BLOCK_CONFIGURATION, r);
    return r;
  }

  // { use_clause }
  private static boolean block_configuration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = use_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { configuration_item }
  private static boolean block_configuration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_configuration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = configuration_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declaration
  // 	| subprogram_body
  // 	| type_declaration
  // 	| subtype_declaration
  // 	| constant_declaration
  // 	| signal_declaration
  // 	| shared_variable_declaration
  // 	| file_declaration
  // 	| alias_declaration
  // 	| component_declaration
  // 	| attribute_declaration
  // 	| attribute_specification
  // 	| configuration_specification
  // 	| disconnection_specification
  // 	| use_clause
  // 	| group_template_declaration
  // 	| group_declaration
  public static boolean block_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_DECLARATIVE_ITEM, "<block declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = consumeToken(b, SHARED_VARIABLE_DECLARATION);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = component_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = configuration_specification(b, l + 1);
    if (!r) r = disconnection_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { block_declarative_item }
  public static boolean block_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_declarative_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_DECLARATIVE_PART, "<block declarative part>");
    r = block_declarative_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ generic_clause
  // 	[ generic_map_aspect SEMICOLON ] ]
  // 	[ port_clause
  // 	[ port_map_aspect SEMICOLON ] ]
  public static boolean block_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_HEADER, "<block header>");
    r = block_header_0(b, l + 1);
    r = r && block_header_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ generic_clause
  // 	[ generic_map_aspect SEMICOLON ] ]
  private static boolean block_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0")) return false;
    block_header_0_0(b, l + 1);
    return true;
  }

  // generic_clause
  // 	[ generic_map_aspect SEMICOLON ]
  private static boolean block_header_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_clause(b, l + 1);
    r = r && block_header_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ generic_map_aspect SEMICOLON ]
  private static boolean block_header_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0_0_1")) return false;
    block_header_0_0_1_0(b, l + 1);
    return true;
  }

  // generic_map_aspect SEMICOLON
  private static boolean block_header_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_map_aspect(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ port_clause
  // 	[ port_map_aspect SEMICOLON ] ]
  private static boolean block_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1")) return false;
    block_header_1_0(b, l + 1);
    return true;
  }

  // port_clause
  // 	[ port_map_aspect SEMICOLON ]
  private static boolean block_header_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_clause(b, l + 1);
    r = r && block_header_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ port_map_aspect SEMICOLON ]
  private static boolean block_header_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1_0_1")) return false;
    block_header_1_0_1_0(b, l + 1);
    return true;
  }

  // port_map_aspect SEMICOLON
  private static boolean block_header_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_header_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_map_aspect(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // architecture_name
  // 	| block_statement_label
  // 	| generate_statement_label [ ( index_specification ) ]
  public static boolean block_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_SPECIFICATION, "<block specification>");
    r = consumeToken(b, ARCHITECTURE_NAME);
    if (!r) r = consumeToken(b, BLOCK_STATEMENT_LABEL);
    if (!r) r = block_specification_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // generate_statement_label [ ( index_specification ) ]
  private static boolean block_specification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_specification_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GENERATE_STATEMENT_LABEL);
    r = r && block_specification_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( index_specification ) ]
  private static boolean block_specification_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_specification_2_1")) return false;
    block_specification_2_1_0(b, l + 1);
    return true;
  }

  // ( index_specification )
  private static boolean block_specification_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_specification_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = index_specification(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block_label COLON
  // 		BLOCK [ ( guard_expression ) ] [ IS ]
  // 			block_header
  // 			block_declarative_part
  // 		BEGIN
  // 			block_statement_part
  // 		END BLOCK [ block_label ] SEMICOLON
  public static boolean block_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement")) return false;
    if (!nextTokenIs(b, BLOCK_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BLOCK_LABEL, COLON, BLOCK);
    r = r && block_statement_3(b, l + 1);
    r = r && block_statement_4(b, l + 1);
    r = r && block_header(b, l + 1);
    r = r && block_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && block_statement_part(b, l + 1);
    r = r && consumeTokens(b, 0, END, BLOCK);
    r = r && block_statement_11(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, BLOCK_STATEMENT, r);
    return r;
  }

  // [ ( guard_expression ) ]
  private static boolean block_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_3")) return false;
    consumeToken(b, GUARD_EXPRESSION);
    return true;
  }

  // [ IS ]
  private static boolean block_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_4")) return false;
    consumeToken(b, IS);
    return true;
  }

  // [ block_label ]
  private static boolean block_statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_11")) return false;
    consumeToken(b, BLOCK_LABEL);
    return true;
  }

  /* ********************************************************** */
  // { concurrent_statement }
  public static boolean block_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_statement_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_STATEMENT_PART, "<block statement part>");
    r = concurrent_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ case_label COLON ]
  // 		CASE expression IS
  // 			case_statement_alternative
  // 			{ case_statement_alternative }
  // 		END CASE [ case_label ] SEMICOLON
  public static boolean case_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement")) return false;
    if (!nextTokenIs(b, "<case statement>", CASE, CASE_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_STATEMENT, "<case statement>");
    r = case_statement_0(b, l + 1);
    r = r && consumeToken(b, CASE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && case_statement_alternative(b, l + 1);
    r = r && case_statement_5(b, l + 1);
    r = r && consumeTokens(b, 0, END, CASE);
    r = r && case_statement_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ case_label COLON ]
  private static boolean case_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_0")) return false;
    parseTokens(b, 0, CASE_LABEL, COLON);
    return true;
  }

  // { case_statement_alternative }
  private static boolean case_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_statement_alternative(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ case_label ]
  private static boolean case_statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_8")) return false;
    consumeToken(b, CASE_LABEL);
    return true;
  }

  /* ********************************************************** */
  // WHEN choices RARROW
  // 		sequence_of_statements
  public static boolean case_statement_alternative(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_statement_alternative")) return false;
    if (!nextTokenIs(b, WHEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    r = r && consumeToken(b, RARROW);
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, m, CASE_STATEMENT_ALTERNATIVE, r);
    return r;
  }

  /* ********************************************************** */
  // ' graphic_character '
  public static boolean character_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "character_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHARACTER_LITERAL, "<character literal>");
    r = consumeToken(b, " graphic_character ");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_expression
  // 	| discrete_range
  // 	| element_simple_name
  // 	| OTHERS
  public static boolean choice(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choice")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHOICE, "<choice>");
    r = simple_expression(b, l + 1);
    if (!r) r = discrete_range(b, l + 1);
    if (!r) r = consumeToken(b, ELEMENT_SIMPLE_NAME);
    if (!r) r = consumeToken(b, OTHERS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // choice { | choice }
  public static boolean choices(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHOICES, "<choices>");
    r = choice(b, l + 1);
    r = r && choices_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // | choice
  private static boolean choices_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "choices_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CHOICES_1_0_0);
    if (!r) r = choice(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR component_specification
  // 		[ binding_indication SEMICOLON ]
  // 		[ block_configuration ]
  // 	END FOR SEMICOLON
  public static boolean component_configuration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && component_specification(b, l + 1);
    r = r && component_configuration_2(b, l + 1);
    r = r && component_configuration_3(b, l + 1);
    r = r && consumeTokens(b, 0, END, FOR, SEMICOLON);
    exit_section_(b, m, COMPONENT_CONFIGURATION, r);
    return r;
  }

  // [ binding_indication SEMICOLON ]
  private static boolean component_configuration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_2")) return false;
    component_configuration_2_0(b, l + 1);
    return true;
  }

  // binding_indication SEMICOLON
  private static boolean component_configuration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ block_configuration ]
  private static boolean component_configuration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_configuration_3")) return false;
    block_configuration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COMPONENT identifier [ IS ]
  // 		[ local_generic_clause ]
  // 		[ local_port_clause ]
  // 	END COMPONENT [ component_simple_name ] SEMICOLON
  public static boolean component_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration")) return false;
    if (!nextTokenIs(b, COMPONENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPONENT);
    r = r && identifier(b, l + 1);
    r = r && component_declaration_2(b, l + 1);
    r = r && component_declaration_3(b, l + 1);
    r = r && component_declaration_4(b, l + 1);
    r = r && consumeTokens(b, 0, END, COMPONENT);
    r = r && component_declaration_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, COMPONENT_DECLARATION, r);
    return r;
  }

  // [ IS ]
  private static boolean component_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_2")) return false;
    consumeToken(b, IS);
    return true;
  }

  // [ local_generic_clause ]
  private static boolean component_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_3")) return false;
    consumeToken(b, LOCAL_GENERIC_CLAUSE);
    return true;
  }

  // [ local_port_clause ]
  private static boolean component_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_4")) return false;
    consumeToken(b, LOCAL_PORT_CLAUSE);
    return true;
  }

  // [ component_simple_name ]
  private static boolean component_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_declaration_7")) return false;
    consumeToken(b, COMPONENT_SIMPLE_NAME);
    return true;
  }

  /* ********************************************************** */
  // instantiation_label COLON
  // 		instantiated_unit
  // 			[ generic_map_aspect ]
  // 			[ port_map_aspect ] SEMICOLON
  public static boolean component_instantiation_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_instantiation_statement")) return false;
    if (!nextTokenIs(b, INSTANTIATION_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INSTANTIATION_LABEL, COLON);
    r = r && instantiated_unit(b, l + 1);
    r = r && component_instantiation_statement_3(b, l + 1);
    r = r && component_instantiation_statement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, COMPONENT_INSTANTIATION_STATEMENT, r);
    return r;
  }

  // [ generic_map_aspect ]
  private static boolean component_instantiation_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_instantiation_statement_3")) return false;
    generic_map_aspect(b, l + 1);
    return true;
  }

  // [ port_map_aspect ]
  private static boolean component_instantiation_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_instantiation_statement_4")) return false;
    port_map_aspect(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // instantiation_list COLON component_name
  public static boolean component_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPONENT_SPECIFICATION, "<component specification>");
    r = instantiation_list(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, COMPONENT_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array_type_definition
  // 	| record_type_definition
  public static boolean composite_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "composite_type_definition")) return false;
    if (!nextTokenIs(b, "<composite type definition>", ARRAY, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOSITE_TYPE_DEFINITION, "<composite type definition>");
    r = array_type_definition(b, l + 1);
    if (!r) r = record_type_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] [ POSTPONED ] assertion SEMICOLON
  public static boolean concurrent_assertion_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_ASSERTION_STATEMENT, "<concurrent assertion statement>");
    r = concurrent_assertion_statement_0(b, l + 1);
    r = r && concurrent_assertion_statement_1(b, l + 1);
    r = r && assertion(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean concurrent_assertion_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement_0")) return false;
    concurrent_assertion_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean concurrent_assertion_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ POSTPONED ]
  private static boolean concurrent_assertion_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_assertion_statement_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  /* ********************************************************** */
  // [ label COLON ] [ POSTPONED ] procedure_call SEMICOLON
  public static boolean concurrent_procedure_call_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_PROCEDURE_CALL_STATEMENT, "<concurrent procedure call statement>");
    r = concurrent_procedure_call_statement_0(b, l + 1);
    r = r && concurrent_procedure_call_statement_1(b, l + 1);
    r = r && procedure_call(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean concurrent_procedure_call_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement_0")) return false;
    concurrent_procedure_call_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean concurrent_procedure_call_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ POSTPONED ]
  private static boolean concurrent_procedure_call_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_procedure_call_statement_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  /* ********************************************************** */
  // [ label COLON ] [ POSTPONED ] conditional_signal_assignment
  // 	| [ label COLON ] [ POSTPONED ] selected_signal_assignment
  public static boolean concurrent_signal_assignment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_SIGNAL_ASSIGNMENT_STATEMENT, "<concurrent signal assignment statement>");
    r = concurrent_signal_assignment_statement_0(b, l + 1);
    if (!r) r = concurrent_signal_assignment_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ] [ POSTPONED ] conditional_signal_assignment
  private static boolean concurrent_signal_assignment_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_signal_assignment_statement_0_0(b, l + 1);
    r = r && concurrent_signal_assignment_statement_0_1(b, l + 1);
    r = r && conditional_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ label COLON ]
  private static boolean concurrent_signal_assignment_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0_0")) return false;
    concurrent_signal_assignment_statement_0_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean concurrent_signal_assignment_statement_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ POSTPONED ]
  private static boolean concurrent_signal_assignment_statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_0_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // [ label COLON ] [ POSTPONED ] selected_signal_assignment
  private static boolean concurrent_signal_assignment_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_signal_assignment_statement_1_0(b, l + 1);
    r = r && concurrent_signal_assignment_statement_1_1(b, l + 1);
    r = r && selected_signal_assignment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ label COLON ]
  private static boolean concurrent_signal_assignment_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1_0")) return false;
    concurrent_signal_assignment_statement_1_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean concurrent_signal_assignment_statement_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ POSTPONED ]
  private static boolean concurrent_signal_assignment_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_signal_assignment_statement_1_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  /* ********************************************************** */
  // block_statement
  // 	| process_statement
  // 	| concurrent_procedure_call_statement
  // 	| concurrent_assertion_statement
  // 	| concurrent_signal_assignment_statement
  // 	| component_instantiation_statement
  // 	| generate_statement
  public static boolean concurrent_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "concurrent_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONCURRENT_STATEMENT, "<concurrent statement>");
    r = block_statement(b, l + 1);
    if (!r) r = process_statement(b, l + 1);
    if (!r) r = concurrent_procedure_call_statement(b, l + 1);
    if (!r) r = concurrent_assertion_statement(b, l + 1);
    if (!r) r = concurrent_signal_assignment_statement(b, l + 1);
    if (!r) r = component_instantiation_statement(b, l + 1);
    if (!r) r = generate_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // boolean_expression
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    if (!nextTokenIs(b, BOOLEAN_EXPRESSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BOOLEAN_EXPRESSION);
    exit_section_(b, m, CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // UNTIL condition
  public static boolean condition_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_clause")) return false;
    if (!nextTokenIs(b, UNTIL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNTIL);
    r = r && condition(b, l + 1);
    exit_section_(b, m, CONDITION_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // target	LARROW options conditional_waveforms SEMICOLON
  public static boolean conditional_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_signal_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_SIGNAL_ASSIGNMENT, "<conditional signal assignment>");
    r = target(b, l + 1);
    r = r && consumeToken(b, LARROW);
    r = r && options(b, l + 1);
    r = r && conditional_waveforms(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { waveform WHEN condition ELSE }
  // 	waveform [ WHEN condition ]
  public static boolean conditional_waveforms(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_WAVEFORMS, "<conditional waveforms>");
    r = conditional_waveforms_0(b, l + 1);
    r = r && waveform(b, l + 1);
    r = r && conditional_waveforms_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // waveform WHEN condition ELSE
  private static boolean conditional_waveforms_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, ELSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ WHEN condition ]
  private static boolean conditional_waveforms_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_2")) return false;
    conditional_waveforms_2_0(b, l + 1);
    return true;
  }

  // WHEN condition
  private static boolean conditional_waveforms_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_waveforms_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONFIGURATION identifier OF entity_name IS
  // 		configuration_declarative_part
  // 		block_configuration
  // 	END [ CONFIGURATION ] [ configuration_simple_name ] SEMICOLON
  public static boolean configuration_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration")) return false;
    if (!nextTokenIs(b, CONFIGURATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONFIGURATION);
    r = r && identifier(b, l + 1);
    r = r && consumeTokens(b, 0, OF, ENTITY_NAME, IS);
    r = r && configuration_declarative_part(b, l + 1);
    r = r && block_configuration(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && configuration_declaration_8(b, l + 1);
    r = r && configuration_declaration_9(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONFIGURATION_DECLARATION, r);
    return r;
  }

  // [ CONFIGURATION ]
  private static boolean configuration_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration_8")) return false;
    consumeToken(b, CONFIGURATION);
    return true;
  }

  // [ configuration_simple_name ]
  private static boolean configuration_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declaration_9")) return false;
    consumeToken(b, CONFIGURATION_SIMPLE_NAME);
    return true;
  }

  /* ********************************************************** */
  // use_clause
  // 	| attribute_specification
  // 	| group_declaration
  public static boolean configuration_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONFIGURATION_DECLARATIVE_ITEM, "<configuration declarative item>");
    r = use_clause(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { configuration_declarative_item }
  public static boolean configuration_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_declarative_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONFIGURATION_DECLARATIVE_PART, "<configuration declarative part>");
    r = configuration_declarative_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block_configuration
  // 	| component_configuration
  public static boolean configuration_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_item")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_configuration(b, l + 1);
    if (!r) r = component_configuration(b, l + 1);
    exit_section_(b, m, CONFIGURATION_ITEM, r);
    return r;
  }

  /* ********************************************************** */
  // FOR component_specification binding_indication SEMICOLON
  public static boolean configuration_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configuration_specification")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && component_specification(b, l + 1);
    r = r && binding_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONFIGURATION_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // CONSTANT identifier_list COLON subtype_indication [ COLONEQUALS expression ] SEMICOLON
  public static boolean constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration")) return false;
    if (!nextTokenIs(b, CONSTANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONSTANT);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    r = r && constant_declaration_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONSTANT_DECLARATION, r);
    return r;
  }

  // [ COLONEQUALS expression ]
  private static boolean constant_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_4")) return false;
    constant_declaration_4_0(b, l + 1);
    return true;
  }

  // COLONEQUALS expression
  private static boolean constant_declaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLONEQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ARRAY index_constraint OF element_subtype_indication
  public static boolean constrained_array_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constrained_array_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY);
    r = r && index_constraint(b, l + 1);
    r = r && consumeTokens(b, 0, OF, ELEMENT_SUBTYPE_INDICATION);
    exit_section_(b, m, CONSTRAINED_ARRAY_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // range_constraint
  // 	| index_constraint
  public static boolean constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRAINT, "<constraint>");
    r = range_constraint(b, l + 1);
    if (!r) r = index_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { context_item }
  public static boolean context_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_clause")) return false;
    if (!nextTokenIs(b, "<context clause>", LIBRARY, USE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTEXT_CLAUSE, "<context clause>");
    r = context_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // library_clause
  // 	| use_clause
  public static boolean context_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "context_item")) return false;
    if (!nextTokenIs(b, "<context item>", LIBRARY, USE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTEXT_ITEM, "<context item>");
    r = library_clause(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // integer [ DOT integer ] [ exponent ]
  public static boolean decimal_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_literal")) return false;
    if (!nextTokenIs(b, DIGIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer(b, l + 1);
    r = r && decimal_literal_1(b, l + 1);
    r = r && decimal_literal_2(b, l + 1);
    exit_section_(b, m, DECIMAL_LITERAL, r);
    return r;
  }

  // [ DOT integer ]
  private static boolean decimal_literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_literal_1")) return false;
    decimal_literal_1_0(b, l + 1);
    return true;
  }

  // DOT integer
  private static boolean decimal_literal_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_literal_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ exponent ]
  private static boolean decimal_literal_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_literal_2")) return false;
    exponent(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type_declaration
  // 	| subtype_declaration
  // 	| object_declaration
  // 	| interface_declaration
  // 	| alias_declaration
  // 	| attribute_declaration
  // 	| component_declaration
  // 	| group_template_declaration
  // 	| group_declaration
  // 	| entity_declaration
  // 	| configuration_declaration
  // 	| subprogram_declaration
  // 	| package_declaration
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = object_declaration(b, l + 1);
    if (!r) r = interface_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = component_declaration(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    if (!r) r = entity_declaration(b, l + 1);
    if (!r) r = configuration_declaration(b, l + 1);
    if (!r) r = subprogram_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TRANSPORT
  // 	| [ REJECT time_expression ] INERTIAL
  public static boolean delay_mechanism(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELAY_MECHANISM, "<delay mechanism>");
    r = consumeToken(b, TRANSPORT);
    if (!r) r = delay_mechanism_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ REJECT time_expression ] INERTIAL
  private static boolean delay_mechanism_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = delay_mechanism_1_0(b, l + 1);
    r = r && consumeToken(b, INERTIAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ REJECT time_expression ]
  private static boolean delay_mechanism_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delay_mechanism_1_0")) return false;
    parseTokens(b, 0, REJECT, TIME_EXPRESSION);
    return true;
  }

  /* ********************************************************** */
  // design_unit { design_unit }
  public static boolean design_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "design_file")) return false;
    if (!nextTokenIs(b, "<design file>", LIBRARY, USE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESIGN_FILE, "<design file>");
    r = design_unit(b, l + 1);
    r = r && design_file_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { design_unit }
  private static boolean design_file_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "design_file_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = design_unit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // context_clause library_unit
  public static boolean design_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "design_unit")) return false;
    if (!nextTokenIs(b, "<design unit>", LIBRARY, USE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESIGN_UNIT, "<design unit>");
    r = context_clause(b, l + 1);
    r = r && library_unit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier  |  operator_symbol
  public static boolean designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DESIGNATOR, "<designator>");
    r = identifier(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TO | DOWNTO
  public static boolean direction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direction")) return false;
    if (!nextTokenIs(b, "<direction>", DOWNTO, TO)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECTION, "<direction>");
    r = consumeToken(b, TO);
    if (!r) r = consumeToken(b, DOWNTO);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DISCONNECT guarded_signal_specification AFTER time_expression SEMICOLON
  public static boolean disconnection_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disconnection_specification")) return false;
    if (!nextTokenIs(b, DISCONNECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DISCONNECT);
    r = r && guarded_signal_specification(b, l + 1);
    r = r && consumeTokens(b, 0, AFTER, TIME_EXPRESSION, SEMICOLON);
    exit_section_(b, m, DISCONNECTION_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // discrete_subtype_indication | range
  public static boolean discrete_range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "discrete_range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISCRETE_RANGE, "<discrete range>");
    r = consumeToken(b, DISCRETE_SUBTYPE_INDICATION);
    if (!r) r = range(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ choices RARROW ] expression
  public static boolean element_association(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_association")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_ASSOCIATION, "<element association>");
    r = element_association_0(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ choices RARROW ]
  private static boolean element_association_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_association_0")) return false;
    element_association_0_0(b, l + 1);
    return true;
  }

  // choices RARROW
  private static boolean element_association_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_association_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = choices(b, l + 1);
    r = r && consumeToken(b, RARROW);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier_list COLON element_subtype_definition SEMICOLON
  public static boolean element_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_DECLARATION, "<element declaration>");
    r = identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && element_subtype_definition(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subtype_indication
  public static boolean element_subtype_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_subtype_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELEMENT_SUBTYPE_DEFINITION, "<element subtype definition>");
    r = subtype_indication(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ENTITY entity_name [ ( architecture_identifier) ]
  // 	| CONFIGURATION configuration_name
  // 	| OPEN
  public static boolean entity_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_ASPECT, "<entity aspect>");
    r = entity_aspect_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, CONFIGURATION, CONFIGURATION_NAME);
    if (!r) r = consumeToken(b, OPEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ENTITY entity_name [ ( architecture_identifier) ]
  private static boolean entity_aspect_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENTITY, ENTITY_NAME);
    r = r && entity_aspect_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( architecture_identifier) ]
  private static boolean entity_aspect_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_aspect_0_2")) return false;
    consumeToken(b, ARCHITECTURE_IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // ENTITY	     | ARCHITECTURE  | CONFIGURATION
  // 	| PROCEDURE  | FUNCTION	     | PACKAGE
  // 	| TYPE	     | SUBTYPE	     | CONSTANT
  // 	| SIGNAL     | VARIABLE	     | COMPONENT
  // 	| LABEL	     | LITERAL	     | UNITS
  // 	| GROUP	     | FILE
  public static boolean entity_class(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_CLASS, "<entity class>");
    r = consumeToken(b, ENTITY);
    if (!r) r = consumeToken(b, ARCHITECTURE);
    if (!r) r = consumeToken(b, CONFIGURATION);
    if (!r) r = consumeToken(b, PROCEDURE);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, PACKAGE);
    if (!r) r = consumeToken(b, TYPE);
    if (!r) r = consumeToken(b, SUBTYPE);
    if (!r) r = consumeToken(b, CONSTANT);
    if (!r) r = consumeToken(b, SIGNAL);
    if (!r) r = consumeToken(b, VARIABLE);
    if (!r) r = consumeToken(b, COMPONENT);
    if (!r) r = consumeToken(b, LABEL);
    if (!r) r = consumeToken(b, LITERAL);
    if (!r) r = consumeToken(b, UNITS);
    if (!r) r = consumeToken(b, GROUP);
    if (!r) r = consumeToken(b, FILE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // entity_class [ RANGE_RE ]
  public static boolean entity_class_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_CLASS_ENTRY, "<entity class entry>");
    r = entity_class(b, l + 1);
    r = r && entity_class_entry_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ RANGE_RE ]
  private static boolean entity_class_entry_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_1")) return false;
    consumeToken(b, RANGE_RE);
    return true;
  }

  /* ********************************************************** */
  // entity_class_entry { COMMA entity_class_entry }
  public static boolean entity_class_entry_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_CLASS_ENTRY_LIST, "<entity class entry list>");
    r = entity_class_entry(b, l + 1);
    r = r && entity_class_entry_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA entity_class_entry
  private static boolean entity_class_entry_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_class_entry_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && entity_class_entry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENTITY identifier IS
  // 		entity_header
  // 		entity_declarative_part
  //       [ BEGIN
  // 		entity_statement_part ]
  // 	END [ ENTITY ] [ entity_simple_name ] SEMICOLON
  public static boolean entity_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration")) return false;
    if (!nextTokenIs(b, ENTITY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTITY);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && entity_header(b, l + 1);
    r = r && entity_declarative_part(b, l + 1);
    r = r && entity_declaration_5(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && entity_declaration_7(b, l + 1);
    r = r && entity_declaration_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, ENTITY_DECLARATION, r);
    return r;
  }

  // [ BEGIN
  // 		entity_statement_part ]
  private static boolean entity_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_5")) return false;
    entity_declaration_5_0(b, l + 1);
    return true;
  }

  // BEGIN
  // 		entity_statement_part
  private static boolean entity_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BEGIN);
    r = r && entity_statement_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ENTITY ]
  private static boolean entity_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_7")) return false;
    consumeToken(b, ENTITY);
    return true;
  }

  // [ entity_simple_name ]
  private static boolean entity_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declaration_8")) return false;
    consumeToken(b, ENTITY_SIMPLE_NAME);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration
  // 	| subprogram_body
  // 	| type_declaration
  // 	| subtype_declaration
  // 	| constant_declaration
  // 	| signal_declaration
  // 	| shared_variable_declaration
  // 	| file_declaration
  // 	| alias_declaration
  // 	| attribute_declaration
  // 	| attribute_specification
  // 	| disconnection_specification
  // 	| use_clause
  // 	| group_template_declaration
  // 	| group_declaration
  public static boolean entity_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_DECLARATIVE_ITEM, "<entity declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = consumeToken(b, SHARED_VARIABLE_DECLARATION);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = disconnection_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { entity_declarative_item }
  public static boolean entity_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_declarative_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_DECLARATIVE_PART, "<entity declarative part>");
    r = entity_declarative_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // entity_tag [ signature ]
  public static boolean entity_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_DESIGNATOR, "<entity designator>");
    r = entity_tag(b, l + 1);
    r = r && entity_designator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ signature ]
  private static boolean entity_designator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_designator_1")) return false;
    signature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [ formal_generic_clause ]
  // 	[ formal_port_clause ]
  public static boolean entity_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_HEADER, "<entity header>");
    r = entity_header_0(b, l + 1);
    r = r && entity_header_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ formal_generic_clause ]
  private static boolean entity_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header_0")) return false;
    consumeToken(b, FORMAL_GENERIC_CLAUSE);
    return true;
  }

  // [ formal_port_clause ]
  private static boolean entity_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_header_1")) return false;
    consumeToken(b, FORMAL_PORT_CLAUSE);
    return true;
  }

  /* ********************************************************** */
  // entity_designator { COMMA entity_designator }
  // 	| OTHERS
  // 	| ALL
  public static boolean entity_name_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_NAME_LIST, "<entity name list>");
    r = entity_name_list_0(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // entity_designator { COMMA entity_designator }
  private static boolean entity_name_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_designator(b, l + 1);
    r = r && entity_name_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA entity_designator
  private static boolean entity_name_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_name_list_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && entity_designator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_name_list COLON entity_class
  public static boolean entity_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_SPECIFICATION, "<entity specification>");
    r = entity_name_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && entity_class(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // concurrent_assertion_statement
  // 	| passive_concurrent_procedure_call_statement
  // 	| passive_process_statement
  public static boolean entity_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_STATEMENT, "<entity statement>");
    r = concurrent_assertion_statement(b, l + 1);
    if (!r) r = consumeToken(b, PASSIVE_CONCURRENT_PROCEDURE_CALL_STATEMENT);
    if (!r) r = consumeToken(b, PASSIVE_PROCESS_STATEMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { entity_statement }
  public static boolean entity_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_statement_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_STATEMENT_PART, "<entity statement part>");
    r = entity_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_name | character_literal | operator_symbol
  public static boolean entity_tag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entity_tag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_TAG, "<entity tag>");
    r = simple_name(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | character_literal
  public static boolean enumeration_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUMERATION_LITERAL, "<enumeration literal>");
    r = identifier(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // enumeration_literal { COMMA enumeration_literal }
  public static boolean enumeration_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUMERATION_TYPE_DEFINITION, "<enumeration type definition>");
    r = enumeration_literal(b, l + 1);
    r = r && enumeration_type_definition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA enumeration_literal
  private static boolean enumeration_type_definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumeration_type_definition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enumeration_literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] EXIT [ loop_label ] [ WHEN condition ] SEMICOLON
  public static boolean exit_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXIT_STATEMENT, "<exit statement>");
    r = exit_statement_0(b, l + 1);
    r = r && consumeToken(b, EXIT);
    r = r && exit_statement_2(b, l + 1);
    r = r && exit_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean exit_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_0")) return false;
    exit_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean exit_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ loop_label ]
  private static boolean exit_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_2")) return false;
    consumeToken(b, LOOP_LABEL);
    return true;
  }

  // [ WHEN condition ]
  private static boolean exit_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_3")) return false;
    exit_statement_3_0(b, l + 1);
    return true;
  }

  // WHEN condition
  private static boolean exit_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exit_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // E [ PLUS ] integer | E MINUS integer
  public static boolean exponent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent")) return false;
    if (!nextTokenIs(b, E)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exponent_0(b, l + 1);
    if (!r) r = exponent_1(b, l + 1);
    exit_section_(b, m, EXPONENT, r);
    return r;
  }

  // E [ PLUS ] integer
  private static boolean exponent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, E);
    r = r && exponent_0_1(b, l + 1);
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ PLUS ]
  private static boolean exponent_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_0_1")) return false;
    consumeToken(b, PLUS);
    return true;
  }

  // E MINUS integer
  private static boolean exponent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponent_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, E, MINUS);
    r = r && integer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // relation { AND relation }
  // 	| relation { OR relation }
  // 	| relation { XOR relation }
  // 	| relation [ NAND relation ]
  // 	| relation [ NOR relation ]
  // 	| relation { XNOR relation }
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    if (!r) r = expression_1(b, l + 1);
    if (!r) r = expression_2(b, l + 1);
    if (!r) r = expression_3(b, l + 1);
    if (!r) r = expression_4(b, l + 1);
    if (!r) r = expression_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // relation { AND relation }
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AND relation
  private static boolean expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation { OR relation }
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OR relation
  private static boolean expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation { XOR relation }
  private static boolean expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && expression_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // XOR relation
  private static boolean expression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XOR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation [ NAND relation ]
  private static boolean expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && expression_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ NAND relation ]
  private static boolean expression_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_3_1")) return false;
    expression_3_1_0(b, l + 1);
    return true;
  }

  // NAND relation
  private static boolean expression_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAND);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation [ NOR relation ]
  private static boolean expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && expression_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ NOR relation ]
  private static boolean expression_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_4_1")) return false;
    expression_4_1_0(b, l + 1);
    return true;
  }

  // NOR relation
  private static boolean expression_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relation { XNOR relation }
  private static boolean expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relation(b, l + 1);
    r = r && expression_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // XNOR relation
  private static boolean expression_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_5_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XNOR);
    r = r && relation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // digit | letter
  public static boolean extended_digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extended_digit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTENDED_DIGIT, "<extended digit>");
    r = consumeToken(b, DIGIT);
    if (!r) r = letter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BACKSLASH graphic_character { graphic_character } BACKSLASH
  public static boolean extended_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extended_identifier")) return false;
    if (!nextTokenIs(b, BACKSLASH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BACKSLASH);
    r = r && graphic_character(b, l + 1);
    r = r && extended_identifier_2(b, l + 1);
    r = r && consumeToken(b, BACKSLASH);
    exit_section_(b, m, EXTENDED_IDENTIFIER, r);
    return r;
  }

  // { graphic_character }
  private static boolean extended_identifier_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extended_identifier_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = graphic_character(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary [ STARSTAR primary ]
  // 	| ABS primary
  // 	| NOT primary
  public static boolean factor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FACTOR, "<factor>");
    r = factor_0(b, l + 1);
    if (!r) r = factor_1(b, l + 1);
    if (!r) r = factor_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // primary [ STARSTAR primary ]
  private static boolean factor_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary(b, l + 1);
    r = r && factor_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ STARSTAR primary ]
  private static boolean factor_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0_1")) return false;
    factor_0_1_0(b, l + 1);
    return true;
  }

  // STARSTAR primary
  private static boolean factor_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STARSTAR);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ABS primary
  private static boolean factor_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ABS);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT primary
  private static boolean factor_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "factor_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && primary(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FILE identifier_list COLON subtype_indication file_open_information  SEMICOLON
  public static boolean file_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_declaration")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    r = r && file_open_information(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FILE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // string_expression
  public static boolean file_logical_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_logical_name")) return false;
    if (!nextTokenIs(b, STRING_EXPRESSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_EXPRESSION);
    exit_section_(b, m, FILE_LOGICAL_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // [ OPEN file_open_kind_expression ] IS file_logical_name
  public static boolean file_open_information(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_open_information")) return false;
    if (!nextTokenIs(b, "<file open information>", IS, OPEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_OPEN_INFORMATION, "<file open information>");
    r = file_open_information_0(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && file_logical_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ OPEN file_open_kind_expression ]
  private static boolean file_open_information_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_open_information_0")) return false;
    parseTokens(b, 0, OPEN, FILE_OPEN_KIND_EXPRESSION);
    return true;
  }

  /* ********************************************************** */
  // FILE  OF type_mark
  public static boolean file_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_type_definition")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILE, OF);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, FILE_TYPE_DEFINITION, r);
    return r;
  }

  /* ********************************************************** */
  // range_constraint
  public static boolean floating_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOATING_TYPE_DEFINITION, "<floating type definition>");
    r = range_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // generic_name
  // 	| port_name
  // 	| parameter_name
  public static boolean formal_designator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_designator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_DESIGNATOR, "<formal designator>");
    r = consumeToken(b, GENERIC_NAME);
    if (!r) r = consumeToken(b, PORT_NAME);
    if (!r) r = consumeToken(b, PARAMETER_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // parameter_interface_list
  public static boolean formal_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_list")) return false;
    if (!nextTokenIs(b, PARAMETER_INTERFACE_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAMETER_INTERFACE_LIST);
    exit_section_(b, m, FORMAL_PARAMETER_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // formal_designator
  // 	| function_name ( formal_designator )
  // 	| type_mark ( formal_designator )
  public static boolean formal_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL_PART, "<formal part>");
    r = formal_designator(b, l + 1);
    if (!r) r = formal_part_1(b, l + 1);
    if (!r) r = formal_part_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // function_name ( formal_designator )
  private static boolean formal_part_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION_NAME);
    r = r && formal_part_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( formal_designator )
  private static boolean formal_part_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_designator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark ( formal_designator )
  private static boolean formal_part_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && formal_part_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( formal_designator )
  private static boolean formal_part_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_part_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_designator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE identifier IS type_definition SEMICOLON
  public static boolean full_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "full_type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && type_definition(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, FULL_TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // function_name [ ( actual_parameter_part ) ]
  public static boolean function_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call")) return false;
    if (!nextTokenIs(b, FUNCTION_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FUNCTION_NAME);
    r = r && function_call_1(b, l + 1);
    exit_section_(b, m, FUNCTION_CALL, r);
    return r;
  }

  // [ ( actual_parameter_part ) ]
  private static boolean function_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_1")) return false;
    function_call_1_0(b, l + 1);
    return true;
  }

  // ( actual_parameter_part )
  private static boolean function_call_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_call_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actual_parameter_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // generate_label COLON
  // 		generation_scheme GENERATE
  // 			[ { block_declarative_item }
  // 		BEGIN ]
  // 			{ concurrent_statement }
  // 		END GENERATE [ generate_label ] SEMICOLON
  public static boolean generate_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement")) return false;
    if (!nextTokenIs(b, GENERATE_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GENERATE_LABEL, COLON);
    r = r && generation_scheme(b, l + 1);
    r = r && consumeToken(b, GENERATE);
    r = r && generate_statement_4(b, l + 1);
    r = r && generate_statement_5(b, l + 1);
    r = r && consumeTokens(b, 0, END, GENERATE);
    r = r && generate_statement_8(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, GENERATE_STATEMENT, r);
    return r;
  }

  // [ { block_declarative_item }
  // 		BEGIN ]
  private static boolean generate_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_4")) return false;
    generate_statement_4_0(b, l + 1);
    return true;
  }

  // { block_declarative_item }
  // 		BEGIN
  private static boolean generate_statement_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generate_statement_4_0_0(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    exit_section_(b, m, null, r);
    return r;
  }

  // { block_declarative_item }
  private static boolean generate_statement_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = block_declarative_item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { concurrent_statement }
  private static boolean generate_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = concurrent_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ generate_label ]
  private static boolean generate_statement_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generate_statement_8")) return false;
    consumeToken(b, GENERATE_LABEL);
    return true;
  }

  /* ********************************************************** */
  // FOR generate_parameter_specification
  // 	| IF condition
  public static boolean generation_scheme(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generation_scheme")) return false;
    if (!nextTokenIs(b, "<generation scheme>", FOR, IF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERATION_SCHEME, "<generation scheme>");
    r = parseTokens(b, 0, FOR, GENERATE_PARAMETER_SPECIFICATION);
    if (!r) r = generation_scheme_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IF condition
  private static boolean generation_scheme_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generation_scheme_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GENERIC ( generic_list ) SEMICOLON
  public static boolean generic_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_clause")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GENERIC);
    r = r && generic_clause_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, GENERIC_CLAUSE, r);
    return r;
  }

  // ( generic_list )
  private static boolean generic_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_clause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = generic_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // generic_interface_list
  public static boolean generic_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_list")) return false;
    if (!nextTokenIs(b, GENERIC_INTERFACE_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GENERIC_INTERFACE_LIST);
    exit_section_(b, m, GENERIC_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // GENERIC MAP ( generic_association_list )
  public static boolean generic_map_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_map_aspect")) return false;
    if (!nextTokenIs(b, GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GENERIC, MAP);
    r = r && consumeToken(b, GENERIC_ASSOCIATION_LIST);
    exit_section_(b, m, GENERIC_MAP_ASPECT, r);
    return r;
  }

  /* ********************************************************** */
  // basic_graphic_character	 | lower_case_letter | other_special_character
  public static boolean graphic_character(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "graphic_character")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GRAPHIC_CHARACTER, "<graphic character>");
    r = basic_graphic_character(b, l + 1);
    if (!r) r = consumeToken(b, LOWER_CASE_LETTER);
    if (!r) r = consumeToken(b, OTHER_SPECIAL_CHARACTER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name | character_literal
  public static boolean group_constituent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_CONSTITUENT, "<group constituent>");
    r = name(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // group_constituent { COMMA group_constituent }
  public static boolean group_constituent_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GROUP_CONSTITUENT_LIST, "<group constituent list>");
    r = group_constituent(b, l + 1);
    r = r && group_constituent_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA group_constituent
  private static boolean group_constituent_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_constituent_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && group_constituent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GROUP identifier COLON group_template_name ( group_constituent_list ) SEMICOLON
  public static boolean group_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_declaration")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GROUP);
    r = r && identifier(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, GROUP_TEMPLATE_NAME);
    r = r && group_declaration_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, GROUP_DECLARATION, r);
    return r;
  }

  // ( group_constituent_list )
  private static boolean group_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_declaration_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = group_constituent_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GROUP identifier IS ( entity_class_entry_list ) SEMICOLON
  public static boolean group_template_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_template_declaration")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GROUP);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && group_template_declaration_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, GROUP_TEMPLATE_DECLARATION, r);
    return r;
  }

  // ( entity_class_entry_list )
  private static boolean group_template_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_template_declaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entity_class_entry_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // guarded_signal_list COLON type_mark
  public static boolean guarded_signal_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "guarded_signal_specification")) return false;
    if (!nextTokenIs(b, GUARDED_SIGNAL_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GUARDED_SIGNAL_LIST, COLON);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, GUARDED_SIGNAL_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // basic_identifier | extended_identifier
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER, "<identifier>");
    r = basic_identifier(b, l + 1);
    if (!r) r = extended_identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier { COMMA identifier }
  public static boolean identifier_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENTIFIER_LIST, "<identifier list>");
    r = identifier(b, l + 1);
    r = r && identifier_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA identifier
  private static boolean identifier_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ if_label COLON ]
  // 		IF condition THEN
  // 			sequence_of_statements
  // 		{ ELSIF condition THEN
  // 			sequence_of_statements }
  // 		[ ELSE
  // 			sequence_of_statements ]
  // 		END IF [ if_label ] SEMICOLON
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    if (!nextTokenIs(b, "<if statement>", IF, IF_LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_STATEMENT, "<if statement>");
    r = if_statement_0(b, l + 1);
    r = r && consumeToken(b, IF);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && sequence_of_statements(b, l + 1);
    r = r && if_statement_5(b, l + 1);
    r = r && if_statement_6(b, l + 1);
    r = r && consumeTokens(b, 0, END, IF);
    r = r && if_statement_9(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ if_label COLON ]
  private static boolean if_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_0")) return false;
    parseTokens(b, 0, IF_LABEL, COLON);
    return true;
  }

  // ELSIF condition THEN
  // 			sequence_of_statements
  private static boolean if_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSIF);
    r = r && condition(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ELSE
  // 			sequence_of_statements ]
  private static boolean if_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_6")) return false;
    if_statement_6_0(b, l + 1);
    return true;
  }

  // ELSE
  // 			sequence_of_statements
  private static boolean if_statement_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && sequence_of_statements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ if_label ]
  private static boolean if_statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_9")) return false;
    consumeToken(b, IF_LABEL);
    return true;
  }

  /* ********************************************************** */
  // TYPE identifier SEMICOLON
  public static boolean incomplete_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "incomplete_type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, INCOMPLETE_TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // discrete_range { COMMA discrete_range }
  public static boolean index_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEX_CONSTRAINT, "<index constraint>");
    r = discrete_range(b, l + 1);
    r = r && index_constraint_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA discrete_range
  private static boolean index_constraint_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_constraint_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && discrete_range(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // discrete_range
  // 	| static_expression
  public static boolean index_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEX_SPECIFICATION, "<index specification>");
    r = discrete_range(b, l + 1);
    if (!r) r = consumeToken(b, STATIC_EXPRESSION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_mark range RANGE_RE
  public static boolean index_subtype_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index_subtype_definition")) return false;
    if (!nextTokenIs(b, "<index subtype definition>", SUBTYPE_NAME, TYPE_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEX_SUBTYPE_DEFINITION, "<index subtype definition>");
    r = type_mark(b, l + 1);
    r = r && range(b, l + 1);
    r = r && consumeToken(b, RANGE_RE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // prefix ( expression { COMMA expression } )
  public static boolean indexed_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEXED_NAME, "<indexed name>");
    r = prefix(b, l + 1);
    r = r && indexed_name_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression { COMMA expression }
  private static boolean indexed_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && indexed_name_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA expression
  private static boolean indexed_name_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexed_name_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ COMPONENT ] component_name
  // 	| ENTITY entity_name [ ( architecture_identifier ) ]
  // 	| CONFIGURATION configuration_name
  public static boolean instantiated_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTANTIATED_UNIT, "<instantiated unit>");
    r = instantiated_unit_0(b, l + 1);
    if (!r) r = instantiated_unit_1(b, l + 1);
    if (!r) r = parseTokens(b, 0, CONFIGURATION, CONFIGURATION_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ COMPONENT ] component_name
  private static boolean instantiated_unit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instantiated_unit_0_0(b, l + 1);
    r = r && consumeToken(b, COMPONENT_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ COMPONENT ]
  private static boolean instantiated_unit_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_0_0")) return false;
    consumeToken(b, COMPONENT);
    return true;
  }

  // ENTITY entity_name [ ( architecture_identifier ) ]
  private static boolean instantiated_unit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENTITY, ENTITY_NAME);
    r = r && instantiated_unit_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( architecture_identifier ) ]
  private static boolean instantiated_unit_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiated_unit_1_2")) return false;
    consumeToken(b, ARCHITECTURE_IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // instantiation_label { COMMA instantiation_label }
  // 	| OTHERS
  // 	| ALL
  public static boolean instantiation_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTANTIATION_LIST, "<instantiation list>");
    r = instantiation_list_0(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // instantiation_label { COMMA instantiation_label }
  private static boolean instantiation_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSTANTIATION_LABEL);
    r = r && instantiation_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA instantiation_label
  private static boolean instantiation_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instantiation_list_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, INSTANTIATION_LABEL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // digit { [ underline ] digit }
  public static boolean integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer")) return false;
    if (!nextTokenIs(b, DIGIT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIGIT);
    r = r && integer_1(b, l + 1);
    exit_section_(b, m, INTEGER, r);
    return r;
  }

  // [ underline ] digit
  private static boolean integer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer_1_0(b, l + 1);
    r = r && consumeToken(b, DIGIT);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ underline ]
  private static boolean integer_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_1_0")) return false;
    consumeToken(b, UNDERLINE);
    return true;
  }

  /* ********************************************************** */
  // range_constraint
  public static boolean integer_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_TYPE_DEFINITION, "<integer type definition>");
    r = range_constraint(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ CONSTANT ] identifier_list COLON [ IN ] subtype_indication [ COLONEQUALS static_expression ]
  public static boolean interface_constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_CONSTANT_DECLARATION, "<interface constant declaration>");
    r = interface_constant_declaration_0(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && interface_constant_declaration_3(b, l + 1);
    r = r && subtype_indication(b, l + 1);
    r = r && interface_constant_declaration_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ CONSTANT ]
  private static boolean interface_constant_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_0")) return false;
    consumeToken(b, CONSTANT);
    return true;
  }

  // [ IN ]
  private static boolean interface_constant_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_3")) return false;
    consumeToken(b, IN);
    return true;
  }

  // [ COLONEQUALS static_expression ]
  private static boolean interface_constant_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_constant_declaration_5")) return false;
    parseTokens(b, 0, COLONEQUALS, STATIC_EXPRESSION);
    return true;
  }

  /* ********************************************************** */
  // interface_constant_declaration
  // 	| interface_signal_declaration
  // 	| interface_variable_declaration
  // 	| interface_file_declaration
  public static boolean interface_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_DECLARATION, "<interface declaration>");
    r = interface_constant_declaration(b, l + 1);
    if (!r) r = interface_signal_declaration(b, l + 1);
    if (!r) r = interface_variable_declaration(b, l + 1);
    if (!r) r = interface_file_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_declaration
  public static boolean interface_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_element")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_ELEMENT, "<interface element>");
    r = interface_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FILE identifier_list COLON subtype_indication
  public static boolean interface_file_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_file_declaration")) return false;
    if (!nextTokenIs(b, FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FILE);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    exit_section_(b, m, INTERFACE_FILE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // interface_element { SEMICOLON interface_element }
  public static boolean interface_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_LIST, "<interface list>");
    r = interface_element(b, l + 1);
    r = r && interface_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEMICOLON interface_element
  private static boolean interface_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && interface_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [SIGNAL] identifier_list COLON [ mode ] subtype_indication [ BUS ] [ COLONEQUALS static_expression ]
  public static boolean interface_signal_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_SIGNAL_DECLARATION, "<interface signal declaration>");
    r = interface_signal_declaration_0(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && interface_signal_declaration_3(b, l + 1);
    r = r && subtype_indication(b, l + 1);
    r = r && interface_signal_declaration_5(b, l + 1);
    r = r && interface_signal_declaration_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [SIGNAL]
  private static boolean interface_signal_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_0")) return false;
    consumeToken(b, SIGNAL);
    return true;
  }

  // [ mode ]
  private static boolean interface_signal_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_3")) return false;
    mode(b, l + 1);
    return true;
  }

  // [ BUS ]
  private static boolean interface_signal_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_5")) return false;
    consumeToken(b, BUS);
    return true;
  }

  // [ COLONEQUALS static_expression ]
  private static boolean interface_signal_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_signal_declaration_6")) return false;
    parseTokens(b, 0, COLONEQUALS, STATIC_EXPRESSION);
    return true;
  }

  /* ********************************************************** */
  // [VARIABLE] identifier_list COLON [ mode ] subtype_indication [ COLONEQUALS static_expression ]
  public static boolean interface_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTERFACE_VARIABLE_DECLARATION, "<interface variable declaration>");
    r = interface_variable_declaration_0(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && interface_variable_declaration_3(b, l + 1);
    r = r && subtype_indication(b, l + 1);
    r = r && interface_variable_declaration_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [VARIABLE]
  private static boolean interface_variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_0")) return false;
    consumeToken(b, VARIABLE);
    return true;
  }

  // [ mode ]
  private static boolean interface_variable_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_3")) return false;
    mode(b, l + 1);
    return true;
  }

  // [ COLONEQUALS static_expression ]
  private static boolean interface_variable_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_variable_declaration_5")) return false;
    parseTokens(b, 0, COLONEQUALS, STATIC_EXPRESSION);
    return true;
  }

  /* ********************************************************** */
  // WHILE condition
  // 	| FOR loop_parameter_specification
  public static boolean iteration_scheme(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_scheme")) return false;
    if (!nextTokenIs(b, "<iteration scheme>", FOR, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITERATION_SCHEME, "<iteration scheme>");
    r = iteration_scheme_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, FOR, LOOP_PARAMETER_SPECIFICATION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WHILE condition
  private static boolean iteration_scheme_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_scheme_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL, "<label>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // upper_case_letter | lower_case_letter
  public static boolean letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letter")) return false;
    if (!nextTokenIs(b, "<letter>", LOWER_CASE_LETTER, UPPER_CASE_LETTER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LETTER, "<letter>");
    r = consumeToken(b, UPPER_CASE_LETTER);
    if (!r) r = consumeToken(b, LOWER_CASE_LETTER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // letter | digit
  public static boolean letter_or_digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letter_or_digit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LETTER_OR_DIGIT, "<letter or digit>");
    r = letter(b, l + 1);
    if (!r) r = consumeToken(b, DIGIT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LIBRARY logical_name_list SEMICOLON
  public static boolean library_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "library_clause")) return false;
    if (!nextTokenIs(b, LIBRARY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIBRARY);
    r = r && logical_name_list(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, LIBRARY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // primary_unit
  // 	| secondary_unit
  public static boolean library_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "library_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIBRARY_UNIT, "<library unit>");
    r = primary_unit(b, l + 1);
    if (!r) r = secondary_unit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // numeric_literal
  // 	| enumeration_literal
  // 	| string_literal
  // 	| bit_string_literal
  // 	| NULL
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = numeric_literal(b, l + 1);
    if (!r) r = enumeration_literal(b, l + 1);
    if (!r) r = string_literal(b, l + 1);
    if (!r) r = bit_string_literal(b, l + 1);
    if (!r) r = consumeToken(b, NULL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean logical_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_NAME, "<logical name>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // logical_name { COMMA logical_name }
  public static boolean logical_name_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_NAME_LIST, "<logical name list>");
    r = logical_name(b, l + 1);
    r = r && logical_name_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // COMMA logical_name
  private static boolean logical_name_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_name_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && logical_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AND | OR | NAND | NOR | XOR | XNOR
  public static boolean logical_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_OPERATOR, "<logical operator>");
    r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = consumeToken(b, NAND);
    if (!r) r = consumeToken(b, NOR);
    if (!r) r = consumeToken(b, XOR);
    if (!r) r = consumeToken(b, XNOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ loop_label COLON ]
  // 		[ iteration_scheme ] LOOP
  // 			sequence_of_statements
  // 		END LOOP [ loop_label ] SEMICOLON
  public static boolean loop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOOP_STATEMENT, "<loop statement>");
    r = loop_statement_0(b, l + 1);
    r = r && loop_statement_1(b, l + 1);
    r = r && consumeToken(b, LOOP);
    r = r && sequence_of_statements(b, l + 1);
    r = r && consumeTokens(b, 0, END, LOOP);
    r = r && loop_statement_6(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ loop_label COLON ]
  private static boolean loop_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_0")) return false;
    parseTokens(b, 0, LOOP_LABEL, COLON);
    return true;
  }

  // [ iteration_scheme ]
  private static boolean loop_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_1")) return false;
    iteration_scheme(b, l + 1);
    return true;
  }

  // [ loop_label ]
  private static boolean loop_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loop_statement_6")) return false;
    consumeToken(b, LOOP_LABEL);
    return true;
  }

  /* ********************************************************** */
  // STARSTAR | ABS | NOT
  public static boolean miscellaneous_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miscellaneous_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MISCELLANEOUS_OPERATOR, "<miscellaneous operator>");
    r = consumeToken(b, STARSTAR);
    if (!r) r = consumeToken(b, ABS);
    if (!r) r = consumeToken(b, NOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IN | OUT | INOUT | BUFFER | LINKAGE
  public static boolean mode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mode")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODE, "<mode>");
    r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, OUT);
    if (!r) r = consumeToken(b, INOUT);
    if (!r) r = consumeToken(b, BUFFER);
    if (!r) r = consumeToken(b, LINKAGE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MULTIPLYING_OPERATOR_RE
  public static boolean multiplying_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplying_operator")) return false;
    if (!nextTokenIs(b, MULTIPLYING_OPERATOR_RE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MULTIPLYING_OPERATOR_RE);
    exit_section_(b, m, MULTIPLYING_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name
  // 	| operator_symbol
  // 	| selected_name
  // 	| indexed_name
  // 	| slice_name
  // 	| attribute_name
  public static boolean name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NAME, "<name>");
    r = simple_name(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    if (!r) r = selected_name(b, l + 1);
    if (!r) r = indexed_name(b, l + 1);
    if (!r) r = slice_name(b, l + 1);
    if (!r) r = attribute_name(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] NEXT [ loop_label ] [ WHEN condition ] SEMICOLON
  public static boolean next_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEXT_STATEMENT, "<next statement>");
    r = next_statement_0(b, l + 1);
    r = r && consumeToken(b, NEXT);
    r = r && next_statement_2(b, l + 1);
    r = r && next_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean next_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_0")) return false;
    next_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean next_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ loop_label ]
  private static boolean next_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_2")) return false;
    consumeToken(b, LOOP_LABEL);
    return true;
  }

  // [ WHEN condition ]
  private static boolean next_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_3")) return false;
    next_statement_3_0(b, l + 1);
    return true;
  }

  // WHEN condition
  private static boolean next_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "next_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHEN);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] NULL SEMICOLON
  public static boolean null_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NULL_STATEMENT, "<null statement>");
    r = null_statement_0(b, l + 1);
    r = r && consumeTokens(b, 0, NULL, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean null_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_statement_0")) return false;
    null_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean null_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "null_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // abstract_literal
  // 	| physical_literal
  public static boolean numeric_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_literal")) return false;
    if (!nextTokenIs(b, "<numeric literal>", DIGIT, UNIT_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERIC_LITERAL, "<numeric literal>");
    r = abstract_literal(b, l + 1);
    if (!r) r = physical_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constant_declaration
  // 	| signal_declaration
  // 	| variable_declaration
  // 	| file_declaration
  public static boolean object_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_DECLARATION, "<object declaration>");
    r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // string_literal
  public static boolean operator_symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_symbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR_SYMBOL, "<operator symbol>");
    r = string_literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ GUARDED ] [ delay_mechanism ]
  public static boolean options(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "options")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPTIONS, "<options>");
    r = options_0(b, l + 1);
    r = r && options_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ GUARDED ]
  private static boolean options_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "options_0")) return false;
    consumeToken(b, GUARDED);
    return true;
  }

  // [ delay_mechanism ]
  private static boolean options_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "options_1")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PACKAGE body package_simple_name IS
  // 		package_body_declarative_part
  // 	END [ PACKAGE BODY ] [ package_simple_name ] SEMICOLON
  public static boolean package_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PACKAGE, BODY, PACKAGE_SIMPLE_NAME, IS);
    r = r && package_body_declarative_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && package_body_6(b, l + 1);
    r = r && package_body_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PACKAGE_BODY, r);
    return r;
  }

  // [ PACKAGE BODY ]
  private static boolean package_body_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_6")) return false;
    parseTokens(b, 0, PACKAGE, BODY);
    return true;
  }

  // [ package_simple_name ]
  private static boolean package_body_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_7")) return false;
    consumeToken(b, PACKAGE_SIMPLE_NAME);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration
  // 	| subprogram_body
  // 	| type_declaration
  // 	| subtype_declaration
  // 	| constant_declaration
  // 	| shared_variable_declaration
  // 	| file_declaration
  // 	| alias_declaration
  // 	| use_clause
  // 	| group_template_declaration
  // 	| group_declaration
  public static boolean package_body_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_BODY_DECLARATIVE_ITEM, "<package body declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = consumeToken(b, SHARED_VARIABLE_DECLARATION);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { package_body_declarative_item }
  public static boolean package_body_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_body_declarative_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_BODY_DECLARATIVE_PART, "<package body declarative part>");
    r = package_body_declarative_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PACKAGE identifier IS
  // 		package_declarative_part
  // 	END [ PACKAGE ] [ package_simple_name ] SEMICOLON
  public static boolean package_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PACKAGE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && package_declarative_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && package_declaration_5(b, l + 1);
    r = r && package_declaration_6(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PACKAGE_DECLARATION, r);
    return r;
  }

  // [ PACKAGE ]
  private static boolean package_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration_5")) return false;
    consumeToken(b, PACKAGE);
    return true;
  }

  // [ package_simple_name ]
  private static boolean package_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declaration_6")) return false;
    consumeToken(b, PACKAGE_SIMPLE_NAME);
    return true;
  }

  /* ********************************************************** */
  // subprogram_declaration
  // 	| type_declaration
  // 	| subtype_declaration
  // 	| constant_declaration
  // 	| signal_declaration
  // 	| shared_variable_declaration
  // 	| file_declaration
  // 	| alias_declaration
  // 	| component_declaration
  // 	| attribute_declaration
  // 	| attribute_specification
  // 	| disconnection_specification
  // 	| use_clause
  // 	| group_template_declaration
  // 	| group_declaration
  public static boolean package_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATIVE_ITEM, "<package declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = signal_declaration(b, l + 1);
    if (!r) r = consumeToken(b, SHARED_VARIABLE_DECLARATION);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = component_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = disconnection_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { package_declarative_item }
  public static boolean package_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_declarative_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PACKAGE_DECLARATIVE_PART, "<package declarative part>");
    r = package_declarative_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier IN discrete_range
  public static boolean parameter_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_SPECIFICATION, "<parameter specification>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && discrete_range(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ abstract_literal ] unit_name
  public static boolean physical_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_literal")) return false;
    if (!nextTokenIs(b, "<physical literal>", DIGIT, UNIT_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PHYSICAL_LITERAL, "<physical literal>");
    r = physical_literal_0(b, l + 1);
    r = r && consumeToken(b, UNIT_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ abstract_literal ]
  private static boolean physical_literal_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_literal_0")) return false;
    abstract_literal(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // range_constraint
  // 		UNITS
  // 			base_unit_declaration
  // 			{ secondary_unit_declaration }
  // 		END UNITS [ physical_type_simple_name ]
  public static boolean physical_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PHYSICAL_TYPE_DEFINITION, "<physical type definition>");
    r = range_constraint(b, l + 1);
    r = r && consumeToken(b, UNITS);
    r = r && base_unit_declaration(b, l + 1);
    r = r && physical_type_definition_3(b, l + 1);
    r = r && consumeTokens(b, 0, END, UNITS);
    r = r && physical_type_definition_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // { secondary_unit_declaration }
  private static boolean physical_type_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = secondary_unit_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ physical_type_simple_name ]
  private static boolean physical_type_definition_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "physical_type_definition_6")) return false;
    consumeToken(b, PHYSICAL_TYPE_SIMPLE_NAME);
    return true;
  }

  /* ********************************************************** */
  // PORT ( port_list ) SEMICOLON
  public static boolean port_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_clause")) return false;
    if (!nextTokenIs(b, PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PORT);
    r = r && port_clause_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PORT_CLAUSE, r);
    return r;
  }

  // ( port_list )
  private static boolean port_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_clause_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = port_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // port_interface_list
  public static boolean port_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_list")) return false;
    if (!nextTokenIs(b, PORT_INTERFACE_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PORT_INTERFACE_LIST);
    exit_section_(b, m, PORT_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // PORT MAP ( port_association_list )
  public static boolean port_map_aspect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "port_map_aspect")) return false;
    if (!nextTokenIs(b, PORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PORT, MAP);
    r = r && consumeToken(b, PORT_ASSOCIATION_LIST);
    exit_section_(b, m, PORT_MAP_ASPECT, r);
    return r;
  }

  /* ********************************************************** */
  // name
  // 	| function_call
  public static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX, "<prefix>");
    r = name(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name
  // 	| literal
  // 	| aggregate
  // 	| function_call
  // 	| qualified_expression
  // 	| type_conversion
  // 	| allocator
  // 	| ( expression )
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = name(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = aggregate(b, l + 1);
    if (!r) r = function_call(b, l + 1);
    if (!r) r = qualified_expression(b, l + 1);
    if (!r) r = type_conversion(b, l + 1);
    if (!r) r = allocator(b, l + 1);
    if (!r) r = primary_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( expression )
  private static boolean primary_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // entity_declaration
  // 	| configuration_declaration
  // 	| package_declaration
  public static boolean primary_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_UNIT, "<primary unit>");
    r = entity_declaration(b, l + 1);
    if (!r) r = configuration_declaration(b, l + 1);
    if (!r) r = package_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // procedure_name [ ( actual_parameter_part ) ]
  public static boolean procedure_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call")) return false;
    if (!nextTokenIs(b, PROCEDURE_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROCEDURE_NAME);
    r = r && procedure_call_1(b, l + 1);
    exit_section_(b, m, PROCEDURE_CALL, r);
    return r;
  }

  // [ ( actual_parameter_part ) ]
  private static boolean procedure_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_1")) return false;
    procedure_call_1_0(b, l + 1);
    return true;
  }

  // ( actual_parameter_part )
  private static boolean procedure_call_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = actual_parameter_part(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] procedure_call SEMICOLON
  public static boolean procedure_call_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCEDURE_CALL_STATEMENT, "<procedure call statement>");
    r = procedure_call_statement_0(b, l + 1);
    r = r && procedure_call(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean procedure_call_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_statement_0")) return false;
    procedure_call_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean procedure_call_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_call_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declaration
  // 	| subprogram_body
  // 	| type_declaration
  // 	| subtype_declaration
  // 	| constant_declaration
  // 	| variable_declaration
  // 	| file_declaration
  // 	| alias_declaration
  // 	| attribute_declaration
  // 	| attribute_specification
  // 	| use_clause
  // 	| group_template_declaration
  // 	| group_declaration
  public static boolean process_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_DECLARATIVE_ITEM, "<process declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { process_declarative_item }
  public static boolean process_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_declarative_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_DECLARATIVE_PART, "<process declarative part>");
    r = process_declarative_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ process_label COLON ]
  // 		[ POSTPONED ] PROCESS [ ( sensitivity_list ) ] [ IS ]
  // 			process_declarative_part
  // 		BEGIN
  // 			process_statement_part
  // 		END [ POSTPONED ] PROCESS [ process_label ] SEMICOLON
  public static boolean process_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_STATEMENT, "<process statement>");
    r = process_statement_0(b, l + 1);
    r = r && process_statement_1(b, l + 1);
    r = r && consumeToken(b, PROCESS);
    r = r && process_statement_3(b, l + 1);
    r = r && process_statement_4(b, l + 1);
    r = r && process_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && process_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && process_statement_9(b, l + 1);
    r = r && consumeToken(b, PROCESS);
    r = r && process_statement_11(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ process_label COLON ]
  private static boolean process_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_0")) return false;
    parseTokens(b, 0, PROCESS_LABEL, COLON);
    return true;
  }

  // [ POSTPONED ]
  private static boolean process_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_1")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // [ ( sensitivity_list ) ]
  private static boolean process_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_3")) return false;
    process_statement_3_0(b, l + 1);
    return true;
  }

  // ( sensitivity_list )
  private static boolean process_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sensitivity_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ IS ]
  private static boolean process_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_4")) return false;
    consumeToken(b, IS);
    return true;
  }

  // [ POSTPONED ]
  private static boolean process_statement_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_9")) return false;
    consumeToken(b, POSTPONED);
    return true;
  }

  // [ process_label ]
  private static boolean process_statement_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_11")) return false;
    consumeToken(b, PROCESS_LABEL);
    return true;
  }

  /* ********************************************************** */
  // { sequential_statement }
  public static boolean process_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "process_statement_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROCESS_STATEMENT_PART, "<process statement part>");
    r = sequential_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_mark QUOTE ( expression )
  // 	| type_mark QUOTE aggregate
  public static boolean qualified_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_expression")) return false;
    if (!nextTokenIs(b, "<qualified expression>", SUBTYPE_NAME, TYPE_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIED_EXPRESSION, "<qualified expression>");
    r = qualified_expression_0(b, l + 1);
    if (!r) r = qualified_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_mark QUOTE ( expression )
  private static boolean qualified_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, QUOTE);
    r = r && qualified_expression_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( expression )
  private static boolean qualified_expression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_expression_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_mark QUOTE aggregate
  private static boolean qualified_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && consumeToken(b, QUOTE);
    r = r && aggregate(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // range_attribute_name
  // 	| simple_expression direction simple_expression
  public static boolean range(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE, "<range>");
    r = consumeToken(b, RANGE_ATTRIBUTE_NAME);
    if (!r) r = range_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // simple_expression direction simple_expression
  private static boolean range_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_expression(b, l + 1);
    r = r && direction(b, l + 1);
    r = r && simple_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // range range
  public static boolean range_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "range_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_CONSTRAINT, "<range constraint>");
    r = range(b, l + 1);
    r = r && range(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // RECORD
  // 		element_declaration
  // 		{ element_declaration }
  // 	END RECORD [ record_type_simple_name ]
  public static boolean record_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition")) return false;
    if (!nextTokenIs(b, RECORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECORD);
    r = r && element_declaration(b, l + 1);
    r = r && record_type_definition_2(b, l + 1);
    r = r && consumeTokens(b, 0, END, RECORD);
    r = r && record_type_definition_5(b, l + 1);
    exit_section_(b, m, RECORD_TYPE_DEFINITION, r);
    return r;
  }

  // { element_declaration }
  private static boolean record_type_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = element_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ record_type_simple_name ]
  private static boolean record_type_definition_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type_definition_5")) return false;
    consumeToken(b, RECORD_TYPE_SIMPLE_NAME);
    return true;
  }

  /* ********************************************************** */
  // shift_expression [ relational_operator shift_expression ]
  public static boolean relation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATION, "<relation>");
    r = shift_expression(b, l + 1);
    r = r && relation_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ relational_operator shift_expression ]
  private static boolean relation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_1")) return false;
    relation_1_0(b, l + 1);
    return true;
  }

  // relational_operator shift_expression
  private static boolean relation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relation_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_operator(b, l + 1);
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RELATIONAL_OPERATOR_RE
  public static boolean relational_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_operator")) return false;
    if (!nextTokenIs(b, RELATIONAL_OPERATOR_RE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RELATIONAL_OPERATOR_RE);
    exit_section_(b, m, RELATIONAL_OPERATOR, r);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ]
  // 		REPORT expression
  // 			[ SEVERITY expression ] SEMICOLON
  public static boolean report_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REPORT_STATEMENT, "<report statement>");
    r = report_statement_0(b, l + 1);
    r = r && consumeToken(b, REPORT);
    r = r && expression(b, l + 1);
    r = r && report_statement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean report_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_0")) return false;
    report_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean report_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ SEVERITY expression ]
  private static boolean report_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_3")) return false;
    report_statement_3_0(b, l + 1);
    return true;
  }

  // SEVERITY expression
  private static boolean report_statement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "report_statement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEVERITY);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] RETURN [ expression ] SEMICOLON
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = return_statement_0(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && return_statement_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean return_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_0")) return false;
    return_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean return_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ expression ]
  private static boolean return_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_2")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // enumeration_type_definition   | integer_type_definition
  // 	| floating_type_definition	  | physical_type_definition
  public static boolean scalar_type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCALAR_TYPE_DEFINITION, "<scalar type definition>");
    r = enumeration_type_definition(b, l + 1);
    if (!r) r = integer_type_definition(b, l + 1);
    if (!r) r = floating_type_definition(b, l + 1);
    if (!r) r = physical_type_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // architecture_body
  // 	| package_body
  public static boolean secondary_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_unit")) return false;
    if (!nextTokenIs(b, "<secondary unit>", ARCHITECTURE, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SECONDARY_UNIT, "<secondary unit>");
    r = architecture_body(b, l + 1);
    if (!r) r = package_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier EQUALS physical_literal SEMICOLON
  public static boolean secondary_unit_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_unit_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SECONDARY_UNIT_DECLARATION, "<secondary unit declaration>");
    r = identifier(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && physical_literal(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // prefix DOT suffix
  public static boolean selected_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTED_NAME, "<selected name>");
    r = prefix(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && suffix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WITH expression SELECT
  // 		target	LARROW options selected_waveforms SEMICOLON
  public static boolean selected_signal_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_signal_assignment")) return false;
    if (!nextTokenIs(b, WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WITH);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SELECT);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, LARROW);
    r = r && options(b, l + 1);
    r = r && selected_waveforms(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SELECTED_SIGNAL_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // { waveform WHEN choices COMMA }
  // 	waveform WHEN choices
  public static boolean selected_waveforms(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveforms")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTED_WAVEFORMS, "<selected waveforms>");
    r = selected_waveforms_0(b, l + 1);
    r = r && waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // waveform WHEN choices COMMA
  private static boolean selected_waveforms_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selected_waveforms_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = waveform(b, l + 1);
    r = r && consumeToken(b, WHEN);
    r = r && choices(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ON sensitivity_list
  public static boolean sensitivity_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_clause")) return false;
    if (!nextTokenIs(b, ON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && sensitivity_list(b, l + 1);
    exit_section_(b, m, SENSITIVITY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // signal_name { COMMA signal_name }
  public static boolean sensitivity_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_list")) return false;
    if (!nextTokenIs(b, SIGNAL_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGNAL_NAME);
    r = r && sensitivity_list_1(b, l + 1);
    exit_section_(b, m, SENSITIVITY_LIST, r);
    return r;
  }

  // COMMA signal_name
  private static boolean sensitivity_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sensitivity_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, SIGNAL_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // { sequential_statement }
  public static boolean sequence_of_statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequence_of_statements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQUENCE_OF_STATEMENTS, "<sequence of statements>");
    r = sequential_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // wait_statement
  // 	| assertion_statement
  // 	| report_statement
  // 	| signal_assignment_statement
  // 	| variable_assignment_statement
  // 	| procedure_call_statement
  // 	| if_statement
  // 	| case_statement
  // 	| loop_statement
  // 	| next_statement
  // 	| exit_statement
  // 	| return_statement
  // 	| null_statement
  public static boolean sequential_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sequential_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SEQUENTIAL_STATEMENT, "<sequential statement>");
    r = wait_statement(b, l + 1);
    if (!r) r = assertion_statement(b, l + 1);
    if (!r) r = report_statement(b, l + 1);
    if (!r) r = signal_assignment_statement(b, l + 1);
    if (!r) r = variable_assignment_statement(b, l + 1);
    if (!r) r = procedure_call_statement(b, l + 1);
    if (!r) r = if_statement(b, l + 1);
    if (!r) r = case_statement(b, l + 1);
    if (!r) r = loop_statement(b, l + 1);
    if (!r) r = next_statement(b, l + 1);
    if (!r) r = exit_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = null_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_expression [ shift_operator simple_expression ]
  public static boolean shift_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_EXPRESSION, "<shift expression>");
    r = simple_expression(b, l + 1);
    r = r && shift_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ shift_operator simple_expression ]
  private static boolean shift_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1")) return false;
    shift_expression_1_0(b, l + 1);
    return true;
  }

  // shift_operator simple_expression
  private static boolean shift_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_operator(b, l + 1);
    r = r && simple_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SLL | SRL | SLA | SRA | ROL | ROR
  public static boolean shift_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_OPERATOR, "<shift operator>");
    r = consumeToken(b, SLL);
    if (!r) r = consumeToken(b, SRL);
    if (!r) r = consumeToken(b, SLA);
    if (!r) r = consumeToken(b, SRA);
    if (!r) r = consumeToken(b, ROL);
    if (!r) r = consumeToken(b, ROR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SIGN_RE
  public static boolean sign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sign")) return false;
    if (!nextTokenIs(b, SIGN_RE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGN_RE);
    exit_section_(b, m, SIGN, r);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] target LARROW [ delay_mechanism ] waveform SEMICOLON
  public static boolean signal_assignment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_ASSIGNMENT_STATEMENT, "<signal assignment statement>");
    r = signal_assignment_statement_0(b, l + 1);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, LARROW);
    r = r && signal_assignment_statement_3(b, l + 1);
    r = r && waveform(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean signal_assignment_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_0")) return false;
    signal_assignment_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean signal_assignment_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ delay_mechanism ]
  private static boolean signal_assignment_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_assignment_statement_3")) return false;
    delay_mechanism(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // signal identifier_list COLON subtype_indication [ signal_kind ] [ COLONEQUALS expression ] SEMICOLON
  public static boolean signal_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration")) return false;
    if (!nextTokenIs(b, SIGNAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGNAL);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    r = r && signal_declaration_4(b, l + 1);
    r = r && signal_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SIGNAL_DECLARATION, r);
    return r;
  }

  // [ signal_kind ]
  private static boolean signal_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_4")) return false;
    signal_kind(b, l + 1);
    return true;
  }

  // [ COLONEQUALS expression ]
  private static boolean signal_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_5")) return false;
    signal_declaration_5_0(b, l + 1);
    return true;
  }

  // COLONEQUALS expression
  private static boolean signal_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLONEQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // REGISTER  |  BUS
  public static boolean signal_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_kind")) return false;
    if (!nextTokenIs(b, "<signal kind>", BUS, REGISTER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_KIND, "<signal kind>");
    r = consumeToken(b, REGISTER);
    if (!r) r = consumeToken(b, BUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // signal_name { COMMA signal_name }
  // 	| OTHERS
  // 	| ALL
  public static boolean signal_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIGNAL_LIST, "<signal list>");
    r = signal_list_0(b, l + 1);
    if (!r) r = consumeToken(b, OTHERS);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // signal_name { COMMA signal_name }
  private static boolean signal_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIGNAL_NAME);
    r = r && signal_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA signal_name
  private static boolean signal_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signal_list_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, SIGNAL_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ [ type_mark { COMMA type_mark } ] [ return type_mark ] ]
  public static boolean signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature")) return false;
    Marker m = enter_section_(b, l, _NONE_, SIGNATURE, "<signature>");
    signature_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // [ type_mark { COMMA type_mark } ] [ return type_mark ]
  private static boolean signature_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = signature_0_0(b, l + 1);
    r = r && signature_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ type_mark { COMMA type_mark } ]
  private static boolean signature_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_0_0")) return false;
    signature_0_0_0(b, l + 1);
    return true;
  }

  // type_mark { COMMA type_mark }
  private static boolean signature_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_mark(b, l + 1);
    r = r && signature_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA type_mark
  private static boolean signature_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_0_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ return type_mark ]
  private static boolean signature_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_0_1")) return false;
    signature_0_1_0(b, l + 1);
    return true;
  }

  // return type_mark
  private static boolean signature_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "signature_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ sign ] term { adding_operator term }
  public static boolean simple_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_EXPRESSION, "<simple expression>");
    r = simple_expression_0(b, l + 1);
    r = r && term(b, l + 1);
    r = r && simple_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ sign ]
  private static boolean simple_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_0")) return false;
    sign(b, l + 1);
    return true;
  }

  // adding_operator term
  private static boolean simple_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = adding_operator(b, l + 1);
    r = r && term(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_NAME, "<simple name>");
    r = identifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // prefix ( discrete_range )
  public static boolean slice_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SLICE_NAME, "<slice name>");
    r = prefix(b, l + 1);
    r = r && slice_name_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( discrete_range )
  private static boolean slice_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "slice_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = discrete_range(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // " { graphic_character } "
  public static boolean string_literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LITERAL, "<string literal>");
    r = consumeToken(b, " { graphic_character } ");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subprogram_specification IS
  // 		subprogram_declarative_part
  // 	BEGIN
  // 		subprogram_statement_part
  // 	END [ subprogram_kind ] [ designator ] SEMICOLON
  public static boolean subprogram_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_BODY, "<subprogram body>");
    r = subprogram_specification(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && subprogram_declarative_part(b, l + 1);
    r = r && consumeToken(b, BEGIN);
    r = r && subprogram_statement_part(b, l + 1);
    r = r && consumeToken(b, END);
    r = r && subprogram_body_6(b, l + 1);
    r = r && subprogram_body_7(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ subprogram_kind ]
  private static boolean subprogram_body_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_body_6")) return false;
    subprogram_kind(b, l + 1);
    return true;
  }

  // [ designator ]
  private static boolean subprogram_body_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_body_7")) return false;
    designator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // subprogram_specification SEMICOLON
  public static boolean subprogram_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_DECLARATION, "<subprogram declaration>");
    r = subprogram_specification(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // subprogram_declaration
  // 	| subprogram_body
  // 	| type_declaration
  // 	| subtype_declaration
  // 	| constant_declaration
  // 	| variable_declaration
  // 	| file_declaration
  // 	| alias_declaration
  // 	| attribute_declaration
  // 	| attribute_specification
  // 	| use_clause
  // 	| group_template_declaration
  // 	| group_declaration
  public static boolean subprogram_declarative_item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declarative_item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_DECLARATIVE_ITEM, "<subprogram declarative item>");
    r = subprogram_declaration(b, l + 1);
    if (!r) r = subprogram_body(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    if (!r) r = subtype_declaration(b, l + 1);
    if (!r) r = constant_declaration(b, l + 1);
    if (!r) r = variable_declaration(b, l + 1);
    if (!r) r = file_declaration(b, l + 1);
    if (!r) r = alias_declaration(b, l + 1);
    if (!r) r = attribute_declaration(b, l + 1);
    if (!r) r = attribute_specification(b, l + 1);
    if (!r) r = use_clause(b, l + 1);
    if (!r) r = group_template_declaration(b, l + 1);
    if (!r) r = group_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { subprogram_declarative_item }
  public static boolean subprogram_declarative_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_declarative_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_DECLARATIVE_PART, "<subprogram declarative part>");
    r = subprogram_declarative_item(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PROCEDURE | FUNCTION
  public static boolean subprogram_kind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_kind")) return false;
    if (!nextTokenIs(b, "<subprogram kind>", FUNCTION, PROCEDURE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_KIND, "<subprogram kind>");
    r = consumeToken(b, PROCEDURE);
    if (!r) r = consumeToken(b, FUNCTION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PROCEDURE designator [ ( formal_parameter_list ) ]
  // 	| [ PURE | IMPURE ]  FUNCTION designator [ ( formal_parameter_list ) ]
  // 		RETURN type_mark
  public static boolean subprogram_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_SPECIFICATION, "<subprogram specification>");
    r = subprogram_specification_0(b, l + 1);
    if (!r) r = subprogram_specification_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PROCEDURE designator [ ( formal_parameter_list ) ]
  private static boolean subprogram_specification_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PROCEDURE);
    r = r && designator(b, l + 1);
    r = r && subprogram_specification_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( formal_parameter_list ) ]
  private static boolean subprogram_specification_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_0_2")) return false;
    subprogram_specification_0_2_0(b, l + 1);
    return true;
  }

  // ( formal_parameter_list )
  private static boolean subprogram_specification_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_parameter_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ PURE | IMPURE ]  FUNCTION designator [ ( formal_parameter_list ) ]
  // 		RETURN type_mark
  private static boolean subprogram_specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = subprogram_specification_1_0(b, l + 1);
    r = r && consumeToken(b, FUNCTION);
    r = r && designator(b, l + 1);
    r = r && subprogram_specification_1_3(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && type_mark(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ PURE | IMPURE ]
  private static boolean subprogram_specification_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_1_0")) return false;
    subprogram_specification_1_0_0(b, l + 1);
    return true;
  }

  // PURE | IMPURE
  private static boolean subprogram_specification_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PURE);
    if (!r) r = consumeToken(b, IMPURE);
    return r;
  }

  // [ ( formal_parameter_list ) ]
  private static boolean subprogram_specification_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_1_3")) return false;
    subprogram_specification_1_3_0(b, l + 1);
    return true;
  }

  // ( formal_parameter_list )
  private static boolean subprogram_specification_1_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_specification_1_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = formal_parameter_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // { sequential_statement }
  public static boolean subprogram_statement_part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subprogram_statement_part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBPROGRAM_STATEMENT_PART, "<subprogram statement part>");
    r = sequential_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SUBTYPE identifier IS subtype_indication SEMICOLON
  public static boolean subtype_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_declaration")) return false;
    if (!nextTokenIs(b, SUBTYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUBTYPE);
    r = r && identifier(b, l + 1);
    r = r && consumeToken(b, IS);
    r = r && subtype_indication(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, SUBTYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // [ resolution_function_name ] type_mark [ constraint ]
  public static boolean subtype_indication(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUBTYPE_INDICATION, "<subtype indication>");
    r = subtype_indication_0(b, l + 1);
    r = r && type_mark(b, l + 1);
    r = r && subtype_indication_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ resolution_function_name ]
  private static boolean subtype_indication_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication_0")) return false;
    consumeToken(b, RESOLUTION_FUNCTION_NAME);
    return true;
  }

  // [ constraint ]
  private static boolean subtype_indication_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subtype_indication_2")) return false;
    constraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // simple_name
  // 	| character_literal
  // 	| operator_symbol
  // 	| ALL
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SUFFIX, "<suffix>");
    r = simple_name(b, l + 1);
    if (!r) r = character_literal(b, l + 1);
    if (!r) r = operator_symbol(b, l + 1);
    if (!r) r = consumeToken(b, ALL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name
  // 	| aggregate
  public static boolean target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TARGET, "<target>");
    r = name(b, l + 1);
    if (!r) r = aggregate(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // factor { multiplying_operator factor }
  public static boolean term(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TERM, "<term>");
    r = factor(b, l + 1);
    r = r && term_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // multiplying_operator factor
  private static boolean term_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "term_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplying_operator(b, l + 1);
    r = r && factor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR time_expression
  public static boolean timeout_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "timeout_clause")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, TIME_EXPRESSION);
    exit_section_(b, m, TIMEOUT_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // type_mark ( expression )
  public static boolean type_conversion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_conversion")) return false;
    if (!nextTokenIs(b, "<type conversion>", SUBTYPE_NAME, TYPE_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_CONVERSION, "<type conversion>");
    r = type_mark(b, l + 1);
    r = r && type_conversion_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( expression )
  private static boolean type_conversion_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_conversion_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // full_type_declaration
  // 	| incomplete_type_declaration
  public static boolean type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = full_type_declaration(b, l + 1);
    if (!r) r = incomplete_type_declaration(b, l + 1);
    exit_section_(b, m, TYPE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // scalar_type_definition
  // 	| composite_type_definition
  // 	| access_type_definition
  // 	| file_type_definition
  public static boolean type_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DEFINITION, "<type definition>");
    r = scalar_type_definition(b, l + 1);
    if (!r) r = composite_type_definition(b, l + 1);
    if (!r) r = access_type_definition(b, l + 1);
    if (!r) r = file_type_definition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_name
  // 	| subtype_name
  public static boolean type_mark(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_mark")) return false;
    if (!nextTokenIs(b, "<type mark>", SUBTYPE_NAME, TYPE_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_MARK, "<type mark>");
    r = consumeToken(b, TYPE_NAME);
    if (!r) r = consumeToken(b, SUBTYPE_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ARRAY ( index_subtype_definition { COMMA index_subtype_definition } )
  // 		OF element_subtype_indication
  public static boolean unconstrained_array_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unconstrained_array_definition")) return false;
    if (!nextTokenIs(b, ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY);
    r = r && unconstrained_array_definition_1(b, l + 1);
    r = r && consumeTokens(b, 0, OF, ELEMENT_SUBTYPE_INDICATION);
    exit_section_(b, m, UNCONSTRAINED_ARRAY_DEFINITION, r);
    return r;
  }

  // index_subtype_definition { COMMA index_subtype_definition }
  private static boolean unconstrained_array_definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unconstrained_array_definition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = index_subtype_definition(b, l + 1);
    r = r && unconstrained_array_definition_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA index_subtype_definition
  private static boolean unconstrained_array_definition_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unconstrained_array_definition_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && index_subtype_definition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // USE selected_name { COMMA selected_name } SEMICOLON
  public static boolean use_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause")) return false;
    if (!nextTokenIs(b, USE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, USE);
    r = r && selected_name(b, l + 1);
    r = r && use_clause_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, USE_CLAUSE, r);
    return r;
  }

  // COMMA selected_name
  private static boolean use_clause_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "use_clause_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && selected_name(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] target  COLONEQUALS expression SEMICOLON
  public static boolean variable_assignment_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_ASSIGNMENT_STATEMENT, "<variable assignment statement>");
    r = variable_assignment_statement_0(b, l + 1);
    r = r && target(b, l + 1);
    r = r && consumeToken(b, COLONEQUALS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean variable_assignment_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_0")) return false;
    variable_assignment_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean variable_assignment_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_assignment_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ SHARED ] VARIABLE identifier_list COLON subtype_indication [ COLONEQUALS expression ] SEMICOLON
  public static boolean variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration")) return false;
    if (!nextTokenIs(b, "<variable declaration>", SHARED, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DECLARATION, "<variable declaration>");
    r = variable_declaration_0(b, l + 1);
    r = r && consumeToken(b, VARIABLE);
    r = r && identifier_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && subtype_indication(b, l + 1);
    r = r && variable_declaration_5(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ SHARED ]
  private static boolean variable_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_0")) return false;
    consumeToken(b, SHARED);
    return true;
  }

  // [ COLONEQUALS expression ]
  private static boolean variable_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_5")) return false;
    variable_declaration_5_0(b, l + 1);
    return true;
  }

  // COLONEQUALS expression
  private static boolean variable_declaration_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declaration_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLONEQUALS);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ label COLON ] WAIT [ sensitivity_clause ] [ condition_clause ] [ timeout_clause ] SEMICOLON
  public static boolean wait_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WAIT_STATEMENT, "<wait statement>");
    r = wait_statement_0(b, l + 1);
    r = r && consumeToken(b, WAIT);
    r = r && wait_statement_2(b, l + 1);
    r = r && wait_statement_3(b, l + 1);
    r = r && wait_statement_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ label COLON ]
  private static boolean wait_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_0")) return false;
    wait_statement_0_0(b, l + 1);
    return true;
  }

  // label COLON
  private static boolean wait_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = label(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ sensitivity_clause ]
  private static boolean wait_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_2")) return false;
    sensitivity_clause(b, l + 1);
    return true;
  }

  // [ condition_clause ]
  private static boolean wait_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_3")) return false;
    condition_clause(b, l + 1);
    return true;
  }

  // [ timeout_clause ]
  private static boolean wait_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wait_statement_4")) return false;
    timeout_clause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // waveform_element { COMMA waveform_element }
  // 	| UNAFFECTED
  public static boolean waveform(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WAVEFORM, "<waveform>");
    r = waveform_0(b, l + 1);
    if (!r) r = consumeToken(b, UNAFFECTED);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // waveform_element { COMMA waveform_element }
  private static boolean waveform_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = waveform_element(b, l + 1);
    r = r && waveform_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA waveform_element
  private static boolean waveform_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && waveform_element(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // value_expression [ AFTER time_expression ]
  // 	| NULL [ AFTER time_expression ]
  public static boolean waveform_element(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element")) return false;
    if (!nextTokenIs(b, "<waveform element>", NULL, VALUE_EXPRESSION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WAVEFORM_ELEMENT, "<waveform element>");
    r = waveform_element_0(b, l + 1);
    if (!r) r = waveform_element_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // value_expression [ AFTER time_expression ]
  private static boolean waveform_element_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE_EXPRESSION);
    r = r && waveform_element_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ AFTER time_expression ]
  private static boolean waveform_element_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_0_1")) return false;
    parseTokens(b, 0, AFTER, TIME_EXPRESSION);
    return true;
  }

  // NULL [ AFTER time_expression ]
  private static boolean waveform_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    r = r && waveform_element_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ AFTER time_expression ]
  private static boolean waveform_element_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "waveform_element_1_1")) return false;
    parseTokens(b, 0, AFTER, TIME_EXPRESSION);
    return true;
  }

}
