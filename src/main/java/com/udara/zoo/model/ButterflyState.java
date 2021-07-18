package com.udara.zoo.model;

public class ButterflyState implements Insect, Flyable, Walkable{

    @Override
    public void fly() {
        System.out.println("Buttery flying");
    }

    @Override
    public void walk() {
        System.out.println("Butterfly walking");
    }

}
