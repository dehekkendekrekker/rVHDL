// This is a generated file. Not intended for manual editing.
package com.rawatech.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLPrimary extends PsiElement {

  @Nullable
  VHDLAggregate getAggregate();

  @Nullable
  VHDLAllocator getAllocator();

  @Nullable
  VHDLExpression getExpression();

  @Nullable
  VHDLFunctionCall getFunctionCall();

  @Nullable
  VHDLLiteral getLiteral();

  @Nullable
  VHDLName getName();

  @Nullable
  VHDLQualifiedExpression getQualifiedExpression();

  @Nullable
  VHDLTypeConversion getTypeConversion();

}
