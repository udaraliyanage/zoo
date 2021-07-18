package com.udara.zoo.model;

import com.udara.zoo.model.behavior.Flyable;
import com.udara.zoo.model.behavior.Walkable;

public class ButterflyState implements Insect, Flyable, Walkable {

    @Override
    public void fly() {
        System.out.println("Buttery flying");
    }

    @Override
    public void walk() {
        System.out.println("Butterfly walking");
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
