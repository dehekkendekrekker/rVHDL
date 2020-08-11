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

public class VHDLEntityDeclarationImpl extends ASTWrapperPsiElement implements VHDLEntityDeclaration {

  public VHDLEntityDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitEntityDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLEntityDeclarativePart getEntityDeclarativePart() {
    return findNotNullChildByClass(VHDLEntityDeclarativePart.class);
  }

  @Override
  @NotNull
  public VHDLEntityHeader getEntityHeader() {
    return findNotNullChildByClass(VHDLEntityHeader.class);
  }

  @Override
  @Nullable
  public VHDLEntityStatementPart getEntityStatementPart() {
    return findChildByClass(VHDLEntityStatementPart.class);
  }

  @Override
  @NotNull
  public VHDLIdentifier getIdentifier() {
    return findNotNullChildByClass(VHDLIdentifier.class);
  }

}
