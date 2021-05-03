package com.gy.designpatterns.visitor.example;

public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public void add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
