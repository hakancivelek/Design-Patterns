package com.hakancivelek.abstractFactory.hotel;

public class HotelBCustomer implements Customer{
    @Override
    public void info() {
        System.out.println( "Hotel B Customer");
    }
}
