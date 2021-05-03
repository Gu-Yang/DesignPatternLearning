package com.gy.designpatterns.brige.example2;

public class HtmlDisplayImpl implements DisplayImpl {

    private String content;

    public HtmlDisplayImpl(String content) {
        this.content = content;
    }

    @Override
    public void rawOpen() {
        System.out.println("<ul>");
    }

    @Override
    public void rawPrint() {
        System.out.println("<li>" + content + "</li>");
    }

    @Override
    public void rawClose() {
        System.out.println("</ul>");
    }
}
