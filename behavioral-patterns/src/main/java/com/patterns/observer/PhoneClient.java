package com.patterns.observer;

class PhoneClient extends Observer {

    PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }

    @Override
    void update() {
        System.out.println("Phone Stream: " + subject.getState());
    }

}
