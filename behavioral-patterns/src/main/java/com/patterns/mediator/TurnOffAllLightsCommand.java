package com.patterns.mediator;

class TurnOffAllLightsCommand implements Command {

    private final Mediator mediator;

    TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }
}
