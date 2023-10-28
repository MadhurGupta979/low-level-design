package ObserverPattern.Observable.impl;

import ObserverPattern.Observable.Observable;
import ObserverPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private int stockQuantity = 0;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observers) {
            obj.update();
        }
    }

    @Override
    public void setData(Object data) {
        if (stockQuantity == 0) {
            notifyObservers();
        }
        stockQuantity = stockQuantity + (int) data;
    }

    @Override
    public int getData() {
        return this.stockQuantity;
    }
}
