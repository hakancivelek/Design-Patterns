package com.hakancivelek.elevator.responsibleElevator;

public class ResponsibleElevatorTest {
	public static void main(String[] args) {
		Elevator elevator = new ResponsibleElevator();
		elevator.openDoor();
		elevator.go(Floor.THIRD);
		elevator.openDoor();
		elevator.go(Floor.FOURTH);
		elevator.openDoor();
		elevator.go(Floor.ENTRANCE);
		elevator.openDoor();
		elevator.go(Floor.SECOND);
	}
}
