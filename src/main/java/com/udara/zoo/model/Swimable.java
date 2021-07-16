package com.udara.zoo.model;

public interface Swimable {

    default void swim() {
        /*
        default method is added to avoid duplication of swim() in Fish class and in Dolphin classes.
        However this gives the false implication that all animals swim similarly. But the requirements in this
        assignment does not mention different animal swim differently.
         */
        System.out.println("default swim method for Fish");
    }
}
