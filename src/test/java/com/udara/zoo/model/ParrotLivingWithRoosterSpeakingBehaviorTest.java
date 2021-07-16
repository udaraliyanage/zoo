package com.udara.zoo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotLivingWithRoosterSpeakingBehaviorTest {

    @Test
    public void parrotLivingWithRoosterShouldSpeakAsRooster() {
        assertEquals("Cock-a-doodle-doo", new ParrotLivingWithRoosterSpeakingBehavior().getSpeech());
    }
}