package com.kumar.decorator.coffieshop;

public class Soy extends CondimentDecorator {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost() + .30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }
}
