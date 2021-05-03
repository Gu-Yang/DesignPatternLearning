package com.gy.designpatterns.prototype.example.framework;

public interface Product extends Cloneable{

    public void use(String s);

    public Product cloneObject();
}
