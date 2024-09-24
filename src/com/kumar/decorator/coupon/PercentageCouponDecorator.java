package com.kumar.decorator.coupon;

public class PercentageCouponDecorator extends CouponDecorator {

    private final Product product;
    private final int discountPercentage;

    public PercentageCouponDecorator(Product product, int discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }


    @Override
    double getPrice() {
        double price = product.getPrice();
        return price - (price * discountPercentage) / 100;
    }
}
