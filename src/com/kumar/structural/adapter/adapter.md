# Adapter Pattern in Java

## Overview

The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It
acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that
the client expects. This is especially useful for integrating with legacy systems or third-party libraries.

## Key Concepts

- **Target:** Defines the interface that the client expects to use.
- **Adaptee:** The existing interface that needs to be adapted.
- **Adapter:** Implements the Target interface and translates calls to the Adaptee interface.
- **Client:** Uses the Target interface and is unaware of the Adaptee and Adapter.

## How It Works

1. **Target Interface:** Defines the interface that the client uses.
2. **Adaptee Class:** Contains the methods that need to be adapted to match the Target interface.
3. **Adapter Class:** Implements the Target interface and translates its methods into calls to the Adaptee methods.
4. **Client:** Interacts with the Target interface, oblivious to the Adapter and Adaptee.

## Example

### Problem Statement

Imagine you need to integrate a modern application with a legacy system. The application expects a `PaymentProcessor`
interface, but the legacy system provides a different interface called `LegacyPaymentService`. You can use the Adapter
Pattern to create an `Adapter` that makes the `LegacyPaymentService` compatible with the `PaymentProcessor` interface.

### Java Code

**`PaymentProcessor.java`**

```java
// Target Interface
public interface PaymentProcessor {
    void processPayment(double amount);
}

// Adaptee Class
public class LegacyPaymentService {
    public void makePayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency + " using LegacyPaymentService.");
    }
}

// Adapter Class
public class PaymentAdapter implements PaymentProcessor {
    private LegacyPaymentService legacyPaymentService;

    public PaymentAdapter(LegacyPaymentService legacyPaymentService) {
        this.legacyPaymentService = legacyPaymentService;
    }

    @Override
    public void processPayment(double amount) {
        // Assume default currency is USD for the adapter
        String defaultCurrency = "USD";
        legacyPaymentService.makePayment(amount, defaultCurrency);
    }
}

// Client Class
public class PaymentClient {
    public static void main(String[] args) {
        // Create an instance of the legacy payment service
        LegacyPaymentService legacyPaymentService = new LegacyPaymentService();

        // Wrap it with the adapter
        PaymentProcessor paymentProcessor = new PaymentAdapter(legacyPaymentService);

        // Use the payment processor as expected
        paymentProcessor.processPayment(100.0); // Outputs: Processing payment of 100.0 USD using LegacyPaymentService.
    }
}
```