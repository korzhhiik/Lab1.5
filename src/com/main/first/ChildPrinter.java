package com.main.first;

public class ChildPrinter extends Printer {

    @Override
    protected void print(String value) {
        System.out.println("\u001B[41m" + value + "\u001B[0m");
    }
}
