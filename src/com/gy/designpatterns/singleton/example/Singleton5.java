package com.gy.designpatterns.singleton.example;

public enum Singleton5 {
    INSTANCE;

    public void printMyself () {
        System.out.println("This is a " + this.getClass() + " instance!");
    }
}
