package com.kumar.observer.observerpattern.observer;

import com.kumar.observer.observerpattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is in stock hurry hu !!");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("msg sent to : " + userName);
        // send the msg on mobile to the end user
    }
}
