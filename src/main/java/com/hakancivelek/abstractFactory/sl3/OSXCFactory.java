package com.hakancivelek.abstractFactory.sl3;

public class OSXCFactory implements GUIFactory {
    @Override
    public Component createButton() {
        return new OSXButton();
    }

    @Override
    public Component createList() {
        return new OSXList();
    }

    @Override
    public Component createTable() {
        return new OSXTable();
    }
}
