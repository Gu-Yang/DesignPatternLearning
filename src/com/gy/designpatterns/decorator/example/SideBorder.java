package com.gy.designpatterns.decorator.example;

public class SideBorder extends Border {

    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumnCount() {
        return 1 + display.getColumnCount() + 1;
    }

    @Override
    public int getRowCount() {
        return display.getRowCount();
    }

    @Override
    public String getRowText(int rowNum) {
        return borderChar + display.getRowText(rowNum) + borderChar;
    }
}
