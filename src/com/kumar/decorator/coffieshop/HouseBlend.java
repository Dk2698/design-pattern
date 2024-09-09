package com.kumar.decorator.coffieshop;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public Double cost() {
        return .87;
    }
}
