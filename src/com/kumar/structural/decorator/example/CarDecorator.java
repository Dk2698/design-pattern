package com.kumar.structural.decorator.example;

// Decorator class implements the component interface and it has a HAS-A relationship with the component interface.
// The component variable should be accessible to the child decorator classes,
public class CarDecorator implements  Car{
    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}
