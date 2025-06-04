package com.hakancivelek.abstractFactory.sl1;

public class ButtonFactory implements GUIFactory {
    public Button create() {
        return new Button();
    }
}
