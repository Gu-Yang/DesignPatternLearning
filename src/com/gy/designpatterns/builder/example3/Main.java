package com.gy.designpatterns.builder.example3;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Tom", "Male")
                .age("22")
                .shoes("FILA")
                .car("Benz")
                .build();

        System.out.println(person);
    }
}
