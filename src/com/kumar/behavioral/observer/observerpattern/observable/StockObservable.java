package com.kumar.behavioral.observer.observerpattern.observable;

import com.kumar.behavioral.observer.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();

}
