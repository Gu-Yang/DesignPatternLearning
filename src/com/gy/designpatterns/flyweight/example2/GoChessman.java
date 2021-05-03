package com.gy.designpatterns.flyweight.example2;

public abstract class GoChessman {
    protected String color;
    private String shape = "Round";
    private int size = 2;

    public GoChessman(String color) {
        this.color = color;
    }

    public abstract String getColor();

    public void display(int xPosition, int yPosition) {
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + "(" + xPosition + ", " + yPosition + ")" );
    }
}
