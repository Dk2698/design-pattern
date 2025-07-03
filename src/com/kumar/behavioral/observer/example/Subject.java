package com.kumar.behavioral.observer.example;

public interface Subject {
    void registerObserver(Observer o); // Register an observer

    void removeObserver(Observer o); // Remove an observer

    void notifyObservers(); // Notify all registered observers
}
