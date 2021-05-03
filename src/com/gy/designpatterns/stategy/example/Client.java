package com.gy.designpatterns.stategy.example;

public class Client {
    public static void main(String[] args) {

        int seed1 = 13;
        int seed2 = 3871;

        Player player1 = new Player("Taro", new ArroganceStrategy(seed1));
        Player player2 = new Player("Hana", new WinningStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand1.isWeakThan(nextHand2)) {
                System.out.println("Winner: " + player2);
                player2.win();
                player1.lose();
            } else {
                System.out.println("Draw...");
                player1.draw();
                player2.draw();
            }
        }
        System.out.println("Total Result:");
        System.out.println(player1);
        System.out.println(player2);
    }
}
