package com.hakancivelek.prototype;

public class Vehicle implements Cloneable {
    private String type; // örn: "jeep", "tank"
    private String color;
    private String weapon;

    public Vehicle(String type, String color, String weapon) {
        this.type = type;
        this.color = color;
        this.weapon = weapon;
    }

    @Override
    public Vehicle clone() {
        Vehicle vehicle = null;
        try {
            vehicle = (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
            e.printStackTrace();
        }
        return vehicle;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Vehicle [type = " + type + ", color = " + color + ", weapon = " + weapon + "]";
    }
}

