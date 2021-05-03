package com.gy.designpatterns.singleton.example;

public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return instance;
    }

    public void printMyself () {
        System.out.println("This is a " + this.getClass() + " instance!");
    }

}
