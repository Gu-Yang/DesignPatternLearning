package com.gy.designpatterns.stategy.example;

import java.text.NumberFormat;

public class Player {
    private String name;
    private Strategy stategy;
    private int winCount;
    private int drawCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy stategy) {
        this.name = name;
        this.stategy = stategy;
    }

    public Hand nextHand() {
        return stategy.nextHand();
    }

    public void win() {
        stategy.study(true);
        winCount++;
        gameCount++;
    }
    public void draw() {
        drawCount++;
        gameCount++;
    }
    public void lose() {
        stategy.study(false);
        loseCount++;
        gameCount++;
    }

    @Override
    public String toString() {

        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置精确到小数点后2位
        numberFormat.setMaximumFractionDigits(2);
        String winRate = numberFormat.format(((float)winCount/(float)gameCount) * 100);

        return "[" + name + ": " + gameCount + " games, " + winCount + " win, " + drawCount + " draw, " + loseCount + " lose, " + winRate + "% win rate]";
    }
}
