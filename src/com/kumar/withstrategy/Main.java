package com.kumar.withstrategy;

public class Main {
    public static void main(String[] args) {
        // passing different object of vehicle
        Vehicle vehicle = new Vehicle(new SportsDriveStrategy());
        vehicle.drive();
    }
}
