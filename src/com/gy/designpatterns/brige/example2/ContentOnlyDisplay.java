package com.gy.designpatterns.brige.example2;

public class ContentOnlyDisplay extends Display {
    public ContentOnlyDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void contentOnlyDisplay() {
        displayImpl.rawPrint();
    }

}
