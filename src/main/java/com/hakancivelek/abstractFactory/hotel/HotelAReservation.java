package com.hakancivelek.abstractFactory.hotel;

public class HotelAReservation implements Reservation{
    @Override
    public void info() {
        System.out.println( "Hotel A Reservation");
    }
}
