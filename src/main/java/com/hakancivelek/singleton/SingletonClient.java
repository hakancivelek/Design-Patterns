package com.hakancivelek.singleton;

public class SingletonClient {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Singleton singleton = Singleton.getInstance();

            singleton.printName();
        }

        Singleton singleton1 = Singleton.getInstance();
        System.out.println("\nHashcode: " + singleton1.hashCode());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("\nHashcode: " + singleton2.hashCode());

        if (singleton1 == singleton2)
            System.out.println("\nThe same object!");
        else
            System.out.println("Different objects!");
    }
}
