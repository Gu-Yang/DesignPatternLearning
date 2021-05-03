package com.gy.designpatterns.proxy.example;

public class Client {
    public static void main(String[] args) {
        Printable printer = new PrinterProxy("GY's Printer");
        System.out.println("当前的打印机名称是： " + printer.getPrinterName() + "。");
        printer.setPrinterName("Grant's Printer");
        System.out.println("当前的打印机名称是： " + printer.getPrinterName() + "。");
        printer.print("Hello, World!");
    }
}
