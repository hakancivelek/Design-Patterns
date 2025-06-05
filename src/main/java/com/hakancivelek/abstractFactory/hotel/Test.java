package com.hakancivelek.abstractFactory.hotel;

public class Test {
    public static void main(String[] args) {
        HotelFactory factory = new HotelAFactory();
        Customer customer = factory.createCustomer();
        customer.info();
        Payment payment = factory.createPayment();
        payment.info();
        Reservation reservation = factory.createReservation();
        reservation.info();
        Room room = factory.createRoom();
        room.info();

        System.out.println("------------------");

        factory = new HotelBFactory();
        customer = factory.createCustomer();
        customer.info();
        payment = factory.createPayment();
        payment.info();
        reservation = factory.createReservation();
        reservation.info();
        room = factory.createRoom();
        room.info();
    }
}
