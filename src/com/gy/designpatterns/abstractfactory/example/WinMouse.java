package com.gy.designpatterns.abstractfactory.example;

public class WinMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Win Mouse click...");
    }
}
