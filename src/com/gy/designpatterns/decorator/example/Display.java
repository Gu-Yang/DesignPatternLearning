package com.gy.designpatterns.decorator.example;

public abstract class Display {

    public abstract int getColumnCount();
    public abstract int getRowCount();
    public abstract String getRowText(int rowNum);

    public final void show() {
        for (int i = 0; i < getRowCount(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
