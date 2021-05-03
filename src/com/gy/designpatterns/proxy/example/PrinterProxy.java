package com.gy.designpatterns.proxy.example;

public class PrinterProxy implements Printable {

    private Printable realPrinter;
    private String name;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {
        if (realPrinter != null) {
            realPrinter.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        realPrinter.print(string);
    }

    private synchronized void realize() {
        if (realPrinter == null) {
            realPrinter = new Printer(name);
        }
    }

}
