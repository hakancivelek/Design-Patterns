package com.hakancivelek.prototype;

public class Soldier implements Cloneable {
    private String color;
    private String outfit;
    private String weapon;

    public Soldier(String color, String outfit, String weapon) {
        this.color = color;
        this.outfit = outfit;
        this.weapon = weapon;
    }

    @Override
    public Soldier clone() {
        Soldier soldier = null;
        try {
            soldier = (Soldier) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
            e.printStackTrace();
        }
        return soldier;
    }

    @Override
    public String toString() {
        return "Soldier [color = " + color + ", outfit = " + outfit + ", weapon = " + weapon + "]";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
