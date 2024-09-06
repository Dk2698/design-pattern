package com.kumar.solid;

public class Circle implements Shape{
    private final int redius;

    public Circle(int redius) {
        this.redius = redius;
    }

    public int getRedius() {
        return redius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(redius, 2);
    }
}
