package com.hakancivelek.singleton;

public class LazySingleton {
    private static LazySingleton singleton;
    int counter;
    String name;

    private LazySingleton() {
        counter++;
        name = "LazySingleton" + counter;
    }

    public static LazySingleton getInstance() {
        if (singleton == null)
            singleton = new LazySingleton();
        return singleton;
    }

    public void printName() {
        System.out.println(name);
    }
}
