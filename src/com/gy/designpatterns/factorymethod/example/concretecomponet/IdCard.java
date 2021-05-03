package com.gy.designpatterns.factorymethod.example.concretecomponet;

import com.gy.designpatterns.factorymethod.example.framework.Product;

public class IdCard extends Product {

    @Override
    public void use() {
        System.out.println("Id card " + getSerialNum() + " used!");
    }

    @Override
    public boolean validate() {
        System.out.println("Id card validated!");
        return true;
    }
}
