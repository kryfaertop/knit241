package org.knit.solutions.Task16;

class CharacterGlyph implements Glyph {
    private char symbol;

    public CharacterGlyph(char symbol) {
        this.symbol = symbol;
    }

    public void render(int x, int y, String style) {
        System.out.printf("Символ '%c' на (%d, %d) стиль: %s\n", symbol, x, y, style);
    }
}
