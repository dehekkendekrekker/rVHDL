// This is a generated file. Not intended for manual editing.
package com.rawatech.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLAttributeName extends PsiElement {

  @NotNull
  VHDLAttributeDesignator getAttributeDesignator();

  @Nullable
  VHDLExpression getExpression();

  @NotNull
  VHDLPrefix getPrefix();

  @Nullable
  VHDLSignature getSignature();

}
