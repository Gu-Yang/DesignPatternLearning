package com.gy.designpatterns.command.example2;

import java.awt.*;

public interface Drawable {
    public void draw(int x, int y);
    public void init();
    public void setColor(Color color);
}
