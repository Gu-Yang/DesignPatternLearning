package com.gy.designpatterns.prototype.example.framework;

public class MessageBox implements Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }
    @Override
    public void use(String s) {
        int length = s.length();

        printdecoLine(length + 4);
        System.out.println(decochar + " " + s + " " + decochar);
        printdecoLine(length + 4);

    }

    @Override
    public Product cloneObject(){

        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }

    private void printdecoLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

}
