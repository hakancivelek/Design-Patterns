package com.hakancivelek.singleton;

public class LazySingletonClient {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            LazySingleton s = LazySingleton.getInstance();
            s.printName();
        }
    }
}
