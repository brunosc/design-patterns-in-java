package com.patterns.command;

import static java.util.Arrays.asList;

class CommandApplication {

    public static void main(String[] args) {
        final var bedroomLight = new Light();
        final var kitchenLight = new Light();
        final var lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);

        System.out.println();

        final var lights = asList(kitchenLight, bedroomLight);
        Command allLightsCommand = new AllLightsCommand(lights);

        lightSwitch.storeAndExecute(allLightsCommand);
    }

}
