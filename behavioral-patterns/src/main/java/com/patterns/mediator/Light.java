package com.patterns.mediator;

// Receiver
class Light {

    private boolean isOn = false;
    private String location = "";

    Light() {}

    Light(String location) {
        this.location = location;
    }

    boolean isOn() {
        return isOn;
    }

    void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    void on() {
        System.out.println(location + " Light switched on.");
    }

    void off() {
        System.out.println(location + " Light switched off.");
    }

}
