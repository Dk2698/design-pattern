# Decorator Pattern

## Overview

The Decorator Pattern is a structural design pattern used to modify or extend the functionality of an object at runtime without affecting other instances of the same class. This pattern is useful when you want to add new behavior to objects dynamically and individually, rather than applying changes to all instances of a class through inheritance or composition at compile time.

## Key Concepts

- **Component:** Defines the interface for objects that can have responsibilities added to them dynamically.
- **Concrete Component:** The base class or concrete implementation that can be decorated.
- **Decorator:** Abstract class or interface that implements the Component interface and has a reference to a Component object. It delegates operations to the Component object and can add new behaviors.
- **Concrete Decorators:** Extend the Decorator class and add new responsibilities or behaviors to the component.

## How It Works

1. **Component Interface:** Defines a common interface for both the Concrete Component and Decorator.
2. **Concrete Component:** Implements the Component interface and defines the base behavior.
3. **Decorator Class:** Implements the Component interface and contains a reference to a Component object. It forwards requests to the Component and adds new behaviors.
4. **Concrete Decorators:** Extend the Decorator class to add specific functionalities.

## Example

Consider a scenario where you have a `Car` interface and different types of cars: `BasicCar`, `SportsCar`, and `LuxuryCar`. You can use the Decorator Pattern to add additional features to these cars dynamically, such as adding sport features or luxury features without modifying the base classes.

### Java Example

```java
// Component Interface
public interface Car {
    String assemble();
}

// Concrete Component
public class BasicCar implements Car {
    @Override
    public String assemble() {
        return "Basic Car";
    }
}

// Decorator Class
public abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String assemble() {
        return car.assemble();
    }
}

// Concrete Decorators
public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " with Sports Features";
    }
}

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + " with Luxury Features";
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        System.out.println(basicCar.assemble());

        Car sportsCar = new SportsCar(basicCar);
        System.out.println(sportsCar.assemble());

        Car luxurySportsCar = new LuxuryCar(sportsCar);
        System.out.println(luxurySportsCar.assemble());
    }
}
```