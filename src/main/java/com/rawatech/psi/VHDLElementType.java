package com.rawatech.psi;

import com.intellij.psi.tree.IElementType;
import com.rawatech.VHDLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class VHDLElementType extends IElementType {
    public VHDLElementType( @NotNull @NonNls String debugName) {
        super(debugName, VHDLanguage.INSTANCE);
    }
}