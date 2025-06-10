package com.hakancivelek.prototype.one;

import com.hakancivelek.prototype.Soldier;

public class SoldierFactoryImplementation implements SoldierFactory {
    private static final Soldier prototype = new Soldier("green", "standard", "rifle");

    @Override
    public Soldier createSoldierForCountryA() {
        Soldier soldier = prototype.clone();
        soldier.setColor("dark green");
        soldier.setOutfit("camouflage");
        soldier.setWeapon("assault rifle");
        return soldier;
    }

    @Override
    public Soldier createSoldierForCountryB() {
        Soldier soldier = prototype.clone();
        soldier.setColor("tan");
        soldier.setOutfit("desert gear");
        soldier.setWeapon("sniper rifle");
        return soldier;
    }
}
