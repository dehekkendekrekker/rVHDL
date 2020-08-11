package com.rawatech;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class VHDLFileType extends LanguageFileType {

    public static final VHDLFileType INSTANCE = new VHDLFileType();

    private VHDLFileType() {
        super(VHDLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "VHDL file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Very High Speed Integrated Circuit Hardware Description Language (VHDL) file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "vhdl";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return VHDLIcons.ICON;
    }
}
