package com.gy.designpatterns.prototype.example.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String, Product> objectMap = new HashMap<>();

    public void register(String prototypeName, Product product) {
        objectMap.put(prototypeName, product);
    }

    public Product create(String prototypeName) {
        Product product = objectMap.get(prototypeName);
        if (product != null) {
            return product.cloneObject();
        }
        return null;
    }

}
