package com.hakancivelek.singleton;

public class Singleton {
    private static int counter = 0;
    private String name;
    private static Singleton singleton = new Singleton();

    private Singleton() {
        counter++;
        name = "Singleton " + counter;
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public void printName() {
        System.out.println(name);
    }
}
