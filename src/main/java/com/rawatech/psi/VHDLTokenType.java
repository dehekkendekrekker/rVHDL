package com.rawatech.psi;

import com.intellij.psi.tree.IElementType;
import com.rawatech.VHDLanguage;
import org.jetbrains.annotations.*;

public class VHDLTokenType extends IElementType {
    public VHDLTokenType(@NotNull @NonNls String debugName) {
        super(debugName, VHDLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "VHDLTokenType." + super.toString();
    }
}