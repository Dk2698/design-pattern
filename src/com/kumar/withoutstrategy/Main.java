package com.kumar.withoutstrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }
}