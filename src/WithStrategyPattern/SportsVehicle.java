package WithStrategyPattern;


import WithStrategyPattern.Strategy.DriveStrategy;
import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
