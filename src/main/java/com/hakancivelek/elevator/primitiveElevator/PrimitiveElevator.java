package com.hakancivelek.elevator.primitiveElevator;

public class PrimitiveElevator {
    public boolean doorOpen = false;
    public int currentFloor = 0;
    public int weight = 0;

    public final int CAPACITY = 1000;
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = 0;

    void openDoor() {
        if (doorOpen)
            System.out.println("The door is already open!");
        else {
            doorOpen = true;
            System.out.println("Door is open.");
        }
    }

    void closeDoor() {
        if (!doorOpen)
            System.out.println("The door is already close!");

        calculateCapacity();

        if (weight <= CAPACITY) {
            doorOpen = false;
            System.out.println("Door is closed.");
        } else {
            System.out.println("The elevator has exceeded capacity.");
            System.out.println("Doors will remain open until someone exits!");
        }
    }

    private void calculateCapacity() {
        weight = (int) (Math.random() * 1500);
        System.out.println("The weight is " + weight);
    }

    void goUp() {
        if (doorOpen)
            closeDoor();
        else if (currentFloor != TOP_FLOOR)
            currentFloor++;
        else
            System.out.println("You are already on the top floor");
    }

    void goDown() {
        if (doorOpen)
            closeDoor();
        else if (currentFloor != BOTTOM_FLOOR)
            currentFloor--;
        else
            System.out.println("You are already on the bottom floor");
    }

    void go(int floor) {
        if (doorOpen)
            closeDoor();
        else if (currentFloor == floor) {
            System.out.println("You are already on floor " + floor + ".");
        } else if (floor > TOP_FLOOR) {
            System.out.println("This floor does not exist. The highest floor is " + TOP_FLOOR + ".");
        } else if (floor < BOTTOM_FLOOR) {
            System.out.println("This floor does not exist. The lowest floor is " + BOTTOM_FLOOR + ".");
        }
    }


    public int getFloor() {
        return currentFloor;
    }

    public boolean getDoorStatus() {
        return doorOpen;
    }
}
