package com.kumar.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionExample {
    public static void main(String[] args) {
//        List<Vehicle1> vehicleList = new ArrayList<>();
//        vehicleList.add(new MotoCycle1());
//        vehicleList.add(new Car1());
//
//        vehicleList.add(new Bicycle1()); // null pointer
//
//        for (Vehicle1 vehicle : vehicleList) {
//            System.out.println(vehicle.hasEngine().toString()); // compiler time error, vehicle not know an=bout hasEngine
//        }

        List<EngineVehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new MotoCycle1());
        vehicleList.add(new Car1());

        //vehicleList.add(new Bicycle1()); // compiler  time error because list store of EngineVehicle of object, not about engine of bicycle

        for (Vehicle1 vehicle : vehicleList) {
//            System.out.println(vehicle.hasEngine().toString());
            System.out.println(vehicle.getNumberOfWheels().toString());
        }
    }
}

class Vehicle1{
    public Integer getNumberOfWheels(){
        return 4;
    }
}

class EngineVehicle extends Vehicle1{
    public Boolean hasEngine(){
        return true;
    }
}
class MotoCycle1 extends EngineVehicle{

}

class Car1 extends EngineVehicle{
}

// inherited another class without breaking functionality
class Bicycle1 extends Vehicle1{
    // no having engine

}
