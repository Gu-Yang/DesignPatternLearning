package com.gy.designpatterns.brige.example1;

public class Milk implements Additive {
    @Override
    public void add() {
        System.out.println("Add milk...");
    }
}
