package com.gy.designpatterns.factorymethod.example.concretecomponet;

import com.gy.designpatterns.factorymethod.example.framework.Product;

public class Keyboard extends Product{

    @Override
    public void use() {
        System.out.println("Keyboard " + getSerialNum() + " used!");
    }

    @Override
    public boolean validate() {
        System.out.println("Keyboard validated!");
        return true;
     }
}
