package com.gy.designpatterns.observer.example;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberSubject subject) {
        System.out.println("GraphObserver:");
        int number = subject.getNumber();
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
