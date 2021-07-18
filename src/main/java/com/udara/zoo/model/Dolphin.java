package com.udara.zoo.model;

import com.udara.zoo.model.behavior.Swimable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Dolphin extends Animal implements Swimable {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Dolphin swim backwards");
    }
}
