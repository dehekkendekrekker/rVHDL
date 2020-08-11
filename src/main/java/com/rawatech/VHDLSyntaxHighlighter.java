package com.rawatech;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.rawatech.psi.VHDLTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class VHDLSyntaxHighlighter extends SyntaxHighlighterBase {
//    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("VHDL_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEY = createTextAttributesKey("VHDL_KEY", DefaultLanguageHighlighterColors.KEYWORD);
//    public static final TextAttributesKey VALUE =createTextAttributesKey("VHDL_VALUE", DefaultLanguageHighlighterColors.STRING);
//    public static final TextAttributesKey COMMENT = createTextAttributesKey("VHDL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
//    public static final TextAttributesKey BAD_CHARACTER =createTextAttributesKey("VHDL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


//    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
//    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
//    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
//    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];



    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new VHDLLexerAdapter();
    }


    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return EMPTY_KEYS;

//        if (tokenType.equals(VHDLTypes.DEFINITION)) {
//            return KEY_KEYS;
//        } else {
//            return EMPTY_KEYS;
//        }
    }
}