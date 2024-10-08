package com.kumar.problem.elevator;

import com.kumar.problem.elevator.enums.Direction;

public class Display {
    private int floor;
    private Direction direction;

    public void setDisplay(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void showDisplay() {
        System.out.println("show floor no: " + floor + " and " + "direction: " + direction);
    }

}
