package com.gy.designpatterns.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private String name;
    private List<Entry> entries = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : entries) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : entries) {
            entry.printList(prefix + "/" + name);
        }
    }

    @Override
    public void add(Entry entry) {
        entries.add(entry);
    }
}
