package com.hakancivelek.singleton.enumuration;

public enum EnumSingleton {
    SINGLETON;

    private EnumSingleton() {
        System.out.println("in EnumSingleton");
    }

    public static EnumSingleton getInstance() {
        return SINGLETON;
    }
}
