package com.kumar.structural.decorator.coupon;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    List<Product> productList;

    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addToCart(Product product) {
        final Product productWithDiscount = new TypeCouponDecorator(
                new PercentageCouponDecorator(product, 10), 3, ProductType.ELECTRONICS);

        productList.add(productWithDiscount);

    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
