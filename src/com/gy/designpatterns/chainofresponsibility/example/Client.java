package com.gy.designpatterns.chainofresponsibility.example;

public class Client {
    public static void main(String[] args) {
        Handler alice = new NoHandler("Alice");
        Handler bob = new LimitHandler("Bob", 100);
        Handler charlie = new SpecialHandler("Charlie", 429);
        Handler diana = new LimitHandler("Diana", 200);
        Handler elmo = new OddHandler("Elmo");
        Handler fred = new LimitHandler("Fred", 300);

        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

        for (int i = 0; i < 500; i++) {
            Issue issue = new Issue(i);
            alice.handle(issue);
        }
    }
}
