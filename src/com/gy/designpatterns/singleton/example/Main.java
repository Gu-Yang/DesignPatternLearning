package com.gy.designpatterns.singleton.example;

public class Main {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton4 singleton4 = Singleton4.getInstance();
        Singleton5 singleton5 = Singleton5.INSTANCE;


        singleton1.printMyself();
        singleton2.printMyself();
        singleton3.printMyself();
        singleton4.printMyself();
        singleton5.printMyself();


    }
}
