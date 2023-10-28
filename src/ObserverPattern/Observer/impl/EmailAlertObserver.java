package ObserverPattern.Observer.impl;

import ObserverPattern.Observable.Observable;
import ObserverPattern.Observer.Observer;

public class EmailAlertObserver implements Observer {
    private String email;

    private Observable observable;

    public EmailAlertObserver(String email, Observable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Email Has Been Sent to : " + email);
    }
}
