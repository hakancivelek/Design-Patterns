package com.hakancivelek.abstractFactory.hotel;

public interface HotelFactory {
    Customer createCustomer();

    Payment createPayment();

    Reservation createReservation();

    Room createRoom();
}
