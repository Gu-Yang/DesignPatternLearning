package com.gy.designpatterns.builder.example2;

public class HighConfigComputerBuilder extends AbstractComputerBuilder{

    private Computer computer;

    public HighConfigComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("i9");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("16G");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1T");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows 10");
    }

    @Override
    public void buildGraphics() {
        computer.setHasGraphics(true);
        computer.setGraphics("GTX3080");
    }

    @Override
    public boolean hasGraphics() {
        return true;
    }

    public Computer getResult() {
        return computer;
    }
}
