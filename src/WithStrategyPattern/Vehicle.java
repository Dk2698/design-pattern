package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    // has-A driveStrategy -> interface
    DriveStrategy driveObject;

    // constructor injection
    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }
    // other method
    public  void  letsDrive(){
        driveObject.drive();// depends on object and execute corresponding
    }
}
