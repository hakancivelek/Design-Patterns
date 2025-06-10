package com.hakancivelek.prototype.two;

import com.hakancivelek.prototype.Artillery;

public class ArtilleryFactory implements CommonFactory<Artillery> {

    private Artillery prototype = new Artillery("100mm", "black", "static");

    @Override
    public Artillery createForCountryA() {
        Artillery artillery = prototype.clone();
        artillery.setCaliber("100mm");
        artillery.setColor("black");
        artillery.setMobilityType("static");
        return artillery;
    }

    @Override
    public Artillery createForCountryB() {
        Artillery artillery = prototype.clone();
        artillery.setCaliber("120mm");
        artillery.setColor("white");
        artillery.setMobilityType("mobile");
        return artillery;
    }
}
