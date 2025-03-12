package com.hakancivelek.singleton;

public class ThreadedLazySingletonClient extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new ThreadedLazySingletonClient().start();
        }
    }

    public void run() {
        ThreadedLazySingleton ls = ThreadedLazySingleton.getInstance();
        ls.printName();
    }
}
