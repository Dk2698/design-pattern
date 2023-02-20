package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
//    public GoodsVehicle(DriveStrategy driveObject) {
//        super(driveObject);
//    }
    public GoodsVehicle( ) {
        super(new NormalDriveStrategy());
    }
}
