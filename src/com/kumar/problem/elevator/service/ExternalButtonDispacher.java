
package com.kumar.problem.elevator.service;

import com.kumar.problem.elevator.enums.Direction;
import com.kumar.problem.elevator.ExternalButton;

public class ExternalButtonDispacher extends ExternalButton {

    private ElevatorController elevatorController;

    public void submitRequest(int destinationFloor, Direction direction){
        elevatorController.acceptRequest(destinationFloor, direction);
    }
}
