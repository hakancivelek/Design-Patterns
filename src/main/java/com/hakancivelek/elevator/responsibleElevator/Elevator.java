package com.hakancivelek.elevator.responsibleElevator;

import com.hakancivelek.elevator.encapsulatedElevator.Floor;

public interface Elevator {
    void goUp();

    void goDown();

    void go(Floor intFloor);
}
