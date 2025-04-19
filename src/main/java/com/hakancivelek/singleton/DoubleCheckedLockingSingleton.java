package com.hakancivelek.singleton;

public class DoubleCheckedLockingSingleton {
    private static int counter = 0;
    private static DoubleCheckedLockingSingleton singleton;
    private String name;

    private DoubleCheckedLockingSingleton() {
        counter++;
        name = "DoubleCheckedLockingSingleton " + counter;
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return singleton;
    }

    public void printName(){
        System.out.println(name);
    }
}