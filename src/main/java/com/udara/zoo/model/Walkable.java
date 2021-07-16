package com.udara.zoo.model;

public interface Walkable {
    default void walk() {
        /*
        Assuming all animals walks the same way. Otherwise any animal can override the behavior
         */
        System.out.println("I am walking");
    }
}
