package com.patterns.command;

class ToggleCommand implements Command {

    private final Light light;

    ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("ToggleCommand");
        light.toggle();
    }
}
