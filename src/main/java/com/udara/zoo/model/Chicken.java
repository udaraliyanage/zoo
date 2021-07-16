package com.udara.zoo.model;

public class Chicken extends WalkingAnimal{

    private final ChikenSpeakingBehavior speakingBehavior;

    public Chicken(ChikenSpeakingBehavior speakingBehavior) {
        this.speakingBehavior = speakingBehavior;
    }

    @Override
    public void shout() {
        speakingBehavior.speak();
    }
}
