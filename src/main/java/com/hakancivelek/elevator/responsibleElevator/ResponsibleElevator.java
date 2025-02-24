package com.hakancivelek.elevator.responsibleElevator;

public class ResponsibleElevator implements Elevator {
    private boolean doorOpen = false;
    private boolean stopped = true;
    private Floor currentFloor = Floor.ENTRANCE;
    private int weight = 0;
    private final int CAPACITY = 1000;

    @Override
    public void openDoor() {
        if (stopped) {
            doorOpen = true;
            System.out.println("Door is open.");
        }
    }

    @Override
    public void closeDoor() {
        calculateCapacity();
        if (weight <= CAPACITY) {
            doorOpen = false;
            System.out.println("Door is closed.");
        } else {
            System.out.println("The elevator has exceeded capacity, doors will remain open until someone exits!");
        }
    }

    @Override
    public void go(Floor desiredFloor) {
        if (doorOpen) {
            closeDoor();
            if (doorOpen) {
                System.out.println("Movement aborted due to capacity issue.");
                return;
            }
        }

        while (currentFloor != desiredFloor) {
            if (currentFloor.ordinal() < desiredFloor.ordinal())
                goUp();
            else
                goDown();
        }
        stopped = true;
        openDoor();
    }

    private void goUp() {
        if (doorOpen) {
            closeDoor();
            if (doorOpen) {
                System.out.println("Movement aborted due to capacity issue.");
                return;
            }
        }
        if (currentFloor != Floor.FIFTH) {
            System.out.println("Going up!");
            currentFloor = currentFloor.increase();
            System.out.println(currentFloor);
        } else {
            System.out.println("Already on top floor.");
        }
        stopped = true;
    }

    private void goDown() {
        if (doorOpen) {
            closeDoor();
            if (doorOpen) {
                System.out.println("Movement aborted due to capacity issue.");
                return;
            }
        }
        if (currentFloor != Floor.ENTRANCE) {
            System.out.println("Going down!");
            currentFloor = currentFloor.decrease();
            System.out.println(currentFloor);
        } else {
            System.out.println("Already on bottom floor.");
        }
        stopped = true;
    }

    private void calculateCapacity() {
        weight = (int) (Math.random() * 1500);
        System.out.println("The weight is " + weight);
    }
}
