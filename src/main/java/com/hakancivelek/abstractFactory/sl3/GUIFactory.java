package com.hakancivelek.abstractFactory.sl3;

public interface GUIFactory {
    Component createButton();

    Component createList();

    Component createTable();
}
