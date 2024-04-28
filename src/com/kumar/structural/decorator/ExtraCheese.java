package com.kumar.structural.decorator;

public class ExtraCheese extends ToppingDecorator{

    private  final BasePizaa basePizaa;

    public ExtraCheese(BasePizaa basePizaa) {
        this.basePizaa = basePizaa;
    }

    @Override
    int cost() {
        return basePizaa.cost() +10;
    }
}
