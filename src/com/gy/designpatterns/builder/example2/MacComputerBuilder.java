package com.gy.designpatterns.builder.example2;

public class MacComputerBuilder extends AbstractComputerBuilder{

    private Computer computer;

    public MacComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("M1");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("8G");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("256G");
    }

    @Override
    public void buildOs() {
        computer.setOs("MacOS");
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
