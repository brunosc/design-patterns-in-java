package com.patterns.facade;

class FacadeApplication {

    public static void main(String[] args) {
        final var facade = new ShapeMakerFacade();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
    }

}
