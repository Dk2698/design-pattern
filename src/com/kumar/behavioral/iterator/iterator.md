# Iterator Design Pattern in Java

The Iterator design pattern provides a way to access the elements of a collection sequentially without exposing its underlying representation. This pattern is especially useful for collections of complex data structures, allowing for easier traversal and management of elements.

## Components of the Iterator Pattern

1. **Aggregate**: This interface defines a method for creating an iterator.
2. **Iterator**: This interface provides methods to traverse the collection (like `hasNext()` and `next()`).
3. **ConcreteIterator**: A class that implements the Iterator interface and keeps track of the current position in the collection.
4. **ConcreteAggregate**: A class that implements the Aggregate interface and returns an instance of the ConcreteIterator.

## Example Implementation

### 1. Aggregate Interface

**`Aggregate.java`**

```java
public interface Aggregate {
    Iterator createIterator();
}
```
**`Book.java`**

```java
package com.kumar.behavioral.iterator.example;

public class Book {
    private int price;
    private String bookName;

    public Book(int price, String bookName) {
        this.price = price;
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public String getBookName() {
        return bookName;
    }
}
```
**`BookIterator.java`**

```java
package com.kumar.behavioral.iterator.example;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BookIterator implements Iterator<Book> {
    private List<Book> books; // Collection of books to iterate over
    private int index = 0;    // Current index in the iteration

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size(); // Check if there are more elements
    }

    @Override
    public Book next() {
        if (this.hasNext()) {
            return books.get(index++); // Return the current book and move to the next
        }
        throw new NoSuchElementException("No more books in the collection"); // Handle no elements left
    }
}
```
**`Library.java`**

```java
package com.kumar.behavioral.iterator.example;

import java.util.Iterator;
import java.util.List;

public class Library implements Aggregate {
    private List<Book> bookList; // Collection of books in the library

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(bookList); // Return a new instance of BookIterator
    }
}
```
**`Client.java`**

```java
package com.kumar.behavioral.iterator.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Initialize a list of books
        final List<Book> bookList = Arrays.asList(
                new Book(100, "Science"),
                new Book(200, "Maths"),
                new Book(300, "GK"),
                new Book(400, "Drawing")
        );

        Library library = new Library(bookList); // Create a library instance
        Iterator<Book> iterator = library.createIterator(); // Get the iterator for the library

        // Traverse through the books using the iterator
        while (iterator.hasNext()) {
            Book book = iterator.next(); // Get the next book
            System.out.println(book.getBookName()); // Print the book name
        }
    }
}
```