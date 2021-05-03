package com.gy.designpatterns.chainofresponsibility.example;

public class SpecialHandler extends Handler {
    private int number;

    public SpecialHandler(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Issue issue) {
        if (issue.getNumber() == number) {
            System.out.println("SpecialHandler " + this + " is handling " + issue.toString());
            return true;
        }
        return false;
    }
}
