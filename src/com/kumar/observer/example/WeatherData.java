package com.kumar.observer.example;

import java.util.ArrayList;
import java.util.List;

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
//            observer.update(temperature, humidity, pressure);
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
