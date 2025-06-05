package com.hakancivelek.abstractFactory.hotel;

public class HotelAFactory implements HotelFactory {
    @Override
    public Customer createCustomer() {
        return new HotelACustomer();
    }

    @Override
    public Payment createPayment() {
        return new HotelAPayment();
    }

    @Override
    public Reservation createReservation() {
        return new HotelAReservation();
    }

    @Override
    public Room createRoom() {
        return new HotelARoom();
    }
}
