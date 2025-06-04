package com.hakancivelek.abstractFactory.sl1;

public class Test {
    public static void main(String[] args) {
        new Client(new ButtonFactory());
        new Client(new ListFactory());
        new Client(new TableFactory());
    }
}
