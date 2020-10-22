package com.patterns.state;

class Fan {

    State fanOffState;
    State fanLowState;
    State fanMedState;
    State fanHighState;

    State state;

    Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }

    State getFanOffState() {
        return fanOffState;
    }

    State getFanLowState() {
        return fanLowState;
    }

    State getFanMedState() {
        return fanMedState;
    }

    State getFanHighState() {
        return fanHighState;
    }

    void setState(State state) {
        this.state = state;
    }
}
