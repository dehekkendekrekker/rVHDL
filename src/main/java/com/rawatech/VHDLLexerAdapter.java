package com.rawatech;

import com.intellij.lexer.FlexAdapter;
import com.rawatech.grammar._VHDLLexer;


public class VHDLLexerAdapter extends FlexAdapter {
    public VHDLLexerAdapter() {
        super(new _VHDLLexer());
    }
}
