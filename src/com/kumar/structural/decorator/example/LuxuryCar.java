package com.kumar.structural.decorator.example;

public class LuxuryCar extends  CarDecorator{
    public LuxuryCar(Car c) {
        super(c);
    }


    @Override
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
