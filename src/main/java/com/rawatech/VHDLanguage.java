package com.rawatech;

import com.intellij.lang.Language;


public class VHDLanguage extends Language {
    public static final VHDLanguage INSTANCE = new VHDLanguage();

    private VHDLanguage() {
        super("VHDL");
    }
}