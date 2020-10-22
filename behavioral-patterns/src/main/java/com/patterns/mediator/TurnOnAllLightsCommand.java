package com.patterns.mediator;

public class TurnOnAllLightsCommand implements Command {

    private final Mediator mediator;

    TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
