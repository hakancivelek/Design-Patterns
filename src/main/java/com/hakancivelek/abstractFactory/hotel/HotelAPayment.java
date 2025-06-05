package com.hakancivelek.abstractFactory.hotel;

public class HotelAPayment implements Payment{
    @Override
    public void info() {
        System.out.println( "Hotel A Payment");
    }
}
