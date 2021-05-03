package com.gy.designpatterns.abstractfactory.example;

public class Main {
    public static void main(String[] args) {
        // Create Win products
        ComputerFactory winFactory = new WinComputerFactory();
        Keyboard winKeyboard = winFactory.createKeyboard();
        Mouse winMouse = winFactory.createMouse();
        winKeyboard.input();
        winMouse.click();

        System.out.println("==============================================");

        // Create Mac products
        ComputerFactory macFactory = new MacComputerFactory();
        Keyboard macKeyboard = macFactory.createKeyboard();
        Mouse macMouse = macFactory.createMouse();
        macKeyboard.input();
        macMouse.click();
    }
}
