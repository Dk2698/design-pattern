package com.kumar.observer.example;

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
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display(); // Update and display new conditions
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display(); // Update and display new conditions
    }
}
