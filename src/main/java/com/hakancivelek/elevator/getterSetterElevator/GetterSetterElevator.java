package com.hakancivelek.elevator.getterSetterElevator;

public class GetterSetterElevator {
    public boolean doorOpen = false;
    public int currentFloor = 1;
    public int weight = 0;

    public final int CAPACITY = 1000;
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = 1;

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public int getTOP_FLOOR() {
        return TOP_FLOOR;
    }

    public int getBOTTOM_FLOOR() {
        return BOTTOM_FLOOR;
    }
}
