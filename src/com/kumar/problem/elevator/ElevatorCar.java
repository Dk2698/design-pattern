package com.kumar.problem.elevator;

import com.kumar.problem.elevator.enums.Direction;
import com.kumar.problem.elevator.enums.Status;

public class ElevatorCar {
    private int leftId;
    private Display display;
    private int currentFloor;
    private Direction direction;
    private Status status;

    private InternalButton internalButtons;

    private Door door;

    public ElevatorCar() {
        display = new Display();
        internalButtons = new InternalButton();
        status = Status.IDLE;
        currentFloor = 0;
        direction = Direction.UP;
        door = new Door();
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void showDisplay() {
        display.showDisplay();
    }

    public void setDisplay() {
        this.display.setDisplay(currentFloor, direction);
    }

    public void pressButton(int destination) {
        internalButtons.pressButton(destination, this); // current elevatorCar
    }


    private boolean moveElevator(int destinationFloor, Direction direction) {
        int startFloor = currentFloor;
        if (direction == Direction.UP) {
            for (int i = startFloor; i <= destinationFloor; i++) {
                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if (i == destinationFloor) {
                    return true;
                }
            }
        }

        if (direction == Direction.DOWN) {
            for (int i = startFloor; i >= destinationFloor; i--) {
                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if (i == destinationFloor) {
                    return true;
                }
            }
        }
        return false;
    }
}
