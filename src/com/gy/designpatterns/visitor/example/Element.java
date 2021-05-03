package com.gy.designpatterns.visitor.example;

public interface Element {
    void accept(Visitor visitor);
}
