package com.kumar.solid;

import java.util.List;

public class AreaCalculator {
    //  not modified class for passing different object of shape
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (final Shape shape : shapes) {
//            if (shape instanceof Square square) {
//                sum += Math.pow(square.getLength(), 2);
//            }
//            if (shape instanceof Circle circle) {
//                sum += Math.PI * Math.pow(circle.getRedius(), 2);
//            }
//            //  violation open for extension and close for modification
//            // handle -> create new interface Shape and area method
//            if (shape instanceof Cube cube){
//            }
            sum += shape.area();
        }
        return sum;
    }
    // these violation of single responsibility
    // handle  -> create new class ShapePrinter
//    public String json(List<Object> shapes){
//        return "{sum: %s}".formatted(sum(shapes));
//    }
//
//    public String csv(List<Object> shapes){
//        return "sum, %s".formatted(sum(shapes));
//    }
}
