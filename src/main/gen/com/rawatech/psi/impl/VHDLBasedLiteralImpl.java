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

public class VHDLBasedLiteralImpl extends ASTWrapperPsiElement implements VHDLBasedLiteral {

  public VHDLBasedLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitBasedLiteral(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public VHDLBase getBase() {
    return findNotNullChildByClass(VHDLBase.class);
  }

  @Override
  @NotNull
  public List<VHDLBasedInteger> getBasedIntegerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, VHDLBasedInteger.class);
  }

  @Override
  @Nullable
  public VHDLExponent getExponent() {
    return findChildByClass(VHDLExponent.class);
  }

}
