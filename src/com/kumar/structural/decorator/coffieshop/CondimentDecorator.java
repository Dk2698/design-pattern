package com.kumar.structural.decorator.coffieshop;

public abstract class CondimentDecorator extends Beverage{

    private  Beverage beverage;

    public abstract String getDescription();
}
