package com.rawatech;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.rawatech.psi.VHDLTypes;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class VHDLSyntaxHighlighter extends SyntaxHighlighterBase {
//    public static final TextAttributesKey SEPARATOR = createTextAttributesKey("VHDL_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("VHDL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
//    public static final TextAttributesKey VALUE =createTextAttributesKey("VHDL_VALUE", DefaultLanguageHighlighterColors.STRING);
//    public static final TextAttributesKey COMMENT = createTextAttributesKey("VHDL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
//    public static final TextAttributesKey BAD_CHARACTER =createTextAttributesKey("VHDL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


//    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
//    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[]{KEYWORD};
//    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
//    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    private ArrayList<IElementType> keywords = new ArrayList<>(Arrays.asList(
            VHDLTypes.ENTITY,
            VHDLTypes.BEGIN,
            VHDLTypes.IS,
            VHDLTypes.END,
            VHDLTypes.GENERIC,
            VHDLTypes.PORT
    ));



    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new VHDLLexerAdapter();
    }


    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (keywords.contains(tokenType)) {
            return KEYWORDS;
        } else {
            return EMPTY_KEYS;
        }
    }
}