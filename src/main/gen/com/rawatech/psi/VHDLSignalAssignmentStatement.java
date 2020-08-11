// This is a generated file. Not intended for manual editing.
package com.rawatech.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VHDLSignalAssignmentStatement extends PsiElement {

  @Nullable
  VHDLDelayMechanism getDelayMechanism();

  @Nullable
  VHDLLabel getLabel();

  @NotNull
  VHDLTarget getTarget();

  @NotNull
  VHDLWaveform getWaveform();

}
