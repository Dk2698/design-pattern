package com.kumar.decorator.pizzashop;

import com.kumar.decorator.pizzashop.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
