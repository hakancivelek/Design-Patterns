package com.hakancivelek.abstractFactory.sl2;

public class Client {

    public Client(GUIFactoryImpl guiFactory) {
        Component button = guiFactory.createButton();

        Component list = guiFactory.createList();

        Component table = guiFactory.createTable();
    }
}
