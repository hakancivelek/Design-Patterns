package com.hakancivelek.prototype.one;

import com.hakancivelek.prototype.Vehicle;

public class Test {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactoryImplementation();

        Vehicle vehicleA = factory.createVehicleForCountryA();
        Vehicle vehicleB = factory.createVehicleForCountryB();

        System.out.println("Country A Vehicle: " + vehicleA);
        System.out.println("Country B Vehicle: " + vehicleB);

        System.out.println("\nAre they different instances? " + (vehicleA != vehicleB));

        Vehicle prototype = new Vehicle("jeep", "green", "machine gun");
        System.out.println("\nPrototype (fresh): " + prototype);

        System.out.println("\nDoes prototype type differ from vehicle A? " + !prototype.getType().equals(vehicleA.getType()));
        System.out.println("Does prototype type differ from vehicle B? " + !prototype.getType().equals(vehicleB.getType()));
    }

}
