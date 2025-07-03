package com.kumar.structural.flyweight;

import java.util.List;
import java.util.Random;

/**
 * Demonstrates the Flyweight pattern by simulating a book store.
 */
public class FlyWeightDemo {
    private static final int BOOKS_TYPES = 2; // Number of unique book types
    private static final int BOOKS_TO_INSERT = 10_000_000; // Total number of books to insert

    public static void main(String[] args) {
        Store store = new Store();

        // Insert books into the store
        for (int i = 0; i < BOOKS_TO_INSERT / BOOKS_TYPES; i++) {
            store.storeBook(getRandomName(), getRandomPrice(), "Action", "Follett", "Stuff");
            store.storeBook(getRandomName(), getRandomPrice(), "Fiction", "Penguin", "More Stuff");
        }

        // Print stored books
        store.printBooks();

        // Memory usage output
        System.out.println(BOOKS_TO_INSERT + " Books Inserted");
        System.out.println("-------------------------");
        System.out.println("Memory Usage: ");
        System.out.println("Book Size (20 bytes) * " + BOOKS_TO_INSERT + " + BookTypes Size (30 bytes) * " + BOOKS_TYPES);
        System.out.println("-------------------------");
        System.out.println("Total: " + ((BOOKS_TO_INSERT * 20 + BOOKS_TYPES * 30) / 1024 / 1024) + "MB (instead of " + ((BOOKS_TO_INSERT * 50) / 1024 / 1024) + "MB)");
    }

    /**
     * Generates a random book name from a predefined list.
     *
     * @return A random book name.
     */
    private static String getRandomName() {
        List<String> books = List.of("book_1", "book_2", "book_3", "book_4", "book_5", "book_6", "book_7", "book_8", "book_9", "book_10");
        return books.get(new Random().nextInt(books.size()));
    }

    /**
     * Generates a random price for a book.
     *
     * @return A random price between 10 and 200.
     */
    private static double getRandomPrice() {
        return new Random().nextDouble() * (200 - 10) + 10; // Generates a random price between 10 and 200
    }
}