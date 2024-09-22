# Strategy Design Pattern
## Strategy design pattern is one of the behavioral design pattern.
    Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
    One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter.
    Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways. 
    For our example, we will try to implement a simple Shopping Cart where we have two payment strategies - using Credit Card or using PayPal.
    First of all we will create the interface for our strategy pattern example, in our case to pay the amount passed as argument.

###  Strategy Design Pattern Important Points
We could have used composition to create instance variable for strategies, but we should avoid that as we want the specific strategy to be applied for a particular task. Same is followed in Collections.sort() and Arrays.sort() method that take comparator as argument.

Strategy Pattern is very similar to State Pattern. One of the difference is that Context contains state as instance variable and there can be multiple tasks whose implementation can be dependent on the state whereas in strategy pattern strategy is passed as argument to the method and context object doesn’t have any variable to store it.

Strategy pattern is useful when we have multiple algorithms for specific task, and we want our application to be flexible to choose any of the algorithm at runtime for specific task.

### Overview

The Strategy Design Pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes. This pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. The Strategy Pattern enables the selection of an algorithm at runtime, providing flexibility and the ability to add new algorithms without altering existing code.

### Common Use Cases

- When multiple algorithms are available for a specific task and the client needs to choose one at runtime.
- When you want to avoid multiple conditional statements in your code.

## Example: Shopping Cart with Payment Strategies

In this example, we implement a simple Shopping Cart that supports two payment strategies: using a Credit Card and using PayPal.

### Components

1. **Strategy Interface**: Defines the method that all concrete strategies must implement.
2. **Concrete Strategies**: Implementations of the strategy interface, encapsulating specific algorithms.
3. **Context**: The class that uses a strategy object to execute an algorithm.

### Strategy
**`PaymentStrategy.java`**
```java
public interface PaymentStrategy {
    /**
     * Method to process payment.
     *
     * @param amount the amount to be paid
     */
    void pay(int amount);
}
```
**`CreditCardStrategy.java`**
```java
public class CreditCardStrategy implements PaymentStrategy {
    private String name;          // Name of the cardholder
    private String cardNumber;    // Credit card number
    private String cvv;           // Card security code
    private String dateOfExpiry;  // Expiry date of the card

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card.");
    }
}
```
**`PaypalStrategy.java`**
```java
public class PaypalStrategy implements PaymentStrategy {
    private String emailId;  // PayPal account email
    private String password;  // PayPal account password

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
```
**`Item.java`**
```java
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
```
#### Context Class
**`ShoppingCart.java`**
```java
public class ShoppingCart {
    private List<Item> itemList;  // List of items in the cart

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : itemList) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void clickForPay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
```
#### Client Class
**`ShoppingCartTest.java`**
```java
public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("12345678", 100);
        Item item2 = new Item("123456789", 400);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay using PayPal
        cart.clickForPay(new PaypalStrategy("myemail@example.com", "mypwd"));

        // Pay using Credit Card
        cart.clickForPay(new CreditCardStrategy("Kumar", "1234567898765", "121", "12/30"));
    }
}
```
### Benefits of the Strategy Pattern

The Strategy Pattern is a behavioral design pattern that provides several advantages in software development. Below are the key benefits:

#### 1. Flexibility
- **Dynamic Behavior**: The Strategy Pattern allows the client to choose the algorithm or strategy at runtime, enabling more dynamic and adaptable behavior in the application.

#### 2. Encapsulation
- **Separation of Concerns**: Each algorithm is encapsulated in its own class, which promotes a clear separation of concerns and adheres to the Single Responsibility Principle (SRP). This makes the code easier to manage and understand.

#### 3. Interchangeability
- **Swappable Algorithms**: Different strategies can be swapped out easily without modifying the client code. This makes it straightforward to implement new strategies or replace existing ones.

#### 4. Maintainability
- **Independent Changes**: Each strategy can be modified or extended independently of the others. This leads to improved maintainability, as changes to one algorithm do not affect the others.

#### 5. Clear Structure
- **Organized Code**: The design organizes related behaviors into their respective strategy classes, which enhances code readability and maintainability. It becomes easier for developers to understand the available strategies and their implementations.

#### 6. Reduced Conditional Logic
- **Avoiding Complex Conditionals**: By encapsulating algorithms in strategy classes, the need for complex conditional logic (if-else statements or switch cases) is reduced. This leads to cleaner, more readable code.

#### 7. Enhances Testability
- **Isolated Testing**: Each strategy can be tested independently, which simplifies unit testing. Developers can focus on validating the behavior of each algorithm without the overhead of other system components.

### Conclusion
The Strategy Pattern offers a robust solution for managing multiple algorithms or behaviors in a clean and maintainable way. It promotes flexibility, encapsulation, and testability, making it a valuable pattern in software design.
