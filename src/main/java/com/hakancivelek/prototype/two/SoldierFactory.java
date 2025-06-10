package com.hakancivelek.prototype.two;

import com.hakancivelek.prototype.Soldier;

public class SoldierFactory implements CommonFactory<Soldier> {

    private Soldier prototype = new Soldier("green", "uniformA", "rifle");

    @Override
    public Soldier createForCountryA() {
        Soldier soldier = prototype.clone();
        soldier.setColor("dark green");
        soldier.setOutfit("camouflage");
        soldier.setWeapon("sniper");
        return soldier;
    }

    @Override
    public Soldier createForCountryB() {
        Soldier soldier = prototype.clone();
        soldier.setColor("white");
        soldier.setOutfit("desert");
        soldier.setWeapon("pistol");
        return soldier;
    }
}

