package com.hakancivelek.singleton;

public class ThreadedLazySingleton {
    private static ThreadedLazySingleton threadedLazySingleton;
    private static int counter;
    private String name;

    private ThreadedLazySingleton() {
        counter++;
        name = "ThreadedLazySingleton " + counter;
    }

    public static ThreadedLazySingleton getInstance() {
        if (threadedLazySingleton == null)
            threadedLazySingleton = new ThreadedLazySingleton();
        return threadedLazySingleton;
    }

    public void printName() {
        System.out.println(name);
    }
}
