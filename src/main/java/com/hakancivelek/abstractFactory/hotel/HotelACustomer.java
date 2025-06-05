package com.hakancivelek.abstractFactory.hotel;

public class HotelACustomer implements Customer{
    @Override
    public void info() {
        System.out.println( "Hotel A Customer");
    }
}
