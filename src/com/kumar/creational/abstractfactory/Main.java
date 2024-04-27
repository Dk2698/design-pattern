package com.kumar.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        final AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        final AbstractFactory factoryInstance = abstractFactoryProducer.getFactoryInstance("Premium");
        final Car car = factoryInstance.getInstance(50000000);
        System.out.println(car.getToSpeed());
    }
}
