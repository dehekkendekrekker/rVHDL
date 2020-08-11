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

public class VHDLDeclarationImpl extends ASTWrapperPsiElement implements VHDLDeclaration {

  public VHDLDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLAliasDeclaration getAliasDeclaration() {
    return findChildByClass(VHDLAliasDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLAttributeDeclaration getAttributeDeclaration() {
    return findChildByClass(VHDLAttributeDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLComponentDeclaration getComponentDeclaration() {
    return findChildByClass(VHDLComponentDeclaration.class);
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
  public VHDLGroupDeclaration getGroupDeclaration() {
    return findChildByClass(VHDLGroupDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLGroupTemplateDeclaration getGroupTemplateDeclaration() {
    return findChildByClass(VHDLGroupTemplateDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLInterfaceDeclaration getInterfaceDeclaration() {
    return findChildByClass(VHDLInterfaceDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLObjectDeclaration getObjectDeclaration() {
    return findChildByClass(VHDLObjectDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLPackageDeclaration getPackageDeclaration() {
    return findChildByClass(VHDLPackageDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLSubprogramDeclaration getSubprogramDeclaration() {
    return findChildByClass(VHDLSubprogramDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLSubtypeDeclaration getSubtypeDeclaration() {
    return findChildByClass(VHDLSubtypeDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLTypeDeclaration getTypeDeclaration() {
    return findChildByClass(VHDLTypeDeclaration.class);
  }

}
