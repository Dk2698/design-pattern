package com.kumar.ExampleObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements  Subject{
    private List<Observer> observerList; // holds the observers
    private float temperature;
    private  float humidity;
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observerList){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }
    public  void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    // other WeatherData methods here
}
