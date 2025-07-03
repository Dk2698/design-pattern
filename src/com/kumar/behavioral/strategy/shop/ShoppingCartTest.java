package com.kumar.behavioral.strategy.shop;

import com.kumar.behavioral.strategy.shop.strategy.CreditCardStrategy;
import com.kumar.behavioral.strategy.shop.strategy.PaypalStrategy;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("12345678", 100);
        Item item2 = new Item("123456789", 400);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay using PayPal
        cart.clickForPay(new PaypalStrategy("myemail@example.com", "mypwd"));

        // Pay using Credit Card
        cart.clickForPay(new CreditCardStrategy("Kumar", "1234567898765", "121", "12/30"));
    }
}