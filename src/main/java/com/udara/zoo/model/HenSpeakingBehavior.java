package com.udara.zoo.model;

public class HenSpeakingBehavior extends ChikenSpeakingBehavior {

    @Override
    public void speak() {
        System.out.println("Cluck, cluck");
    }
}
