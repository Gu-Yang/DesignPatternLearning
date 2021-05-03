package com.gy.designpatterns.factorymethod.example.concretecomponet;

import com.gy.designpatterns.factorymethod.example.framework.Factory;
import com.gy.designpatterns.factorymethod.example.framework.Product;

public class IdCardFactory extends Factory {

    @Override
    protected Product createProduct() {
        Product product = new IdCard();
        System.out.println("Id card created!");
        return product;
    }

    @Override
    protected boolean validateProduct(Product product) {
        return product.validate();
    }

    @Override
    protected void registerProduct(Product product) {
        int serial = createSerial();
        product.setSerialNum(serial);
        getProductList().add(product);
        System.out.println("Id card " + serial + " was registered!");
    }

    private int createSerial() {
        return (int) (Math.random() * 1000000);
    }
}
