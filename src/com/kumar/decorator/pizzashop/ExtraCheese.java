package com.kumar.decorator.pizzashop;

public class ExtraCheese extends ToppingDecorator { // is-A
    BasePizza basePizza; // has-A

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
