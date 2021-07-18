package com.udara.zoo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotLivingWithDogSpeakingBehaviorTest {

    @Test
    public void parrotLivingWithDogShouldShoutAsDog() {
        assertEquals("Woof, woof", new ParrotLivingWithDogSpeakingBehavior().getSpeech());
    }
}