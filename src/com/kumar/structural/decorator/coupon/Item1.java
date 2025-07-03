package com.kumar.structural.decorator.coupon;

public class Item1 extends Product {
    private final double originalPrice;

    public Item1(String name, double originalPrice, ProductType productType) {
        super(name, originalPrice, productType);
        this.originalPrice = originalPrice;
    }

    @Override
    double getPrice() {
        return originalPrice;
    }
}
