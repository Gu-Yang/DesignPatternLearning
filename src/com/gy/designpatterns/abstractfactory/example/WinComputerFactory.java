package com.gy.designpatterns.abstractfactory.example;

public class WinComputerFactory implements ComputerFactory{

    @Override
    public Keyboard createKeyboard() {
        return new WinKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new WinMouse();
    }

}
