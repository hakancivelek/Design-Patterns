package com.hakancivelek.prototype.one;

import com.hakancivelek.prototype.Artillery;

public class ArtilleryFactoryImplementation implements ArtilleryFactory {
    private static Artillery prototype = new Artillery("100mm", "black", "static");

    @Override
    public Artillery createArtilleryForCountryA() {
        Artillery artillery = prototype.clone();
        artillery.setCaliber("150mm");
        artillery.setColor("camouflage");
        artillery.setMobilityType("tracked");
        return artillery;
    }

    @Override
    public Artillery createArtilleryForCountryB() {
        Artillery artillery = prototype.clone();
        artillery.setCaliber("120mm");
        artillery.setColor("white");
        artillery.setMobilityType("mobile");
        return artillery;
    }
}
