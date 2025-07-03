package com.kumar.creational.nullobjectpattern;

public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 30;
    }

    @Override
    public int getSeatingCapacity() {
        return 4;
    }
}
