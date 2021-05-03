package com.gy.designpatterns.adapter.example2;

public class Main {

    public static void main(String[] args) {
        PrintBanner pb = new PrintBanner(new Banner("test example2"));
        pb.printStrong();
        pb.printWeak();
    }
}
