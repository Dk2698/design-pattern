package com.kumar.ExampleDecorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportscar = new SportsCar(new BasicCar());
        sportscar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
        System.out.println("\n*****");
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

//        System.out.println("\n*****");
//        Car sportsLuxury = new SportsCar(new LuxuryCar()); // not combined, basic class is required
//        luxuryCar.assemble();
    }
}
