// This is a generated file. Not intended for manual editing.
package com.rawatech.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.rawatech.psi.impl.*;

public interface VHDLTypes {

  IElementType DEFINITION = new VHDLElementType("DEFINITION");
  IElementType ENTITY_DECLARATION = new VHDLElementType("ENTITY_DECLARATION");
  IElementType ENTITY_HEADER = new VHDLElementType("ENTITY_HEADER");
  IElementType GENERIC_CLAUSE = new VHDLElementType("GENERIC_CLAUSE");
  IElementType PORT_CLAUSE = new VHDLElementType("PORT_CLAUSE");

  IElementType BEGIN = new VHDLTokenType("begin");
  IElementType COMMENT = new VHDLTokenType("COMMENT");
  IElementType END = new VHDLTokenType("end");
  IElementType ENTITY = new VHDLTokenType("entity");
  IElementType ENTITY_STATEMENT_PART = new VHDLTokenType("entity_statement_part");
  IElementType GENERIC = new VHDLTokenType("generic");
  IElementType GENERIC_LIST = new VHDLTokenType("generic_list");
  IElementType IDENTIFIER = new VHDLTokenType("IDENTIFIER");
  IElementType IS = new VHDLTokenType("is");
  IElementType PORT = new VHDLTokenType("port");
  IElementType PORT_LIST = new VHDLTokenType("port_list");
  IElementType SIMPLE_NAME = new VHDLTokenType("SIMPLE_NAME");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DEFINITION) {
        return new VHDLDefinitionImpl(node);
      }
      else if (type == ENTITY_DECLARATION) {
        return new VHDLEntityDeclarationImpl(node);
      }
      else if (type == ENTITY_HEADER) {
        return new VHDLEntityHeaderImpl(node);
      }
      else if (type == GENERIC_CLAUSE) {
        return new VHDLGenericClauseImpl(node);
      }
      else if (type == PORT_CLAUSE) {
        return new VHDLPortClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
