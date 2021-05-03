package com.gy.designpatterns.command.example2;

import java.awt.*;

public class ColorCommand implements Command {

    private Color color;
    protected Drawable drawable;

    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }

    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
