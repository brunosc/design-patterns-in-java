package com.patterns.command;

// Receiver
class Light {

    private boolean isOn = false;

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
        System.out.println("Light switched on.");
    }

    void off() {
        System.out.println("Light switched off.");
    }

}
