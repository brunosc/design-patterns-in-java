package com.patterns.command;

import java.util.List;

class AllLightsCommand implements Command {

    private final List<Light> lights;

    AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println("AllLightsCommand");
        for (Light light : lights) {
            if (light.isOn()) {
                light.toggle();
            }
        }
    }
}
