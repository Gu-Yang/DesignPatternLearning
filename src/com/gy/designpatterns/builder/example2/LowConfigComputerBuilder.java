package com.gy.designpatterns.builder.example2;

public class LowConfigComputerBuilder extends AbstractComputerBuilder{

    private Computer computer;

    public LowConfigComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("i5");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("8G");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("500g");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows 10");
    }

    @Override
    public void buildGraphics() {
        computer.setGraphics(null);
    }

    @Override
    public boolean hasGraphics() {
        return false;
    }
    public Computer getResult() {
        return computer;
    }
}
