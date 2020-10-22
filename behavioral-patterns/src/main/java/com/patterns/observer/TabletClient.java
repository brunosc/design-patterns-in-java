package com.patterns.observer;

class TabletClient extends Observer {

    TabletClient (Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }

    @Override
    void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }
}
