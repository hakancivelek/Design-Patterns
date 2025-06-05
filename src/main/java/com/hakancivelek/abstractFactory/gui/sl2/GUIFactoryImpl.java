package com.hakancivelek.abstractFactory.gui.sl2;

public class GUIFactoryImpl implements GUIFactory {
    @Override
    public Component createButton() {
        return new Button();
    }

    @Override
    public Component createList() {
        return new List();
    }

    @Override
    public Component createTable() {
        return new Table();
    }
}
