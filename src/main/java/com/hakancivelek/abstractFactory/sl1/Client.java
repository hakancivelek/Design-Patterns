package com.hakancivelek.abstractFactory.sl1;

public class Client {
    GUIFactoryImpl guiFactory;

    public Client(GUIFactoryImpl guiFactory) {
        Component button = guiFactory.createButton();
        button.paint();

        Component list = guiFactory.createList();
        list.paint();

        Component table = guiFactory.createTable();
        table.paint();
    }
}
