package com.gy.designpatterns.observer.example;

public class Client {
    public static void main(String[] args) {
        NumberSubject subject = new RandomNumberSubject();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        subject.addObserver(digitObserver);
        subject.addObserver(graphObserver);
        subject.execute();
    }
}
