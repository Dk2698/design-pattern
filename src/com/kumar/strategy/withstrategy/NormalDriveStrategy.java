package com.kumar.strategy.withstrategy;

public class NormalDriveStrategy  implements  DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}