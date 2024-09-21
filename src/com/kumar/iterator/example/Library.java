package com.kumar.iterator.example;

import java.util.Iterator;
import java.util.List;

public class Library implements Aggregate{
    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
