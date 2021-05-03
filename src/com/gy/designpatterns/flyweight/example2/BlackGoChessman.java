package com.gy.designpatterns.flyweight.example2;

public class BlackGoChessman extends GoChessman {

    public BlackGoChessman() {
        super("Black");
    }

    @Override
    public String getColor() {
        return color;
    }
}
