package com.gy.designpatterns.builder.example2;

public class Main {

    public static void main(String[] args) {

        // Build and show low configuration computer
        LowConfigComputerBuilder computeBuilder1 = new LowConfigComputerBuilder();
        ComputerDirector director1 = new ComputerDirector(computeBuilder1);
        director1.construct();
        Computer lowConfigComputer = computeBuilder1.getResult();
        System.out.println(lowConfigComputer.toString());

        // Build and show high configuration computer
        HighConfigComputerBuilder computeBuilder2 = new HighConfigComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(computeBuilder2);
        director2.construct();
        Computer highConfigComputer = computeBuilder2.getResult();
        System.out.println(highConfigComputer.toString());
    }
}
