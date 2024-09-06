package com.kumar.solid;

public class Cube implements Shape, ThreeDimessionShape{

    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 300;
    }
}
