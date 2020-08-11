// This is a generated file. Not intended for manual editing.
package com.rawatech.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLBasedLiteral extends PsiElement {

  @NotNull
  VHDLBase getBase();

  @NotNull
  List<VHDLBasedInteger> getBasedIntegerList();

  @Nullable
  VHDLExponent getExponent();

}
