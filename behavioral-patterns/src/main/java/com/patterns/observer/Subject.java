package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    abstract void setState(String state);
    abstract String getState();

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
