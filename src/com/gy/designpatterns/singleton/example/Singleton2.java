package com.gy.designpatterns.singleton.example;

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {}

    public static synchronized Singleton2 getInstance() {

        if (instance == null) {
            instance = new Singleton2();
        }

        return instance;
    }

    public void printMyself () {
        System.out.println("This is a " + this.getClass() + " instance!");
    }
}
