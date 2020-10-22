package com.patterns.mediator;

class MediatorApplication {

    public static void main(String[] args) {
        final var mediator = new Mediator();

        final var bedroomLight = new Light("Bedroom");
        final var kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
    }

}
