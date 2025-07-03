# Flyweight Design Pattern

## Purpose
The Flyweight pattern aims to minimize memory usage by sharing common data among multiple objects instead of creating separate instances for each one. This is particularly effective when dealing with a large number of similar objects.

## Structure
The Flyweight pattern typically consists of:
- **Flyweight Interface**: Defines the interface for flyweight objects.
- **Concrete Flyweight**: Implements the flyweight interface and stores intrinsic state.
- **Flyweight Factory**: Manages the creation and reuse of flyweight instances. It ensures that shared objects are created only once.

## Intrinsic and Extrinsic State
- **Intrinsic State**: Shared data that is consistent across all instances. In the book example, `BookType` holds the intrinsic state.
- **Extrinsic State**: Unique data that is provided by the client at runtime, such as the name and price of each `Book`.

## Performance Improvement
By reducing the number of objects created, the Flyweight pattern can significantly improve performance in applications where many similar objects exist. This leads to lower memory consumption and better cache performance.

## Use Cases
The pattern is well-suited for scenarios like:
- Graphics rendering
- Text processing (e.g., fonts and characters)
- Any situation where a large number of objects share similar properties.

## Complexity
While the Flyweight pattern can optimize resource usage, it also adds complexity to the codebase. It requires careful design to separate intrinsic and extrinsic states effectively.

## Thread Safety
When implementing the Flyweight pattern in a multi-threaded environment, it’s crucial to ensure that shared objects are thread-safe, especially when their state can be modified.

## Memory Management
The Flyweight pattern can lead to reduced memory overhead, but it’s essential to manage the lifecycle of shared objects correctly to prevent memory leaks and ensure proper garbage collection.

## Real-World Examples
Common applications include:
- Text editors using character objects that share common font attributes.
- Game development where many instances of similar objects (like trees, enemies) can share common characteristics.

## Design Principles
The Flyweight pattern embodies several design principles, including:
- **Single Responsibility Principle**: Separating the intrinsic and extrinsic state allows for focused management of object state.
- **Factory Method**: The Flyweight Factory can be seen as an implementation of the Factory Method pattern, encapsulating the creation logic.

# Explanation of the Flyweight Pattern

## Flyweight Objects
In this context, the flyweight objects are the `BookType` instances. Each unique book type is created only once and shared among multiple `Book` instances. This is achieved using the `BookFactory` class.

## Intrinsic vs. Extrinsic State
- **Intrinsic State**: This is the shared state that can be stored and shared. In our case, the `BookType` (type, distributor, other data) represents the intrinsic state.
- **Extrinsic State**: This is the unique state for each object that cannot be shared. In this case, it is represented by the `Book` class, which has properties like name and price.

## Factory
The `BookFactory` class is responsible for managing `BookType` instances. It checks if a `BookType` for a specific type already exists; if not, it creates a new instance. This prevents duplicate `BookType` instances and ensures efficient memory use.

## Client Code
The `Store` class manages the collection of `Book` instances. When a book is added, it requests the appropriate `BookType` from the factory, ensuring that multiple `Book` instances can reference the same `BookType` if they share the same type.

## Demonstration
The `FlyWeightDemo` class simulates a book store by inserting a large number of books with only a couple of distinct types, demonstrating how the Flyweight pattern reduces memory usage.

## Code Breakdown
Here’s a closer look at the code components:

### BookType Class
```java
@Getter
public class BookType {
    private final String type;
    private final String distribute;
    private final String otherData;

    public BookType(String type, String distribute, String otherData) {
        this.type = type;
        this.distribute = distribute;
        this.otherData = otherData;
    }
}
```
### Book Class
```java
@Data
public class Book {
    private final String name;
    private final double price;
    private final BookType bookType;

    public Book(String name, double price, BookType bookType) {
        this.name = name;
        this.price = price;
        this.bookType = bookType;
    }
}
```
### BookFactory Class
```java
public class BookFactory {
    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData) {
        return bookTypes.computeIfAbsent(type, k -> new BookType(type, distributor, otherData));
    }
}
```
### Store Class
```java
public class Store {
    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String type, String distributor, String otherData) {
        final BookType bookType = BookFactory.getBookType(type, distributor, otherData);
        books.add(new Book(name, price, bookType));
    }

    public void printBooks() {
        books.forEach(System.out::println);
    }
}
```
### FlyWeightDemo Class
```java
public class FlyWeightDemo {
    private static final int BOOKS_TYPES = 2;
    private static final int BOOKS_TO_INSERT = 10_000_000;

    public static void main(String[] args) {
        Store store = new Store();
        for (int i = 0; i < BOOKS_TO_INSERT / BOOKS_TYPES; i++) {
            store.storeBook(getRandomName(), getRandomPrice(), "Action", "Follett", "Stuff");
            store.storeBook(getRandomName(), getRandomPrice(), "Fiction", "Penguin", "More Stuff");
        }

        store.printBooks();

        System.out.println(BOOKS_TO_INSERT + " Books Inserted");
        System.out.println("Memory Usage: ");
        System.out.println("Total: " + ((BOOKS_TO_INSERT * 20 + BOOKS_TYPES * 30) / 1024 / 1024) + "MB");
    }

    private static String getRandomName() {
        List<String> books = List.of("book_1", "book_2", "book_3", "book_4", "book_5");
        return books.get(new Random().nextInt(books.size()));
    }

    private static double getRandomPrice() {
        return new Random().nextDouble() * (200 - 10) + 10;
    }
}
```

## Conclusion
The Flyweight design pattern is a powerful tool for optimizing memory usage in applications where many similar objects are required. By carefully managing shared and unique states, it enables developers to build efficient systems while keeping complexity in check. Understanding the principles and trade-offs associated with this pattern is essential for effective implementation.
