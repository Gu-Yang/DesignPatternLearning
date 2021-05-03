package com.gy.designpatterns.singleton.example;

public class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {}

    private static class Singleton4Holder {
        public static Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Singleton4Holder.instance;
    }

    public void printMyself () {
        System.out.println("This is a " + this.getClass() + " instance!");
    }
}
