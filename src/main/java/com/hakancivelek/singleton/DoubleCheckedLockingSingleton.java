package com.hakancivelek.singleton;

public class DoubleCheckedLockingSingleton {
    //	private static DoubleCheckedLockingSingleton singleton;
    private static volatile DoubleCheckedLockingSingleton singleton;

    private static int count;
    private String name;

    private DoubleCheckedLockingSingleton() {
        name = "DoubleCheckedLockingSingleton" + count;
        count++;
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

    public void printName() {
        System.out.println(name);
    }
}