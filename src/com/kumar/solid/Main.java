package com.kumar.solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final AreaCalculator areaCalculator = new AreaCalculator();

        final Circle circle = new Circle(10);
        final Square square = new Square(10);
        final Cube cube = new Cube();
        final Reactangle reactangle = new Reactangle();
        List<Shape> shapes = List.of(circle, square, cube, reactangle);

        final int sum = areaCalculator.sum(shapes);
//        System.out.println("sum = "+ sum);
//        System.out.println(areaCalculator.json(shapes));

        final ShapesPrinter printer = new ShapesPrinter();
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }

}
