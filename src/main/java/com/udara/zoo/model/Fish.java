package com.udara.zoo.model;

public abstract class Fish extends Animal implements Swimable {

    private Size size;
    private Colour colour;

    public Fish(Size size, Colour colour) {
        this.size = size;
        this.colour = colour;
    }

    public Size getSize() {
        return size;
    }

    public Colour getColour() {
        return colour;
    }
}
