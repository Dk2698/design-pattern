package com.kumar.structural.decorator;

public class Mushroom extends ToppingDecorator {

    private final BasePizaa basePizaa;

    public Mushroom(BasePizaa basePizaa) {
        this.basePizaa = basePizaa;
    }

    @Override
    int cost() {
        return basePizaa.cost() + 5;
    }
}
