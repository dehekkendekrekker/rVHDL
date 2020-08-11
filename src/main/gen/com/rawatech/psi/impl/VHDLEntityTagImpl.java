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

public class VHDLEntityTagImpl extends ASTWrapperPsiElement implements VHDLEntityTag {

  public VHDLEntityTagImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitEntityTag(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLCharacterLiteral getCharacterLiteral() {
    return findChildByClass(VHDLCharacterLiteral.class);
  }

  @Override
  @Nullable
  public VHDLOperatorSymbol getOperatorSymbol() {
    return findChildByClass(VHDLOperatorSymbol.class);
  }

  @Override
  @Nullable
  public VHDLSimpleName getSimpleName() {
    return findChildByClass(VHDLSimpleName.class);
  }

}
