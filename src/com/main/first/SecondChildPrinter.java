package com.main.first;

public class SecondChildPrinter extends Printer {

    @Override
    protected void print(String value) {
        System.out.println("\u001B[32m" + value + "\u001B[0m");
    }
}
