package com.kumar.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * A factory class to manage and create BookType instances using the Flyweight pattern.
 */
public class BookFactory {
    // Map to store BookType instances to ensure unique instances per type
    private static final Map<String, BookType> bookTypes = new HashMap<>();

    /**
     * Retrieves a BookType instance for the given parameters.
     * If it doesn't exist, a new instance is created and stored.
     *
     * @param type        The type of the book.
     * @param distributor The distributor of the book.
     * @param otherData   Any other relevant data.
     * @return The BookType instance.
     */
    public static BookType getBookType(String type, String distributor, String otherData) {
        return bookTypes.computeIfAbsent(type, k -> new BookType(type, distributor, otherData));
    }
}