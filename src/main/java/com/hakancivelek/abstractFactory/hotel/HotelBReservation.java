package com.hakancivelek.abstractFactory.hotel;

public class HotelBReservation implements Reservation{
    @Override
    public void info() {
        System.out.println( "Hotel B Reservation");
    }
}
