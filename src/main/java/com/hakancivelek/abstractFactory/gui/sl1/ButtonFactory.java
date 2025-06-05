package com.hakancivelek.abstractFactory.gui.sl1;

public class ButtonFactory implements GUIFactory {
    public Button create() {
        return new Button();
    }
}
