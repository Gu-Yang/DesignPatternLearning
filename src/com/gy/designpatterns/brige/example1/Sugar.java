package com.gy.designpatterns.brige.example1;

public class Sugar implements Additive {

    @Override
    public void add() {
        System.out.println("Add sugar...");
    }
}
