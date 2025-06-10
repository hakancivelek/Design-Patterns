package com.hakancivelek.prototype;

public class Artillery implements Cloneable {
    private String caliber;
    private String color;
    private String mobilityType;

    public Artillery(String caliber, String color, String mobilityType) {
        this.caliber = caliber;
        this.color = color;
        this.mobilityType = mobilityType;
    }

    @Override
    public Artillery clone() {
        Artillery artillery = null;
        try {
            artillery = (Artillery) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
            e.printStackTrace();
        }
        return artillery;
    }

    @Override
    public String toString() {
        return "Artillery [caliber = " + caliber + ", color = " + color + ", mobilityType = " + mobilityType + "]";
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMobilityType(String mobilityType) {
        this.mobilityType = mobilityType;
    }
}

