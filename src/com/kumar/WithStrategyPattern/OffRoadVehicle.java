package com.kumar.WithStrategyPattern;


import com.kumar.WithStrategyPattern.Strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(DriveStrategy driveObject) {
        super(driveObject);
    }
}
