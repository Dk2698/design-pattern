package com.kumar.structural.flyweight;

public class CharacterLatter {

    char character;
    String fontType;
    int size;
    int row;
    int column;

    public CharacterLatter(char character, String fontType, int size, int row, int column) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
        this.row = row;
        this.column = column;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getFontType() {
        return fontType;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
