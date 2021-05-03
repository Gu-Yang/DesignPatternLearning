package com.gy.designpatterns.brige.example2;

public class StringDisplayImpl implements DisplayImpl {

    private String content;

    public StringDisplayImpl(String content) {
        this.content = content;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + content + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        int length = content.length();
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
