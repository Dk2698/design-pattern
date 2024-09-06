package com.kumar.solid;

import java.util.List;

// single responsibility
public class ShapesPrinter {

    // dependency Inversion
    // Components should depend on abstraction, not on concretions
//    private AreaCalculator areaCalculator = new AreaCalculator(); // breaks rules o/c, if makes changes ArealCalculator
    private  final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes){
        return "{sum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "sum, %s".formatted(areaCalculator.sum(shapes));
    }
}
