package com.kumar.structural.decorator.pizzashop;

public class PizzaStore {
    public static void main(String[] args) {

        BasePizza newPizza = new ExtraCheese(new Margherita()); // mergherita cast + extra-cheese
        System.out.println(newPizza.cost());

        BasePizza newPizza1 = new ExtraCheese(new FarmHouse()); // farmhouse cast + extra-cheese
        System.out.println(newPizza1.cost());

        BasePizza newPizza2 = new Mushroom(new ExtraCheese(new Margherita())); // mergherita cast + extracheese => same base class
        System.out.println(newPizza2.cost());
    }
}
