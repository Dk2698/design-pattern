package com.kumar.decorator.example;

public class BasicCar implements  Car{
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}
