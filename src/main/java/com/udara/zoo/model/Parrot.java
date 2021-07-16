package com.udara.zoo.model;

public class Parrot extends Bird{

    private SpeakingBehavior behavior;

    public Parrot(SpeakingBehavior behavior) {
        this.behavior = behavior;
    }

    public void shout() {
        System.out.println(behavior.getSpeech());
    }
}
