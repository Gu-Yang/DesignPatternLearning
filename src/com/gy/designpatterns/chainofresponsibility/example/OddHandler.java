package com.gy.designpatterns.chainofresponsibility.example;

public class OddHandler extends Handler {
    public OddHandler(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Issue issue) {
        if (issue.getNumber() % 2 == 1) {
            System.out.println("OddHandler " + this + " is handling " + issue.toString());
            return true;
        }
        return false;
    }
}
