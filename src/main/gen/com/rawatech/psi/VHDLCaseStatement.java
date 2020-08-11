// This is a generated file. Not intended for manual editing.
package com.rawatech.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLCaseStatement extends PsiElement {

  @NotNull
  List<VHDLCaseStatementAlternative> getCaseStatementAlternativeList();

  @NotNull
  VHDLExpression getExpression();

}
