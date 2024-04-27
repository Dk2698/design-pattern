package com.kumar.ObserverPattern.Observer;

import com.kumar.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements  NotificationAlertObserver{
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
        System.out.println("msg sent to : "+ userName);
        // send the msg on mobile to the end user
    }
}
