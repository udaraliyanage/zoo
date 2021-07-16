package com.udara.zoo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotWithIphoneSpeakingBehaviorTest {

    @Test
    public void parrotLivingNearIPhoneShouldShoutAsIphoneRingTone() {
        ;
        assertEquals("Ton kota tan tan ton ton", new ParrotWithIphoneSpeakingBehavior().getSpeech());
    }
}