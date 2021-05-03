package com.gy.designpatterns.builder.example;

public interface Builder {
    void makeTitle(String title);
    void makeString(String s);
    void makeItems(String[] items);
    void close();
}
