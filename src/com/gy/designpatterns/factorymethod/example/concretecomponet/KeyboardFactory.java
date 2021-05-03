package com.gy.designpatterns.factorymethod.example.concretecomponet;

import com.gy.designpatterns.factorymethod.example.framework.Factory;
import com.gy.designpatterns.factorymethod.example.framework.Product;

public class KeyboardFactory extends Factory{

    @Override
    protected Product createProduct() {
        Product product = new Keyboard();
        System.out.println("Keyboard created!");
        return product;
    }

    @Override
    protected boolean validateProduct(Product product) {
        System.out.println("Keyboard validated!");
        return true;
    }

    @Override
    protected void registerProduct(Product product) {
        int serial = createSerial();
        product.setSerialNum(serial);
        getProductList().add(product);
        System.out.println("Keyboard " + serial + " was registered!");
    }

    private int createSerial() {
        return (int) (Math.random() * 1000000);
    }
}
