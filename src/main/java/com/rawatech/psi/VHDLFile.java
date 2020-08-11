package com.rawatech.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.rawatech.VHDLFileType;
import com.rawatech.VHDLanguage;
import org.jetbrains.annotations.NotNull;

public class VHDLFile extends PsiFileBase {
    public VHDLFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, VHDLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return VHDLFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "VHDL File";
    }
}