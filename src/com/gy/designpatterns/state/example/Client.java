package com.gy.designpatterns.state.example;

public class Client {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while(true) {
            for (int hour = 1; hour < 24; hour++) {
                frame.setClock(hour); // 设置时间
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
