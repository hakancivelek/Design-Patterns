package com.hakancivelek.abstractFactory.gui.sl3;

public class WinFactory implements GUIFactory {
    @Override
    public Component createButton() {
        return new WinButton();
    }

    @Override
    public Component createList() {
        return new WinList();
    }

    @Override
    public Component createTable() {
        return new WinTable();
    }
}
