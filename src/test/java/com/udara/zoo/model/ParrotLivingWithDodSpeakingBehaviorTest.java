package com.udara.zoo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotLivingWithDodSpeakingBehaviorTest {

    @Test
    public void parrotLivingWithDogShouldShoutAsDog() {
        assertEquals("Woof, woof", new ParrotLivingWithDodSpeakingBehavior().getSpeech());
    }
}