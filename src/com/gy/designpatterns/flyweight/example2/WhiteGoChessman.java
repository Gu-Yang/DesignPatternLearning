package com.gy.designpatterns.flyweight.example2;

public class WhiteGoChessman extends GoChessman {
    public WhiteGoChessman() {
        super("White");
    }

    @Override
    public String getColor() {
        return color;
    }
}
