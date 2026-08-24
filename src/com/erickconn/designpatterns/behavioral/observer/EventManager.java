package com.erickconn.designpatterns.behavioral.observer;
import java.util.*;

public abstract class EventManager {

    Vector<EventObserver> observers = new Vector<>();

    void attach(EventObserver o) {
        observers.add(o);
    }

    void detach(EventObserver o) {
        observers.remove(o);
    }

    void notifyObservers(String state) {
        for (EventObserver o : observers) {
            o.update(state);
        }
    }

}
