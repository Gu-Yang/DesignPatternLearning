package com.gy.designpatterns.prototype.example.framework;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Product pen1 = new UnderlinePen('_');
        Product pen2 = new UnderlinePen('~');
        Product box1 = new MessageBox('*');
        Product box2 = new MessageBox('#');

        manager.register("underline message", pen1);
        manager.register("wavyline message", pen2);
        manager.register("aster box", box1);
        manager.register("well number box", box2);

        Product p1 = manager.create("underline message");
        p1.use("Hello, World!");
        Product p2 = manager.create("wavyline message");
        p2.use("Hello, World!");
        Product p3 = manager.create("aster box");
        p3.use("Hello, World!");
        Product p4 = manager.create("well number box");
        p4.use("Hello, World!");
    }
}
