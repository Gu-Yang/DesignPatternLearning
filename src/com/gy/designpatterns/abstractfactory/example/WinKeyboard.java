package com.gy.designpatterns.abstractfactory.example;

public class WinKeyboard implements Keyboard{
    @Override
    public void input() {
        System.out.println("Win Keyboard input...");
    }
}
