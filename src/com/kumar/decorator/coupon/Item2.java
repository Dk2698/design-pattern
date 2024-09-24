package com.kumar.decorator.coupon;

public class Item2 extends Product {

    private final double originalPrice;

    public Item2(String name, double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
        this.originalPrice = originalPrice;
    }

    @Override
    double getPrice() {
        return originalPrice;
    }
}
