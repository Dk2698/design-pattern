package com.kumar.decorator.coffieshop;

public class Mocha extends CondimentDecorator{
    private final Beverage beverage;

    protected Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost()  + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Mocha";
    }
}
