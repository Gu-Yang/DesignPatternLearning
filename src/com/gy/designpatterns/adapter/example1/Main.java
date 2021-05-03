package com.gy.designpatterns.adapter.example1;

public class Main {

    public static void main(String[] args) {
        PrintBanner pb = new PrintBanner("test example1");
        pb.printStrong();
        pb.printWeak();
    }
}
