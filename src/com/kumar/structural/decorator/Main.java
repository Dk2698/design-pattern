package com.kumar.structural.decorator;

public class Main {
    public static void main(String[] args) {
        final Mushroom mushroom = new Mushroom(new ExtraCheese(new FarmHousePizaa()));
        System.out.println("cost mushroom : " + mushroom.cost());

        final ExtraCheese extraCheese = new ExtraCheese(new Mushroom(new MargheritaPizaa()));
        System.out.println("cost extraCheese: " + extraCheese.cost());

    }
}
