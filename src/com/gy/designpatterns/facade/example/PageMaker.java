package com.gy.designpatterns.facade.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {

    }
    public static void makeWelcomePage(String mailAddr, String filename) {
        Properties mailProps = Database.getProperties("maildata");
        String username = mailProps.getProperty(mailAddr);
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(" Waiting for your mail!");
            writer.mailto(mailAddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
