package com.patterns.facade;

class ShapeMakerFacade {

    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    ShapeMakerFacade() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    void drawCircle(){
        circle.draw();
    }

    void drawRectangle(){
        rectangle.draw();
    }

    void drawSquare(){
        square.draw();
    }
}
