package com.kumar.decorator.coupon;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {
    private final Product product;
    private final int discountPercentage;
    private final ProductType productType;

    private static final List<ProductType> eligibleTypes = new ArrayList<>();

    static {
        eligibleTypes.add(ProductType.ELECTRONICS);
        eligibleTypes.add(ProductType.FASHION);
    }

    public TypeCouponDecorator(Product product, int discountPercentage, ProductType productType) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.productType = productType;
    }

    @Override
    double getPrice() {
        double price = product.getPrice();
        if (eligibleTypes.contains(productType)) {
            return price - (price * discountPercentage) / 100;
        }
        return price;
    }
}
