package com.kumar.observer.observerpattern.observer;

import com.kumar.observer.observerpattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    //
    String emailId;
    StockObservable observable; // passing to implement class

    // inject
    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock hurry hu !!");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("Mail sent to : " + emailId);
        // send the actual email to the end user
    }
}
