package com.kumar.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitution {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotoCycle());
        vehicleList.add(new Car());

        vehicleList.add(new Bicycle()); // null pointer

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.hasEngine().toString());
        }
    }
}

class Vehicle{
    public Integer getNumberOfWheels(){
        return 4;
    }
    public Boolean hasEngine(){
        return true;
    }
}

class MotoCycle extends Vehicle{

}

class Car extends Vehicle{
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}

// inherited another class without breaking functionality
class Bicycle extends Vehicle{
    // no having enginee
    @Override
    public Boolean hasEngine() {
        return null;
    }
}
