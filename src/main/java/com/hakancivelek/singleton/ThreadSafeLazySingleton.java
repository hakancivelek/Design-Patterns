package com.hakancivelek.singleton;

public class ThreadSafeLazySingleton {
    private static int counter;
    private String name;
    private static volatile ThreadSafeLazySingleton threadSafeLazySingleton;

    private ThreadSafeLazySingleton() {
        counter++;
        name = "ThreadSafeLazySingleton " + counter;
    }

    public static ThreadSafeLazySingleton getInstance() {
        synchronized (ThreadSafeLazySingleton.class) {
            if (threadSafeLazySingleton == null)
                threadSafeLazySingleton = new ThreadSafeLazySingleton();
            return threadSafeLazySingleton;
        }
    }

    public void printName() {
        System.out.println(name);
    }
}
