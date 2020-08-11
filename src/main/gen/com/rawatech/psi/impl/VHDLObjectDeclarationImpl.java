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

public class VHDLObjectDeclarationImpl extends ASTWrapperPsiElement implements VHDLObjectDeclaration {

  public VHDLObjectDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitObjectDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLConstantDeclaration getConstantDeclaration() {
    return findChildByClass(VHDLConstantDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLFileDeclaration getFileDeclaration() {
    return findChildByClass(VHDLFileDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLSignalDeclaration getSignalDeclaration() {
    return findChildByClass(VHDLSignalDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLVariableDeclaration getVariableDeclaration() {
    return findChildByClass(VHDLVariableDeclaration.class);
  }

}
