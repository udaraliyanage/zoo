package com.udara.zoo.model;

public class Chicken extends Animal implements Speakable{

    @Override
    public void shout() {
        System.out.println("Cluck, cluck");
    }
}
