package com.gy.designpatterns.flyweight.example2;

public class Client {
    public static void main(String[] args) {
        GoChessmanFactory factory = GoChessmanFactory.getInstance();
        GoChessman black1 = factory.getGoChessman("Black");
        GoChessman black2 = factory.getGoChessman("Black");
        GoChessman black3 = factory.getGoChessman("Black");

        GoChessman white1 = factory.getGoChessman("White");
        GoChessman white2 = factory.getGoChessman("White");
        GoChessman white3 = factory.getGoChessman("White");

        black1.display(1, 2);
        white1.display(3,5);
        black2.display(3,4);
        white2.display(1,3);
        black3.display(5,4);
        white3.display(5,5);

    }
}
