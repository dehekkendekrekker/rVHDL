// This is a generated file. Not intended for manual editing.
package com.rawatech.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLAliasDeclaration extends PsiElement {

  @NotNull
  VHDLAliasDesignator getAliasDesignator();

  @NotNull
  VHDLName getName();

  @Nullable
  VHDLSignature getSignature();

  @Nullable
  VHDLSubtypeIndication getSubtypeIndication();

}
