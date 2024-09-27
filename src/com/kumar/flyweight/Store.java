package com.kumar.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a store that manages a collection of books.
 */
public class Store {
    // List to store all the books in the store
    private final List<Book> books = new ArrayList<>();

    /**
     * Stores a book in the store by creating a Book instance.
     *
     * @param name        The name of the book.
     * @param price       The price of the book.
     * @param type        The type of the book.
     * @param distributor The distributor of the book.
     * @param otherData   Any other relevant data.
     */
    public void storeBook(String name, double price, String type, String distributor, String otherData) {
        final BookType bookType = BookFactory.getBookType(type, distributor, otherData);
        books.add(new Book(name, price, bookType));
    }

    /**
     * Prints all the books in the store.
     */
    public void printBooks() {
        books.forEach(System.out::println);
    }
}
