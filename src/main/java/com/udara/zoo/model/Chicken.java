package com.udara.zoo.model;

import java.util.Locale;

public class Chicken extends WalkingAnimal{

    private final ChikenSpeakingBehavior speakingBehavior;
    private final Locale locale;

    public Chicken(ChikenSpeakingBehavior speakingBehavior) {
        this.speakingBehavior = speakingBehavior;
        this.locale = Locale.getDefault();
    }

    public Chicken(ChikenSpeakingBehavior speakingBehavior, Locale locale) {
        this.speakingBehavior = speakingBehavior;
        this.locale = locale;
    }

    @Override
    public void shout() {
        speakingBehavior.speak(locale);
    }
}
