package com.hakancivelek.abstractFactory.gui.sl1;

public class ListFactory implements GUIFactory{
    @Override
    public Component create() {
        return new List();
    }
}
