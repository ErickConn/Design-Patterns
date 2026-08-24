package com.erickconn.designpatterns.behavioral.observer;


public class NotificationSender extends EventManager {

    private String subjectState;

    public String getState() {
        return subjectState;
    }

    public void setState(String state) {
        subjectState = state;
    }

  
    public void notifyObservers() {
        super.notifyObservers(subjectState);
    }

}
