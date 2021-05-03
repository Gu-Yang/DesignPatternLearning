package com.gy.designpatterns.chainofresponsibility.example;

public class NoHandler extends Handler {

    public NoHandler(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Issue issue) {
        return false;
    }
}
