package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // create obj means click on Product Iphone -> notify me
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        // user click
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username", iphoneStockObservable);
        // add to user in list for notify
        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        // change to state for stockcount

        iphoneStockObservable.setStockCount(10);
        // only on time message send because business logic
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);

    }
}
