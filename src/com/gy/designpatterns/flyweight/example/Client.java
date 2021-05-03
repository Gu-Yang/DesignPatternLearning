package com.gy.designpatterns.flyweight.example;

public class Client {
    public static void main(String[] args) {
        String string = "123450";
        BigString bigString = new BigString(string);
        bigString.print();
    }
}
