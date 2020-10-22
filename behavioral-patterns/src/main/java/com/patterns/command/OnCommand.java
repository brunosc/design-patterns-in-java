package com.patterns.command;

class OnCommand implements Command {

    private final Light light;

    OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("OnCommand");
        light.on();
    }
}
