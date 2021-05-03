package com.gy.designpatterns.templatemethod.example.anotherpackage;

import com.gy.designpatterns.templatemethod.example.AbstractDisplay;
import com.gy.designpatterns.templatemethod.example.CharDisplay;
import com.gy.designpatterns.templatemethod.example.StringDisplay;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("Hello,World");
        display1.display();
        display2.display();
    }
}
