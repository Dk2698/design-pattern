package com.kumar.decorator.pizzashop;

import com.kumar.decorator.pizzashop.BasePizza;
import com.kumar.decorator.pizzashop.ToppingDecorator;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
