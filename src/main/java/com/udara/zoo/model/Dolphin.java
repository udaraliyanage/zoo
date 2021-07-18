package com.udara.zoo.model;

import com.udara.zoo.model.behavior.Swimable;

public class Dolphin extends Animal implements Swimable {

    @Override
    public void swim() {
        System.out.println("Dolphin swim backwards");
    }
}
