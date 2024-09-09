package com.kumar.decorator.coffieshop;

public abstract class CondimentDecorator extends Beverage{

    private  Beverage beverage;

    public abstract String getDescription();
}
