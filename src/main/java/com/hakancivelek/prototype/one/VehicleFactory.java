package com.hakancivelek.prototype.one;

import com.hakancivelek.prototype.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicleForCountryA();

    Vehicle createVehicleForCountryB();
}