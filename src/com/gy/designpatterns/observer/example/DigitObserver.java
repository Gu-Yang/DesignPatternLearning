package com.gy.designpatterns.observer.example;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberSubject subject) {
        System.out.println("DigitObserver: " + subject.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
