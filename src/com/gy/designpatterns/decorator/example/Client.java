package com.gy.designpatterns.decorator.example;

import java.io.*;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Display d1 = new SingleRowStringDisplay("Hello, World!");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBoard(d2);
        Display d4 = new FullBoard(new FullBoard(new SideBorder(d3, '$')));

        d1.show();
        d2.show();
        d3.show();
        d4.show();

        Reader reader = new LineNumberReader(
                new BufferedReader(
                        new FileReader("datafile.txt")
                )
        );

    }
}
