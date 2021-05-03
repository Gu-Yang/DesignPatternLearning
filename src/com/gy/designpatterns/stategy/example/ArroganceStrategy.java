package com.gy.designpatterns.stategy.example;

import java.util.Random;

public class ArroganceStrategy implements Strategy {

    private Random random;
    private boolean won;
    private Hand prevHand;

    public ArroganceStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        } else {
            Hand currentHand = null;
            while(prevHand != currentHand) {
                currentHand = Hand.getHand(random.nextInt(3));
            }
            prevHand = currentHand;
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
