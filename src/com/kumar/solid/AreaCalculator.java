package com.kumar.solid;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Object> shapes) {
        int sum = 0;
        for (final Object shape : shapes) {
            if (shape instanceof Square square) {
                sum += Math.pow(square.getLength(), 2);
            }
            if (shape instanceof Circle circle) {
                sum += Math.PI * Math.pow(circle.getRedius(), 2);
            }
            //  violation open for extension and close for modification
            // handle -> create new interface Shape and area method
            if (shape instanceof Cube cube){
            }
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
