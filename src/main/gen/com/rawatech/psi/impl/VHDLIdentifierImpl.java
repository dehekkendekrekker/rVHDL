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

public class VHDLIdentifierImpl extends ASTWrapperPsiElement implements VHDLIdentifier {

  public VHDLIdentifierImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull VHDLVisitor visitor) {
    visitor.visitIdentifier(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof VHDLVisitor) accept((VHDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public VHDLBasicIdentifier getBasicIdentifier() {
    return findChildByClass(VHDLBasicIdentifier.class);
  }

  @Override
  @Nullable
  public VHDLExtendedIdentifier getExtendedIdentifier() {
    return findChildByClass(VHDLExtendedIdentifier.class);
  }

}
