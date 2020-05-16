package com.company.data;

public class PlayerBoard {

    public PlayerBoard(boolean isVisible) {
        myField = new Field(true);
        opponentsField = new Field(false);

        this.isVisible = isVisible;
    }

    private Field myField;
    private Field opponentsField;
    private boolean isVisible;

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public Iterable<Character> getColumnHeaders() {
        return myField.getColumnHeaders();
    }
}
