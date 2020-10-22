package com.patterns.facade;

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw");
    }
}
