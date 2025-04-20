package com.hakancivelek.singleton;

public class BillPughSingleton {
    private int counter = 0;
    private static String name;

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    private BillPughSingleton() {
        counter++;
        name = "BillPughSingleton " + counter;
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void printName() {
        System.out.println(name);
    }
}
