package com.kumar.decorator.coupon;


public class CouponTestDrive {
    public static void main(String[] args) {
        Product item1 = new Item1("FAN", 1000, ProductType.ELECTRONICS);
        Product item2 = new Item2("Tshirt", 2000, ProductType.FASHION);

        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);


        System.out.println("Total price after discount " + cart.getTotalPrice());
    }
}
