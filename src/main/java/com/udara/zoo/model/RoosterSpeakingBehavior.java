package com.udara.zoo.model;

public class RoosterSpeakingBehavior extends ChikenSpeakingBehavior {
    @Override
    public void speak() {
        System.out.println("Cock-a-doodle-doo");
    }
}
