package com.hakancivelek.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    int counter = 0;
    String name;

    private LazySingleton() {
        counter++;
        name = "LazySingleton" + counter;
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
