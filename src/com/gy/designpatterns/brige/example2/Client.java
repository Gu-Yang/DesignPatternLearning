package com.gy.designpatterns.brige.example2;

public class Client {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Display!"));
        CountDisplay d2 = new CountDisplay(new StringDisplayImpl("Hello, MultipleDisplay!"));

        Display d3 = new Display(new HtmlDisplayImpl("Hello, Display!"));
        CountDisplay d4 = new CountDisplay(new HtmlDisplayImpl("Hello, MultipleDisplay!"));

        ContentOnlyDisplay d5 = new ContentOnlyDisplay(new StringDisplayImpl("Hello, ContentOnlyDisplay!"));
        ContentOnlyDisplay d6 = new ContentOnlyDisplay(new HtmlDisplayImpl("Hello, ContentOnlyDisplay!"));

        d1.display();
        d2.display();
        d2.mutipleDisplay(3);
        System.out.println("-----------------------------------------------------------");

        d3.display();
        d4.display();
        d4.mutipleDisplay(3);
        System.out.println("-----------------------------------------------------------");

        d5.contentOnlyDisplay();
        d6.contentOnlyDisplay();
    }
}
