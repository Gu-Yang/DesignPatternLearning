package com.gy.designpatterns.brige.example1;

public abstract class AbstractCoffee {
    protected Additive additive;

    public AbstractCoffee(Additive additive) {
        this.additive = additive;
    }

    public abstract void orderCoffee();
}
