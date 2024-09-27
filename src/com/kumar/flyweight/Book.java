package com.kumar.flyweight;

import lombok.Data;

/**
 * Represents a book with a specific name, price, and type.
 */
@Data
public class Book {
    private final String name;
    private final double price;
    private final BookType bookType;

    /**
     * Constructor to initialize the book's fields.
     *
     * @param name     The name of the book.
     * @param price    The price of the book.
     * @param bookType The type of the book.
     */
    public Book(String name, double price, BookType bookType) {
        this.name = name;
        this.price = price;
        this.bookType = bookType;
    }
}