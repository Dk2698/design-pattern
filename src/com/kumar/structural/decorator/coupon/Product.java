package com.kumar.structural.decorator.coupon;

public abstract class Product {
    String name;
    double originalPrice;
    ProductType productType;

    Product() {
    }

    Product(String name, double originalPrice, ProductType productType) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.productType = productType;
    }

    abstract double getPrice();


    public ProductType getProductType() {
        return productType;
    }

}
