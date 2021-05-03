package com.gy.designpatterns.chainofresponsibility.example;

public class Issue {
    private int number;  //问题编号
    public Issue(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public String toString() {
        return "[Issue " + number + "]";
    }
}
