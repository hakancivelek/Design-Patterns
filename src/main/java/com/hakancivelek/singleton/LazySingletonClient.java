package com.hakancivelek.singleton;

public class LazySingletonClient {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            LazySingleton lazySingleton = LazySingleton.getInstance();

            lazySingleton.printName();
        }

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println("\nHashcode: " + lazySingleton1.hashCode());

        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("\nHashcode: " + lazySingleton2.hashCode());

        if (lazySingleton1 == lazySingleton2)
            System.out.println("\nThe same object!");
        else
            System.out.println("Different objects!");
    }
}
