package com.udara.zoo.model;

import com.udara.zoo.model.behavior.Speakable;
import com.udara.zoo.model.behavior.Swimable;
import com.udara.zoo.model.behavior.Walkable;

public class Dog extends Animal implements Speakable, Walkable, Swimable {

    @Override
    public void shout() {
        System.out.println("Bab Baw");
    }

    @Override
    public void swim() {
        System.out.println("Swiming keeping head out of water");;
    }
}
