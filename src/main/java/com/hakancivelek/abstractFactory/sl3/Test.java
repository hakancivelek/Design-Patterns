package com.hakancivelek.abstractFactory.sl3;

public class Test {
    public static void main(String[] args) {
        new Client(new OSXCFactory());
        System.out.println("----------------------");
        new Client(new WinFactory());
    }
}
