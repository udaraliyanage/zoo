package com.udara.zoo.model;

public class Chicken extends Animal implements Speakable{

    private final ChikenSpeakingBehavior speakingBehavior;

    public Chicken(ChikenSpeakingBehavior speakingBehavior) {
        this.speakingBehavior = speakingBehavior;
    }

    @Override
    public void shout() {
        speakingBehavior.speak();
    }
}
