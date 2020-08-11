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

public class VHDLPrimaryUnitImpl extends ASTWrapperPsiElement implements VHDLPrimaryUnit {

  public VHDLPrimaryUnitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitPrimaryUnit(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLConfigurationDeclaration getConfigurationDeclaration() {
    return findChildByClass(VHDLConfigurationDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLEntityDeclaration getEntityDeclaration() {
    return findChildByClass(VHDLEntityDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLPackageDeclaration getPackageDeclaration() {
    return findChildByClass(VHDLPackageDeclaration.class);
  }

}
