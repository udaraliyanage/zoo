package com.udara.zoo.model;

import java.util.Locale;

public class Chicken extends WalkingAnimal{

    private final ChickenSpeakingBehavior speakingBehavior;
    private final Locale locale;

    public Chicken(ChickenSpeakingBehavior speakingBehavior) {
        this.speakingBehavior = speakingBehavior;
        this.locale = Locale.getDefault();
    }

    public Chicken(ChickenSpeakingBehavior speakingBehavior, Locale locale) {
        this.speakingBehavior = speakingBehavior;
        this.locale = locale;
    }

    @Override
    public void speak() {
        speakingBehavior.speak(locale);
    }
}
