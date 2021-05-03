package com.gy.designpatterns.brige.example2;

public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void mutipleDisplay(int count) {
        open();
        for (int i = 0; i < count; i++) {
            displayImpl.rawPrint();
        }
        close();
    }
}
