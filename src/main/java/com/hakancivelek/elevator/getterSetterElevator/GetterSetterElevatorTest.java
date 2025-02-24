package com.hakancivelek.elevator.getterSetterElevator;

public class GetterSetterElevatorTest {
    static GetterSetterElevator publicElevator = new GetterSetterElevator();
    static boolean stopped = false;

    public static void main(String[] args) {
        printElevatorState();
        publicElevator.setDoorOpen(true); // Passengers get on

        publicElevator.setDoorOpen(false); // Doors closed
        printElevatorState();

        // Go down to currentFloor 0 (below bottom of building)
        publicElevator.setCurrentFloor(publicElevator.getCurrentFloor() - 1);
        publicElevator.setCurrentFloor(publicElevator.getCurrentFloor() + 1);

        // Jump to currentFloor 7 (only 5 floors in building)
        publicElevator.setCurrentFloor(7);
        publicElevator.setDoorOpen(true); // Passengers get on/off

        printElevatorState();
        publicElevator.setDoorOpen(false);

        publicElevator.setCurrentFloor(-15); // Go to the first floor
        printElevatorState();
        publicElevator.setDoorOpen(true); // Passengers get on/off
        publicElevator.setCurrentFloor(publicElevator.getCurrentFloor() + 1); // Elevator moves with door open
        printElevatorState();
        publicElevator.setDoorOpen(false);
        publicElevator.setCurrentFloor(publicElevator.getCurrentFloor() - 1);
        publicElevator.setCurrentFloor(publicElevator.getCurrentFloor() - 1);
        printElevatorState();
        publicElevator.setCurrentFloor(publicElevator.getCurrentFloor() - 1);
        printElevatorState();

        System.out.println("***********************");

        Thread thread = new Thread() {
            public void run() {
                System.out.println("Started!");
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                stopped = true;
                System.out.println("Stopped!");
            }
        };

        thread.start();

        while (!stopped) {
            publicElevator.currentFloor--;
        }
        printElevatorState();

    }

    public static void printElevatorState() {
        String doorStatusString = publicElevator.isDoorOpen() ? "OPEN" : "CLOSED";
        System.out.println("Elevator is at floor " + publicElevator.getCurrentFloor() + " and the door is " + doorStatusString);
    }
}
