package com.gy.designpatterns.brige.example1;

public class LargeCupCoffee extends AbstractCoffee{
    public LargeCupCoffee(Additive additive) {
        super(additive);
    }

    @Override
    public void orderCoffee() {
        System.out.println("Prepare large cup coffee...");
        additive.add();
    }

    public void orderMultipleCoffee(int count) {
        for (int i = 0; i < count; i++) {
            orderCoffee();
        }
    }
}
