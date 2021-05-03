package com.gy.designpatterns.flyweight.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charName;
    private String fontdata;
    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("flyweightfile/big" + charName + ".txt")
            );
            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }
            reader.close();
            this.fontdata = buffer.toString();
        } catch (IOException e) {
            this.fontdata = charName + "?";
        }
    }

    public void print() {
        System.out.println(fontdata);
    }
}
