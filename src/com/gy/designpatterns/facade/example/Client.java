package com.gy.designpatterns.facade.example;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
