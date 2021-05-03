package com.gy.designpatterns.singleton.example;

public class Singleton3 {

    private static volatile Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    public void printMyself () {
        System.out.println("This is a " + this.getClass() + " instance!");
    }
}
