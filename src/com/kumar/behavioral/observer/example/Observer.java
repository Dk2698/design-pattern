package com.kumar.behavioral.observer.example;

// The Observer interface is implemented by all observer
public interface Observer {
    // these are the state values the Observers get from the subject when a weather measurement change
    public  void update(float temp, float humidity, float pressure);
    public  void update();
}
