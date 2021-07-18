package com.udara.zoo.model;

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
