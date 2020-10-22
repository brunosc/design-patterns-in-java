package com.patterns.decorator;

abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}
