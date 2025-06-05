package com.hakancivelek.abstractFactory.hotel;

public class HotelBPayment implements Payment{
    @Override
    public void info() {
        System.out.println( "Hotel B Payment");
    }
}
