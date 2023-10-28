package ObserverPattern.Observable;

import ObserverPattern.Observer.Observer;

public interface Observable {
    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();

    void setData(Object data);

    int getData();
}
