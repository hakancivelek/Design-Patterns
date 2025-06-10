package com.hakancivelek.prototype.two;

import com.hakancivelek.prototype.Vehicle;

public class VehicleFactory implements CommonFactory<Vehicle> {

    private Vehicle prototype = new Vehicle("jeep", "green", "machine gun");

    @Override
    public Vehicle createForCountryA() {
        Vehicle vehicle = prototype.clone();
        vehicle.setColor("dark green");
        vehicle.setWeapon("cannon");
        return vehicle;
    }

    @Override
    public Vehicle createForCountryB() {
        Vehicle vehicle = prototype.clone();
        vehicle.setColor("white");
        vehicle.setWeapon("laser");
        return vehicle;
    }
}
