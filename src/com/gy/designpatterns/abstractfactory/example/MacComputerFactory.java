package com.gy.designpatterns.abstractfactory.example;

public class MacComputerFactory implements ComputerFactory{

    @Override
    public Keyboard createKeyboard() {
        return new MacKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new MacMouse();
    }

}
