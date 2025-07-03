package com.kumar.structural.flyweight;

import lombok.Getter;

/**
 * Represents the type of a book, including its distribution details.
 */
@Getter
public class BookType {
    private final String type;
    private final String distribute;
    private final String otherData;

    /**
     * Constructor to initialize the book type's fields.
     *
     * @param type         The type of the book.
     * @param distribute   The distributor of the book.
     * @param otherData    Any other relevant data.
     */
    public BookType(String type, String distribute, String otherData) {
        this.type = type;
        this.distribute = distribute;
        this.otherData = otherData;
    }
}