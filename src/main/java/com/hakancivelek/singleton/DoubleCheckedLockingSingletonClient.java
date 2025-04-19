package com.hakancivelek.singleton;

public class DoubleCheckedLockingSingletonClient extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            new DoubleCheckedLockingSingletonClient().start();
        }
    }

    public void run() {
        DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
        singleton.printName();
    }
}

