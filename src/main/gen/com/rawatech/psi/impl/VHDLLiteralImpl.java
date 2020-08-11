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

public class VHDLLiteralImpl extends ASTWrapperPsiElement implements VHDLLiteral {

  public VHDLLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLBitStringLiteral getBitStringLiteral() {
    return findChildByClass(VHDLBitStringLiteral.class);
  }

  @Override
  @Nullable
  public VHDLEnumerationLiteral getEnumerationLiteral() {
    return findChildByClass(VHDLEnumerationLiteral.class);
  }

  @Override
  @Nullable
  public VHDLNumericLiteral getNumericLiteral() {
    return findChildByClass(VHDLNumericLiteral.class);
  }

  @Override
  @Nullable
  public VHDLStringLiteral getStringLiteral() {
    return findChildByClass(VHDLStringLiteral.class);
  }

}
