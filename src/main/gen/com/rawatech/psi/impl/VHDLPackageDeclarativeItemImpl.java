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

public class VHDLPackageDeclarativeItemImpl extends ASTWrapperPsiElement implements VHDLPackageDeclarativeItem {

  public VHDLPackageDeclarativeItemImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitPackageDeclarativeItem(this);
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
  public VHDLAttributeSpecification getAttributeSpecification() {
    return findChildByClass(VHDLAttributeSpecification.class);
  }

  @Override
  @Nullable
  public VHDLComponentDeclaration getComponentDeclaration() {
    return findChildByClass(VHDLComponentDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLConstantDeclaration getConstantDeclaration() {
    return findChildByClass(VHDLConstantDeclaration.class);
  }

  @Override
  @Nullable
  public VHDLDisconnectionSpecification getDisconnectionSpecification() {
    return findChildByClass(VHDLDisconnectionSpecification.class);
  }

  @Override
  @Nullable
  public VHDLFileDeclaration getFileDeclaration() {
    return findChildByClass(VHDLFileDeclaration.class);
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
  public VHDLSignalDeclaration getSignalDeclaration() {
    return findChildByClass(VHDLSignalDeclaration.class);
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

  @Override
  @Nullable
  public VHDLUseClause getUseClause() {
    return findChildByClass(VHDLUseClause.class);
  }

}
