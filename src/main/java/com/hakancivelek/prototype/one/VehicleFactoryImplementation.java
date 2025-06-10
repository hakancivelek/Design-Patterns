package com.hakancivelek.prototype.one;

import com.hakancivelek.prototype.Vehicle;

public class VehicleFactoryImplementation implements VehicleFactory {
    private static final Vehicle prototype = new Vehicle("jeep", "green", "machine gun");

    @Override
    public Vehicle createVehicleForCountryA() {
        Vehicle vehicle = prototype.clone();
        vehicle.setType("armored car");
        vehicle.setColor("dark green");
        vehicle.setWeapon("grenade launcher");
        return vehicle;
    }

    @Override
    public Vehicle createVehicleForCountryB() {
        Vehicle vehicle = prototype.clone();
        vehicle.setType("tank");
        vehicle.setColor("desert yellow");
        vehicle.setWeapon("120mm cannon");
        return vehicle;
    }
}
