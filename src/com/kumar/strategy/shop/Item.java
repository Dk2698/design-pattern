package com.kumar.strategy.shop;

public class Item {
    private String upcCode;  // Unique Product Code
    private int price;       // Price of the item

    /**
     * Constructor for Item.
     *
     * @param upcCode Unique Product Code
     * @param price   Price of the item
     */
    public Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}