package com.gy.designpatterns.abstractfactory.example;

public class MacKeyboard implements Keyboard{
    @Override
    public void input() {
        System.out.println("Mac Keyboard input...");
    }
}
