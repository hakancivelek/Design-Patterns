package com.hakancivelek.prototype.two;

import com.hakancivelek.prototype.Soldier;
import com.hakancivelek.prototype.Vehicle;

public class Test {
    public static void main(String[] args) {
        CommonFactory<Vehicle> vehicleFactory = new VehicleFactory();
        CommonFactory<Soldier> soldierFactory = new SoldierFactory();

        Vehicle vehicleA = vehicleFactory.createForCountryA();
        Vehicle vehicleB = vehicleFactory.createForCountryB();

        Soldier soldierA = soldierFactory.createForCountryA();
        Soldier soldierB = soldierFactory.createForCountryB();

        System.out.println(vehicleA);
        System.out.println(vehicleB);
        System.out.println(soldierA);
        System.out.println(soldierB);
    }
}
