package com.gy.designpatterns.templatemethod.example;

public class StringDisplay extends AbstractDisplay{

    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.printf("+");
        for (int i=0; i<str.length(); i++) {
            System.out.printf("-");
        }
        System.out.println("+");
    }
}
