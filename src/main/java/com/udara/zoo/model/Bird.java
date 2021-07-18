package com.udara.zoo.model;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Bird extends WalkingAnimal{

    public Bird(String name) {
        super(name);
    }

    void fly() {
        System.out.println("I am flying");
    }
}
