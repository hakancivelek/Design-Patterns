package com.hakancivelek.prototype.one;

import com.hakancivelek.prototype.Soldier;

public interface SoldierFactory {
    Soldier createSoldierForCountryA();

    Soldier createSoldierForCountryB();
}
