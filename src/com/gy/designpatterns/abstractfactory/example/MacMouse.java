package com.gy.designpatterns.abstractfactory.example;

public class MacMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Mac Mouse click...");
    }
}
