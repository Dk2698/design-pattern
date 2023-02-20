package WithStrategyPattern;


import WithStrategyPattern.Strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(DriveStrategy driveObject) {
        super(driveObject);
    }
}
