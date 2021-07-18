package com.udara.zoo.model;

public interface Flyable {

    default void fly() {
        System.out.println("I am flying");
    }
}
