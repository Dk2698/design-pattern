package com.kumar.solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final IAreaCalculator areaCalculator = new AreaCalculator();
        final IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();

        final Circle circle = new Circle(10);
        final Square square = new Square(10);
        final Cube cube = new Cube();
        final Reactangle reactangle = new Reactangle();

        // Liskov substitution
        //this means that every subclass or derived class should be substituted for their base or parent class
//        final NoShape noShape = new NoShape();
        final Shape noShape = new NoShape(); // not calculate area;
//        List<Shape> shapes = List.of(noShape,circle, square, cube, reactangle);
        List<Shape> shapes = List.of(circle, square, cube, reactangle);

        final int sum = areaCalculator.sum(shapes);
//        System.out.println("sum = "+ sum);
//        System.out.println(areaCalculator.json(shapes));

//        final ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        final ShapesPrinter printer = new ShapesPrinter(areaCalculatorV2);
//        System.out.println(printer.json(sum));
//        System.out.println(printer.csv(sum));
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));

    }
    // interface Segregation
    // interface should not force classes to implement what they can't do.
    // large interfaces should be divided into small ones.
}
