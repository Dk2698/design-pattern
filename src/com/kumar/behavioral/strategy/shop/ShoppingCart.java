package com.kumar.behavioral.strategy.shop;

import com.kumar.behavioral.strategy.shop.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;  // List of items in the cart

    /**
     * Constructor for ShoppingCart.
     */
    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    /**
     * Adds an item to the shopping cart.
     *
     * @param item The item to be added
     */
    public void addItem(Item item) {
        this.itemList.add(item);
    }

    /**
     * Removes an item from the shopping cart.
     *
     * @param item The item to be removed
     */
    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    /**
     * Calculates the total price of items in the cart.
     *
     * @return total price of items
     */
    public int calculateTotal() {
        int sum = 0;
        for (Item item : itemList) {
            sum += item.getPrice();
        }
        return sum;
    }

    /**
     * Processes payment using the specified payment strategy.
     *
     * @param paymentMethod The payment strategy to be used
     */
    public void clickForPay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
