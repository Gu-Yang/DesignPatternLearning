package com.gy.designpatterns.chainofresponsibility.example;

public abstract class Handler {
    private String name;
    private Handler next;

    public Handler(String name) {
        this.name = name;
    }

    public Handler setNext(Handler handler) {
        this.next = handler;
        return next;
    }
    public final void handle(Issue issue) {
        if (resolve(issue)) {
            done(issue);
        } else if (next != null) {
            next.handle(issue);
        } else {
            fail(issue);
        }
    }

    protected abstract boolean resolve(Issue issue);
    private void done(Issue issue) {
        System.out.println(issue + " is resolved by handler " + this + ".");
    }
    private void fail(Issue issue) {
        System.out.println(issue + " cannot be resolved");
    }

    public String toString() {
        return "[" + name + "]";
    }

}
