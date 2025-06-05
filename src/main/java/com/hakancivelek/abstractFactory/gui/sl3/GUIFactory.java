package com.hakancivelek.abstractFactory.gui.sl3;

public interface GUIFactory {
    Component createButton();

    Component createList();

    Component createTable();
}
