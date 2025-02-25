package com.hakancivelek.elevator.responsibleElevator;

public interface Elevator {

    void openDoor();

    void closeDoor();

    void go(Floor desiredFloor);
}
