package com.udara.zoo.model.behavior;

public interface Flyable {

    default void fly() {
        System.out.println("I am flying");
    }
}
