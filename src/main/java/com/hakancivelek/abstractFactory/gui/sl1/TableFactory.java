package com.hakancivelek.abstractFactory.gui.sl1;

public class TableFactory implements GUIFactory {
    @Override
    public Component create() {
        return new Table();
    }
}
