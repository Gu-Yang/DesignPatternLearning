package com.gy.designpatterns.decorator.example;

import java.nio.charset.StandardCharsets;

public class SingleRowStringDisplay extends Display {

    private String text;

    public SingleRowStringDisplay(String text) {
        this.text = text;
    }

    @Override
    public int getColumnCount() {
        return text.getBytes().length;
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public String getRowText(int rowNum) {
        if (rowNum == 0) {
            return text;
        } else {
            return null;
        }
    }
}
