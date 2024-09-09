package com.kumar.decorator.coffieshop;

public class Whip extends CondimentDecorator {

    private  final Beverage beverage;
    public Whip(Beverage beverage1) {
        this.beverage = beverage1;
    }

    @Override
    public Double cost() {
        return beverage.cost()  + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Whip";
    }
}
