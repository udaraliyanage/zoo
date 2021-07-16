package com.udara.zoo.model;

public class Dolphin extends Animal implements Swimable{

    @Override
    public void swim() {
        System.out.println("Dolphin swim backwards");
    }
}
