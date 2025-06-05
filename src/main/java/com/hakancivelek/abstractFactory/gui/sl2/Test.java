package com.hakancivelek.abstractFactory.gui.sl2;

public class Test {
    public static void main(String[] args) {
        new Client(new GUIFactoryImpl());
        GUIFactoryImpl factory = new GUIFactoryImpl();
        Client client = new Client(factory);
    }
}
