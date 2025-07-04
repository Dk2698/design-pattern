package com.kumar.creational.nullobjectpattern;

class VehicleFactory {
    static Vehicle getVehicleObject(String type) {
        if ("Car".equals(type)){
            return new Car();
        }
//        return null;
        return new NullVehicle();
    }
}
