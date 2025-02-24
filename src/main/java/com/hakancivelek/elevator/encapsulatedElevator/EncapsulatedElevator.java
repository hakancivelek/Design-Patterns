package com.hakancivelek.elevator.encapsulatedElevator;

public class EncapsulatedElevator {
    private boolean doorOpen = false;
    private boolean stopped = true;
    private Floor currentFloor = Floor.ENTRANCE;
    private int weight = 0;
    private final int CAPACITY = 1000;

    public void openDoor() {
        if (stopped) {
            doorOpen = true;
            System.out.println("The door is open.");
        } else {
            System.out.println("You can't open the door when the elevator is moving!");
        }
    }

    public void closeDoor() {
        calculateCapacity();

        if (weight <= CAPACITY) {
            doorOpen = false;
            System.out.println("Door is closed.");
        } else
            System.out.println("The elevator has exceeded capacity, doors will remain open until someone exits!");
    }

    private void calculateCapacity() {
        weight = (int) (Math.random() * 1500);
        System.out.println("The weight is " + weight);
    }

    public void goUp() {
        if (doorOpen)
            closeDoor();
        if (currentFloor.compareTo(Floor.TOP_FLOOR) < 0) {
            System.out.println("Going up!");
            stopped = false;
            currentFloor = currentFloor.goUp();
            System.out.println(currentFloor);
        } else
            System.out.println("Already on top floor.");
        stop();
    }

    public void goDown() {
        if (doorOpen)
            closeDoor();
        if (currentFloor.compareTo(Floor.ENTRANCE) > 0) {
            System.out.println("Going down!");
            stopped = false;
            currentFloor = currentFloor.goDown();
            System.out.println(currentFloor);
        } else
            System.out.println("Already on bottom floor.");
        stop();
    }

    public void go(Floor desiredFloor) {
        int compare = currentFloor.compareTo(desiredFloor);
        while (compare != 0) {
            if (compare < 0)
                goUp();
            else
                goDown();
            compare = currentFloor.compareTo(desiredFloor);
        }
        stop();
    }

    private void stop() {
        stopped = true;
        openDoor();
    }

    public boolean getDoorStatus() {
        return doorOpen;
    }
}
