package com.udara.zoo.model;

public abstract class Bird extends Animal implements Speakable{

    void fly() {
        System.out.println("I am flying");
    }
}
