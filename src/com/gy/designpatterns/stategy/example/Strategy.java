package com.gy.designpatterns.stategy.example;

public interface Strategy {
    public Hand nextHand();
    public void study(boolean win);
}
