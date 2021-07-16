package com.udara.zoo.model;

public abstract class WalkingAnimal extends Animal implements Speakable {

    void walk(){
        System.out.println("I am walking");
    }
}
