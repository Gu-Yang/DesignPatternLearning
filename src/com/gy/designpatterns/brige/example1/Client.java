package com.gy.designpatterns.brige.example1;

public class Client {
    public static void main(String[] args) {
        LargeCupCoffee largeCupMilkCoffee = new LargeCupCoffee(new Milk());
        AbstractCoffee largeCupSugarCoffee = new LargeCupCoffee(new Sugar());

        largeCupSugarCoffee.orderCoffee();
        largeCupMilkCoffee.orderCoffee();
        System.out.println("======");
        largeCupMilkCoffee.orderMultipleCoffee(5);
    }
}
