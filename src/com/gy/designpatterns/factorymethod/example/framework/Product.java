package com.gy.designpatterns.factorymethod.example.framework;

public abstract class Product {

    private int serialNum;

    public int getSerialNum() {
        return serialNum;
    }
    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public abstract void use();
    public abstract boolean validate();
}
