package com.gy.designpatterns.brige.example2;

public class Display {
    protected DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    public void open() {
        displayImpl.rawOpen();
    }
    public void print() {
        displayImpl.rawPrint();
    }
    public void close() {
        displayImpl.rawClose();
    }
    public final void display() {
        open();
        print();
        close();
    }

}
