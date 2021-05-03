package com.gy.designpatterns.stategy.example;

public enum Hand {

    SHITOU(0, "石头"),
    JIANDAO(1, "剪刀"),
    BU(2, "布");

    int value;
    String name;

    Hand(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Hand getHand(int value) {
        for (Hand hand : values()) {
            if (hand.value == value ) {
                return hand;
            }
        }
        return null;
    }

    public boolean isStrongerThan(Hand hand) {
        return this.fight(hand) == 1;
    }
    public boolean isWeakThan(Hand hand) {
        return this.fight(hand) == -1;
    }

    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.value + 1) % 3 == hand.value){
            return 1;
        } else {
            return -1;
        }
    }
}
