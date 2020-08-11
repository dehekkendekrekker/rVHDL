// This is a generated file. Not intended for manual editing.
package generated;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import generated.psi.impl.*;

public interface GeneratedTypes {

  IElementType DEFINITION = new IElementType("DEFINITION", null);
  IElementType ENTITY_DECLARATION = new IElementType("ENTITY_DECLARATION", null);
  IElementType ENTITY_HEADER = new IElementType("ENTITY_HEADER", null);
  IElementType GENERIC_CLAUSE = new IElementType("GENERIC_CLAUSE", null);
  IElementType PORT_CLAUSE = new IElementType("PORT_CLAUSE", null);

  IElementType BEGIN = new IElementType("begin", null);
  IElementType END = new IElementType("end", null);
  IElementType ENTITY = new IElementType("entity", null);
  IElementType ENTITY_STATEMENT_PART = new IElementType("entity_statement_part", null);
  IElementType GENERIC = new IElementType("generic", null);
  IElementType GENERIC_LIST = new IElementType("generic_list", null);
  IElementType IDENTIFIER = new IElementType("IDENTIFIER", null);
  IElementType IS = new IElementType("is", null);
  IElementType PORT = new IElementType("port", null);
  IElementType PORT_LIST = new IElementType("port_list", null);
  IElementType SIMPLE_NAME = new IElementType("SIMPLE_NAME", null);

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DEFINITION) {
        return new DefinitionImpl(node);
      }
      else if (type == ENTITY_DECLARATION) {
        return new EntityDeclarationImpl(node);
      }
      else if (type == ENTITY_HEADER) {
        return new EntityHeaderImpl(node);
      }
      else if (type == GENERIC_CLAUSE) {
        return new GenericClauseImpl(node);
      }
      else if (type == PORT_CLAUSE) {
        return new PortClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
