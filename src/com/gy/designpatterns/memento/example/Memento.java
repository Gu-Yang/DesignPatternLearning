package com.gy.designpatterns.memento.example;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    private int money;
    private ArrayList<Fruit> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    List<Fruit> getFruits() {
        return (ArrayList<Fruit>) fruits.clone();
    };

}
