package com.hakancivelek.abstractFactory.hotel;

public class HotelBFactory implements HotelFactory{
    @Override
    public Customer createCustomer() {
        return new HotelBCustomer();
    }

    @Override
    public Payment createPayment() {
        return new HotelBPayment();
    }

    @Override
    public Reservation createReservation() {
        return new HotelBReservation();
    }

    @Override
    public Room createRoom() {
        return new HotelBRoom();
    }
}
