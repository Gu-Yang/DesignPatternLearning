package com.gy.designpatterns.abstractfactory.example;

public interface ComputerFactory {
    Keyboard createKeyboard();
    Mouse createMouse();
}
