package ObserverPattern.Observer.impl;

import ObserverPattern.Observable.Observable;
import ObserverPattern.Observer.Observer;

public class NotificationAlertObserver implements Observer {
    private String phoneNumber;

    private Observable observable;

    public NotificationAlertObserver(String phoneNumber, Observable observable) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        System.out.println("Notification Has Been Sent To : " + phoneNumber);
    }
}
