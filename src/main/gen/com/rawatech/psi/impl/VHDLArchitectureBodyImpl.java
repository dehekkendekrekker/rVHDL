// This is a generated file. Not intended for manual editing.
package com.rawatech.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.rawatech.psi.VHDLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.rawatech.psi.*;

public class VHDLArchitectureBodyImpl extends ASTWrapperPsiElement implements VHDLArchitectureBody {

  public VHDLArchitectureBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitArchitectureBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLArchitectureDeclarativePart getArchitectureDeclarativePart() {
    return findNotNullChildByClass(VHDLArchitectureDeclarativePart.class);
  }

  @Override
  @NotNull
  public VHDLArchitectureStatementPart getArchitectureStatementPart() {
    return findNotNullChildByClass(VHDLArchitectureStatementPart.class);
  }

  @Override
  @NotNull
  public VHDLIdentifier getIdentifier() {
    return findNotNullChildByClass(VHDLIdentifier.class);
  }

}
