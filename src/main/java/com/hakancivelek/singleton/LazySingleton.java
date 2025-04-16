package com.hakancivelek.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    private static int counter;
    private String name;

    private LazySingleton() {
        counter++;
        name = "LazySingleton " + counter;
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }

    public void printName() {
        System.out.println(name);
    }
}
