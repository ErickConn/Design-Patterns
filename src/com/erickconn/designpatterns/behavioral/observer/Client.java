package com.erickconn.designpatterns.behavioral.observer;

public class Client {

    public static void main(String args[]) {

        // Criação do Subject concreto 
        NotificationSender sender = new NotificationSender();

        // Criação do Observador concreto
        NotificationObserver o = new NotificationObserver();

        sender.setState("123");
        System.out.println(o.observerState);

        sender.attach(o);
        sender.notifyObservers();
        System.out.println(o.observerState);

    }
}
