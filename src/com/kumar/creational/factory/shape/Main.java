package com.kumar.creational.factory.shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circleObject = shapeFactory.getShape("CIRCLE");
        circleObject.draw();

        Shape rectangleObject = shapeFactory.getShape("RECTANGLE");
        rectangleObject.draw();
    }
}
