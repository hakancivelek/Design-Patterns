package com.hakancivelek.abstractFactory.gui.sl3;

public class Client {
    public Client(GUIFactory factory) {
        Component button = factory.createButton();
        button.paint();

        Component list = factory.createList();
        list.paint();
        
        Component table = factory.createTable();
        table.paint();
    }
}
