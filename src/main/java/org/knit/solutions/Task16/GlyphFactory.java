package org.knit.solutions.Task16;

import java.util.*;

public class GlyphFactory {
    private Map<Character, Glyph> glyphs = new HashMap<>();

    public Glyph getGlyph(char symbol) {
        glyphs.putIfAbsent(symbol, new CharacterGlyph(symbol));
        return glyphs.get(symbol);
    }
}
