package com.hakancivelek.singleton.enumuration;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.getInstance();
        EnumSingleton singleton2 = EnumSingleton.SINGLETON;

        if (singleton1 == singleton2){
            System.out.println("Same objects!");
        } else {
            System.out.println("Different objects!");
        }
    }
}
