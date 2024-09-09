package com.kumar.decorator.coffieshop;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public Double cost() {
        return 1.20;
    }
}
