package com.gy.designpatterns.factorymethod.example.framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Factory {

    private List<Product> productList = new ArrayList<>();

    public Product create() {
        Product product = createProduct();
        if (validateProduct(product)) {
            registerProduct(product);
            return product;
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    protected abstract Product createProduct();
    protected abstract boolean validateProduct(Product product);
    protected abstract void registerProduct(Product product);

}
