package com.gy.designpatterns.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

public class GoChessmanFactory {
    private static GoChessmanFactory factory = new GoChessmanFactory();
    private Map<String, GoChessman> goChessmanMap = new HashMap<>();
    private GoChessmanFactory() {
        GoChessman blackGoChessman = new BlackGoChessman();
        GoChessman whiteGoChessman = new WhiteGoChessman();
        goChessmanMap.put("Black", blackGoChessman);
        goChessmanMap.put("White", whiteGoChessman);
    }

    public static GoChessmanFactory getInstance() {
        return factory;
    }

    public GoChessman getGoChessman(String key) {
        return goChessmanMap.get(key);
    }
}
