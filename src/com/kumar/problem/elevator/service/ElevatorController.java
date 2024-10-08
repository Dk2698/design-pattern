package com.kumar.problem.elevator.service;

import com.kumar.problem.elevator.ElevatorCar;
import com.kumar.problem.elevator.enums.Direction;

import java.util.PriorityQueue;

public class ElevatorController {

    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;

    private ElevatorCar elevator;

    ElevatorController(ElevatorCar elevatorCar) {
        this.elevator = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a, b) -> b - a);

    }

    public void acceptRequest(int floor, Direction direction) {
        System.out.println("Accept request for floor: " + floor + " direction: " + direction);
    }

    public void submitExternalRequest(int floor, Direction direction) {
        System.out.println("Accept request for floor: " + floor + " direction: " + direction);
        if (direction == Direction.DOWN) {
            downMaxPQ.offer(floor);
        } else {
            upMinPQ.offer(floor);
        }
    }

    public void submitInternalRequest(int floor) {

    }

    public void controlElevator() {
        while (true) {

            if (elevator.getDirection() == Direction.UP) {


            }
        }
    }
}
