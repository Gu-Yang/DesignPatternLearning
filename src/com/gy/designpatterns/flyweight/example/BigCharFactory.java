package com.gy.designpatterns.flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private static BigCharFactory singleton = new BigCharFactory();
    private static Map<Character, BigChar> bigCharMap = new HashMap<>();

    private BigCharFactory() {}

    public static BigCharFactory getInstance() {
        return singleton;
    }

    public synchronized BigChar getBigChar(char charName) {
        BigChar bc = bigCharMap.get(charName);
        if (bc == null) {
            bc = new BigChar(charName);
            bigCharMap.put(charName, bc);
        }
        return bc;
    }

}
