package com.gy.designpatterns.builder.example;

public class Main {

    public static void main(String[] args) {

        // TextBuilder
        TextBuilder textBuilder = new TextBuilder();
        Director director1 = new Director(textBuilder);
        director1.construct();
        String result = textBuilder.getResult();
        System.out.println(result);

        // HTMLBuilder
        HtmlBuilder2 htmlBuilder2 = new HtmlBuilder2();
        Director director2 = new Director(htmlBuilder2);
        director2.construct();
        String filename = htmlBuilder2.getResult();
        System.out.println(filename);
    }
}
