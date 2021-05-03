package com.gy.designpatterns.memento.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<Fruit> fruits = new ArrayList<>();
    private Random random = new Random();

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金钱增加100");
        } else if (dice == 2) {
            money -= 100;
            System.out.println("所持金钱减少100");
        } else if (dice ==5) {
            money /= 2;
            System.out.println("所持金钱减半了");
        } else if (dice == 6) {
            money *= 2;
            System.out.println("所持金钱加倍了");
        } else if (dice ==4) {
            Fruit fruit = getFruit();
            fruits.add(fruit);
            System.out.println("获得了水果（" + fruit + "）");
        } else {
            System.out.println("什么都没有发生");
        }
    }
    public Memento createMemento() {
        Memento memento = new Memento(money);
        for (Fruit f : fruits) {
            memento.addFruit(f);
        }
        return memento;
    }
    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private Fruit getFruit() {
        return Fruit.values()[random.nextInt(Fruit.values().length)];
    }
}
