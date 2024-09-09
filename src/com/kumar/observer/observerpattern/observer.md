### Publishers + Subscribers = Observer
#### The Observer Pattern it's one to many relationship and loosly coupling
Observer Pattern is one of the behavioral design pattern. Observer design pattern is useful
when you are interested in the state of an object and want to get notified whenever there is any change. 
In observer pattern, the object that watch on the state of another object are called Observer and the object 
that is being watched is called Subject or Observable.

Observer Pattern , only we call the publisher the SUBJECT and the Subscribers the OBSERVERS

### Observer Pattern defined
According to GoF, observer design pattern intent is;

#### Define a one-to-many dependency between objects so that when one object changes state,all its dependents are notified and updated automatically.
#### The Subjects and observers define the one-to-many relationship. we have one subject, who notifies many observers when something in the subject changes. the Observers are dependent on the subject - when the subjects state change, the observer are nofified
Subject contains a list of observers to notify of any change in it’s state,
so it should provide methods using which observers can register and unregister themselves. 
Subject also contain a method to notify all the observers of any change and
either it can send the update while notifying the observer or it can provide another method to get the update. 
Observer should have a method to set the object to watch and another method that will be used by Subject to notify them of any updates.
Java provides inbuilt platform for implementing Observer pattern through java.util.Observable class and java.util.Observer interface.
However, it’s not widely used because the implementation is really simple and most of the time we don’t want to end up extending a class
just for implementing Observer pattern as java doesn’t provide multiple inheritance in classes. Java Message Service (JMS) uses Observer design pattern along with Mediator pattern
to allow applications to subscribe and publish data to other applications. 
Model-View-Controller (MVC) frameworks also use Observer pattern where Model is the Subject and Views are observers that can register to get notified of any change to the model.

#### Observer design pattern is also called as publish-subscribe pattern

### The Power of loose Coupling
when two objects are loosely coupled, they can interact but they
typically have very little knowledge of ech other
it's give us a lot of flexibility
    
    First, the only thing the subject knows about an observer that it implements a 
    a certain interface(the Observer interface).
    We can add new observers at any time.
    We never need to modify the subject to add new types of observers
    We can can reuse subject or observers independently of each other
    Change to either the subject or an observer wil not affect the other

## Design Principle
### Strive for loosely coupled designs between objects that interact
#### Loosely coupled design allows us to  build flexible OO  systems that can handle changes because they minimize the interdependency between objects
#### The Observer Pattern defines a one-to-many relationship between objects.
#### Subjects update Observers using a common interface.
#### Observers of any concrete type can participate in the pattern as long as they implement the Observer interface.
#### Observers are loosely coupled in that the Subject knows nothing about them, other than that they implement the Observer interface.
#### You can push or pull data from the Subject when using the pattern (pull is considered more “correct”).
#### Swing makes heavy use of the Observer Pattern, as do many GUI frameworks.
#### You’ll also find the pattern in many other places, including RxJava, JavaBeans, and RMI, as well as in other language frameworks, like Cocoa, Swift, and JavaScript events.
#### The Observer Pattern is related to the Publish/Subscribe Pattern, which is for more complex situations with multiple Subjects and/or multiple message types.
#### The Observer Pattern is a commonly used pattern, and we’ll see it again when we learn about Model-View-Controller.

### Example

Consider a weather monitoring system where a `WeatherStation` (Subject) provides updates on temperature. Various devices like `TemperatureDisplay` and `WeatherApp` (Observers) subscribe to this `WeatherStation` to get updates when the temperature changes.

# Weather Monitoring System

## Overview

This project demonstrates the Observer Pattern with a simple weather monitoring system. The system includes a `WeatherData` class that acts as the Subject and several displays that act as Observers. The `WeatherData` class notifies all registered displays when new weather measurements are available.

## Components

- **`WeatherData`**: Implements the `Subject` interface. Holds weather measurements and notifies observers of any changes.
- **`CurrentConditionsDisplay`**: Implements the `Observer` and `DisplayElement` interfaces. Displays current weather conditions.
- **`Subject`**: Interface for managing observers.
- **`Observer`**: Interface for objects that need to be updated with changes in the subject.
- **`DisplayElement`**: Interface for objects that need to display information.

## How It Works

1. **Create a `WeatherData` instance**: This is the subject that maintains weather measurements.
2. **Create and register displays**: Displays like `CurrentConditionsDisplay` are registered with the `WeatherData` instance.
3. **Update weather measurements**: Call `setMeasurements` on the `WeatherData` instance to update the weather data and notify all registered observers.

## Example

Here's a simple example demonstrating the system:

```java
//Subject
public interface Subject {
    void registerObserver(Observer o); // Register an observer

    void removeObserver(Observer o); // Remove an observer

    void notifyObservers(); // Notify all registered observers
}
// WeatherDate
public class WeatherData implements Subject {
    private List<Observer> observerList; // Holds the observers
    private float temperature;
    private float humidity;
    private float pressure;

    // Constructor initializes the observer list
    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o); // Add an observer to the list
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o); // Remove an observer from the list
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            // Notify each observer of the change
            observer.update();
        }
    }

    /**
     * This method is called whenever the weather measurements have been updated
     */
    public void measurementsChanged() {
        notifyObservers(); // Notify all observers of the change
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(); // Notify observers of the change
    }

    // Getter methods for temperature, humidity, and pressure
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

public interface Observer {
    void update(); // Update with new data
}

public interface DisplayElement {
    void display(); // Display the current state
}

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    // Constructor that registers the display with the WeatherData
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // Register as an observer
    }

    @Override
    public void display() {
        // Print the current conditions to the console
        System.out.println("Current conditions " + temperature + "F degree and " + humidity + " % humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display(); // Update and display new conditions
    }
}

//Usage
public class WeatherStation {
    public static void main(String[] args) {
        // Create a WeatherData instance
        WeatherData weatherData = new WeatherData();

        // Create and register displays
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // Uncomment the following lines to add more displays
        // StatisticDisplay statisticDisplay = new StatisticsDisplay(weatherData);
        // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // Simulate weather measurements changes
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
```