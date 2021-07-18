package com.udara.zoo.model;


import com.udara.zoo.model.behavior.Flyable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Bird extends WalkingAnimal implements Flyable {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
