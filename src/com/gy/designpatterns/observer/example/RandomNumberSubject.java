package com.gy.designpatterns.observer.example;

import java.util.Random;

public class RandomNumberSubject extends NumberSubject {

    private Random random = new Random();
    private int number;

    @Override
    protected int getNumber() {
        return number;
    }

    @Override
    protected void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
