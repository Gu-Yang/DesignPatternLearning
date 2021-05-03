package com.gy.designpatterns.memento.example;

public class Client {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(500);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("==== step " + (i+1));
            System.out.println("当前状态：" + gamer);

            gamer.bet();

            System.out.println("所持金钱为 " + gamer.getMoney() + " 元");
            // 决定如何处理
            if (gamer.getMoney() > memento.getMoney()) {
                memento = gamer.createMemento();
                System.out.println(" （所持金钱增加了，保存游戏状态）");
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                gamer.restoreMemento(memento);
                System.out.println("（所持金钱减少了许多，恢复至以前的游戏状态）");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
