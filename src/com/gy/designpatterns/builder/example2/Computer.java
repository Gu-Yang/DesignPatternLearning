package com.gy.designpatterns.builder.example2;

public class Computer {
    private String cpu;
    private String memory;
    private String storage;
    private String os;
    private String graphics;
    private boolean hasGraphics;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public void setHasGraphics(boolean hasGraphics) {
        this.hasGraphics = hasGraphics;
    }

    public boolean hasGraphics() {
        return this.hasGraphics;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", storage='" + storage + '\'' +
                ", os='" + os + '\'');
        if (hasGraphics == true) {
            sb.append(", graphics='" + graphics + '\'');
        }
        sb.append('}');
        return sb.toString();

    }
}
