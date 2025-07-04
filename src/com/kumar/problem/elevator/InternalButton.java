package com.kumar.problem.elevator;

import com.kumar.problem.elevator.service.InternalButtonDispacher;

public class InternalButton {
    private InternalButtonDispacher internalButtonDispacher = new InternalButtonDispacher();

    int[] availableButtons = {1,2,3,4,5,6,7,8,9,10};
    int buttonSelected;

    void pressButton(int destination, ElevatorCar elevatorCar) {

        //1.check if destination is in the list of available floors

        //2.submit the request to the jobDispatcher
        internalButtonDispacher.submitInternalRequest(destination, elevatorCar);
    }

}
