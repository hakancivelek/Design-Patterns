package com.hakancivelek.elevator.encapsulatedElevator;

public enum Floor {
    ENTRANCE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), TOP_FLOOR(5);
    private final int intFloor;

    Floor(int intFloor) {
        this.intFloor = intFloor;
    }

    int getIntFloor() {
        return intFloor;
    }

    Floor goUp() {
        Floor upperFloor = null;
        if (this == ENTRANCE)
            upperFloor = FIRST;
        else if (this == FIRST)
            upperFloor = SECOND;
        else if (this == SECOND)
            upperFloor = THIRD;
        else if (this == THIRD)
            upperFloor = FOURTH;
        else
            upperFloor = TOP_FLOOR;

        return upperFloor;
    }

    Floor goDown() {
        Floor lowerFloor = null;
        if (this == TOP_FLOOR)
            lowerFloor = FOURTH;
        else if (this == FOURTH)
            lowerFloor = THIRD;
        else if (this == THIRD)
            lowerFloor = SECOND;
        else if (this == SECOND)
            lowerFloor = FIRST;
        else
            lowerFloor = ENTRANCE;

        return lowerFloor;
    }

    @Override
    public String toString() {
        String string = null;
        string = "Floor: " + getIntFloor();
        return string;
    }
}
