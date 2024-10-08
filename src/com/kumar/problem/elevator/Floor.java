package com.kumar.problem.elevator;

import com.kumar.problem.elevator.enums.Direction;
import com.kumar.problem.elevator.service.ExternalButtonDispacher;

public class Floor {
    private int floorNumber;
    private ExternalButton externalDispatcher;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        externalDispatcher = new ExternalButtonDispacher();
    }

    public void pressExternalButton(Direction direction){
//        externalDispatcher.submitExternalRequest(floorNumber, direction);
    }
}
