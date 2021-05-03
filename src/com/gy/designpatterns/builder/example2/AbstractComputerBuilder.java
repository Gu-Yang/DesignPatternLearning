package com.gy.designpatterns.builder.example2;

public abstract class AbstractComputerBuilder {

    public abstract void buildCpu();
    public abstract void buildMemory();
    public abstract void buildStorage();
    public abstract void buildOs();
    public abstract void buildGraphics();
    public abstract boolean hasGraphics();
}
