package com.gy.designpatterns.chainofresponsibility.example;

public class LimitHandler extends Handler {

    private int limit;

    public LimitHandler(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Issue issue) {
        if (issue.getNumber() < limit) {
            System.out.println("LimitHandler " + this + " is handling " + issue.toString());
            return true;
        }
        return false;
    }
}
