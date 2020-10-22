package com.patterns.decorator;

class DecoratorApplication {

    public static void main(String[] args) {
        final var simpleSandwich = new SimpleSandwich();
        final var meatDecorator = new MeatDecorator(simpleSandwich);
        Sandwich sandwich = new DressingDecorator(meatDecorator);
        System.out.println(sandwich.make());
    }

}
