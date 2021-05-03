package com.gy.designpatterns.builder.example2;

public class ComputerDirector {

    private AbstractComputerBuilder computerBuilder;

    public ComputerDirector(AbstractComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void construct() {
        computerBuilder.buildCpu();
        computerBuilder.buildMemory();
        computerBuilder.buildStorage();
        computerBuilder.buildOs();
        if (computerBuilder.hasGraphics()) {
            computerBuilder.buildGraphics();
        }
    }

}
