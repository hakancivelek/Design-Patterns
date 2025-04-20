package com.hakancivelek.singleton;

public class BillPughSingletonClient {
    public static void main(String[] args) {
        for(int i = 0; i < 200; i++){
            BillPughSingleton singleton = BillPughSingleton.getInstance();
            singleton.printName();
        }
    }
}
