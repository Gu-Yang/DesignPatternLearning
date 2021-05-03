package com.gy.designpatterns.decorator.example;

public class FullBoard extends Border {

    public FullBoard(Display display) {
        super(display);
    }

    @Override
    public int getColumnCount() {
        return 1 + display.getColumnCount() + 1;
    }

    @Override
    public int getRowCount() {
        return 1 + display.getRowCount() + 1;
    }

    @Override
    public String getRowText(int rowNum) {
        if (rowNum == 0) {
            return '+' + makeline('-', display.getColumnCount()) + '+';
        } else if (rowNum == display.getRowCount() + 1) {
            return '+' + makeline('-', display.getColumnCount()) + '+';
        } else {
            return '|' + display.getRowText(rowNum - 1) + '|';
        }
    }

    private String makeline(char ch, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
