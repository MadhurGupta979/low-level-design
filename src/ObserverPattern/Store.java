package ObserverPattern;

import ObserverPattern.Observable.Observable;
import ObserverPattern.Observable.impl.IphoneObservable;
import ObserverPattern.Observer.Observer;
import ObserverPattern.Observer.impl.EmailAlertObserver;
import ObserverPattern.Observer.impl.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        Observable iphoneObservable = new IphoneObservable();

        Observer emailAlertObserver = new EmailAlertObserver("xyz@gmail.com", iphoneObservable);
        Observer notificationAlertObserver = new NotificationAlertObserver("9891189223", iphoneObservable);

        iphoneObservable.add(emailAlertObserver);
        iphoneObservable.add(notificationAlertObserver);

        iphoneObservable.setData(10);
    }
}
