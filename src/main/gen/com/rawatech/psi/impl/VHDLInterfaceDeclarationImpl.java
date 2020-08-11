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

public class VHDLInterfaceDeclarationImpl extends ASTWrapperPsiElement implements VHDLInterfaceDeclaration {

  public VHDLInterfaceDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitInterfaceDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLInterfaceConstantDeclaration getInterfaceConstantDeclaration() {
    return findChildByClass(VHDLInterfaceConstantDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLInterfaceFileDeclaration getInterfaceFileDeclaration() {
    return findChildByClass(VHDLInterfaceFileDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLInterfaceSignalDeclaration getInterfaceSignalDeclaration() {
    return findChildByClass(VHDLInterfaceSignalDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLInterfaceVariableDeclaration getInterfaceVariableDeclaration() {
    return findChildByClass(VHDLInterfaceVariableDeclaration.class);
  }

}
