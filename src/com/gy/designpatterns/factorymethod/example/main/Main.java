package com.gy.designpatterns.factorymethod.example.main;

import com.gy.designpatterns.factorymethod.example.concretecomponet.KeyboardFactory;
import com.gy.designpatterns.factorymethod.example.framework.Factory;
import com.gy.designpatterns.factorymethod.example.framework.Product;
import com.gy.designpatterns.factorymethod.example.concretecomponet.IdCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory idCardFactory = new IdCardFactory();
        Product idCard1 = idCardFactory.create();
        Product idCard2 = idCardFactory.create();
        Product idCard3 = idCardFactory.create();

//        Factory keyboardFactory = new KeyboardFactory();
//        Product keyboard1 = keyboardFactory.create();
//        Product keyboard2 = keyboardFactory.create();
//        Product keyboard3 = keyboardFactory.create();
//
//        Factory factory2 = new KeyboardFactory();
//        Product keyboard = factory2.createProduct();
//
        idCard2.use();
        for (Product product : idCardFactory.getProductList()) {
            product.use();
        }
//        keyboard1.use();
    }
}
