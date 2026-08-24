package com.erickconn.designpatterns.behavioral.observer;

public class NotificationObserver implements EventObserver {

    String observerState;

    public void update(String state) {
        this.observerState = state;
    }
}
