package com.gy.designpatterns.visitor.example;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Entry rootdir = new Directory("root");
            Entry bindir = new Directory("bin");
            Entry tmpdir = new Directory("tmp");
            Entry usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            tmpdir.add(new File("db.cache", 550));

            rootdir.accept(new ListVisitor());
            System.out.println("---------------------------------------------");
            rootdir.accept(new HighlightListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
